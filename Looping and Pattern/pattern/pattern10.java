package pattern.patter;
/*Print Diagonal Code(One Diagonal)
                    *
                        *
                            *
                                *
                                    *
                                        *
                                            *
                                                *
                                                    *
                                                        *

 */
public class pattern10 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
