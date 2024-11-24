public class Main
{
  public static void main(String[] args)
  {
    Person person1 = new Person("Alessia", "8th July 2000");
    Job jobTest1 = new Job("Software Engineering", 23153, person1);
    System.out.println(
        "I am working as a " + jobTest1.getTitle() + "my monthly "
            + "salary after taxes is " + jobTest1.getSalary()
            + " and my name is " + jobTest1.getEmployee());
    System.out.println("Person1: " + jobTest1);

    Person person2 = new Person("Ioan-Sorin", "31st August 2001");
    Job jobTest2 = new Job("Software Engineering", 25153);
    System.out.println(jobTest2);
    jobTest2.setEmployee(person2);
    jobTest2.setSalary(30564);
    jobTest2.setTitle("Scrum master");
    System.out.println("Person 2:" + jobTest2);

    Job jobTest3 = new Job("Sustanability Manager", 34085.87);
    System.out.println(jobTest3);
    jobTest3.setEmployee(new Person("Cristina", "30th December 1960"));
    System.out.println("My name is " + jobTest3.getEmployee().getName()
        + ", I was born on the " + jobTest3.getEmployee().getBirthday()
        + ", I work as a " + jobTest3.getTitle() + " and my monthly salary is "
        + jobTest3.getSalary() + ".");
    jobTest3.givePercentageRaise(0.2);
    System.out.println(
        "Consequently, my salary raise will be " + jobTest3.getSalary());
  }
}