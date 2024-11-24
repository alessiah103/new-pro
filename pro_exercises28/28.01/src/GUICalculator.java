import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUICalculator extends Application
{

  @Override public void start(Stage window) throws Exception
  {
    window.setTitle("Calculator");
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("Exercise.fxml"));
    Scene scene = new Scene(loader.load());
    window.setScene(scene);
    window.show();
  }
}
