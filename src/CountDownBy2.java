public class CountDownBy2 {
    public static void main(String[] args) {
        // Pseudocode:
// START
//   Create a loop starting at 10 and ending at 0
//   Decrease the counter by 2 each time
//   Display each number with a space
// STOP
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
    }
}

