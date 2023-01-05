public class Item
{
    String name;
    double price;
    int bulkQty = 0;
    double bulkPrice = 0;

    Item(String n, double p)
    {
        name = n;
        price = p;
    }
    Item(String n, double p, int bQ, double bP)
    {
        if(p < 0 || bQ < 0||bP < 0)
            throw new IllegalArgumentException("error");
        name = n;
        price = p;
        bulkQty = bQ;
        bulkPrice = bP;
    }

    String getName()
    {
        return name;
    }

    public double priceFor(int quantity)
    {
        if(bulkQty == quantity)
        {
            return bulkPrice;
        } else {
            return price*quantity;
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        if(name.equals(obj))
            return true;
        return false;
    }

    @Override
    public String toString()
    {
        if(bulkQty == 0)
            return name + ", $" + price;
        return name + ", $" + price + " (" + bulkQty + " for $" + bulkPrice;
    }
}
