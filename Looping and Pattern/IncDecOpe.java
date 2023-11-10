package pattern;

public class IncDecOpe {
    public static void main(String[] args) {
        //int a = 5;
//        a++;
//        System.out.println(a);
//        a--;
        //a++;
        //++a;

        //int a= 5;
        //int b = a++;
        //int b = ++a;
        //int b = a++ + ++a + --a;

        int a =5;
        int b;
        b = a++ + ++a + ++a + a++ + --a + a--;
        System.out.println(a);
        System.out.println(b);
    }
}
