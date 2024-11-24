import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlignGUI extends Application
{
  private Scene scene;
  private FlowPane mainPane;
  private HBox mainHBox;

  private VBox checkBoxesVBox;
  private VBox textFieldsVBox;
  private VBox buttonsVBox;

  private CheckBox exitOnOkCheckBox;
  private CheckBox exitOnCancelCheckBox;

  private TextField xTextField;
  private TextField yTextField;

  private Button okButton;
  private Button cancelButton;
  private Button clearButton;

  public void start(Stage window)
  {
    window.setTitle("Align");

    exitOnOkCheckBox = new CheckBox("Exit on OK");
    exitOnCancelCheckBox = new CheckBox("Exit on Cancel");
    checkBoxesVBox = new VBox(10, exitOnOkCheckBox, exitOnCancelCheckBox);

    Label xLabel = new Label("X:");
    xTextField = new TextField();
    xTextField.setMaxWidth(50);
    HBox xLabelHBox = new HBox(xLabel, xTextField);
    Label yLabel = new Label("Y:");
    yTextField = new TextField();
    yTextField.setMaxWidth(50);
    HBox yLabelHBox = new HBox(yLabel, yTextField);
    textFieldsVBox = new VBox(10, xLabelHBox, yLabelHBox);

    okButton = new Button("OK");
    okButton.setMaxWidth(100);
    cancelButton = new Button("Cancel");
    cancelButton.setMaxWidth(100);
    clearButton = new Button("Clear");
    clearButton.setMaxWidth(100);
    buttonsVBox = new VBox(10, okButton, cancelButton, clearButton);

    mainHBox = new HBox(10, checkBoxesVBox, textFieldsVBox, buttonsVBox);
    mainPane = new FlowPane(mainHBox);
    mainPane.setAlignment(Pos.BASELINE_CENTER);

    scene = new Scene(mainPane, 300,100);

    window.setScene(scene);
    window.show();
  }
}
