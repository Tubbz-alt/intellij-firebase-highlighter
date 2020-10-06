// This is a generated file. Not intended for manual editing.
package co.anbora.labs.firebase.syntax.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static co.anbora.labs.firebase.syntax.psi.FirebaseRulesTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import co.anbora.labs.firebase.syntax.psi.*;

public class FirebaseRulesServiceStatementImpl extends ASTWrapperPsiElement implements FirebaseRulesServiceStatement {

  public FirebaseRulesServiceStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FirebaseRulesVisitor visitor) {
    visitor.visitServiceStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FirebaseRulesVisitor) accept((FirebaseRulesVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FirebaseRulesMatchStatement> getMatchStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FirebaseRulesMatchStatement.class);
  }

}