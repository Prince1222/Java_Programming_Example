import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<String>();
        a.add("Prince");
        a.add("John");
        a.add("Sammer");
        Iterator<String> it = a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
