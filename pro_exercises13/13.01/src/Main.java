public class Main {
    public static void main(String[] args) {
      // Testing MyDate class functionality
      MyDate birthday1 = new MyDate(15, 8, 1990);
      MyDate birthday2 = new MyDate(10, 5, 1985);
      MyDate birthday3 = new MyDate(15, 8, 1990); // Same as birthday1 for equality check

      // Displaying date details
      System.out.println("Birthday1: " + birthday1);  // Should print 15/8/1990
      System.out.println("Birthday2: " + birthday2);  // Should print 10/5/1985

      // Testing isBefore method
      System.out.println("birthday1.isBefore(birthday2): " + birthday1.isBefore(birthday2)); // false
      System.out.println("birthday2.isBefore(birthday1): " + birthday2.isBefore(birthday1)); // true

      // Testing equals method in MyDate
      System.out.println("birthday1.equals(birthday3): " + birthday1.equals(birthday3)); // true
      System.out.println("birthday1.equals(birthday2): " + birthday1.equals(birthday2)); // false

      // Testing toString, getAstroSign, and isLeapYear in MyDate
      System.out.println("Astrological Sign of Birthday1: " + birthday1.getAstroSign()); // "Leo"
      System.out.println("Is year of Birthday1 a leap year? " + birthday1.isLeapYear()); // true if 1990 is leap year

      // Testing Person class functionality
      Person person1 = new Person("John Doe", birthday1);
      Person person2 = new Person("Jane Smith", birthday2);
      Person person3 = new Person("John Doe", birthday1);

      // Testing getName, getAddress, and getBirthday methods
      System.out.println("Person 1 Name: " + person1.getName()); // "John Doe"
      System.out.println("Person 1 Address: " + person1.getAddress()); // "123 Elm Street"
      System.out.println("Person 1 Birthday: " + person1.getBirthday()); // Should print 15/8/1990

      System.out.println("Person 2 Name: " + person2.getName()); // "Jane Smith"
      System.out.println("Person 2 Address: " + person2.getAddress()); // null (or default value)

      // Testing getAge method in Person
      System.out.println("Person 1 Age: " + person1.getAge()); // Age based on 15/8/1990
      System.out.println("Person 2 Age: " + person2.getAge()); // Age based on 10/5/1985

      // Testing equals method in Person
      System.out.println("person1.equals(person3): " + person1.equals(person3)); // true
      System.out.println("person1.equals(person2): " + person1.equals(person2)); // false

      // Testing toString method in Person
      System.out.println("Person 1: " + person1); // Should print name, address, and birthday
      System.out.println("Person 2: " + person2); // Should print name and birthday with "null" or "No address" for address
    }
  }

