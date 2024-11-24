public class Clock
{
  private int hour;
  private int minute;
  private int second;

  public Clock(int h, int m, int s)
  {
    this.hour = h;
    this.minute = m;
    this.second = s;
  }

  public Clock(int totalTimeInSeconds)
  {
    this.hour = totalTimeInSeconds / 3600; //since 1 hour = 3600 seconds
    this.minute = (totalTimeInSeconds % 3600)
        / 60;  //computes how many seconds are left after extracting full hours and then divide by 60 I get the minutes
    this.second = totalTimeInSeconds % 60;
  }

  public void set(int h, int m, int s)
  {
    if (hour >= 0 && hour <= 24)
    {
      this.hour = h;
    }
    if (minute >= 0 && minute <= 59)
    {
      this.minute = m;
    }
    if (second >= 0 && second <= 59)
    {
      this.second = s;
    }
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public void tic()
  {
    second++;
    if (second > 59)
    {
      second = 0;
      minute++;
    }
    if (minute > 59)
    {
      minute = 0;
      hour++;
    }
  }
  public int convertToSeconds() {
    return hour * 3600 + minute * 60 + second;
  }
  public int timeInSecondsTo(Clock other) {
    return Math.abs(this.convertToSeconds() - other.convertToSeconds());
  }
  public static Clock timeTo(int totalSeconds) {
    int h = (totalSeconds / 3600) % 24;
    int m = (totalSeconds % 3600) / 60;
    int s = totalSeconds % 60;
    return new Clock(h, m, s);
  }
  public boolean isBefore(Clock other) {
    return this.convertToSeconds() < other.convertToSeconds();
  }
  public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }
}
