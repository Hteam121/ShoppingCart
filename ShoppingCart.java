import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<ItemOrder> list;
    static double total = 0;
    double price = 0;

    ShoppingCart()
    {
        list = new ArrayList<>();
    }

    void add(ItemOrder newOrder)
    {
/**
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i).getItem().toString());
        }
**/
        System.out.println("works");
        price = 0;
        boolean flag = true;

        System.out.println(list.size());
        if(list.size() == 0)
        {
            list.add(newOrder);
            total+= newOrder.getPrice();
        }
        for(int i = 0; i < list.size(); i++)
        {
            //System.out.println(i);
            if(newOrder.getItem().getName().equals(list.get(i).getItem().getName()))
            {
                price -= list.get(i).getPrice();
                list.set(i, newOrder);
                //System.out.println(list.get(i).getPrice());
                price+= list.get(i).getPrice();
                flag = false;
                //System.out.println(list.get(i).getItem().getName());
            }
        }


        if(flag)
        {
            price += newOrder.getPrice();
            list.add(newOrder);
        }
    }

    double getTotal()
    {
/**
        int total = 0;
        for(int i = 0;i < list.size(); i++)
        {
            System.out.println(list.get(i).getPrice());
            total += list.get(i).getPrice();
            System.out.println(total);
        }
**/
        total+= price;
        return total;
    }
}
