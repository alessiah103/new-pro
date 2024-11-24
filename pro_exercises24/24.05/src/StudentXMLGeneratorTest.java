import java.util.ArrayList;


public class StudentXMLGeneratorTest {
  public static void main(String[] args) {
    // Create a list of students
    ArrayList<Student> studentList = new ArrayList<>();
    studentList.add(new Student("Bob", "Bobson", "Denmark"));
    studentList.add(new Student("Jane", "Doe", "England"));
    studentList.add(new Student("John", "Doe", "USA"));

    // Create an instance of StudentXMLGenerator
    StudentXMLGenerator generator = new StudentXMLGenerator();

    // Generate the XML file
    generator.generateXML(studentList, "D:\\SEM1\\new-pro\\pro_exercises24\\24.05\\src\\studentlist.xml");
  }
}

