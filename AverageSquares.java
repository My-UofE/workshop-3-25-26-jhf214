import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        //System.out.print("Enter your name: ");

        // Read in line from standard input
        //String name = in.nextLine();
        in.nextLine();
        //System.out.println("Hi " + name + "!");


        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input
        
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        //System.out.println("You entered: " + startNum + " and " + endNum);
        System.out.println("Average of squares from " + startNum + " to " + endNum);
        int total = 0;
        int i = startNum;
        while (i <= endNum) {
            total += i*i;
            ++i;
        }
        double average = (double) total / (endNum - startNum + 1);
        System.out.println(average);
    }
}