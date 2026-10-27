import java.util.*;

public class ch5_2
{
    public static void main(String[] argv)
    {
        System.out.print("請輸入分數：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

//        switch(score)
//        {
//            case 90,91,92,93,94,95,96,97,98,99:
//                System.out.println("分數為A");
//                break;
//            case 80,81,82,83,84,85,86,87,88,89:
//                System.out.println("分數為B");
//                break;
//            case 70,71,72,73,74,75,76,77,78,79:
//                System.out.println("分數為C");
//                break;
//            case 60,61,62,63,64,65,66,67,68,69:
//                System.out.println("分數為D");
//                break;
//
//            default:
//                System.out.println("分數為E");
//                break;
//        }

        if(score<=100 &&score>=90)
            System.out.println("分數為A");
        else if(score<=89 &&score>=80)
            System.out.println("分數為B");
        else if(score<=79 &&score>=70)
            System.out.println("分數為C");
        else if(score<=69 &&score>=60)
            System.out.println("分數為D");
        else
            System.out.println("分數為E");
    }
}
