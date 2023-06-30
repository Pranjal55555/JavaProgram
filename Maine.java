public class Maine {
    public static void inverted_rotatedhalf_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void invertedhalfpyramidwithnumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 2; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void floydstraingle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(counter + " ");

                counter++;
            }

            System.out.println();

        }
    }

    public static void traingle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i - j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void butterfulypattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print(" *");
            }
            int  space=2 * (n - i);
            for (int j = i; j <=space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        // inverted_rotatedhalf_pyramid(4);
        // invertedhalfpyramidwithnumber(5);
        // floydstraingle(5);
        // traingle(6);
        butterfulypattern(4);
    }
}