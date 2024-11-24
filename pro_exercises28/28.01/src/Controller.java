import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller
{
    @FXML private TextField textField;
    @FXML private Button oneButton;
    @FXML private Button twoButton;
    @FXML private Button threeButton;
    @FXML private Button fourButton;
    @FXML private Button fiveButton;
    @FXML private Button sixButton;
    @FXML private Button sevenButton;
    @FXML private Button eightButton;
    @FXML private Button nineButton;
    @FXML private Button zeroButton;
    @FXML private Button divideButton;
    @FXML private Button multiplyButton;
    @FXML private Button subtractButton;
    @FXML private Button addButton;
    @FXML private Button equalButton;
    @FXML private Button commaButton;
    @FXML private double v1;
    @FXML private double v2;
    @FXML private char operator;
    
    public void handleActions(ActionEvent e) {
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
        textField.appendText(",");
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
