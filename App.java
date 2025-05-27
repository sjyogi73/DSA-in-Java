import java.util.ArrayList;
import java.util.Scanner;

public class App {
     private String AppUser = "Admin";
    private String AppPass = "1234";

    public boolean UserLogin(){
        System.out.println("Welcome to Login");
        
        ArrayList<String> UserList = new ArrayList<String>();
        UserList = GetUserData();
        String User = UserList.get(0);
        String Password = UserList.get(1);
        
        if ( User.equals(AppUser) && Password.equals(AppPass) ){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<String> GetUserData(){
        ArrayList<String> UserList = new ArrayList<String>();

        try (Scanner GetData = new Scanner(System.in)) {
            //Get User name
            System.out.println("Enter the user name: ");
            UserList.add(GetData.nextLine());

            // Get Password
            System.out.println("Enter the Password: ");
            UserList.add(GetData.nextLine());
        }
        return UserList;
    }

    public static void main(String[] args) {
        App Initial = new App();

        if (Initial.UserLogin()){
            System.out.println("Loggin sucess");
        }else{
            System.out.println("Invalid username or password");
        }
    }
}
