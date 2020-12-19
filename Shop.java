package com.company;

public class Shop {
    public String Name;
    public String INN;

    public Shop(String Name, String INN)
    {
        this.Name = Name;
        this.INN = INN;
    }

    public String getName()
    {
        return Name;
    }

    public String getINN()
    {
        return INN;
    }

    static String[] AvailableINN = new String[]
            {"123456781234", "567812345678", "987654321000","000000000000","111122223333"};

    public void CheckINN(String Name, String INN) {
        int a = 0;
        while (a<5) {
            if (INN == AvailableINN[a]){
                System.out.println("ИНН клиента " + Name + " действителен.");
            break;
            }
            else {
                a++;
            }
            if(a==5){
                System.out.println("ИНН клиента " + Name + " недействителен.");
            }
        }
    }

    public static void Check(Shop a)
    {
        try
        {
            a.CheckINN(a.getName(), a.getINN());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());;
        }
    }

}
