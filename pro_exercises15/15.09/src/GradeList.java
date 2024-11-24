public class GradeList
{
  private int[] grades;

  public GradeList(int numberOfGrades)
  {
    this.grades = new int[numberOfGrades];
  }

  public int getNumberOfGrades()
  {
    return grades.length;
  }

  public int getGrade(int index)
  {
    if (index >= 0 && index < grades.length)
    {
      return grades[index];
    }
    else
    {
      throw new IndexOutOfBoundsException("Invalid index");
    }
  }

  public void setGrade(int grade, int index)
  {
    if (index >= 0 && index < grades.length)
    {
      grades[index] = grade;
    }
    else
    {
      throw new IndexOutOfBoundsException("Invalid index");
    }
  }

  public double getAverage()
  {
    int totalSum = 0;

    for (int i = 0; i < grades.length; i++)
    {
      totalSum += grades[i];
    }
    return (double) totalSum / grades.length;
  }

  public String toString()
  {
    String tmp = "Grades {";

    for (int i = 0; i < grades.length; i++)
    {
      if (i == grades.length - 1)
      {
        tmp += grades[i] + "}";
      }
      else
      {
        tmp += grades[i] + ", ";
      }
    }
    return tmp;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    GradeList other = (GradeList) obj;//creating the other object for comparing two objects
    if (other.getNumberOfGrades() != this.getNumberOfGrades())
    {
      return false;
    }
    for (int i = 0; i < grades.length; i++)
    {
      if (other.getGrade(i) != this.getGrade(i))
      {
        return false;
      }
    }

  }
}
