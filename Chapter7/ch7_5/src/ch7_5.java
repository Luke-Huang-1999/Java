public class ch7_5
{
    public static void main(String[] argv)
    {
        int[] a = {1, 2, 3, 4, 5};

        cubic(a);

        System.out.print("a[] = ");
        for (int i : a)
            System.out.print(i + " ");
    }
    static void cubic(int []a)
    {
        int length = a.length;
        for (int i = 0; i < length; i++)
        {
            a[i] = a[i] * a[i] * a[i];
        }
    }
}
