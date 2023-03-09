package BasicPractise;

import java.util.Scanner;
        public class Calculater {
        public static void main(String[] args) {

            int n1,n2,result = 0;
            Scanner input = new Scanner(System.in);


            System.out.print("Please enter the first Number : ");
            n1 = input.nextInt();

            System.out.print("Please enter the second Number : ");
            n2 = input.nextInt();

            System.out.print("Please choose the process\nPlus=1\nMinus=2\nDivision=3\nMultiplication=4\nChoise : ");
            int choise = input.nextInt();

            switch (choise) {

                case 1 :
                    result = n1 + n2;
                    break;
                case 2 :
                    result = n1 - n2;
                    break;
                case 3 :
                    result = n1 / n2;
                    break;
                case 4 :
                    result = n1 * n2;
                    break;


            }
            while ( !(choise == 1 | choise == 2 | choise == 3 | choise == 4)) {
                System.out.println("Please enter valid options...");
                System.out.print("Please choose the process\nPlus=1\nMinus=2\nDivision=3\nMultiplication=4\nChoise : ");
                 choise = input.nextInt();
                switch (choise) {

                    case 1 :
                        result = n1 + n2;
                        break;
                    case 2 :
                        result = n1 - n2;
                        break;
                    case 3 :
                        result = n1 / n2;
                        break;
                    case 4 :
                        result = n1 * n2;
                        break;


                }
            }

            System.out.println("Result = " + result );


        }
    }
