package com.company;

public class ShopTest {
    public static void main(String[] args)
    {
        Shop client1 = new Shop("Сидоров В.В.","000000000000");
        Shop.Check(client1);

        Shop client2 = new Shop("Иванов К.В.","111122223333");
        Shop.Check(client2);

        Shop client3 = new Shop("Козлов И.К.","456743214563");
        Shop.Check(client3);

        Shop client4 = new Shop("Воробьёв А.У.","235746772342");
        Shop.Check(client4);

        Shop client5 = new Shop("Ландышева М.Н.","123456781234");
        Shop.Check(client5);
    }
}
