import java.util.ArrayList;
public class Stack {
  private ArrayList<String> listofvals = new ArrayList<>();

  //the function that adds stuff to stack
    public void Push(String enteredval) {
        listofvals.add(enteredval);
    }

}
