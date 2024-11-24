public class Encapsulation1 {
    public static void main(String[] args) {
       
                User set = new User("Prince");
                set.setName("Prince Wick");
                String name = set.getName();  
                System.out.println("Name: " + name);
            }
        }
         class User {
            private String name;  
            public User(String name) {
                this.name = name;  
            }
            public void setName(String name) {  
                this.name = name;
            }
            public String getName () {  
                return this.name;
            }
        
        
    }

