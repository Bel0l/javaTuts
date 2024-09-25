package accessors.Task;

public class Main {

    public static void main(String[] args) {
        
        B user = new B();
            user.setDetails("detailed");
        System.out.println("Name " + user.getName() + " details " + user.getDetails() );
    }

    
}
