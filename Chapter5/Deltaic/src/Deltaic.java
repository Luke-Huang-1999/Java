import java.util.*;

public class Deltaic
{
    public static void main(String[] argv)
    {
        int i = 0, j = 0, k = 0;
        System.out.println("請輸入三角形的邊長：");

        Scanner sc = new Scanner(System.in);
        System.out.print("邊長 1 ->");
        i = sc.nextInt();
        System.out.print("邊長 2 ->");
        j = sc.nextInt();
        System.out.print("邊長 3 ->");
        k = sc.nextInt();

        if ((i + j) > k)
        {
            if ((i + k) > j)
            {
                if ((j + k) > i)
                {
                    System.out.println("可以為三角形的三邊長");
                }
            }
        }


    }
}
