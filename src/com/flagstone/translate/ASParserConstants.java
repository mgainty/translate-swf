/* Generated By:JavaCC: Do not edit this line. ASParserConstants.java */
package com.flagstone.translate;

public interface ASParserConstants {

  int EOF = 0;
  int BOOLEAN_LITERAL = 8;
  int NULL_LITERAL = 9;
  int INTEGER_LITERAL = 10;
  int DECIMAL_LITERAL = 11;
  int HEX_LITERAL = 12;
  int FLOATING_POINT_LITERAL = 13;
  int EXPONENT = 14;
  int STRING_LITERAL = 15;
  int DOUBLE_QUOTE = 16;
  int SINGLE_QUOTE = 17;
  int ASSIGN = 18;
  int ASSIGN_ADD = 19;
  int ASSIGN_SUB = 20;
  int ASSIGN_MUL = 21;
  int ASSIGN_DIV = 22;
  int ASSIGN_MOD = 23;
  int ASSIGN_LSL = 24;
  int ASSIGN_ASR = 25;
  int ASSIGN_LSR = 26;
  int ASSIGN_AND = 27;
  int ASSIGN_OR = 28;
  int ASSIGN_XOR = 29;
  int LOGICAL_AND = 30;
  int LOGICAL_OR = 31;
  int LOGICAL_NOT = 32;
  int EQ = 33;
  int GT = 34;
  int LT = 35;
  int GTE = 36;
  int LTE = 37;
  int NE = 38;
  int BIT_AND = 39;
  int BIT_OR = 40;
  int BIT_XOR = 41;
  int BIT_NOT = 42;
  int LSL = 43;
  int LSR = 44;
  int ASR = 45;
  int PLUS = 46;
  int MINUS = 47;
  int MULTIPLY = 48;
  int DIVIDE = 49;
  int MOD = 50;
  int INC = 51;
  int DEC = 52;
  int STRICT_EQ = 53;
  int STRICT_NEQ = 54;
  int ADD = 55;
  int AND = 56;
  int OR = 57;
  int STRING_EQ = 58;
  int STRING_NEQ = 59;
  int STRING_LE = 60;
  int STRING_GT = 61;
  int STRING_GE = 62;
  int IF = 63;
  int ELSE = 64;
  int WHILE = 65;
  int DO = 66;
  int FOR = 67;
  int IN = 68;
  int BREAK = 69;
  int CONTINUE = 70;
  int DELETE = 71;
  int INSTANCEOF = 72;
  int RETURN = 73;
  int WITH = 74;
  int NEW = 75;
  int FUNCTION = 76;
  int VAR = 77;
  int ONCLIPEVENT = 78;
  int ON = 79;
  int TRY = 80;
  int CATCH = 81;
  int FINALLY = 82;
  int THROW = 83;
  int SWITCH = 84;
  int CASE = 85;
  int DEFAULT_CASE = 86;
  int INITCLIP = 87;
  int ENDINITCLIP = 88;
  int IDENTIFIER = 89;
  int LETTER = 90;
  int DIGIT = 91;

  int DEFAULT = 0;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\f\"",
    "\"\\r\"",
    "\"\\n\"",
    "<token of kind 6>",
    "<token of kind 7>",
    "<BOOLEAN_LITERAL>",
    "\"null\"",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<EXPONENT>",
    "<STRING_LITERAL>",
    "<DOUBLE_QUOTE>",
    "<SINGLE_QUOTE>",
    "\"=\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"%=\"",
    "\"<<=\"",
    "\">>=\"",
    "\">>>=\"",
    "\"&=\"",
    "\"|=\"",
    "\"^=\"",
    "\"&&\"",
    "\"||\"",
    "\"!\"",
    "\"==\"",
    "\">\"",
    "\"<\"",
    "\">=\"",
    "\"<=\"",
    "\"!=\"",
    "\"&\"",
    "\"|\"",
    "\"^\"",
    "\"~\"",
    "\"<<\"",
    "\">>>\"",
    "\">>\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"++\"",
    "\"--\"",
    "\"===\"",
    "\"!==\"",
    "\"add\"",
    "\"and\"",
    "\"or\"",
    "\"eq\"",
    "\"ne\"",
    "\"le\"",
    "\"gt\"",
    "\"ge\"",
    "\"if\"",
    "\"else\"",
    "\"while\"",
    "\"do\"",
    "\"for\"",
    "\"in\"",
    "\"break\"",
    "\"continue\"",
    "\"delete\"",
    "\"instanceof\"",
    "\"return\"",
    "\"with\"",
    "\"new\"",
    "\"function\"",
    "\"var\"",
    "\"onClipEvent\"",
    "\"on\"",
    "\"try\"",
    "\"catch\"",
    "\"finally\"",
    "\"throw\"",
    "\"switch\"",
    "\"case\"",
    "\"default\"",
    "\"#initclip\"",
    "\"#endinitclip\"",
    "<IDENTIFIER>",
    "<LETTER>",
    "<DIGIT>",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\";\"",
    "\",\"",
    "\":\"",
    "\"?\"",
    "\"[\"",
    "\"]\"",
    "\".\"",
  };

}
