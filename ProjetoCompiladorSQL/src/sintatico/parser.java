
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package sintatico;

import java.io.*;
import java_cup.runtime.*;
import sintatico.Yylex;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\004\013\000\002\004\003\000\002\003\003" +
    "\000\002\005\003\000\002\005\003\000\002\005\005\000" +
    "\002\006\003\000\002\007\003\000\002\010\003\000\002" +
    "\011\006\000\002\011\005\000\002\011\005\000\002\014" +
    "\003\000\002\012\003\000\002\013\003\000\002\015\004" +
    "\000\002\016\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\044\000\006\003\005\004\010\001\002\000\010\002" +
    "\uffff\003\uffff\004\uffff\001\002\000\010\002\ufffd\003\ufffd" +
    "\004\ufffd\001\002\000\006\014\013\016\015\001\002\000" +
    "\010\002\012\003\005\004\010\001\002\000\006\014\ufffc" +
    "\016\ufffc\001\002\000\010\002\001\003\001\004\001\001" +
    "\002\000\004\002\000\001\002\000\004\005\ufffb\001\002" +
    "\000\004\005\022\001\002\000\010\005\ufff2\011\ufff2\012" +
    "\ufff2\001\002\000\006\005\ufffa\012\017\001\002\000\004" +
    "\016\015\001\002\000\004\005\ufff9\001\002\000\004\015" +
    "\024\001\002\000\004\015\ufff8\001\002\000\004\006\025" +
    "\001\002\000\004\006\ufff7\001\002\000\004\016\ufff6\001" +
    "\002\000\004\016\030\001\002\000\006\007\036\016\040" +
    "\001\002\000\004\013\031\001\002\000\006\016\ufff1\020" +
    "\ufff1\001\002\000\006\016\035\020\034\001\002\000\006" +
    "\007\ufff3\016\ufff3\001\002\000\006\007\ufff0\016\ufff0\001" +
    "\002\000\006\007\ufff4\016\ufff4\001\002\000\004\010\046" +
    "\001\002\000\004\016\015\001\002\000\004\013\031\001" +
    "\002\000\004\016\042\001\002\000\006\007\ufff5\016\ufff5" +
    "\001\002\000\004\011\045\001\002\000\010\002\ufffe\003" +
    "\ufffe\004\ufffe\001\002\000\010\002\uffee\003\uffee\004\uffee" +
    "\001\002\000\004\016\uffef\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\044\000\010\002\006\003\005\004\003\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\005\013\014\015" +
    "\001\001\000\006\003\005\004\010\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\006\020\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\014\017\001\001\000\002\001\001\000\004" +
    "\007\022\001\001\000\002\001\001\000\004\010\025\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\011\026" +
    "\001\001\000\004\015\036\001\001\000\004\012\031\001" +
    "\001\000\002\001\001\000\004\013\032\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\014\042\001\001\000\004\012\040\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\016\043\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    /*public static void main(String args[]) throws Exception{
        new parser(new Yylex(System.in)).parse();
    }

    public void syntax_error(Symbol s){
        report_error("Erro de sintaxe. Linha: " + (s.right + 1)) +
        "Coluna: "+ s.left + ".Texto: \"" + s.value + "\"", null);
    }*/


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // START ::= START EXPR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= START EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // START ::= EXPR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // EXPR ::= SEL SIMB FR TAB CONDICAO EXPRESSAO ORDENACAO ATRIB PONTUACAO 
            {
              Object RESULT =null;
		 System.out.println("Senten??as analizadas coretamente. Sem erros"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPR",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // EXPR ::= error 
            {
              Object RESULT =null;
		 System.out.println("Erro sintatico na sentenca"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPR",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SEL ::= SELECT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SEL",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SIMB ::= TODOS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SIMB",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SIMB ::= ATRIB 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SIMB",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SIMB ::= ATRIB VIRGULA ATRIB 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SIMB",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // FR ::= FROM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FR",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // TAB ::= TABELA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TAB",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // CONDICAO ::= WHERE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONDICAO",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // EXPRESSAO ::= EXPRESSAO ATRIBUTO IG ATRIBUTO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // EXPRESSAO ::= ATRIBUTO IG ATRIBUTO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // EXPRESSAO ::= ATRIBUTO IG NUMERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ATRIB ::= ATRIBUTO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ATRIB",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // IG ::= IGUAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("IG",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // NUMERO ::= VALOR_NUMERICO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NUMERO",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // ORDENACAO ::= ORDER BY 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ORDENACAO",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // PONTUACAO ::= PONTO_E_VIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PONTUACAO",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
