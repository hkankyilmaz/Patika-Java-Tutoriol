    import  java.util.Scanner;
    public class Authentication {
        public static void main(String [] args) {
            String username, password;
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter the username : ");
            username = input.nextLine();

            System.out.print("Please enter the password : ");
            password = input.nextLine();

            if ( username.equals("Hakan") && password.equals("1234") ) {
                System.out.println("You are Log in");
            }else {
                System.out.println("Wrong password or username...");
            }
        }
    }
