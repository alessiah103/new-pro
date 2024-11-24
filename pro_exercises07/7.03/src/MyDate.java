public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
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
}