import java.util.ArrayList;

public class Notebook
{
  private int numberOfNotes;
  private ArrayList<Note> notes;
  public Notebook(int max){
    numberOfNotes=max;
    notes = new ArrayList<Note>();
  }
  public void addNote(Note note){
    if(notes.size()<numberOfNotes){
      notes.add(note);
    }else
      System.out.println("Error");
  }
  public void setNotes(Note note, int index){
    if(index>=0 && index<notes.size() ){
      notes.set(index,note);
    }
  }
  public void remove(int index){
    if(index>=0 && index<notes.size() ){
      notes.remove(index);
    }
  }
  public Note getNote(int index )
  {
    if (index >= 0 && index < notes.size())
    {
     return notes.get(index);
    }return null;
  }
  public int getNumberOfPriorityNotes(){
    int counter=0;
    for (Note n;notes){
      if(n.getPriority() == 1 || n.getPriority() == 2 || n.getPriority() == 3){
        counter++;
      }
    }
    return counter;
  }

  public PriorityNotes[] getPriorityNotes(){
    ArrayList<> pnotes =new ArrayList<>();
    for(Note n;notes){
      if(n.getPriority() == 1 || n.getPriority() == 2 || n.getPriority() == 3){
        pnotes.add(n);
      }
    }
    return pnotes.toArray(new PriorityNotes[notes.size()]);
  }
  }




}
