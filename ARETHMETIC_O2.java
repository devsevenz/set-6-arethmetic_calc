import java.util.Scanner;

public class ARETHMETIC_O2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean programrunning = true;
        int number1;
        int number2;
        int r_addition = 0;
        int r_subtraction = 0;
        int r_multiplication = 0;
        int r_division = 0;
        int r_modulus = 0;
        String operation = "operation";
        String choice;

        //start
        System.out.println("WELCOME TO A MY SIMPLE PROGRAM");

        //loop

        while (programrunning) {

        //input

            System.out.print("Enter number: ");
            if(!sc.hasNextInt()){
                System.out.println("INVALID INPUT!");
                    return;
            }else {
                number1 = sc.nextInt();
            }
            System.out.print("Enter number: ");
            if(!sc.hasNextInt()){
                System.out.println("INVALID INPUT!");
                return;
            }else {
                number2 = sc.nextInt();
            }



            r_addition = number1 + number2;
            r_subtraction = number1 - number2;
            r_multiplication = number1 * number2;
            r_division = number1 / number2;
            r_modulus = number1 % number2;


            //output

                System.out.println("RESULTS: ");
                System.out.println("ADDITION: " + r_addition);
                System.out.println("SUBTRACTION: " + r_subtraction);
                System.out.println("MULTIPLICATION: " + r_multiplication);
                System.out.println("DIVISION: " + r_division + " " + "REMAINDER: " + r_modulus);





            System.out.println("do you want to perform another operation? (Y/N)");
            choice = sc.next().toLowerCase();

            if(!choice.equals("y")){
                programrunning = false;
            }
        }System.out.println("THANK YOU!");
    }
}