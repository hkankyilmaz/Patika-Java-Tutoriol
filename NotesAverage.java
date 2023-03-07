    import java.sql.SQLOutput;
    import java.util.Scanner;

    public class NotesAverage {
        public static void main(String[] args) {
            double math , biology , history , chemistiry , geograpy ;
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter yours Math note : ");
            math = input.nextInt();

            System.out.print("Please enter yours Biology note : ");
            biology = input.nextInt();

            System.out.print("Please enter yours History note : ");
            history = input.nextInt();

            System.out.print("Please enter yours Chemistiry note : ");
            chemistiry = input.nextInt();

            System.out.print("Please enter yours Geograpy note : ");
            geograpy = input.nextInt();

            double averageNotes = ( biology + math + history + chemistiry + geograpy  ) / 5 ;
            boolean isPass = averageNotes >= 60;

            System.out.println("Your Average Note is : " + averageNotes);
            System.out.println(isPass ? "You Pass the class" : "Failed the class");

        }
    }
