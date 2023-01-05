import java.util.ArrayList;

public class Catalog {
    String name;
    ArrayList<Item> list = new ArrayList<>();

    Catalog(String n)
    {
        name = n;
    }

    void add(Item item)
    {
        list.add(item);
    }

    int size()
    {
        return list.size();
    }

    Item get(int index)
    {
        return list.get(index);
    }

    String getName()
    {
        return name;
    }
}
