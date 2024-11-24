public class Multithreading1 {
    public static void main(String[] args) throws InterruptedException {
      // Creating two threads
      Thread t1 = new Thread(() -> {
        System.out.println(" Thread 1 ");
      });
      Thread t2 = new Thread(() -> {
        System.out.println("  Thread 2 ");
      });
  
      // Starting both threads
      t1.start();
      t2.start();
  
      // Wait for both threads to complete
      t1.join();
      t2.join();
  
      System.out.println("Both threads have completed");
    }
  }
