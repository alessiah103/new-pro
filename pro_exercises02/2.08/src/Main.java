import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = keyboard.nextLine();
    System.out.println("Enter your age: ");
    int age = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Enter your city: ");
    String city = keyboard.nextLine();
    System.out.println("Enter your college: ");
    String college = keyboard.nextLine();
    System.out.println("Enter your profession: ");
    String profession = keyboard.nextLine();
    System.out.println("Enter your animal: ");
    String animal = keyboard.nextLine();
    System.out.println("Enter your animal's name: ");
    String animalName = keyboard.nextLine();

    System.out.println(
        "There once was a person named " + name + " who lived in " + city
            + ". At the age of " + age + ",\n" + name + " went to college at "
            + college + ". " + name + " graduated and went to work as a \n"
            + profession + ". Then, " + name + " adopted a " + animal
            + " named " + animalName + ". They both lived\n"
            + "happily ever after!");
  }
}