    import java.util.Scanner;
    public class CalTaxiPrice {

        public static void main(String[] args) {

            double  wayTaken;
            Scanner input = new Scanner(System.in);

            System.out.print(" Please Enter the taken way : ");
            wayTaken = input.nextDouble();

            double price = 2.20 * wayTaken + 10;

            if ( price < 20) price = 20;

            System.out.println("Taxi Price is : "+ price);


        }

    }
