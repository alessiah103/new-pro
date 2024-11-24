import java.time.LocalDate;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
    LocalDate currentDate = LocalDate.now();
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public MyDate()
  {
    day = 8;
    month = 7;
    year = 2000;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public void setDay(int d)
  {
    day = d;
  }

  public void setMonth(int m)
  {
    month = m;
  }

  public void setYear(int y)
  {
    this.year = y;
  }

  public boolean isLeapYear()
  {
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public int daysInAMonth()
  {
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
        || month == 10 || month == 12)
    {
      return 31;
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11)
    {
      return 30;
    }
    else if (month == 2)
    {
      if (isLeapYear())
      {
        return 29;
      }
      return 28;
    }
    else
    {
      return -1; //handle invalid month values
    }
  }

  public String getAstroSign()
  {
    if (month == 3 && day >= 21 || month == 4 && day <= 19)
    {
      return "Aries";
    }
    else if (month == 4 && day >= 20 || month == 5 && day <= 20)
    {
      return "Taurus";
    }
    else if (month == 5 && day >= 21 || month == 6 && day <= 20)
    {
      return "Gemini";
    }
    else if (month == 6 && day >= 21 || month == 7 && day <= 22)
    {
      return "Cancer";
    }
    else if (month == 7 && day >= 23 || month == 8 && day <= 22)
    {
      return "Leo";
    }
    else if (month == 8 && day >= 23 || month == 9 && day <= 22)
    {
      return "Virgo";
    }
    else if (month == 9 && day >= 23 || month == 10 && day <= 22)
    {
      return "Libra";
    }
    else if (month == 10 && day >= 23 || month == 11 && day <= 22)
    {
      return "Scorpio";
    }
    else if (month == 11 && day >= 22 || month == 12 && day <= 21)
    {
      return "Sagittarius";
    }
    else if (month == 12 && day >= 22 || month == 1 && day <= 19)
    {
      return "Capricorn";
    }
    else if (month == 1 && day >= 20 || month == 2 && day <= 18)
    {
      return "Aquarius";
    }
    else if (month == 2 && day >= 19 || month == 3 && day <= 20)
    {
      return "Pisces";
    }
    else
    {
      return "Error";
    }
  }

  public String dayOfWeek()
  {
    int m = this.month;
    int y = this.year;

    if (m == 1)
    {
      m = 13;
      y -= 1;
    }
    else if (m == 2)
    {
      m = 14;
      y -= 1;
    }
    int q = this.day;
    int k = year % 100;
    int j = year / 100;

    int h = (q + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
    switch (h)
    {
      case 0:
        return "Saturday";
      case 1:
        return "Sunday";
      case 2:
        return "Monday";
      case 3:
        return "Tuesday";
      case 4:
        return "Wednesday";
      case 5:
        return "Thursday";
      case 6:
        return "Friday";
      default:
        return "Invalid date";
    }
  }
  public String getMonthName()
  {
    switch (month)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Error!";
    }
  }

  public void nextDay()
  {
    if (day < daysInAMonth())
    {
      day++;
    }
    else
    {
      day = 1;
      if (month < 12)
      {
        month++;
      }
      else
      {
        month = 1;
        year++;
      }
    }
  }

  public boolean equals(Object obj)
  {
    if (this == obj)
    {
      return true;
    }
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    MyDate other = (MyDate) obj;

    return day == other.day &&
        month == other.month &&
        year == other.year;
  }
  public MyDate copy() {
    return new MyDate(this.day, this.month, this.year);
  }
  //copy constructor
  public MyDate(MyDate obj) {
    this.day = obj.day;
    this.month = obj.month;
    this.year = obj.year;
  }
  public void nextDays(int days) {
    for (int i = 0; i < days; i++) {
      nextDay();
    }
  }
  public static MyDate today() {
    LocalDate currentDate = LocalDate.now();
    return new MyDate(currentDate.getDayOfMonth(), currentDate.getMonthValue(), currentDate.getYear());
  }
  public boolean isBefore(MyDate date2) {
    if (this.year < date2.year) {
      return true;
    } else if (this.year == date2.year) {
      if (this.month < date2.month) {
        return true;
      } else if (this.month == date2.month) {
        return this.day < date2.day;
      }
    }
    return false;
  }

  public String toString()
  {
    return day + "/" + month + "/" + year;
  }
}