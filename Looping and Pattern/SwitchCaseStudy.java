package pattern;

public class SwitchCaseStudy {
    public static void main(String[] args) {
        int num = 300;
        switch(num)
        {
            case 200:
                System.out.println("case1");
                break;
            case 300:
                System.out.println("case2");
                break;
            case 100:
                System.out.println("case3");
                break;
            default:
                System.out.println("Case doesn't match.");


        }
    }
}
