// This is a generated file. Not intended for manual editing.
package org.mule.tooling.lang.dw.parser.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import org.mule.tooling.lang.dw.parser.WeaveElementType;
import org.mule.tooling.lang.dw.parser.WeaveTokenType;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveAdditionSubtractionExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveAndExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveAnnotationArgumentImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveAnnotationArgumentsImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveAnnotationImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveAnyDateLiteralImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveArrayDeconstructPatternImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveArrayExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveAsExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveAttributeSelectorImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveAttributesImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveAttributesTypeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveBinaryExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveBodyImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveBooleanLiteralImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveBracketSelectorExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveCloseObjectTypeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveCloseOrderedObjectTypeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveConditionalAttributeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveConditionalExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveConditionalKeyValuePairImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveContainerModuleIdentifierImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveCustomInterpolationStringImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveCustomInterpolatorExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveCustomLoaderImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveDataFormatImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveDeclaredNamespaceImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveDefaultPatternImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveDefaultValueExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveDirectiveImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveDoExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveDocumentImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveDotSelectorExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveDynamicAttributeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveDynamicKeyValuePairImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveDynamicReturnImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveEmptyArrayPatternImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveEmptyObjectPatternImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveEnclosedExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveEqualityExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveExpressionPatternImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveFqnIdentifierImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveFunctionCallArgumentsImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveFunctionCallExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveFunctionDefinitionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveFunctionDirectiveImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveFunctionParameterImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveGreaterThanExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveHeaderImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveIdentifierImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveImportDirectiveImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveImportedElementImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveInputDirectiveImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveIntersectionTypeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveIsExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveKeyImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveKeyTypeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveKeyValuePairTypeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveLambdaLiteralImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveLambdaTypeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveLambdaTypeParameterImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveLeftShiftExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveLiteralPatternImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveMatchExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveModuleReferenceImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveMultiValueSelectorImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveMultipleKeyValuePairObjImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveMultiplicationDivisionExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveNameTypeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveNamedLiteralPatternImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveNamedRegexPatternImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveNamedTypePatternImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveNamespaceDefinitionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveNamespaceDirectiveImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveNamespaceSelectorImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveNotExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveNullLiteralImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveNumberLiteralImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveObjectDeconstructExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveObjectDeconstructPatternImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveObjectExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveObjectSelectorImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveObjectTypeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveOptionElementImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveOptionsImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveOrExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveOrderedObjectTypeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveOutputDirectiveImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeavePatternMatcherExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveQualifiedNameImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveReferenceTypeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveRegexLiteralImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveRegexPatternImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveRightShiftExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveSchemaElementImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveSchemaImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveSchemaSelectorImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveSelectorImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveSimpleAttributeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveSimpleKeyValuePairImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveSingleKeyValuePairObjImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveStringLiteralImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveTypeDefinitionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveTypeDirectiveImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveTypeParameterImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveTypePatternImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveUnaryMinusExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveUndefinedLiteralImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveUnionTypeImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveUsingExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveValueSelectorImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveVariableDefinitionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveVariableDirectiveImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveVariableReferenceExpressionImpl;
import org.mule.tooling.lang.dw.parser.psi.impl.WeaveVersionDirectiveImpl;

public interface WeaveTypes {

  IElementType ADDITION_SUBTRACTION_EXPRESSION = new WeaveElementType("ADDITION_SUBTRACTION_EXPRESSION");
  IElementType AND_EXPRESSION = new WeaveElementType("AND_EXPRESSION");
  IElementType ANNOTATION = new WeaveElementType("ANNOTATION");
  IElementType ANNOTATION_ARGUMENT = new WeaveElementType("ANNOTATION_ARGUMENT");
  IElementType ANNOTATION_ARGUMENTS = new WeaveElementType("ANNOTATION_ARGUMENTS");
  IElementType ANY_DATE_LITERAL = new WeaveElementType("ANY_DATE_LITERAL");
  IElementType ARRAY_DECONSTRUCT_PATTERN = new WeaveElementType("ARRAY_DECONSTRUCT_PATTERN");
  IElementType ARRAY_EXPRESSION = new WeaveElementType("ARRAY_EXPRESSION");
  IElementType AS_EXPRESSION = new WeaveElementType("AS_EXPRESSION");
  IElementType ATTRIBUTE = new WeaveElementType("ATTRIBUTE");
  IElementType ATTRIBUTES = new WeaveElementType("ATTRIBUTES");
  IElementType ATTRIBUTES_TYPE = new WeaveElementType("ATTRIBUTES_TYPE");
  IElementType ATTRIBUTE_SELECTOR = new WeaveElementType("ATTRIBUTE_SELECTOR");
  IElementType BINARY_EXPRESSION = new WeaveElementType("BINARY_EXPRESSION");
  IElementType BODY = new WeaveElementType("BODY");
  IElementType BOOLEAN_LITERAL = new WeaveElementType("BOOLEAN_LITERAL");
  IElementType BRACKET_SELECTOR_EXPRESSION = new WeaveElementType("BRACKET_SELECTOR_EXPRESSION");
  IElementType CLOSE_OBJECT_TYPE = new WeaveElementType("CLOSE_OBJECT_TYPE");
  IElementType CLOSE_ORDERED_OBJECT_TYPE = new WeaveElementType("CLOSE_ORDERED_OBJECT_TYPE");
  IElementType CONDITIONAL_ATTRIBUTE = new WeaveElementType("CONDITIONAL_ATTRIBUTE");
  IElementType CONDITIONAL_EXPRESSION = new WeaveElementType("CONDITIONAL_EXPRESSION");
  IElementType CONDITIONAL_KEY_VALUE_PAIR = new WeaveElementType("CONDITIONAL_KEY_VALUE_PAIR");
  IElementType CONTAINER_MODULE_IDENTIFIER = new WeaveElementType("CONTAINER_MODULE_IDENTIFIER");
  IElementType CUSTOM_INTERPOLATION_STRING = new WeaveElementType("CUSTOM_INTERPOLATION_STRING");
  IElementType CUSTOM_INTERPOLATOR_EXPRESSION = new WeaveElementType("CUSTOM_INTERPOLATOR_EXPRESSION");
  IElementType CUSTOM_LOADER = new WeaveElementType("CUSTOM_LOADER");
  IElementType DATA_FORMAT = new WeaveElementType("DATA_FORMAT");
  IElementType DECLARED_NAMESPACE = new WeaveElementType("DECLARED_NAMESPACE");
  IElementType DEFAULT_PATTERN = new WeaveElementType("DEFAULT_PATTERN");
  IElementType DEFAULT_VALUE_EXPRESSION = new WeaveElementType("DEFAULT_VALUE_EXPRESSION");
  IElementType DIRECTIVE = new WeaveElementType("DIRECTIVE");
  IElementType DOCUMENT = new WeaveElementType("DOCUMENT");
  IElementType DOT_SELECTOR_EXPRESSION = new WeaveElementType("DOT_SELECTOR_EXPRESSION");
  IElementType DO_EXPRESSION = new WeaveElementType("DO_EXPRESSION");
  IElementType DYNAMIC_ATTRIBUTE = new WeaveElementType("DYNAMIC_ATTRIBUTE");
  IElementType DYNAMIC_KEY_VALUE_PAIR = new WeaveElementType("DYNAMIC_KEY_VALUE_PAIR");
  IElementType DYNAMIC_RETURN = new WeaveElementType("DYNAMIC_RETURN");
  IElementType EMPTY_ARRAY_PATTERN = new WeaveElementType("EMPTY_ARRAY_PATTERN");
  IElementType EMPTY_OBJECT_PATTERN = new WeaveElementType("EMPTY_OBJECT_PATTERN");
  IElementType ENCLOSED_EXPRESSION = new WeaveElementType("ENCLOSED_EXPRESSION");
  IElementType EQUALITY_EXPRESSION = new WeaveElementType("EQUALITY_EXPRESSION");
  IElementType EXPRESSION = new WeaveElementType("EXPRESSION");
  IElementType EXPRESSION_PATTERN = new WeaveElementType("EXPRESSION_PATTERN");
  IElementType FQN_IDENTIFIER = new WeaveElementType("FQN_IDENTIFIER");
  IElementType FUNCTION_CALL_ARGUMENTS = new WeaveElementType("FUNCTION_CALL_ARGUMENTS");
  IElementType FUNCTION_CALL_EXPRESSION = new WeaveElementType("FUNCTION_CALL_EXPRESSION");
  IElementType FUNCTION_DEFINITION = new WeaveElementType("FUNCTION_DEFINITION");
  IElementType FUNCTION_DIRECTIVE = new WeaveElementType("FUNCTION_DIRECTIVE");
  IElementType FUNCTION_PARAMETER = new WeaveElementType("FUNCTION_PARAMETER");
  IElementType GREATER_THAN_EXPRESSION = new WeaveElementType("GREATER_THAN_EXPRESSION");
  IElementType HEADER = new WeaveElementType("HEADER");
  IElementType IDENTIFIER = new WeaveElementType("IDENTIFIER");
  IElementType IMPORTED_ELEMENT = new WeaveElementType("IMPORTED_ELEMENT");
  IElementType IMPORT_DIRECTIVE = new WeaveElementType("IMPORT_DIRECTIVE");
  IElementType INPUT_DIRECTIVE = new WeaveElementType("INPUT_DIRECTIVE");
  IElementType INTERSECTION_TYPE = new WeaveElementType("INTERSECTION_TYPE");
  IElementType IS_EXPRESSION = new WeaveElementType("IS_EXPRESSION");
  IElementType KEY = new WeaveElementType("KEY");
  IElementType KEY_TYPE = new WeaveElementType("KEY_TYPE");
  IElementType KEY_VALUE_PAIR = new WeaveElementType("KEY_VALUE_PAIR");
  IElementType KEY_VALUE_PAIR_TYPE = new WeaveElementType("KEY_VALUE_PAIR_TYPE");
  IElementType LAMBDA_LITERAL = new WeaveElementType("LAMBDA_LITERAL");
  IElementType LAMBDA_TYPE = new WeaveElementType("LAMBDA_TYPE");
  IElementType LAMBDA_TYPE_PARAMETER = new WeaveElementType("LAMBDA_TYPE_PARAMETER");
  IElementType LEFT_SHIFT_EXPRESSION = new WeaveElementType("LEFT_SHIFT_EXPRESSION");
  IElementType LITERAL_EXPRESSION = new WeaveElementType("LITERAL_EXPRESSION");
  IElementType LITERAL_PATTERN = new WeaveElementType("LITERAL_PATTERN");
  IElementType MATCH_EXPRESSION = new WeaveElementType("MATCH_EXPRESSION");
  IElementType MODULE_REFERENCE = new WeaveElementType("MODULE_REFERENCE");
  IElementType MULTIPLE_KEY_VALUE_PAIR_OBJ = new WeaveElementType("MULTIPLE_KEY_VALUE_PAIR_OBJ");
  IElementType MULTIPLICATION_DIVISION_EXPRESSION = new WeaveElementType("MULTIPLICATION_DIVISION_EXPRESSION");
  IElementType MULTI_VALUE_SELECTOR = new WeaveElementType("MULTI_VALUE_SELECTOR");
  IElementType NAMED_LITERAL_PATTERN = new WeaveElementType("NAMED_LITERAL_PATTERN");
  IElementType NAMED_REGEX_PATTERN = new WeaveElementType("NAMED_REGEX_PATTERN");
  IElementType NAMED_TYPE_PATTERN = new WeaveElementType("NAMED_TYPE_PATTERN");
  IElementType NAMESPACE_DEFINITION = new WeaveElementType("NAMESPACE_DEFINITION");
  IElementType NAMESPACE_DIRECTIVE = new WeaveElementType("NAMESPACE_DIRECTIVE");
  IElementType NAMESPACE_SELECTOR = new WeaveElementType("NAMESPACE_SELECTOR");
  IElementType NAME_TYPE = new WeaveElementType("NAME_TYPE");
  IElementType NOT_EXPRESSION = new WeaveElementType("NOT_EXPRESSION");
  IElementType NULL_LITERAL = new WeaveElementType("NULL_LITERAL");
  IElementType NUMBER_LITERAL = new WeaveElementType("NUMBER_LITERAL");
  IElementType OBJECT_DECONSTRUCT_EXPRESSION = new WeaveElementType("OBJECT_DECONSTRUCT_EXPRESSION");
  IElementType OBJECT_DECONSTRUCT_PATTERN = new WeaveElementType("OBJECT_DECONSTRUCT_PATTERN");
  IElementType OBJECT_EXPRESSION = new WeaveElementType("OBJECT_EXPRESSION");
  IElementType OBJECT_SELECTOR = new WeaveElementType("OBJECT_SELECTOR");
  IElementType OBJECT_TYPE = new WeaveElementType("OBJECT_TYPE");
  IElementType OPTIONS = new WeaveElementType("OPTIONS");
  IElementType OPTION_ELEMENT = new WeaveElementType("OPTION_ELEMENT");
  IElementType ORDERED_OBJECT_TYPE = new WeaveElementType("ORDERED_OBJECT_TYPE");
  IElementType OR_EXPRESSION = new WeaveElementType("OR_EXPRESSION");
  IElementType OUTPUT_DIRECTIVE = new WeaveElementType("OUTPUT_DIRECTIVE");
  IElementType PATTERN = new WeaveElementType("PATTERN");
  IElementType PATTERN_MATCHER_EXPRESSION = new WeaveElementType("PATTERN_MATCHER_EXPRESSION");
  IElementType QUALIFIED_NAME = new WeaveElementType("QUALIFIED_NAME");
  IElementType REFERENCE_TYPE = new WeaveElementType("REFERENCE_TYPE");
  IElementType REGEX_LITERAL = new WeaveElementType("REGEX_LITERAL");
  IElementType REGEX_PATTERN = new WeaveElementType("REGEX_PATTERN");
  IElementType RIGHT_SHIFT_EXPRESSION = new WeaveElementType("RIGHT_SHIFT_EXPRESSION");
  IElementType SCHEMA = new WeaveElementType("SCHEMA");
  IElementType SCHEMA_ELEMENT = new WeaveElementType("SCHEMA_ELEMENT");
  IElementType SCHEMA_SELECTOR = new WeaveElementType("SCHEMA_SELECTOR");
  IElementType SELECTOR = new WeaveElementType("SELECTOR");
  IElementType SIMPLE_ATTRIBUTE = new WeaveElementType("SIMPLE_ATTRIBUTE");
  IElementType SIMPLE_KEY_VALUE_PAIR = new WeaveElementType("SIMPLE_KEY_VALUE_PAIR");
  IElementType SINGLE_KEY_VALUE_PAIR_OBJ = new WeaveElementType("SINGLE_KEY_VALUE_PAIR_OBJ");
  IElementType STRING_LITERAL = new WeaveElementType("STRING_LITERAL");
  IElementType TYPE = new WeaveElementType("TYPE");
  IElementType TYPE_DEFINITION = new WeaveElementType("TYPE_DEFINITION");
  IElementType TYPE_DIRECTIVE = new WeaveElementType("TYPE_DIRECTIVE");
  IElementType TYPE_PARAMETER = new WeaveElementType("TYPE_PARAMETER");
  IElementType TYPE_PATTERN = new WeaveElementType("TYPE_PATTERN");
  IElementType UNARY_MINUS_EXPRESSION = new WeaveElementType("UNARY_MINUS_EXPRESSION");
  IElementType UNDEFINED_LITERAL = new WeaveElementType("UNDEFINED_LITERAL");
  IElementType UNION_TYPE = new WeaveElementType("UNION_TYPE");
  IElementType USING_EXPRESSION = new WeaveElementType("USING_EXPRESSION");
  IElementType VALUE_SELECTOR = new WeaveElementType("VALUE_SELECTOR");
  IElementType VARIABLE_DEFINITION = new WeaveElementType("VARIABLE_DEFINITION");
  IElementType VARIABLE_DIRECTIVE = new WeaveElementType("VARIABLE_DIRECTIVE");
  IElementType VARIABLE_REFERENCE_EXPRESSION = new WeaveElementType("VARIABLE_REFERENCE_EXPRESSION");
  IElementType VERSION_DIRECTIVE = new WeaveElementType("VERSION_DIRECTIVE");

  IElementType AND = new WeaveTokenType("&");
  IElementType AND_KEYWORD = new WeaveTokenType("and");
  IElementType ARROW_TOKEN = new WeaveTokenType("->");
  IElementType AS = new WeaveTokenType("as");
  IElementType AT = new WeaveTokenType("@");
  IElementType BACKTIKED_QUOTED_STRING = new WeaveTokenType("BACKTIKED_QUOTED_STRING");
  IElementType CASE_KEYWORD = new WeaveTokenType("case");
  IElementType CLOSE_CLOSE_KEYWORD = new WeaveTokenType("|}");
  IElementType CLOSE_CLOSE_ORDERED_KEYWORD = new WeaveTokenType("|-}");
  IElementType CLOSE_ORDERED_KEYWORD = new WeaveTokenType("-}");
  IElementType COLON = new WeaveTokenType(":");
  IElementType COMMA = new WeaveTokenType(",");
  IElementType DEFAULT = new WeaveTokenType("DEFAULT");
  IElementType DIVISION = new WeaveTokenType("/");
  IElementType DOCUMENT_SEPARATOR = new WeaveTokenType("---");
  IElementType DOLLAR_VARIABLE = new WeaveTokenType("DOLLAR_VARIABLE");
  IElementType DOUBLE_LITERAL = new WeaveTokenType("DOUBLE_LITERAL");
  IElementType DOUBLE_QUOTED_STRING = new WeaveTokenType("DOUBLE_QUOTED_STRING");
  IElementType DO_KEYWORD = new WeaveTokenType("do");
  IElementType ELSE = new WeaveTokenType("ELSE");
  IElementType EQ = new WeaveTokenType("=");
  IElementType EQUAL = new WeaveTokenType("==");
  IElementType ESCLAMATION = new WeaveTokenType("!");
  IElementType FALSE_LITERAL = new WeaveTokenType("false");
  IElementType FAT_ARROW = new WeaveTokenType("=>");
  IElementType FROM_KEYWORD = new WeaveTokenType("from");
  IElementType FUNCTION_DIRECTIVE_KEYWORD = new WeaveTokenType("fun");
  IElementType GREATER = new WeaveTokenType(">");
  IElementType GREATER_EQUAL = new WeaveTokenType(">=");
  IElementType HASH = new WeaveTokenType("#");
  IElementType ID = new WeaveTokenType("ID");
  IElementType IF = new WeaveTokenType("if");
  IElementType IMPORT_DIRECTIVE_KEYWORD = new WeaveTokenType("IMPORT_DIRECTIVE_KEYWORD");
  IElementType INPUT_DIRECTIVE_KEYWORD = new WeaveTokenType("input");
  IElementType INTEGER_LITERAL = new WeaveTokenType("INTEGER_LITERAL");
  IElementType IS = new WeaveTokenType("is");
  IElementType LESS = new WeaveTokenType("<");
  IElementType LESS_EQUAL = new WeaveTokenType("<=");
  IElementType LINE_COMMENT = new WeaveTokenType("LINE_COMMENT");
  IElementType L_BRACKET = new WeaveTokenType("[");
  IElementType L_CURLY = new WeaveTokenType("{");
  IElementType L_PARREN = new WeaveTokenType("(");
  IElementType MATCHES_KEYWORD = new WeaveTokenType("matches");
  IElementType MATCH_KEYWORD = new WeaveTokenType("match");
  IElementType MIME_TYPE_KEYWORD = new WeaveTokenType("MIME_TYPE_KEYWORD");
  IElementType MINUS = new WeaveTokenType("-");
  IElementType MODULO = new WeaveTokenType("%");
  IElementType MULTIPLY = new WeaveTokenType("*");
  IElementType NAMESPACE_DIRECTIVE_KEYWORD = new WeaveTokenType("ns");
  IElementType NAMESPACE_URI = new WeaveTokenType("NAMESPACE_URI");
  IElementType NOT_EQUAL = new WeaveTokenType("!=");
  IElementType NOT_KEYWORD = new WeaveTokenType("not");
  IElementType NULL_LITERAL_KEYWORD = new WeaveTokenType("NULL_LITERAL_KEYWORD");
  IElementType OPEN_CLOSE_KEYWORD = new WeaveTokenType("{|");
  IElementType OPEN_CLOSE_ORDERED_KEYWORD = new WeaveTokenType("{-|");
  IElementType OPEN_ORDERED_KEYWORD = new WeaveTokenType("{-");
  IElementType OR = new WeaveTokenType("|");
  IElementType OR_KEYWORD = new WeaveTokenType("or");
  IElementType OUTPUT_DIRECTIVE_KEYWORD = new WeaveTokenType("output");
  IElementType PACKAGE_SEPARATOR = new WeaveTokenType("::");
  IElementType PLUS = new WeaveTokenType("+");
  IElementType QUESTION = new WeaveTokenType("?");
  IElementType RULE_ANY_DATE = new WeaveTokenType("RULE_ANY_DATE");
  IElementType RULE_ANY_REGEX = new WeaveTokenType("RULE_ANY_REGEX");
  IElementType RULE_NULL_LITERAL = new WeaveTokenType("null");
  IElementType R_BRACKET = new WeaveTokenType("]");
  IElementType R_CURLY = new WeaveTokenType("}");
  IElementType R_PARREN = new WeaveTokenType(")");
  IElementType SIMILAR = new WeaveTokenType("~=");
  IElementType SINGLE_QUOTED_STRING = new WeaveTokenType("SINGLE_QUOTED_STRING");
  IElementType SUB_TYPE = new WeaveTokenType("<:");
  IElementType TILDE = new WeaveTokenType("~");
  IElementType TRUE_LITERAL = new WeaveTokenType("true");
  IElementType TYPE_DIRECTIVE_KEYWORD = new WeaveTokenType("type");
  IElementType UNDERSCORE = new WeaveTokenType("_");
  IElementType UNLESS = new WeaveTokenType("UNLESS");
  IElementType USING = new WeaveTokenType("USING");
  IElementType VAR_DIRECTIVE_KEYWORD = new WeaveTokenType("var");
  IElementType VERSION_DIRECTIVE_KEYWORD = new WeaveTokenType("%dw");
  IElementType XOR = new WeaveTokenType("^");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADDITION_SUBTRACTION_EXPRESSION) {
        return new WeaveAdditionSubtractionExpressionImpl(node);
      }
      else if (type == AND_EXPRESSION) {
        return new WeaveAndExpressionImpl(node);
      } else if (type == ANNOTATION) {
         return new WeaveAnnotationImpl(node);
       } else if (type == ANNOTATION_ARGUMENT) {
         return new WeaveAnnotationArgumentImpl(node);
       } else if (type == ANNOTATION_ARGUMENTS) {
         return new WeaveAnnotationArgumentsImpl(node);
       } else if (type == ANY_DATE_LITERAL) {
         return new WeaveAnyDateLiteralImpl(node);
       } else if (type == ARRAY_DECONSTRUCT_PATTERN) {
         return new WeaveArrayDeconstructPatternImpl(node);
       } else if (type == ARRAY_EXPRESSION) {
         return new WeaveArrayExpressionImpl(node);
       } else if (type == AS_EXPRESSION) {
         return new WeaveAsExpressionImpl(node);
       } else if (type == ATTRIBUTES) {
         return new WeaveAttributesImpl(node);
       } else if (type == ATTRIBUTES_TYPE) {
         return new WeaveAttributesTypeImpl(node);
       } else if (type == ATTRIBUTE_SELECTOR) {
         return new WeaveAttributeSelectorImpl(node);
       } else if (type == BINARY_EXPRESSION) {
         return new WeaveBinaryExpressionImpl(node);
       } else if (type == BODY) {
         return new WeaveBodyImpl(node);
       } else if (type == BOOLEAN_LITERAL) {
         return new WeaveBooleanLiteralImpl(node);
       } else if (type == BRACKET_SELECTOR_EXPRESSION) {
         return new WeaveBracketSelectorExpressionImpl(node);
       } else if (type == CLOSE_OBJECT_TYPE) {
         return new WeaveCloseObjectTypeImpl(node);
       } else if (type == CLOSE_ORDERED_OBJECT_TYPE) {
         return new WeaveCloseOrderedObjectTypeImpl(node);
       } else if (type == CONDITIONAL_ATTRIBUTE) {
         return new WeaveConditionalAttributeImpl(node);
       } else if (type == CONDITIONAL_EXPRESSION) {
         return new WeaveConditionalExpressionImpl(node);
       } else if (type == CONDITIONAL_KEY_VALUE_PAIR) {
         return new WeaveConditionalKeyValuePairImpl(node);
       } else if (type == CONTAINER_MODULE_IDENTIFIER) {
         return new WeaveContainerModuleIdentifierImpl(node);
       } else if (type == CUSTOM_INTERPOLATION_STRING) {
         return new WeaveCustomInterpolationStringImpl(node);
       } else if (type == CUSTOM_INTERPOLATOR_EXPRESSION) {
         return new WeaveCustomInterpolatorExpressionImpl(node);
       } else if (type == CUSTOM_LOADER) {
         return new WeaveCustomLoaderImpl(node);
       } else if (type == DATA_FORMAT) {
         return new WeaveDataFormatImpl(node);
       } else if (type == DECLARED_NAMESPACE) {
         return new WeaveDeclaredNamespaceImpl(node);
       } else if (type == DEFAULT_PATTERN) {
         return new WeaveDefaultPatternImpl(node);
       } else if (type == DEFAULT_VALUE_EXPRESSION) {
         return new WeaveDefaultValueExpressionImpl(node);
       } else if (type == DIRECTIVE) {
         return new WeaveDirectiveImpl(node);
       } else if (type == DOCUMENT) {
         return new WeaveDocumentImpl(node);
       } else if (type == DOT_SELECTOR_EXPRESSION) {
         return new WeaveDotSelectorExpressionImpl(node);
       } else if (type == DO_EXPRESSION) {
         return new WeaveDoExpressionImpl(node);
       } else if (type == DYNAMIC_ATTRIBUTE) {
         return new WeaveDynamicAttributeImpl(node);
       } else if (type == DYNAMIC_KEY_VALUE_PAIR) {
         return new WeaveDynamicKeyValuePairImpl(node);
       } else if (type == DYNAMIC_RETURN) {
         return new WeaveDynamicReturnImpl(node);
       } else if (type == EMPTY_ARRAY_PATTERN) {
         return new WeaveEmptyArrayPatternImpl(node);
       } else if (type == EMPTY_OBJECT_PATTERN) {
         return new WeaveEmptyObjectPatternImpl(node);
       } else if (type == ENCLOSED_EXPRESSION) {
         return new WeaveEnclosedExpressionImpl(node);
       } else if (type == EQUALITY_EXPRESSION) {
         return new WeaveEqualityExpressionImpl(node);
       } else if (type == EXPRESSION_PATTERN) {
         return new WeaveExpressionPatternImpl(node);
       } else if (type == FQN_IDENTIFIER) {
         return new WeaveFqnIdentifierImpl(node);
       } else if (type == FUNCTION_CALL_ARGUMENTS) {
         return new WeaveFunctionCallArgumentsImpl(node);
       } else if (type == FUNCTION_CALL_EXPRESSION) {
         return new WeaveFunctionCallExpressionImpl(node);
       } else if (type == FUNCTION_DEFINITION) {
         return new WeaveFunctionDefinitionImpl(node);
       } else if (type == FUNCTION_DIRECTIVE) {
         return new WeaveFunctionDirectiveImpl(node);
       } else if (type == FUNCTION_PARAMETER) {
         return new WeaveFunctionParameterImpl(node);
       } else if (type == GREATER_THAN_EXPRESSION) {
         return new WeaveGreaterThanExpressionImpl(node);
       } else if (type == HEADER) {
         return new WeaveHeaderImpl(node);
       } else if (type == IDENTIFIER) {
         return new WeaveIdentifierImpl(node);
       } else if (type == IMPORTED_ELEMENT) {
         return new WeaveImportedElementImpl(node);
       } else if (type == IMPORT_DIRECTIVE) {
         return new WeaveImportDirectiveImpl(node);
       } else if (type == INPUT_DIRECTIVE) {
         return new WeaveInputDirectiveImpl(node);
       } else if (type == INTERSECTION_TYPE) {
         return new WeaveIntersectionTypeImpl(node);
       } else if (type == IS_EXPRESSION) {
         return new WeaveIsExpressionImpl(node);
       } else if (type == KEY) {
         return new WeaveKeyImpl(node);
       } else if (type == KEY_TYPE) {
         return new WeaveKeyTypeImpl(node);
       } else if (type == KEY_VALUE_PAIR_TYPE) {
         return new WeaveKeyValuePairTypeImpl(node);
       } else if (type == LAMBDA_LITERAL) {
         return new WeaveLambdaLiteralImpl(node);
       } else if (type == LAMBDA_TYPE) {
         return new WeaveLambdaTypeImpl(node);
       } else if (type == LAMBDA_TYPE_PARAMETER) {
         return new WeaveLambdaTypeParameterImpl(node);
       } else if (type == LEFT_SHIFT_EXPRESSION) {
         return new WeaveLeftShiftExpressionImpl(node);
       } else if (type == LITERAL_PATTERN) {
         return new WeaveLiteralPatternImpl(node);
       } else if (type == MATCH_EXPRESSION) {
         return new WeaveMatchExpressionImpl(node);
       } else if (type == MODULE_REFERENCE) {
         return new WeaveModuleReferenceImpl(node);
       } else if (type == MULTIPLE_KEY_VALUE_PAIR_OBJ) {
         return new WeaveMultipleKeyValuePairObjImpl(node);
       } else if (type == MULTIPLICATION_DIVISION_EXPRESSION) {
         return new WeaveMultiplicationDivisionExpressionImpl(node);
       } else if (type == MULTI_VALUE_SELECTOR) {
         return new WeaveMultiValueSelectorImpl(node);
       } else if (type == NAMED_LITERAL_PATTERN) {
         return new WeaveNamedLiteralPatternImpl(node);
       } else if (type == NAMED_REGEX_PATTERN) {
         return new WeaveNamedRegexPatternImpl(node);
       } else if (type == NAMED_TYPE_PATTERN) {
         return new WeaveNamedTypePatternImpl(node);
       } else if (type == NAMESPACE_DEFINITION) {
         return new WeaveNamespaceDefinitionImpl(node);
       } else if (type == NAMESPACE_DIRECTIVE) {
         return new WeaveNamespaceDirectiveImpl(node);
       } else if (type == NAMESPACE_SELECTOR) {
         return new WeaveNamespaceSelectorImpl(node);
       } else if (type == NAME_TYPE) {
         return new WeaveNameTypeImpl(node);
       } else if (type == NOT_EXPRESSION) {
         return new WeaveNotExpressionImpl(node);
       } else if (type == NULL_LITERAL) {
         return new WeaveNullLiteralImpl(node);
       } else if (type == NUMBER_LITERAL) {
         return new WeaveNumberLiteralImpl(node);
       } else if (type == OBJECT_DECONSTRUCT_EXPRESSION) {
         return new WeaveObjectDeconstructExpressionImpl(node);
       } else if (type == OBJECT_DECONSTRUCT_PATTERN) {
         return new WeaveObjectDeconstructPatternImpl(node);
       } else if (type == OBJECT_EXPRESSION) {
         return new WeaveObjectExpressionImpl(node);
       } else if (type == OBJECT_SELECTOR) {
         return new WeaveObjectSelectorImpl(node);
       } else if (type == OBJECT_TYPE) {
         return new WeaveObjectTypeImpl(node);
       } else if (type == OPTIONS) {
         return new WeaveOptionsImpl(node);
       } else if (type == OPTION_ELEMENT) {
         return new WeaveOptionElementImpl(node);
       } else if (type == ORDERED_OBJECT_TYPE) {
         return new WeaveOrderedObjectTypeImpl(node);
       } else if (type == OR_EXPRESSION) {
         return new WeaveOrExpressionImpl(node);
       } else if (type == OUTPUT_DIRECTIVE) {
         return new WeaveOutputDirectiveImpl(node);
       } else if (type == PATTERN_MATCHER_EXPRESSION) {
         return new WeavePatternMatcherExpressionImpl(node);
       } else if (type == QUALIFIED_NAME) {
         return new WeaveQualifiedNameImpl(node);
       } else if (type == REFERENCE_TYPE) {
         return new WeaveReferenceTypeImpl(node);
       } else if (type == REGEX_LITERAL) {
         return new WeaveRegexLiteralImpl(node);
       } else if (type == REGEX_PATTERN) {
         return new WeaveRegexPatternImpl(node);
       } else if (type == RIGHT_SHIFT_EXPRESSION) {
         return new WeaveRightShiftExpressionImpl(node);
       } else if (type == SCHEMA) {
         return new WeaveSchemaImpl(node);
       } else if (type == SCHEMA_ELEMENT) {
         return new WeaveSchemaElementImpl(node);
       } else if (type == SCHEMA_SELECTOR) {
         return new WeaveSchemaSelectorImpl(node);
       } else if (type == SELECTOR) {
         return new WeaveSelectorImpl(node);
       } else if (type == SIMPLE_ATTRIBUTE) {
         return new WeaveSimpleAttributeImpl(node);
       } else if (type == SIMPLE_KEY_VALUE_PAIR) {
         return new WeaveSimpleKeyValuePairImpl(node);
       } else if (type == SINGLE_KEY_VALUE_PAIR_OBJ) {
         return new WeaveSingleKeyValuePairObjImpl(node);
       } else if (type == STRING_LITERAL) {
         return new WeaveStringLiteralImpl(node);
       } else if (type == TYPE_DEFINITION) {
         return new WeaveTypeDefinitionImpl(node);
       } else if (type == TYPE_DIRECTIVE) {
         return new WeaveTypeDirectiveImpl(node);
       } else if (type == TYPE_PARAMETER) {
         return new WeaveTypeParameterImpl(node);
       } else if (type == TYPE_PATTERN) {
         return new WeaveTypePatternImpl(node);
       } else if (type == UNARY_MINUS_EXPRESSION) {
         return new WeaveUnaryMinusExpressionImpl(node);
       } else if (type == UNDEFINED_LITERAL) {
         return new WeaveUndefinedLiteralImpl(node);
       } else if (type == UNION_TYPE) {
         return new WeaveUnionTypeImpl(node);
       } else if (type == USING_EXPRESSION) {
         return new WeaveUsingExpressionImpl(node);
       } else if (type == VALUE_SELECTOR) {
         return new WeaveValueSelectorImpl(node);
       } else if (type == VARIABLE_DEFINITION) {
         return new WeaveVariableDefinitionImpl(node);
       } else if (type == VARIABLE_DIRECTIVE) {
         return new WeaveVariableDirectiveImpl(node);
       } else if (type == VARIABLE_REFERENCE_EXPRESSION) {
         return new WeaveVariableReferenceExpressionImpl(node);
       } else if (type == VERSION_DIRECTIVE) {
         return new WeaveVersionDirectiveImpl(node);
       }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
