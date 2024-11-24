import javax.swing.*;

public class Main
{
  public static void main(String[] args)
  {
    String[] options = {"Yes", "No"};
    int choice = JOptionPane.showOptionDialog(null,
        "Do you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null, options,options[0]);
    if(choice == JOptionPane.YES_OPTION) {
      System.out.println("Choice is yes");
    } else if (choice == JOptionPane.NO_OPTION); {
    System.out.println("Choice is no");
  }
  }
}