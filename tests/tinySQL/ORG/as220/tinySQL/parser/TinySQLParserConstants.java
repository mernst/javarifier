/* Generated By:JavaCC: Do not edit this line. TinySQLParserConstants.java */
package ORG.as220.tinySQL.parser;

public interface TinySQLParserConstants
{

  int EOF = 0;
  int WHITESPACE = 1;
  int LETTER = 3;
  int NON_ZERO_DIGIT = 4;
  int DIGIT = 5;
  int HEX_DIGIT = 6;
  int BINARY_DIGIT = 7;
  int UNSIGNED_INTEGER = 8;
  int EXPONENT_PART = 9;
  int NEWLINE = 10;
  int NONQUOTE_CHARACTER = 11;
  int COMMA = 12;
  int PERIOD = 13;
  int COLON = 14;
  int QUOTE = 15;
  int DQUOTE = 16;
  int SEMICOLON = 17;
  int L_PAREN = 18;
  int R_PAREN = 19;
  int QUEST = 20;
  int ADD = 21;
  int AND = 22;
  int ALL = 23;
  int ALTER = 24;
  int AS = 25;
  int ASC = 26;
  int BY = 27;
  int COLUMN = 28;
  int COMPACT = 29;
  int CREATE = 30;
  int DELETE = 31;
  int DESC = 32;
  int DISTINCT = 33;
  int DROP = 34;
  int EXIST = 35;
  int EXISTS = 36;
  int FROM = 37;
  int GROUP = 38;
  int IF = 39;
  int INSERT = 40;
  int INTO = 41;
  int LIMIT = 42;
  int NOT = 43;
  int NULL = 44;
  int OR = 45;
  int ORDER = 46;
  int RENAME = 47;
  int SELECT = 48;
  int SET = 49;
  int TABLE = 50;
  int TO = 51;
  int UPDATE = 52;
  int VALUES = 53;
  int WHERE = 54;
  int CHAR = 55;
  int INT = 56;
  int NUMERIC = 57;
  int DATE = 58;
  int BOOLEAN = 59;
  int FLOAT = 60;
  int BIT = 61;
  int DECIMAL = 62;
  int DOUBLE = 63;
  int REAL = 64;
  int BIGINT = 65;
  int SMALLINT = 66;
  int TINYINT = 67;
  int VARCHAR = 68;
  int LONGVARCHAR = 69;
  int BINARY = 70;
  int VARBINARY = 71;
  int LONGVARBINARY = 72;
  int TIME = 73;
  int TIMESTAMP = 74;
  int BLOB = 75;
  int CLOB = 76;
  int PLUS = 77;
  int MINUS = 78;
  int MULT = 79;
  int DIV = 80;
  int ASSIGN = 81;
  int EQUALS = 82;
  int NOT_EQUALS = 83;
  int LT_EQUALS = 84;
  int GT_EQUALS = 85;
  int LT = 86;
  int GT = 87;
  int BETWEEN = 88;
  int NBETWEEN = 89;
  int LIKE = 90;
  int IDENTIFIER = 91;
  int QUOTED_IDENTIFIER = 92;
  int STRING_LITERAL = 93;
  int JOKER_IDENTIFIER = 94;
  int QUOTED_JOKER_IDENTIFIER = 95;
  int UNSIGNED_NUMERIC_LITERAL = 96;
  int EXACT_NUMERIC_LITERAL = 97;
  int APPROXIMATE_NUMERIC_LITERAL = 98;
  int EXPONENT = 99;
  int MANTISSA = 100;
  int SIGNED_INTEGER = 101;
  int SIGN = 102;
  int SIGNED_NUMERIC_LITERAL = 103;

  int DEFAULT = 0;

  String[] tokenImage = {
    "<EOF>",
    "<WHITESPACE>",
    "<token of kind 2>",
    "<LETTER>",
    "<NON_ZERO_DIGIT>",
    "<DIGIT>",
    "<HEX_DIGIT>",
    "<BINARY_DIGIT>",
    "<UNSIGNED_INTEGER>",
    "<EXPONENT_PART>",
    "<NEWLINE>",
    "<NONQUOTE_CHARACTER>",
    "\",\"",
    "\".\"",
    "\":\"",
    "\"\\\'\"",
    "\"\\\"\"",
    "\";\"",
    "\"(\"",
    "\")\"",
    "\"?\"",
    "\"add\"",
    "\"and\"",
    "\"all\"",
    "\"alter\"",
    "\"as\"",
    "\"asc\"",
    "\"by\"",
    "\"column\"",
    "\"compact\"",
    "\"create\"",
    "\"delete\"",
    "\"desc\"",
    "\"distinct\"",
    "\"drop\"",
    "\"exist\"",
    "\"exists\"",
    "\"from\"",
    "\"group\"",
    "\"if\"",
    "\"insert\"",
    "\"into\"",
    "\"limit\"",
    "\"not\"",
    "\"null\"",
    "\"or\"",
    "\"order\"",
    "\"rename\"",
    "\"select\"",
    "\"set\"",
    "\"table\"",
    "\"to\"",
    "\"update\"",
    "\"values\"",
    "\"where\"",
    "<CHAR>",
    "<INT>",
    "<NUMERIC>",
    "\"date\"",
    "\"boolean\"",
    "\"float\"",
    "\"bit\"",
    "\"decimal\"",
    "\"double\"",
    "\"real\"",
    "<BIGINT>",
    "<SMALLINT>",
    "<TINYINT>",
    "\"varchar\"",
    "\"longvarchar\"",
    "\"binary\"",
    "\"varbinary\"",
    "\"longvarbinary\"",
    "\"time\"",
    "\"timestamp\"",
    "\"blob\"",
    "\"clob\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"=\"",
    "\"==\"",
    "\"<>\"",
    "\"<=\"",
    "\">=\"",
    "\"<\"",
    "\">\"",
    "\"between\"",
    "<NBETWEEN>",
    "\"like\"",
    "<IDENTIFIER>",
    "<QUOTED_IDENTIFIER>",
    "<STRING_LITERAL>",
    "<JOKER_IDENTIFIER>",
    "<QUOTED_JOKER_IDENTIFIER>",
    "<UNSIGNED_NUMERIC_LITERAL>",
    "<EXACT_NUMERIC_LITERAL>",
    "<APPROXIMATE_NUMERIC_LITERAL>",
    "<EXPONENT>",
    "<MANTISSA>",
    "<SIGNED_INTEGER>",
    "<SIGN>",
    "<SIGNED_NUMERIC_LITERAL>",
  };

}
