package org.mule.tooling.lang.dw.wizard;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.SourcePathsBuilder;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.project.DumbAwareRunnable;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.idea.maven.model.MavenId;
import org.jetbrains.idea.maven.utils.MavenUtil;
import org.jetbrains.idea.maven.wizards.AbstractMavenModuleBuilder;
import org.jetbrains.idea.maven.wizards.MavenModuleBuilder;
import org.jetbrains.idea.maven.wizards.MavenModuleWizardStep;
import org.jetbrains.idea.maven.wizards.SelectPropertiesStep;
import org.mule.tooling.lang.dw.WeaveIcons;

import javax.swing.*;
import java.io.File;
import java.util.Objects;

public class WeaveModuleBuilder extends AbstractMavenModuleBuilder implements SourcePathsBuilder {

    private String weaveVersion = "2.3.1-SNAPSHOT";
    private String weaveMavenVersion = "2.3.2-SNAPSHOT";
    private String wtfVersion = "1.0.3-SNAPSHOT";

    public WeaveModuleBuilder() {
        setProjectId(new MavenId("org.mule.weave.module", "my-weave-module", "1.0.0-SNAPSHOT"));
    }

    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull ModulesProvider modulesProvider) {
        return new ModuleWizardStep[]{
                new MavenModuleWizardStep(this, wizardContext, !wizardContext.isNewWizard()),
                new SelectPropertiesStep(wizardContext.getProject(), this)
        };
    }

    @Override
    public void setupRootModel(ModifiableRootModel rootModel) {
        super.setupRootModel(rootModel);

        final Project project = rootModel.getProject();
        final VirtualFile root = createAndGetContentEntry();
        rootModel.addContentEntry(root);
        //Check if this is a module and has parent
        final MavenId parentId = (this.getParentProject() != null ? this.getParentProject().getMavenId() : null);

        MavenUtil.runWhenInitialized(project, (DumbAwareRunnable) () -> {
            WeaveModuleInitializer.configure(project, getProjectId(), weaveVersion, weaveMavenVersion, root, parentId, wtfVersion);
        });
    }

    private VirtualFile createAndGetContentEntry() {
        final String path = FileUtil.toSystemIndependentName(Objects.requireNonNull(this.getContentEntryPath()));
        boolean mkdirs = new File(path).mkdirs();
        if (!mkdirs) {
            System.out.println("Unable to create " + path);
        }
        return LocalFileSystem.getInstance().refreshAndFindFileByPath(path);
    }

    @Override
    public String getName() {
        return "Weave Project";
    }

    @Override
    public String getBuilderId() {
        return getClass().getName();
    }


    @Override
    public String getPresentableName() {
        return "Weave Project";
    }

    @Override
    public Icon getNodeIcon() {
        return WeaveIcons.DataWeaveIcon;
    }

    @Override
    public String getDescription() {
        return "Create a weave project.";
    }

}
