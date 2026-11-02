class IcCard
{
    long id;
    int money;

    void showInfo()
    {
        System.out.println("卡片卡號：" + id);
        System.out.println("餘額：" + money + "元");
    }
}

public class Card2
{
    public static void main(String[] args)
    {
        IcCard mycard = new IcCard();

        mycard.id = 0x336789AB;
        mycard.money = 300;

        mycard.showInfo();
    }
}
