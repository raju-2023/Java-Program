package pattern;

public class If_Else_Statement {
    public static void main(String[] args) {
//        int age = 8;
//        if(age >= 18)
//        {
//            System.out.println("You are Adult.");
//        }
//        else
//        {
//            System.out.println("You are a Kids.");
//        }


//            int age = 68;
//            if(age >= 18 && age<60)
//            {
//                System.out.println("You are an Adult.");
//            } else if (age >= 60)
//            {
//                System.out.println("You are senior citizen");
//            }
//            else
//            {
//                System.out.println("You are a Kid.");
//            }



        int age = 7;
        if(age >= 18 && age<=60)
        {
            if (age>20 && age<30)
            {
                System.out.println("You are in 20's");
            } else if (age >=30 && age<=40)
            {
                System.out.println("You are in 30's");
            }
            else
            {
                System.out.println("You are still teen");
            }
        } 
        else if (age > 60) 
        {
            System.out.println("You are an old man");
        }
        else if (age >= 16 && age<18)
        {
            System.out.println("You are teen ager");
        }
        else
        {
            System.out.println("You are still kid");
        }


    }
}
