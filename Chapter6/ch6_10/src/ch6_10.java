import java.util.*;

public class ch6_10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入x值：");//10
        int x = sc.nextInt();
        System.out.print("請輸入n值：");//5
        int n = sc.nextInt();

        double result = 0;
        int i = 1;
        int j = 0;
        while (n >= 1)
        {
            double check = (x++) / (n--);
            result = result + check;
        }

        System.out.println("result = " + result);

    }


}
