import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.Group;

public class App extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.initStyle(StageStyle.DECORATED);
		
		Scene sc = new Scene(new Group(), 1280, 720);
		primaryStage.setScene(sc);
		
		primaryStage.setTitle("Even'Mans");
		
		primaryStage.show();
	}

	public static void main(String[] args) 
	{
		launch(args);
	}

}
