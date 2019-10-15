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

 class thread1 {
    public static void main(String arg[])
    {
        one a1=new one();
        two b1=new two();
        a1.start();
        b1.start();
    }
}
