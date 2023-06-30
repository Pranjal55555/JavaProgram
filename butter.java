public class butter {
    public static void butterful(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");

            }
            for (int j = 1; j <= 2 * (n - 1); j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
            }
        for (int i = n; i >= 1; i--) {
            System.out.print("*");
            }
        for (int j = 1; j <= 2 * (n - 1); j++) {
            System.out.print(" ");
            }
        for (int j = 1; j <= i; j++) {
            System.out.print(" *");
            }

    }
}
