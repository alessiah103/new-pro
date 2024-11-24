import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CalculatorGUI extends Application
{
  private Scene scene;
  private BorderPane borderPane;

  private TextField textField;
  private VBox leftVBox;
  private VBox rightVBox;
  private HBox bottomHBox;
  private VBox centerVBox;

  private HBox firstRowCenterVBox;
  private HBox secondRowCenterVBox;
  private HBox thirdRowCenterVBox;

  private Button oneButton;
  private Button twoButton;
  private Button threeButton;
  private Button fourButton;
  private Button fiveButton;
  private Button sixButton;
  private Button sevenButton;
  private Button eightButton;
  private Button nineButton;
  private Button zeroButton;
  private Button commaButton;
  private Button equalButton;
  private Button divideButton;
  private Button multiplyButton;
  private Button subtractButton;
  private Button addButton;

  public void start(Stage window) throws Exception
  {
    window.setTitle("Calculator");

    borderPane = new BorderPane();

    textField = new TextField();
    textField.setPrefHeight(50);

    oneButton = new Button("1");
    oneButton.setPrefSize(100, 100);
    twoButton = new Button("2");
    twoButton.setPrefSize(100, 100);
    threeButton = new Button("3");
    threeButton.setPrefSize(100, 100);
    fourButton = new Button("4");
    fourButton.setPrefSize(100, 100);
    fiveButton = new Button("5");
    fiveButton.setPrefSize(100, 100);
    sixButton = new Button("6");
    sixButton.setPrefSize(100, 100);
    sevenButton = new Button("7");
    sevenButton.setPrefSize(100, 100);
    eightButton = new Button("8");
    eightButton.setPrefSize(100, 100);
    nineButton = new Button("9");
    nineButton.setPrefSize(100, 100);
    zeroButton = new Button("0");
    zeroButton.setPrefSize(100, 100);
    divideButton = new Button("/");
    divideButton.setPrefSize(100, 100);
    multiplyButton = new Button("*");
    multiplyButton.setPrefSize(100, 100);
    subtractButton = new Button("-");
    subtractButton.setPrefSize(100, 100);
    addButton = new Button("+");
    addButton.setPrefSize(100, 100);
    commaButton = new Button(",");
    commaButton.setPrefSize(100, 100);
    equalButton = new Button("=");
    equalButton.setPrefSize(100, 100);

    firstRowCenterVBox = new HBox(0, eightButton, nineButton);
    secondRowCenterVBox = new HBox(0, fiveButton, sixButton);
    thirdRowCenterVBox = new HBox(0, twoButton, threeButton);
    centerVBox = new VBox(0, firstRowCenterVBox, secondRowCenterVBox, thirdRowCenterVBox);

    leftVBox = new VBox(0, sevenButton, fourButton, oneButton);
    rightVBox = new VBox(0, divideButton, multiplyButton, subtractButton);
    bottomHBox = new HBox(0, zeroButton, commaButton, equalButton, addButton);

    borderPane.setTop(textField);
    borderPane.setLeft(leftVBox);
    borderPane.setRight(rightVBox);
    borderPane.setBottom(bottomHBox);
    borderPane.setCenter(centerVBox);

    scene = new Scene(borderPane, 400,450);
    window.setScene(scene);
    window.show();
  }
}
