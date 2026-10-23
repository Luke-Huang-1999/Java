import java.util.*;
public class Evaluate
{
    public static void main(String[] argv)
    {
        System.out.print("請輸入年度考績 (優、甲、乙、丙)：");

        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        switch(grade)
        {
            case "優":
                System.out.println("出國去玩");
                break;
            case "甲":
                System.out.println("買支手機犒賞自己");
                break;
            case "乙":
                System.out.println("去逛街放鬆心情");
                break;
            case "丙":
                System.out.println("準備上求職網站找工作");
                break;
            default:
                System.out.println("請輸入正確的考績");
                break;
        }
    }
}
