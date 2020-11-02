//__________________________________________________________________________________________________________________________________
package gui;
//__________________________________________________________________________________________________________________________________
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.image.Image;
//__________________________________________________________________________________________________________________________________
/**
 * This class manage the necessary attributes and methods to manage and launch the User Interface.
 * 
 * @author Juan José Valencia Jaramillo
 * @version V_01_February-2019
 */
public class Main extends Application{
	@Override
	/**
	 * 
	 */
	public void start(Stage stage) throws Exception{
		Parent root =
				FXMLLoader.load(getClass().getResource("GrammarProgram.fxml"));

		Scene scene = new Scene(root);
		stage.setTitle("GrammarProgram");
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.setResizable(false);
		stage.centerOnScreen();
		stage.setScene(scene);


		Image icon = new Image("gui/imgs/Icon.png");
		stage.getIcons().add(icon);
		stage.show();
	}
//___________________________________________________________________________________________________________________________________
	/**
	 * 
	 * @param args
	 */
	public static void main(String[]args){
		launch(args);
	}
//___________________________________________________________________________________________________________________________________
}