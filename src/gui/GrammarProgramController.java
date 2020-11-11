//__________________________________________________________________________________________________________________________________
package gui;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import model.Grammar;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
//__________________________________________________________________________________________________________________________________
/**
 * This class manage the necessary attributes and methods to manage and use the automaton program gui. 
 * @author Juan José Valencia Jaramillo
 * @version 1.0
 */
public class GrammarProgramController {

    @FXML
    private Button cykButton;

    @FXML
    private TextField stringInput;

    @FXML
    private TextField initialSymbolInput;

    @FXML
    private TextField terminalsInput;

    @FXML
    private TextField symbolsInput;

    @FXML
    private Button informationButton;
    
    @FXML
    private Button addProductionButton;

    @FXML
    private TextField headOfProduction;

    @FXML
    private TextField BodyOfProduction;

    @FXML
    private Label belongsToLanguage;

    @FXML
    private Label resultantTable;
    
    @FXML
    private Alert alert;
    
    private Grammar grammar;

//__________________________________________________________________________________________________________________________________
    @FXML
    /**
     * This method initializes the elements before the stage is load.
     */
    private void initialize() {    	
    	//production part is not enable until the initial information is first entered by the user
    	changeProductionRulesInformationToState(true);
    	alert = new Alert(AlertType.NONE);    
    }
//__________________________________________________________________________________________________________________________________
    /**
     * This method allows to change the state of the gui controls so the user cannot enter a different initial information unless
     * they execute the CYK algorithm and start the processing of creating another grammar
     */
    private void changeInitialInformationToState(boolean tfstate, boolean bttstate) {    
    	stringInput.setEditable(tfstate);
    	initialSymbolInput.setEditable(tfstate);
    	terminalsInput.setEditable(tfstate);
    	symbolsInput.setEditable(tfstate);
    	informationButton.setDisable(bttstate);
    }
//__________________________________________________________________________________________________________________________________
    /**
     * This method allows to change the state of the gui controls so the user cannot enter more production rules to the grammar unless
     * they execute the CYK algorithm and start the processing of creating another grammar
     */
    private void changeProductionRulesInformationToState(boolean state) {    	    	        	
    	headOfProduction.setDisable(state);
    	BodyOfProduction.setDisable(state);
    	addProductionButton.setDisable(state);    	    	
    }
//__________________________________________________________________________________________________________________________________
    private void resetForm() {
    	stringInput.clear();
    	initialSymbolInput.clear();
    	terminalsInput.clear();
    	symbolsInput.clear();
    	changeInitialInformationToState(true,false);
    	
    	headOfProduction.clear();
    	BodyOfProduction.clear();
    	changeProductionRulesInformationToState(true);
    }
//__________________________________________________________________________________________________________________________________
    @FXML
    /**
     * This method ends the session of the application.
     * @param event the event triggered by the user.
     */
    private void exitSystem(MouseEvent event) {
    	System.exit(0);
    }
//__________________________________________________________________________________________________________________________________    
    /**
     * This method shows a pop up window to notify whenever something in the program went wrong.
     * @param message the message that specifies the cause of the problem.
     */
    private void showError(String message) {
    	alert.setAlertType(AlertType.ERROR);
    	ImageView error = new ImageView("gui/imgs/Fatal Error.png");
    	error.setFitHeight(50);
    	error.setFitWidth(50);
    	alert.setGraphic(error);
    	alert.setContentText(message);
    	alert.show();
    }
//__________________________________________________________________________________________________________________________________  
    /**
     * This method shows a pop up window to notify whenever something may cause some problems in the normal execution of the program
     * @param message the message that specifies the cause of the notification
     */
    private void showWarning(String message) {
    	alert.setAlertType(AlertType.WARNING);
    	ImageView warning = new ImageView("gui/imgs/Something Went Wrong.png");
    	warning.setFitHeight(50);
    	warning.setFitWidth(50);
    	alert.setGraphic(warning);
    	alert.setContentText(message);
    	alert.show();
    }
//__________________________________________________________________________________________________________________________________
    /**
     * This method shows a pop up window to notify whenever something in the program was successfully completed.
     * @param message the message that confirms the execution of the task.
     */
    private void showCorrect(String message) {
    	alert.setAlertType(AlertType.CONFIRMATION);
    	ImageView correct = new ImageView("gui/imgs/Done.png");
    	correct.setFitHeight(50);
    	correct.setFitWidth(50);
    	alert.setGraphic(correct);
    	alert.setContentText(message);
    	alert.show();
    }
//__________________________________________________________________________________________________________________________________
    @FXML
    /**
     * This method allows to add the initial information to build up the grammar: 
     * @param event the event triggered by the user
     */
    private void addInitialInformation(ActionEvent event) {
    	String initialSymbol = initialSymbolInput.getText();
    	String terminals = terminalsInput.getText();
    	String symbols = symbolsInput.getText();
    	if(!stringInput.getText().isEmpty() && !initialSymbol.isEmpty() && !terminals.isEmpty() && !symbols.isEmpty()) {
    		grammar = new Grammar(initialSymbol);
    		grammar.addTerminal(terminals);
    		grammar.addSymbol(symbols);
    		changeInitialInformationToState(false,true);
    		changeProductionRulesInformationToState(false);
    		showCorrect("initial information succesfully added" + "\n" + "now, let's add some production rules");
    	}
    	else {
    		showError("None of these fields can be empty, all fields are mandatory");
    	}
    }
//__________________________________________________________________________________________________________________________________
    @FXML
    /**
     * This method allows to add a new production rule to the grammar
     * @param event the even triggered by the user
     */
    private void addProductionRule(ActionEvent event) {
    	String head = headOfProduction.getText();
    	String bodies = BodyOfProduction.getText();
    	if(!head.isEmpty()) {
    		grammar.addProductionRule(bodies, bodies);
    		showCorrect("Production rule succesfully added" + "\n" + "Let's add another one" + "\n" + "or Let's start with CYK process");
    	}
    	else {
    		showError("Head of the production cannot be empty");
    	}
    }
//__________________________________________________________________________________________________________________________________
    @FXML
    private void startCYKAlgorithm(ActionEvent event) {
    	showCorrect("CYK algorithm successfully executed" + "\n" + "Check the results on the resume tab");
    	resetForm();
    }
//__________________________________________________________________________________________________________________________________
}