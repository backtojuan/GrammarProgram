//__________________________________________________________________________________________________________________________________
package gui;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
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
    private TextField headOfProduction;

    @FXML
    private TextField BodyOfProduction;

    @FXML
    private Label belongsToLanguage;

    @FXML
    private Label resultantTable;
    
    @FXML
    private Alert alert;

//__________________________________________________________________________________________________________________________________
    @FXML
    /**
     * This method initializes the elements before the stage is load.
     */
    private void initialize() {
    	
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
    private void addInitialInformation(ActionEvent event) {

    }
//__________________________________________________________________________________________________________________________________
    @FXML
    private void addProductionRule(ActionEvent event) {

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
    @FXML
    private void startCYKAlgorithm(ActionEvent event) {

    }
//__________________________________________________________________________________________________________________________________
}