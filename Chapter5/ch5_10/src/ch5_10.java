import java.util.*;

public class ch5_10
{
    public static void main(String[] args)
    {
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入你的整月工時：");
        int work_time = sc.nextInt();
        System.out.print("請輸入你的固定時薪：");
        int salary_hour = sc.nextInt();

        if (work_time <= 60)
        {
            result = work_time * salary_hour;
        }
        else if (work_time <= 120)
        {
            result = (int)(work_time * salary_hour * 1.33);
        }
        else
        {
            result = (int)(work_time * salary_hour * 1.66);
        }
        System.out.println("薪資為 = " + result + "元");

    }
}
