// This is a generated file. Not intended for manual editing.
package co.anbora.labs.firebase.syntax.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FirebaseRulesExpression extends PsiElement {

  @Nullable
  FirebaseRulesBooleanStatement getBooleanStatement();

  @Nullable
  FirebaseRulesBuiltInFunctionStatement getBuiltInFunctionStatement();

  @Nullable
  FirebaseRulesCallFunctionStatement getCallFunctionStatement();

  @Nullable
  FirebaseRulesLiteralStatement getLiteralStatement();

  @Nullable
  FirebaseRulesNullStatement getNullStatement();

  @Nullable
  FirebaseRulesObjectStatement getObjectStatement();

}
