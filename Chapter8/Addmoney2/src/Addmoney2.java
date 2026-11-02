class IcCard
{
    int id;
    int money;

    boolean withDraw(int amount)
    {
        if(money >= amount)
        {
            this.money = this.money - amount;
            //System.out.println("提款成功");
            return true;
        }
        else
        {
            //System.out.println("提款失敗");
            return false;
        }

    }

    void showInfo()
    {
        System.out.println("卡片名稱：" + id);
        System.out.println("卡片餘額：" + money);
    }

    void withDrawState(boolean State)
    {
        System.out.println("提款狀態：" + State);
    }
}

public class Addmoney2
{
    public static void main(String[] args)
    {
        IcCard mycard = new IcCard();

        mycard.id = 123456789;
        mycard.money = 1000;
        System.out.println("提款前");
        mycard.showInfo();



        System.out.println("\n\n提款後");
        mycard.withDrawState(mycard.withDraw(100));
        mycard.showInfo();
    }
}
