package org.mule.tooling.lang.dw.filter;

import com.intellij.execution.filters.Filter;
import com.intellij.execution.filters.HyperlinkInfo;
import com.intellij.execution.filters.OpenFileHyperlinkInfo;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import org.jetbrains.annotations.Nullable;
import org.mule.tooling.lang.dw.util.VirtualFileSystemUtils;
import org.mule.weave.v2.parser.ast.variables.NameIdentifier;
import scala.Option;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DataWeaveFilter implements Filter {

    private Project myProject;

    private Pattern ELEMENT_REGEX = Pattern.compile("(?<nameIdentifier>[A-z0-9_:]*)(\\s\\(line:\\s(?<lineNumber>[0-9]+), column:\\s(?<columnNumber>[0-9]+)\\))");

    public DataWeaveFilter(Project myProject) {
        this.myProject = myProject;
    }

    @Nullable
    @Override
    public Result applyFilter(String textLine, int entireLength) {
        final Matcher matcher = ELEMENT_REGEX.matcher(textLine);
        if (matcher.find()) {
            String element = matcher.group(0);
            final String nameIdentifierText = matcher.group("nameIdentifier");
            final String lineNumber = matcher.group("lineNumber");
            final String columnNumber = matcher.group("columnNumber");

            NameIdentifier nameIdentifierFile = NameIdentifier.apply(nameIdentifierText, Option.empty());
            VirtualFile virtualFile = VirtualFileSystemUtils.resolve(nameIdentifierFile, myProject);
            if (virtualFile == null && nameIdentifierFile.parent().isDefined()) {
                nameIdentifierFile = nameIdentifierFile.parent().get();
                virtualFile = VirtualFileSystemUtils.resolve(nameIdentifierFile, myProject);
            }

            if (virtualFile == null) {
                return null;
            } else {
                HyperlinkInfo info = new OpenFileHyperlinkInfo(myProject, virtualFile, Integer.parseInt(lineNumber) - 1, Integer.parseInt(columnNumber));
                return new Result(entireLength - element.length(), entireLength, info);
            }
        }
        return null;
    }
}