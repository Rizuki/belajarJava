import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String userName , password;

        int i = 1;
        while (i <= 3 ){
            System.out.println("Test "+i);
            System.out.print("Username : ");
            userName = inputScanner.nextLine();
            System.out.print("Password : ");
            password = inputScanner.nextLine();
//            System.out.println();
            if (userName.equals("user") && password.equals("password")){
                System.out.println("Welcome User\n");
                break;
            } else {
                System.out.println("Access denied\n");
            }
            i++;
        }
        if (i > 3){
            System.out.println("Please try again later, after a while");
        }


    }
}
