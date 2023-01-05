public class ItemOrder {

    Item item;
    int qty;

    ItemOrder(Item i, int q)
    {
        item = i;
        qty = q;
    }



    double getPrice()
    {
        return item.priceFor(qty);
    }

    Item getItem()
    {
        return item;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(item.equals(obj))
        {
            return true;
        } else {
            return false;
        }
    }
}
