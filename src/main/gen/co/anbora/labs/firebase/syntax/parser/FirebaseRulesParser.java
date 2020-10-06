// This is a generated file. Not intended for manual editing.
package co.anbora.labs.firebase.syntax.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static co.anbora.labs.firebase.syntax.psi.FirebaseRulesTypes.*;
import static co.anbora.labs.firebase.syntax.FirebaseRulesParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FirebaseRulesParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // port nodeRule port |
  //     string |
  //     rightlet |
  //     leftlet
  public static boolean bridge(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bridge")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BRIDGE, "<bridge>");
    r = bridge_0(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = rightlet(b, l + 1);
    if (!r) r = leftlet(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // port nodeRule port
  private static boolean bridge_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bridge_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port(b, l + 1);
    r = r && nodeRule(b, l + 1);
    r = r && port(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LP nodename? metadata? RP
  public static boolean component(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && component_1(b, l + 1);
    r = r && component_2(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, COMPONENT, r);
    return r;
  }

  // nodename?
  private static boolean component_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_1")) return false;
    consumeToken(b, NODENAME);
    return true;
  }

  // metadata?
  private static boolean component_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_2")) return false;
    metadata(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // bridge op connection | bridge
  public static boolean connection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connection")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONNECTION, "<connection>");
    r = connection_0(b, l + 1);
    if (!r) r = bridge(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // bridge op connection
  private static boolean connection_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connection_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bridge(b, l + 1);
    r = r && consumeToken(b, OP);
    r = r && connection(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // compMeta portname COLON portname lineTerm
  public static boolean imp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imp")) return false;
    if (!nextTokenIs(b, COMPMETA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMPMETA, PORTNAME, COLON, PORTNAME);
    r = r && lineTerm(b, l + 1);
    exit_section_(b, m, IMP, r);
    return r;
  }

  /* ********************************************************** */
  // nodeRule portWithIndex | nodeRule port
  public static boolean leftlet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "leftlet")) return false;
    if (!nextTokenIs(b, NODENAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = leftlet_0(b, l + 1);
    if (!r) r = leftlet_1(b, l + 1);
    exit_section_(b, m, LEFTLET, r);
    return r;
  }

  // nodeRule portWithIndex
  private static boolean leftlet_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "leftlet_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nodeRule(b, l + 1);
    r = r && portWithIndex(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // nodeRule port
  private static boolean leftlet_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "leftlet_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nodeRule(b, l + 1);
    r = r && port(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // char?
  public static boolean lineTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lineTerm")) return false;
    Marker m = enter_section_(b, l, _NONE_, LINE_TERM, "<line term>");
    consumeToken(b, CHAR);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // COLON compMeta
  public static boolean metadata(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLON, COMPMETA);
    exit_section_(b, m, METADATA, r);
    return r;
  }

  /* ********************************************************** */
  // nodename component?
  public static boolean nodeRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nodeRule")) return false;
    if (!nextTokenIs(b, NODENAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NODENAME);
    r = r && nodeRule_1(b, l + 1);
    exit_section_(b, m, NODE_RULE, r);
    return r;
  }

  // component?
  private static boolean nodeRule_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nodeRule_1")) return false;
    component(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // portname
  public static boolean port(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port")) return false;
    if (!nextTokenIs(b, PORTNAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PORTNAME);
    exit_section_(b, m, PORT, r);
    return r;
  }

  /* ********************************************************** */
  // portname LB number RB
  public static boolean portWithIndex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "portWithIndex")) return false;
    if (!nextTokenIs(b, PORTNAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PORTNAME, LB, NUMBER, RB);
    exit_section_(b, m, PORT_WITH_INDEX, r);
    return r;
  }

  /* ********************************************************** */
  // stmt lineTerm
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = stmt(b, l + 1);
    r = r && lineTerm(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // portWithIndex nodeRule | port nodeRule
  public static boolean rightlet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rightlet")) return false;
    if (!nextTokenIs(b, PORTNAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rightlet_0(b, l + 1);
    if (!r) r = rightlet_1(b, l + 1);
    exit_section_(b, m, RIGHTLET, r);
    return r;
  }

  // portWithIndex nodeRule
  private static boolean rightlet_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rightlet_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = portWithIndex(b, l + 1);
    r = r && nodeRule(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // port nodeRule
  private static boolean rightlet_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rightlet_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port(b, l + 1);
    r = r && nodeRule(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // root_item *
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!root_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !<<eof>> property
  static boolean root_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_item_0(b, l + 1);
    r = r && property(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean root_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // imp | connection
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = imp(b, l + 1);
    if (!r) r = connection(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
