package pattern;

public class LogicalOperator {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a == b && a<b && a<c);//false

        System.out.println(a<b && a<c && b<c && a<=c);//true

        System.out.println(a == b || a<b || a>b);//true

        System.out.println(!true);//false
    }
}
