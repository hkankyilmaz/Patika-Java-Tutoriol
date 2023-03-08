        import java.util.Scanner;
        public class CalculateCircleSurface {
            public  static  void  main(String[] args) {
                double radius,angle;
                Scanner input = new Scanner(System.in);

                System.out.print("Please Enter Radius : ");
                radius = input.nextDouble();

                System.out.print("Please Enter Angle");
                angle = input.nextDouble();

                double perimeter = 2 * 3.14 * radius * ( angle / 360);
                double surface = 3.14 * radius * radius * ( angle / 360);

                System.out.println("Perimeter : " + perimeter + "---- Surface : " + surface);

            }



        }
