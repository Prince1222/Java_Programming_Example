import java.util.HashMap;

public class HashMap1 {
  public static void main(String[] args) {
    // Create a HashMap
    HashMap<String, Integer> map = new HashMap<>();

    // Add key-value pairs to the map
    map.put("apple", 1);
    map.put("banana", 2);
    map.put("cherry", 3);

    // Get the value associated with a key
    int value = map.get("banana");
    System.out.println(value); // Outputs 2

    // Check if the map contains a key
    boolean containsKey = map.containsKey("apple");
    System.out.println(containsKey); // Outputs true

    // Check if the map contains a value
    boolean containsValue = map.containsValue(3);
    System.out.println(containsValue); // Outputs true
  }
}