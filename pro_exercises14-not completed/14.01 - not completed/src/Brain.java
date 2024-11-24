public class Brain
{
  private String activeMemoryItem;
  private String passiveMemoryItemOne;
  private String passiveMemoryItemTwo;

  public Brain()
  {
    this.activeMemoryItem = "sdsdsdsefsef";
    this.passiveMemoryItemOne = "fsedfsfsafse";
    this.passiveMemoryItemTwo = "sfdasefawefesf";
  }

  public int getIQ()
  {
    int char1 = activeMemoryItem.length();
    int char2 = passiveMemoryItemOne.length();
    int char3 = passiveMemoryItemTwo.length();
    if ((char1 < 20 && char2 < 10 && char3 < 10) || (char2 < 20 && char1 < 10
        && char3 < 10) || (char3 < 20 && char2 < 10 && char1 < 10))
    {
      return 130;
    }
    else if (char1 >= 10 && char2 >= 10 || char3 >= 10)
    {
      return 100;
    }
    else
    {
      return 70;
    }
  }

  public boolean isBrainDamaged()
  {
    if (activeMemoryItem == null || passiveMemoryItemOne == null
        || passiveMemoryItemTwo == null)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public void remember(String info)
  {
    passiveMemoryItemOne = passiveMemoryItemTwo;
    activeMemoryItem = passiveMemoryItemOne;
    activeMemoryItem = info;
  }

  public void refreshMemory(String info)
  {
    if (info.equals(passiveMemoryItemOne) || info.equals(passiveMemoryItemTwo))
    {
      remember(info);
    }
  }

  public boolean recall(String info)
  {
    return (info.equals(activeMemoryItem) || info.equals(passiveMemoryItemOne)
        || info.equals(passiveMemoryItemTwo));
  }

  public String recall()
  {
    return activeMemoryItem;
  }

  public String toString()
  {
    return "Brain{" + "activeMemoryItem='" + activeMemoryItem + '\''
        + ", passiveMemoryItemOne='" + passiveMemoryItemOne + '\''
        + ", passiveMemoryItemTwo='" + passiveMemoryItemTwo + '\'' + '}';
  }

  public boolean equals(Object obj)
  {
    if (obj == this)
    {
      return true;
    }
    else if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Brain other = (Brain) obj;
    return activeMemoryItem.equals(other.activeMemoryItem)
        && passiveMemoryItemOne.equals(other.passiveMemoryItemOne)
        && passiveMemoryItemTwo.equals(other.passiveMemoryItemTwo);
  }
}
