public class TriangleUp {
    public static void main(String[] args) {
        // Print triangle of stars increasing by 1 per row
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

