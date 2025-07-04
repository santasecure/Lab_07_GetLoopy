public class StarSquare {
    public static void main(String[] args) {
        // Pseudocode:
// START
//   Outer loop from 1 to 5 (each row)
//     Inner loop from 1 to 5 (each column)
//     Display a star followed by a space
//     End inner loop
//   Print a newline
// STOP
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


