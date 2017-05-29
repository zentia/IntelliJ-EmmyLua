/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.tang.intellij.lua.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import static com.tang.intellij.lua.psi.LuaTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>lua.flex</tt>
 */
public class _LuaLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int xDOUBLE_QUOTED_STRING = 2;
  public static final int xSINGLE_QUOTED_STRING = 4;
  public static final int xBLOCK_STRING = 6;
  public static final int xCOMMENT = 8;
  public static final int xBLOCK_COMMENT = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\33\1\3\1\2\1\27\1\30\1\1\22\33\1\3\1\52\1\31\1\51\1\33\1\57\1\71\1\34"+
    "\1\61\1\62\1\56\1\7\1\65\1\14\1\13\1\60\1\10\11\5\1\67\1\66\1\54\1\25\1\53"+
    "\2\33\4\12\1\6\1\12\21\4\1\11\2\4\1\24\1\32\1\26\1\70\1\4\1\33\1\35\1\36\1"+
    "\44\1\23\1\16\1\42\1\17\1\47\1\20\1\4\1\37\1\40\1\4\1\22\1\21\1\46\1\4\1\15"+
    "\1\41\1\45\1\43\1\4\1\50\1\11\2\4\1\63\1\72\1\64\1\55\6\33\1\27\32\33\1\0"+
    "\337\33\1\0\177\33\13\0\35\33\2\27\5\33\1\0\57\33\1\0\40\33");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\1\1\1\2\1\3\1\4\1\5\1\4\1\6"+
    "\1\7\7\3\1\10\1\11\1\12\1\13\1\14\7\3"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\2\36\1\1\1\0\2\37\1\0\1\4\1\0"+
    "\1\4\1\40\1\41\4\3\1\42\1\43\1\44\2\3"+
    "\1\45\1\46\1\0\1\47\12\3\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\36\4\0\1\60"+
    "\2\0\2\4\1\61\2\0\2\3\1\62\2\3\1\63"+
    "\1\64\1\65\2\3\1\66\6\3\1\0\1\60\1\67"+
    "\3\0\2\3\1\70\1\71\5\3\1\72\1\73\1\3"+
    "\1\74\1\0\1\75\2\0\3\3\1\76\1\77\1\100"+
    "\1\3\1\101\1\102\3\0\1\103\1\104\1\105\1\3"+
    "\3\0\1\3\1\106\1\0\1\107\1\106\2\0\2\110";

  private static int [] zzUnpackAction() {
    int [] result = new int[174];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\73\0\166\0\261\0\354\0\u0127\0\u0162\0\u019d"+
    "\0\u01d8\0\u0213\0\u0162\0\u024e\0\u0289\0\u02c4\0\u02ff\0\u033a"+
    "\0\u0375\0\u03b0\0\u03eb\0\u0426\0\u0461\0\u049c\0\u04d7\0\u0162"+
    "\0\u0162\0\u0162\0\u0512\0\u054d\0\u0588\0\u05c3\0\u05fe\0\u0639"+
    "\0\u0674\0\u06af\0\u06ea\0\u0725\0\u0760\0\u0162\0\u0162\0\u079b"+
    "\0\u0162\0\u0162\0\u0162\0\u0162\0\u0162\0\u0162\0\u07d6\0\u0162"+
    "\0\u0162\0\u0162\0\u0811\0\u084c\0\u0887\0\u08c2\0\u0162\0\u08fd"+
    "\0\u0938\0\u0973\0\u09ae\0\u09e9\0\u0a24\0\u0a5f\0\u0a9a\0\u0ad5"+
    "\0\u0b10\0\u0b4b\0\u01d8\0\u01d8\0\u01d8\0\u0b86\0\u0bc1\0\u01d8"+
    "\0\u0162\0\u049c\0\u0162\0\u0bfc\0\u0c37\0\u0c72\0\u0cad\0\u0ce8"+
    "\0\u0d23\0\u0d5e\0\u0d99\0\u0dd4\0\u0e0f\0\u0162\0\u0162\0\u0162"+
    "\0\u0162\0\u0162\0\u0162\0\u0162\0\u0162\0\u0162\0\u0e4a\0\u0e85"+
    "\0\u0ec0\0\u0887\0\u0efb\0\u0f36\0\u09e9\0\u0f71\0\u09ae\0\u0162"+
    "\0\u0fac\0\u0fe7\0\u1022\0\u105d\0\u01d8\0\u1098\0\u10d3\0\u01d8"+
    "\0\u01d8\0\u01d8\0\u110e\0\u1149\0\u01d8\0\u1184\0\u11bf\0\u11fa"+
    "\0\u1235\0\u1270\0\u12ab\0\u12e6\0\u1321\0\u135c\0\u1397\0\u13d2"+
    "\0\u140d\0\u1448\0\u1483\0\u14be\0\u01d8\0\u14f9\0\u1534\0\u156f"+
    "\0\u15aa\0\u15e5\0\u01d8\0\u01d8\0\u1620\0\u12e6\0\u165b\0\u1696"+
    "\0\u16d1\0\u170c\0\u1747\0\u1782\0\u17bd\0\u01d8\0\u01d8\0\u01d8"+
    "\0\u17f8\0\u01d8\0\u01d8\0\u1833\0\u186e\0\u18a9\0\u01d8\0\u01d8"+
    "\0\u01d8\0\u18e4\0\u191f\0\u195a\0\u1995\0\u19d0\0\u1a0b\0\u1a46"+
    "\0\u01d8\0\u1a81\0\u1abc\0\u1af7\0\u1b32\0\u1b6d";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[174];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\7\3\10\1\11\1\12\1\11\1\13\1\14\2\11"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\7\1\10\1\31\2\7"+
    "\1\32\1\33\1\34\1\11\1\35\1\11\1\36\1\37"+
    "\1\11\1\40\2\11\1\41\1\42\1\7\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\1\61\1\62\31\0\1\63"+
    "\75\0\1\64\36\0\24\7\1\65\46\7\14\0\1\66"+
    "\56\0\14\67\1\70\56\67\74\0\3\10\24\0\1\10"+
    "\46\0\3\11\1\0\3\11\2\0\7\11\11\0\14\11"+
    "\27\0\1\12\1\71\1\0\1\12\2\0\1\72\2\0"+
    "\1\71\61\0\1\12\1\71\1\0\1\12\1\73\1\0"+
    "\1\72\2\0\1\71\61\0\1\74\2\0\1\74\2\0"+
    "\1\75\73\0\1\76\62\0\3\11\1\0\3\11\2\0"+
    "\1\11\1\77\5\11\11\0\14\11\26\0\3\11\1\0"+
    "\3\11\2\0\5\11\1\100\1\11\11\0\3\11\1\101"+
    "\10\11\26\0\3\11\1\0\3\11\2\0\4\11\1\102"+
    "\2\11\11\0\14\11\26\0\3\11\1\0\3\11\2\0"+
    "\5\11\1\103\1\11\11\0\5\11\1\104\6\11\26\0"+
    "\3\11\1\0\3\11\2\0\1\105\6\11\11\0\14\11"+
    "\26\0\3\11\1\0\3\11\2\0\3\11\1\106\1\107"+
    "\2\11\11\0\14\11\26\0\3\11\1\0\3\11\2\0"+
    "\4\11\1\110\2\11\11\0\14\11\46\0\1\111\1\112"+
    "\72\0\1\113\51\0\3\11\1\0\3\11\2\0\5\11"+
    "\1\114\1\11\11\0\14\11\26\0\3\11\1\0\3\11"+
    "\2\0\1\115\6\11\11\0\14\11\26\0\3\11\1\0"+
    "\3\11\2\0\4\11\1\116\2\11\11\0\14\11\26\0"+
    "\3\11\1\0\3\11\2\0\4\11\1\117\2\11\11\0"+
    "\1\120\5\11\1\121\5\11\26\0\3\11\1\0\3\11"+
    "\2\0\5\11\1\122\1\11\11\0\14\11\26\0\3\11"+
    "\1\0\3\11\2\0\1\123\6\11\11\0\12\11\1\124"+
    "\1\11\26\0\3\11\1\0\3\11\2\0\7\11\11\0"+
    "\12\11\1\125\1\11\74\0\1\126\45\0\1\127\25\0"+
    "\1\130\44\0\1\131\26\0\1\132\43\0\1\133\125\0"+
    "\1\134\101\0\1\135\3\0\31\63\1\136\1\137\40\63"+
    "\32\64\1\140\1\64\1\136\36\64\24\0\1\141\1\142"+
    "\61\0\1\143\72\0\1\144\63\0\1\74\1\0\1\145"+
    "\1\74\3\0\1\145\63\0\1\146\2\0\1\146\67\0"+
    "\2\147\1\0\1\147\1\0\1\147\3\0\1\147\4\0"+
    "\1\147\11\0\2\147\3\0\1\147\1\0\1\147\33\0"+
    "\1\74\2\0\1\74\75\0\1\150\74\0\1\151\1\152"+
    "\60\0\3\11\1\0\3\11\2\0\7\11\11\0\10\11"+
    "\1\153\1\154\2\11\26\0\3\11\1\0\3\11\2\0"+
    "\6\11\1\155\11\0\14\11\26\0\3\11\1\0\3\11"+
    "\2\0\7\11\11\0\4\11\1\156\7\11\26\0\3\11"+
    "\1\0\3\11\2\0\7\11\11\0\10\11\1\157\3\11"+
    "\26\0\3\11\1\0\3\11\2\0\7\11\11\0\3\11"+
    "\1\160\10\11\26\0\3\11\1\0\3\11\2\0\7\11"+
    "\11\0\10\11\1\161\3\11\26\0\3\11\1\0\3\11"+
    "\2\0\6\11\1\162\11\0\14\11\26\0\3\11\1\0"+
    "\3\11\2\0\1\11\1\163\5\11\11\0\14\11\26\0"+
    "\3\11\1\0\3\11\2\0\7\11\11\0\7\11\1\164"+
    "\4\11\26\0\3\11\1\0\3\11\2\0\1\165\6\11"+
    "\11\0\14\11\26\0\3\11\1\0\3\11\2\0\7\11"+
    "\11\0\3\11\1\166\10\11\26\0\3\11\1\0\3\11"+
    "\2\0\5\11\1\167\1\11\11\0\14\11\26\0\3\11"+
    "\1\0\3\11\2\0\7\11\11\0\10\11\1\170\3\11"+
    "\26\0\3\11\1\0\3\11\2\0\7\11\11\0\6\11"+
    "\1\171\5\11\26\0\3\11\1\0\3\11\2\0\1\11"+
    "\1\172\5\11\11\0\14\11\26\0\3\11\1\0\3\11"+
    "\2\0\3\11\1\173\3\11\11\0\14\11\23\0\2\63"+
    "\1\0\23\63\2\0\42\63\1\0\2\64\1\0\23\64"+
    "\2\0\42\64\26\141\1\174\44\141\1\175\2\0\11\175"+
    "\1\176\12\175\2\0\42\175\24\0\1\177\53\0\1\146"+
    "\1\71\1\0\1\146\5\0\1\71\72\0\1\200\76\0"+
    "\1\201\54\0\3\11\1\0\3\11\2\0\7\11\11\0"+
    "\6\11\1\202\5\11\26\0\3\11\1\0\3\11\2\0"+
    "\1\11\1\203\5\11\11\0\14\11\26\0\3\11\1\0"+
    "\3\11\2\0\1\11\1\204\5\11\11\0\14\11\26\0"+
    "\3\11\1\0\3\11\2\0\4\11\1\205\2\11\11\0"+
    "\14\11\26\0\3\11\1\0\3\11\2\0\7\11\11\0"+
    "\1\206\13\11\26\0\3\11\1\0\3\11\2\0\7\11"+
    "\11\0\1\207\13\11\26\0\3\11\1\0\3\11\2\0"+
    "\7\11\11\0\4\11\1\210\7\11\26\0\3\11\1\0"+
    "\3\11\2\0\7\11\11\0\7\11\1\211\4\11\26\0"+
    "\3\11\1\0\3\11\2\0\3\11\1\212\3\11\11\0"+
    "\14\11\26\0\3\11\1\0\3\11\2\0\1\11\1\213"+
    "\5\11\11\0\14\11\26\0\3\11\1\0\3\11\2\0"+
    "\5\11\1\214\1\11\11\0\14\11\26\0\3\11\1\0"+
    "\3\11\2\0\7\11\11\0\3\11\1\215\10\11\22\0"+
    "\25\141\1\174\1\216\44\141\1\175\2\0\24\175\2\0"+
    "\42\175\1\176\1\0\1\217\24\176\2\0\42\176\24\0"+
    "\1\220\1\177\64\0\1\221\76\0\1\222\53\0\3\11"+
    "\1\0\3\11\2\0\1\223\6\11\11\0\14\11\26\0"+
    "\3\11\1\0\3\11\2\0\7\11\11\0\1\224\13\11"+
    "\26\0\3\11\1\0\3\11\2\0\3\11\1\225\3\11"+
    "\11\0\14\11\26\0\3\11\1\0\3\11\2\0\7\11"+
    "\11\0\2\11\1\226\11\11\26\0\3\11\1\0\3\11"+
    "\2\0\7\11\11\0\3\11\1\227\10\11\26\0\3\11"+
    "\1\0\3\11\2\0\1\11\1\230\5\11\11\0\14\11"+
    "\26\0\3\11\1\0\3\11\2\0\7\11\11\0\10\11"+
    "\1\231\3\11\26\0\3\11\1\0\3\11\2\0\7\11"+
    "\11\0\3\11\1\232\10\11\26\0\3\11\1\0\3\11"+
    "\2\0\1\11\1\233\5\11\11\0\14\11\25\0\1\217"+
    "\10\0\1\234\13\0\1\217\42\0\73\220\20\0\1\235"+
    "\67\0\1\236\61\0\3\11\1\0\3\11\2\0\5\11"+
    "\1\237\1\11\11\0\14\11\26\0\3\11\1\0\3\11"+
    "\2\0\7\11\11\0\10\11\1\240\3\11\26\0\3\11"+
    "\1\0\3\11\2\0\7\11\11\0\5\11\1\241\6\11"+
    "\26\0\3\11\1\0\3\11\2\0\3\11\1\242\3\11"+
    "\11\0\14\11\36\0\1\243\77\0\1\244\67\0\1\245"+
    "\60\0\3\11\1\0\3\11\2\0\4\11\1\246\2\11"+
    "\11\0\14\11\36\0\1\176\100\0\1\247\67\0\1\250"+
    "\57\0\3\11\1\0\3\11\2\0\5\11\1\251\1\11"+
    "\11\0\14\11\25\0\1\252\24\0\1\252\62\0\1\253"+
    "\52\0\1\252\2\0\70\252\21\0\1\254\73\0\1\255"+
    "\53\0\1\256\24\0\1\256\42\0\1\256\2\0\70\256";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7080];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\6\0\1\11\3\1\1\11\14\1\3\11\13\1\2\11"+
    "\1\1\6\11\1\1\3\11\3\1\1\0\1\11\1\1"+
    "\1\0\1\1\1\0\15\1\1\11\1\0\1\11\12\1"+
    "\11\11\4\0\1\1\2\0\2\1\1\11\2\0\21\1"+
    "\1\0\2\1\3\0\15\1\1\0\1\1\2\0\11\1"+
    "\3\0\4\1\3\0\2\1\1\0\2\1\2\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[174];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public _LuaLexer() {
        this(null);
    }

    private int nBrackets = 0;
    private boolean checkAhead(char c, int offset) {
        return this.zzMarkedPos >= this.zzBuffer.length()?false:this.zzBuffer.charAt(this.zzMarkedPos + offset) == c;
    }

    private boolean checkBlock() {
        nBrackets = 0;
        if (checkAhead('[', 0)) {
            int n = 0;
            while (checkAhead('=', n + 1)) n++;
            if (checkAhead('[', n + 1)) {
                nBrackets = n;
                return true;
            }
        }
        return false;
    }

    private int checkBlockRedundant() {
        int redundant = -1;
        String cs = yytext().toString();
        StringBuilder s = new StringBuilder("]");
        for (int i = 0; i < nBrackets; i++) s.append('=');
        s.append(']');
        int index = cs.indexOf(s.toString());
        if (index > 0)
            redundant = yylength() - index - nBrackets - 2;
        return redundant;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _LuaLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            }
          case 73: break;
          case 2: 
            { return TokenType.WHITE_SPACE;
            }
          case 74: break;
          case 3: 
            { return ID;
            }
          case 75: break;
          case 4: 
            { return NUMBER;
            }
          case 76: break;
          case 5: 
            { return PLUS;
            }
          case 77: break;
          case 6: 
            { return DOT;
            }
          case 78: break;
          case 7: 
            { return MINUS;
            }
          case 79: break;
          case 8: 
            { return LBRACK;
            }
          case 80: break;
          case 9: 
            { return ASSIGN;
            }
          case 81: break;
          case 10: 
            { return RBRACK;
            }
          case 82: break;
          case 11: 
            { yybegin(xDOUBLE_QUOTED_STRING); yypushback(yylength());
            }
          case 83: break;
          case 12: 
            { yybegin(xSINGLE_QUOTED_STRING); yypushback(yylength());
            }
          case 84: break;
          case 13: 
            { return GETN;
            }
          case 85: break;
          case 14: 
            { return GT;
            }
          case 86: break;
          case 15: 
            { return LT;
            }
          case 87: break;
          case 16: 
            { return BIT_TILDE;
            }
          case 88: break;
          case 17: 
            { return MULT;
            }
          case 89: break;
          case 18: 
            { return MOD;
            }
          case 90: break;
          case 19: 
            { return DIV;
            }
          case 91: break;
          case 20: 
            { return LPAREN;
            }
          case 92: break;
          case 21: 
            { return RPAREN;
            }
          case 93: break;
          case 22: 
            { return LCURLY;
            }
          case 94: break;
          case 23: 
            { return RCURLY;
            }
          case 95: break;
          case 24: 
            { return COMMA;
            }
          case 96: break;
          case 25: 
            { return SEMI;
            }
          case 97: break;
          case 26: 
            { return COLON;
            }
          case 98: break;
          case 27: 
            { return EXP;
            }
          case 99: break;
          case 28: 
            { return BIT_AND;
            }
          case 100: break;
          case 29: 
            { return BIT_OR;
            }
          case 101: break;
          case 30: 
            { yybegin(YYINITIAL); return STRING;
            }
          case 102: break;
          case 31: 
            { yypushback(yylength()); yybegin(xCOMMENT);
            }
          case 103: break;
          case 32: 
            { return CONCAT;
            }
          case 104: break;
          case 33: 
            { boolean block = checkBlock();
        if (block) { yypushback(yylength()); yybegin(xBLOCK_COMMENT); }
        else { yypushback(yylength()); yybegin(xCOMMENT); }
            }
          case 105: break;
          case 34: 
            { return IN;
            }
          case 106: break;
          case 35: 
            { return IF;
            }
          case 107: break;
          case 36: 
            { return OR;
            }
          case 108: break;
          case 37: 
            { return DO;
            }
          case 109: break;
          case 38: 
            { yybegin(xBLOCK_STRING); yypushback(yylength()); checkBlock();
            }
          case 110: break;
          case 39: 
            { return EQ;
            }
          case 111: break;
          case 40: 
            { return SHEBANG;
            }
          case 112: break;
          case 41: 
            { return GE;
            }
          case 113: break;
          case 42: 
            { return BIT_RTRT;
            }
          case 114: break;
          case 43: 
            { return LE;
            }
          case 115: break;
          case 44: 
            { return BIT_LTLT;
            }
          case 116: break;
          case 45: 
            { return NE;
            }
          case 117: break;
          case 46: 
            { return DOUBLE_DIV;
            }
          case 118: break;
          case 47: 
            { return DOUBLE_COLON;
            }
          case 119: break;
          case 48: 
            { yybegin(YYINITIAL);return SHORT_COMMENT;
            }
          case 120: break;
          case 49: 
            { return ELLIPSIS;
            }
          case 121: break;
          case 50: 
            { return END;
            }
          case 122: break;
          case 51: 
            { return NIL;
            }
          case 123: break;
          case 52: 
            { return NOT;
            }
          case 124: break;
          case 53: 
            { return AND;
            }
          case 125: break;
          case 54: 
            { return FOR;
            }
          case 126: break;
          case 55: 
            { yybegin(YYINITIAL);return DOC_COMMENT;
            }
          case 127: break;
          case 56: 
            { return ELSE;
            }
          case 128: break;
          case 57: 
            { return GOTO;
            }
          case 129: break;
          case 58: 
            { return TRUE;
            }
          case 130: break;
          case 59: 
            { return THEN;
            }
          case 131: break;
          case 60: 
            { int redundant = checkBlockRedundant();
        if (redundant != -1) {
            yypushback(redundant);
            yybegin(YYINITIAL); return STRING;
        } else {
            yybegin(YYINITIAL); return TokenType.BAD_CHARACTER;
        }
            }
          case 132: break;
          case 61: 
            { int redundant = checkBlockRedundant();
        if (redundant != -1) {
            yypushback(redundant);
            yybegin(YYINITIAL);return BLOCK_COMMENT; }
        else { yybegin(YYINITIAL);return BLOCK_COMMENT; }
            }
          case 133: break;
          case 62: 
            { return BREAK;
            }
          case 134: break;
          case 63: 
            { return LOCAL;
            }
          case 135: break;
          case 64: 
            { return FALSE;
            }
          case 136: break;
          case 65: 
            { return UNTIL;
            }
          case 137: break;
          case 66: 
            { return WHILE;
            }
          case 138: break;
          case 67: 
            { return RETURN;
            }
          case 139: break;
          case 68: 
            { return REPEAT;
            }
          case 140: break;
          case 69: 
            { return ELSEIF;
            }
          case 141: break;
          case 70: 
            { return REGION;
            }
          case 142: break;
          case 71: 
            { return FUNCTION;
            }
          case 143: break;
          case 72: 
            { return ENDREGION;
            }
          case 144: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
