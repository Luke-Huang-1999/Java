public class ch7_4
{
    public static void main(String[] argv)
    {
        int[] a = {30, 20, 10, 5, 34};
        System.out.println("a.length = " + (a.length) / 2);
        for (int i = 0; i < (a.length / 2); i++)
        {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length  - 1- i] = tmp;
        }
        for (int i : a)
            System.out.print(i + " ");
    }
}
