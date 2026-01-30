import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern2 {
    public static void main(String[] args) {
        // Declare Scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the size: ");
        int size = in.nextInt(); // Reads in an int from standard input

        while (size > 5 || size < 1) {
            if (size > 5)
                System.out.println("too big!");   //wrong way round but tests incorrect
            
            else if (size < 1)
                System.out.println("too small!");

            System.out.print("Enter the size: ");
            size = in.nextInt();
        }
        
        boolean reversing = false;  //is each row starting at increasing number (or decreasing)
        int rowFromTopBottom = 0;   //how many rows from the top or bottom (0 if on it)

        while (0 <= rowFromTopBottom && rowFromTopBottom <= size) {

            if (rowFromTopBottom == size)
                reversing = true;
            else {
                int num = 1;   //gets row start num
                while (num <= size) {   //count up (eg 123)
                    System.out.print(num+rowFromTopBottom);
                    ++num;
                }
                num--;
                while (num >= 1) {  //count down (eg 321)
                    System.out.print(num+rowFromTopBottom);
                    --num;
                }
                System.out.println();
            }

            if (!reversing)
                ++rowFromTopBottom;
            else
                --rowFromTopBottom;
        }
    }

}