    import java.util.Scanner;
        public class CalThriAngleSurface {

            public static void main(String [] args) {

                double sideOne , sideTwo , sideThree;
                Scanner input = new Scanner(System.in);

                System.out.print(" Please enter the first side of the triangle : ");
                sideOne = input.nextDouble();

                System.out.print(" Please enter the second side of the triangle : ");
                sideTwo = input.nextDouble();

                System.out.print(" Please enter the third side of the triangle : ");
                sideThree = input.nextDouble();

                double perimeterHalf =  ( sideOne + sideTwo + sideThree) / 2;
                double surface = perimeterHalf * (perimeterHalf - sideOne) * ( perimeterHalf - sideTwo) * (perimeterHalf - sideThree);

                System.out.println(perimeterHalf);
                System.out.println("Surface of The triangle : " + Math.sqrt(surface));


            }
    }
