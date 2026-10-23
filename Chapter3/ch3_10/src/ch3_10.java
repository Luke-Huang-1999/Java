public class ch3_10
{
    public static void main(String[] argv)
    {
        int m1 = 240_000;
        int m2 = 1_500_000;
        final double rate = 0.0084;
        double interest;
        int m1_new;
        int m2_new;

        interest = (m1 * rate) / 12.0;
        m1_new = (int) Math.round(interest) + m1;

        interest = (m2 * rate) / 12.0;
        m2_new = (int) Math.round(interest) + m2;

        System.out.println("存款為" + m1 + "時，一個月後的本利和為" + m1_new);
        System.out.println("存款為" + m2 + "時，一個月後的本利和為" + m2_new);


    }
}
