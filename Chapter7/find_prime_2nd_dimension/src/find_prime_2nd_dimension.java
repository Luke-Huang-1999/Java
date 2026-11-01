public class find_prime_2nd_dimension
{
    public static void main(String[] argv)
    {
        int[][] arr = new int[10][];

        find_prime(arr);

        for (int i = 0; i < 10; i++)
        {
            System.out.print("arr[" + i + "]=");
            for (int num : arr[i])
                System.out.print(num + " ");
            System.out.print("\n");
        }
    }

    static void find_prime(int[][] a)
    {
        int i, j, is_prime = 1;     //1為質數，0為合數
        int row = 0, col = 0, old_row = 0;
        int[] col_cnt = new int[10];
        for (i = 2; i < 100; i++)
        {
            is_prime = 1;
            for (j = i - 1; j > 1; j--)
            {
                if (i % j == 0)
                {
                    is_prime = 0;
                    break;
                }
            }
            if (is_prime == 1)
                col_cnt[i / 10]++;

        }
        for (i = 0; i < 10; i++)
        {
            a[i] = new int[col_cnt[i]];
        }

        for (i = 2; i < 100; i++)
        {
            is_prime = 1;
            for (j = i - 1; j > 1; j--)
            {
                if (i % j == 0)
                {
                    is_prime = 0;
                    break;
                }
            }

            if (is_prime == 1)
            {
                row = i / 10;
                if (old_row != row)
                    col = 0;
                a[row][col++] = i;
                old_row = row;
            }

        }

    }
}
//    static int[] col_cnt(int[][] a)
//    {
//        int[] cnt = new int[10];
//        int i , j, is_prime = 1;
//        for (i = 2; i < 100; i++)
//        {
//            for (j = i - 1; j > 1; j--)
//            {
//                if(i % j == 0)
//                {
//                    is_prime = 0;
//                    break;
//                }
//            }
//
//        }
//    }

