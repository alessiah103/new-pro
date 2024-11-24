import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Book 1." + "\n");

    System.out.println("Enter the author of the book: ");
    String author1 = keyboard.nextLine();
    System.out.println("Enter the title of the book: ");
    String title1 = keyboard.nextLine();
    System.out.println("Enter the price of the book: ");
    double price1 = keyboard.nextDouble();
    System.out.println("Enter the number of pages of the book: ");
    int pages1 = keyboard.nextInt();
    Book book1 = new Book(author1, title1, price1, pages1);
    book1.setPrice(book1.getPrice() * 0.80);
    keyboard.nextLine();

    System.out.println("Book 2." + "\n");
    System.out.println("Enter the author of the book: ");
    String author2 = keyboard.nextLine();
    System.out.println("Enter the title of the book: ");
    String title2 = keyboard.nextLine();
    System.out.println("Enter the price of the book: ");
    double price2 = keyboard.nextDouble();
    System.out.println("Enter the number of pages of the book: ");
    int pages2 = keyboard.nextInt();
    Book book2 = new Book(author2, title2, price2, pages2);
    book2.setPrice(book2.getPrice() * 0.80);

    System.out.println("\nDetails of Book 1 after price reduction:");
    book1.printBookDetails();
    System.out.println("\nDetails of Book 2 after price reduction:");
    book2.printBookDetails();
  }
}
