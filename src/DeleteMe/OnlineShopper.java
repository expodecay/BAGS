package DeleteMe;

public class OnlineShopper {
    public static void main(String[] args)
    {
        Item[] items =
                {
                        new Item("Bird feeder", 2050),
                        new Item("Squirrel guard", 1547),
                        new Item("Bird bath", 4499),
                        new Item("Sunflower seeds", 1295)
                };
        //DeleteMe.Project_1.BagInterface<DeleteMe.Project_1.Item> shoppingCart = new FixedSizeArrayBag<>();
        //DeleteMe.Project_1.BagInterface<DeleteMe.Project_1.Item> shoppingCart = new Project_1.ResizableArrayBag<>();
        BagInterface<Item> shoppingCart = new LinkedBag<>();
        int totalCost = 0;
        //Statements that add selected items to the shopping cart:
        for (int index=0; index<items.length; index++)
        {
            Item nextItem = items[index]; //Simulate getting item from shopper
            shoppingCart.add(nextItem);
            totalCost = totalCost + nextItem.getPrice();
        }
        //Simulate checkout
        while (!shoppingCart.isEmpty())
            System.out.println(shoppingCart.remove());
        System.out.println("Total cost: " + "\t$"
                + totalCost / 100 + "." + totalCost % 100);
    }
}
