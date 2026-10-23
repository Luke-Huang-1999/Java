public class ch4_2
{
    public static void main(String[] argv)
    {
        //宣告變數
        int origin = 137;//初始價格
        int ten_cnt, five_cnt, one_cnt;

        //先處理10元硬幣
        ten_cnt = origin / 10;

        //再處理5元硬幣
        five_cnt = (origin % 10) / 5;

        //最後處理1元硬幣
        one_cnt = origin - ten_cnt * 10 - five_cnt * 5;


        //輸出結果
        System.out.println("10元硬幣最少需要" + ten_cnt);
        System.out.println(" 5元硬幣最少需要" + five_cnt);
        System.out.println(" 1元硬幣最少需要" + one_cnt);

    }
}
