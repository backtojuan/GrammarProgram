//__________________________________________________________________________________________________________________________________v
package model;
//__________________________________________________________________________________________________________________________________
/**
 * This class manages the necessary attributes and methods to run CYK algorithm over a given context-free grammar.
 * @author Juan Jos� Valencia Jaramillo
 * @version 1.0
 *
 */
public class CYK {
	private String string;	
	private String[][] CYKTable;
//__________________________________________________________________________________________________________________________________	
	/**
	 * <b>CYK constructor</b>
	 * @param string the string input to validate
	 */
	public CYK(String string) {
		this.string = string;
		CYKTable = new String[string.length()][string.length()];
	}
//__________________________________________________________________________________________________________________________________
	/**
	 * This method returns the string input 
	 * <b>Pre:</b> the cyk exists
	 * @return the string input
	 */
	public String getStringInput() {
		return string;
	}
//__________________________________________________________________________________________________________________________________
	/**
	 * This method returns the cyktable filled once the cyk algorithm is run
	 * <b>Pre:</b> the cyk exists
	 * @return the cyk table
	 */
	public String[][] getCYKTable(){
		return CYKTable;
	}	
//__________________________________________________________________________________________________________________________________				
	/**
	 * This method runs the cyk algorithm to check if a string input is generated by a given context-free grammar
	 * <b>Pos:</b> The cyk validates wether the string input is generated or not by the given grammar.
	 * @param string the string input
	 * @param grammar the grammar in CNF
	 * @return a boolean value
	 */
	public boolean CYKAlgorithm(String string, Grammar grammar) {
		if(string.equalsIgnoreCase(Grammar.LAMBDA)) {  
			//if the input string is "lambda" the only production it needs to be checked it's 'S'
			return grammar.getProductionRules().get(grammar.getInitialSymbol()).contains(string);
		}		
		boolean confirmation = false;
		/**String[] terminals = string.split("");
		int n = string.length();
		int j = 1;
		
		for(int i=1; i < n; i++) {		
			for(int s=0; s<grammar.getSymbols().size(); s++) {
				if(grammar.isInGrammar(grammar.getSymbols().get(s),terminals[i-1])) {
					CYKTable[i][0] = grammar.getSymbols().get(s);
				}
			}
		}					*/		
		return confirmation;
	}
//__________________________________________________________________________________________________________________________________
}
