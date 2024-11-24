import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentXMLGenerator {
  // Method to generate an XML file from a list of students
  public void generateXML(ArrayList<Student> list, String filename) {
    StringBuilder xmlContent = new StringBuilder();
    xmlContent.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
    xmlContent.append("<students>\n");

    // Use a traditional for loop to iterate over the student list
    for (int i = 0; i < list.size(); i++) {
      Student student = list.get(i);
      xmlContent.append("  <student>\n");
      xmlContent.append("    <firstname>").append(student.getFirstName()).append("</firstname>\n");
      xmlContent.append("    <lastname>").append(student.getLastName()).append("</lastname>\n");
      xmlContent.append("    <country>").append(student.getCountry()).append("</country>\n");
      xmlContent.append("  </student>\n");
    }

    xmlContent.append("</students>");

    // Write the XML content to the specified file
    try (FileWriter writer = new FileWriter(filename)) {
      writer.write(xmlContent.toString());
      System.out.println("XML file created successfully: " + filename);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

