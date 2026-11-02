public class Array
{
    public static void main(String[] argv)
    {
        int[][] scores = {
                {85, 72, 90},
                {60, 88, 75},
                {92, 95, 80},
                {78, 65, 89},
                {88, 90, 96}};
        printScore(scores);
        System.out.print("\n");
        aVerage(scores);
        System.out.print("\n");
        findMax(scores);
        System.out.print("\n");
        avSingle(scores, aVerage(scores));
        System.out.print("\n");
    }

    public static void printScore(int[][] scores)
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("學生" + (i + 1) + "：國文" + scores[i][0] + " 英文" + scores[i][1] + " 英文" + scores[i][2]);
        }

    }

    public static int aVerage(int[][] scores)
    {
        int sum = 0;
        double av = 0.0;
        double avHighScore = 0.0;
        int avHighIndex = 0;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                sum = sum + scores[i][j];
            }
            av = sum / 3.0;
            sum = 0;
            System.out.println("學生" + (i + 1) + " 平均：" + av);
            if(avHighScore < av)
            {
                avHighScore = av;
                avHighIndex = i;
            }
        }
        return avHighIndex;
    }

    public static void findMax(int[][] scores)
    {
        int[] max = new int[3];         //找出該科目最高分
        int[] maxIndex = new int[3];    //紀錄哪一個學生最高分

        for (int j = 0; j < 3; j++)
        {
            for (int i = 0; i < 5; i++)
            {
                if (max[j] < scores[i][j])
                {
                    max[j] = scores[i][j];
                    maxIndex[j] = i + 1;
                }
            }
        }

        System.out.println("國文最高分：" + max[0]+"(學生" + maxIndex[0] + ")");
        System.out.println("英文最高分：" + max[1]+"(學生" + maxIndex[1] + ")");
        System.out.println("數學最高分：" + max[2]+"(學生" + maxIndex[2] + ")");

    }
    public static void avSingle(int[][] scores, int avHighIndex)
    {
        double avS = 0.0;
        for(int j=0;j<3;j++)
        {
            avS += scores[avHighIndex][j] / 3.0;
        }
        System.out.println("總平均最高：學生" + (avHighIndex + 1));
        System.out.println("平均成績：" + avS);
    }
}
