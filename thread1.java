class one extends Thread
{
    public void run()
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println("from class a "+i);
        }
        System.out.println("exit a ");
    }
}
class two extends Thread
{
    public void run()
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println("from class b "+i);
        }
        System.out.println("exit b ");
    }
}
class Thread1 {
    public static void main(String arg[])
    {
        one A=new one();
        two B=new two();
        A.start();
        B.start();
    }
}
