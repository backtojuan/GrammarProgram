//__________________________________________________________________________________________________________________________________
package model;
import java.util.*;
//__________________________________________________________________________________________________________________________________
/**
 * This class manage the necessary attributes and methods to create grammars
 * @author Juan José Valencia Jaramillo
 * @version 1.0
 *
 */
public class Grammar {
	
	private String initialSymbol;
	private List<String> terminals;
	private List<String> symbols;
	private HashMap<String, ArrayList<String>> productionRules;
	
	public final static String LAMBDA = "lambda";
//__________________________________________________________________________________________________________________________________
	/**
	 * <b>Grammar constructor</b> 
	 * Allows to create a new grammar
	 * @param initialSymbol the initialSymbol that start the productions
	 */
	public Grammar(String initialSymbol) {
		this.initialSymbol = initialSymbol;
		terminals = new ArrayList<String>();
		symbols = new ArrayList<String>();
		productionRules = new HashMap<String, ArrayList<String>>();
	}
//__________________________________________________________________________________________________________________________________
	/**
	 * this method allows to get the initial symbol that starts the productions of this grammar
	 * <b>Pre:</b> the grammar exists. </n>
	 * @return the initial symbol
	 */
	public String getInitialSymbol() {
		return initialSymbol;
	}
//__________________________________________________________________________________________________________________________________
	/**
	 * This method allows to get the set of terminals for this grammar
	 * <b>Pre:</b> the grammar exists. </n>
	 * @return the set of terminals
	 */
	public List<String> getTerminals() {
		return terminals;
	}
//__________________________________________________________________________________________________________________________________
	/**
	 * This method allows to get the set of symbols for this grammar
	 * <b>Pre:</b> the grammar exists. </n>
	 * @return the set of symbols
	 */
	public List<String> getSymbols() {
		return symbols;
	}
//__________________________________________________________________________________________________________________________________
	/**
	 * This method allows to get the set of productions rules that generate different strings which belong to the language
	 * generated for this grammar
	 * <b>Pre:</b> the grammar exists. </n>
	 * @return the set of production rules 
	 */
	public HashMap<String, ArrayList<String>> getProductionRules() {
		return productionRules;
	}
//__________________________________________________________________________________________________________________________________
	/**
	 * This method add a new terminal to the set of terminals of this grammar
	 * <b>Pre:</b> The grammar exists
	 * <b>Pre:</b> The terminal cannot be an empty String
	 * <b>Pos:</b> The terminal is added to the set of terminals
	 * @param terminal the terminal to be added to the set
	 */
	public void addTerminal(String terminal) {
    	String[] terminalset = terminal.split(",");
    	for (int i = 0; i < terminalset.length; i++) {
    		terminals.add(terminalset[i]);
		}
	}
//__________________________________________________________________________________________________________________________________
	/**
	 * This method add a new symbol to the set of symbols of this grammar
	 * <b>Pre:</b> The grammar exists
	 * <b>Pre:</b> The symbol cannot be an empty String
	 * <b>Pos:</b> The symbol is added to the set of symbols 
	 * @param symbol
	 */
	public void addSymbol(String symbol) {
		String[] symbolset = symbol.split(",");
		for (int i = 0; i < symbolset.length; i++) {
			symbols.add(symbolset[i]);
		}
	}
//__________________________________________________________________________________________________________________________________
	/**
	 * This method add a new production rule to the set of production rules of this grammar
	 * <b>Pre:</b> The grammar exists
	 * <b>Pre:</b> The head of the production cannot be an empty String
	 * <b>Pos:</b> The production rule is added to the set of production rules
	 * @param head
	 * @param bodies
	 */
	public void addProductionRule(String head, String bodies) {		
		String[] bodieset = bodies.split(",");
		ArrayList<String> totalBodies = new ArrayList<String>();
		for (int i = 0; i < bodieset.length; i++) {
			totalBodies.add(bodieset[i]);
		}
		productionRules.put(head, totalBodies);				
	}
//__________________________________________________________________________________________________________________________________	
}