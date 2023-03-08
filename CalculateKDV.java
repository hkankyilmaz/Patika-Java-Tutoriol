
        import java.util.Scanner;
        public class CalculateKDV {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Please enter the amount of the money : ");
                double amountOfMoney = input.nextDouble(),withKdv8 = 0,withKdv18= 0;

                boolean isNumberGreater = amountOfMoney > 100;

                if (isNumberGreater) {
                     withKdv8 = amountOfMoney + (amountOfMoney * 0.08);
                }else {
                    withKdv18 = amountOfMoney + (amountOfMoney * 0.18);
                }

                System.out.println("Principal : " + amountOfMoney );
                if (isNumberGreater) {
                    System.out.println("Price--with KDV-- : " + withKdv8 );
                    System.out.println("KDV Cost : " + (withKdv8 - amountOfMoney) );
                }else {
                    System.out.println("Price--with KDV-- : " + withKdv18 );
                    System.out.println("KDV Cost : " + (withKdv18 - amountOfMoney) );
                }

            }
        }
