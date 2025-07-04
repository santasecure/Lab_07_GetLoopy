public class TriangleDown {
    public static void main(String[] args) {
        // Pseudocode:
// START
//   Outer loop from 5 down to 1 (each row)
//     Inner loop from 1 to current row number
//     Display a star followed by a space
//     End inner loop
//   Print a newline
// STOP
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


