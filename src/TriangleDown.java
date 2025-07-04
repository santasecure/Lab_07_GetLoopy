public class TriangleDown {
    public static void main(String[] args) {
        // Print triangle of stars decreasing by 1 per row
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


