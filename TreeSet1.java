import java.util.*;

public class TreeSet1 {
    public static void main(String[] args) {
        Hashtable<String,Integer> set = new Hashtable<>();
        set.put("Bipul",1);
        set.put("Roshan",2);
        set.put("Utkarsh",3);

       int value = set.get("Roshan");
       System.out.println(value);

       boolean containsKey = set.containsKey("Bipul");
       System.out.println("Roshan");

       boolean containsValue = set.contains(3);
       System.out.println(containsKey);
    }
}
