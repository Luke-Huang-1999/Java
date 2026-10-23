public class ch4_1
{
    public static void main(String[] argv)
    {
        int i = 300;
        int j;
        int result = 1;
        if (i < 31)
            for (j = 0; j < i; j++)
            {
                result *= 2;
            }
        else
        {
            result = i;
        }

        System.out.println("result = " + result);
    }
}
