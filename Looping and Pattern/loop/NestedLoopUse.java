package pattern.loop;

public class NestedLoopUse {
    public static void main(String[] args) {
int n = 12;
        for(int i = 0;i < n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

    }
}
