import java.util.ArrayList;
public class Stack {
  private ArrayList<String> listofvals = new ArrayList<>();

  //the function that adds stuff to stack
    public void Push(String enteredval) {
        listofvals.add(enteredval);
    }

    //pops stuff from the stack
    public void Pop(){listofvals.remove(listofvals.size()-1);}

    //determines the peak value
    public void Peek(){listofvals.get(listofvals.size()-1);}

    //clears stack
    public void Clear(){listofvals.clear();}
}
