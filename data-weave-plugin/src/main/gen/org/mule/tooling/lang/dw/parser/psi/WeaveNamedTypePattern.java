// This is a generated file. Not intended for manual editing.
package org.mule.tooling.lang.dw.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WeaveNamedTypePattern extends WeavePattern, WeaveNamedElement {

  @Nullable
  WeaveExpression getExpression();

  @NotNull
  WeaveIdentifier getIdentifier();

  @Nullable
  WeaveType getType();

  String getName();

  PsiElement setName(@NotNull String newName);

  PsiElement getNameIdentifier();

}
