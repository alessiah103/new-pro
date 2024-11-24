import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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

  private double v1;
  private double v2;
  private char operator;

  private Listener listener;

  public void start(Stage window) throws Exception
  {
    window.setTitle("Calculator");

    borderPane = new BorderPane();

    textField = new TextField();
    textField.setPrefHeight(50);
    listener = new Listener();

    oneButton = new Button("1");
    oneButton.setOnAction(listener);
    oneButton.setPrefSize(100, 100);
    twoButton = new Button("2");
    twoButton.setOnAction(listener);
    twoButton.setPrefSize(100, 100);
    threeButton = new Button("3");
    threeButton.setOnAction(listener);
    threeButton.setPrefSize(100, 100);
    fourButton = new Button("4");
    fourButton.setOnAction(listener);
    fourButton.setPrefSize(100, 100);
    fiveButton = new Button("5");
    fiveButton.setOnAction(listener);
    fiveButton.setPrefSize(100, 100);
    sixButton = new Button("6");
    sixButton.setOnAction(listener);
    sixButton.setPrefSize(100, 100);
    sevenButton = new Button("7");
    sevenButton.setOnAction(listener);
    sevenButton.setPrefSize(100, 100);
    eightButton = new Button("8");
    eightButton.setOnAction(listener);
    eightButton.setPrefSize(100, 100);
    nineButton = new Button("9");
    nineButton.setOnAction(listener);
    nineButton.setPrefSize(100, 100);
    zeroButton = new Button("0");
    zeroButton.setOnAction(listener);
    zeroButton.setPrefSize(100, 100);
    divideButton = new Button("/");
    divideButton.setOnAction(listener);
    divideButton.setPrefSize(100, 100);
    multiplyButton = new Button("*");
    multiplyButton.setOnAction(listener);
    multiplyButton.setPrefSize(100, 100);
    subtractButton = new Button("-");
    subtractButton.setOnAction(listener);
    subtractButton.setPrefSize(100, 100);
    addButton = new Button("+");
    addButton.setOnAction(listener);
    addButton.setPrefSize(100, 100);
    commaButton = new Button(",");
    commaButton.setOnAction(listener);
    commaButton.setPrefSize(100, 100);
    equalButton = new Button("=");
    equalButton.setOnAction(listener);
    equalButton.setPrefSize(100, 100);

    firstRowCenterVBox = new HBox(0, eightButton, nineButton);
    secondRowCenterVBox = new HBox(0, fiveButton, sixButton);
    thirdRowCenterVBox = new HBox(0, twoButton, threeButton);
    centerVBox = new VBox(0, firstRowCenterVBox, secondRowCenterVBox,
        thirdRowCenterVBox);

    leftVBox = new VBox(0, sevenButton, fourButton, oneButton);
    rightVBox = new VBox(0, divideButton, multiplyButton, subtractButton);
    bottomHBox = new HBox(0, zeroButton, commaButton, equalButton, addButton);

    borderPane.setTop(textField);
    borderPane.setLeft(leftVBox);
    borderPane.setRight(rightVBox);
    borderPane.setBottom(bottomHBox);
    borderPane.setCenter(centerVBox);

    scene = new Scene(borderPane, 400, 450);
    window.setScene(scene);
    window.show();
  }

  private class Listener implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      String input = textField.getText();

      if (e.getSource() == oneButton)
      {
        textField.appendText("1");
      }
      else if (e.getSource() == twoButton)
      {
        textField.appendText("2");
      }
      else if (e.getSource() == threeButton)
      {
        textField.appendText("3");
      }
      else if (e.getSource() == fourButton)
      {
        textField.appendText("4");
      }
      else if (e.getSource() == fiveButton)
      {
        textField.appendText("5");
      }
      else if (e.getSource() == sixButton)
      {
        textField.appendText("6");
      }
      else if (e.getSource() == sevenButton)
      {
        textField.appendText("7");
      }
      else if (e.getSource() == eightButton)
      {
        textField.appendText("8");
      }
      else if (e.getSource() == nineButton)
      {
        textField.appendText("9");
      }
      else if (e.getSource() == zeroButton)
      {
        textField.appendText("0");
      }
      else if (e.getSource() == commaButton)
      {
        textField.appendText(".");
      }
      else if (e.getSource() == addButton)
      {
        v1 = Double.parseDouble(textField.getText());
        operator = '+';
        textField.clear();
      }
      else if (e.getSource() == subtractButton)
      {
        v1 = Double.parseDouble(textField.getText());
        operator = '-';
        textField.clear();
      }
      else if (e.getSource() == multiplyButton)
      {
        v1 = Double.parseDouble(textField.getText());
        operator = '*';
        textField.clear();
      }
      else if (e.getSource() == divideButton)
      {
        v1 = Double.parseDouble(textField.getText());
        operator = '/';
        textField.clear();
      }
      else if (e.getSource() == equalButton)
      {
        v2 = Double.parseDouble(textField.getText());
        double result = 0;
        if (operator == '+')
        {
          result = v1 + v2;
        }
        else if (operator == '-')
        {
          result = v1 - v2;
        }
        else if (operator == '*')
        {
          result = v1 * v2;
        }
        else if (operator == '/')
        {
          result = v1 / v2;
        }
        textField.setText(result + "");

      }
    }
  }
}

