package shop;

public class Inventory {

    private final int MAX_SIZE;
    private ClothingItem[] items;
    private int itemLength;

    public Inventory(int size) {
        itemLength = 0;
        MAX_SIZE = size;
        items = new ClothingItem[MAX_SIZE];
    }

    public void addItem(ClothingItem newItem) {
        if (itemLength == MAX_SIZE) {
            System.out.println("Inventory::Cannot add more clothes");
            return;
        }

        items[itemLength] = newItem;
        itemLength += 1;
    }

    public int stockFor(String name, char size) {
        int contador = 0;
        ClothingItem productToFind=new ClothingItem(name, 0.0, size);
        /**
         * FALTA  IMPLEMENTAR
         */
        System.out.println("\u001B[31mFALTA IMPLEMENTAR stockFor\033[0m");

        return contador;
    }
    public void removeItem(String name, char size) {
        boolean itemFound = false;
        int elementToRemove = -1;
        ClothingItem product = new ClothingItem(name, 0.0, size);

        /**
         * FALTA  IMPLEMENTAR
         */
        System.out.println("\u001B[31mFALTA IMPLEMENTAR removeItem\033[0m");
    }

    public ClothingItem findItem(String name, char size) {
        boolean found = false;
        ClothingItem item = null;

        ClothingItem product = new ClothingItem();
        product.setName(name);
        product.setSize(size);

        /**
         * FALTA  IMPLEMENTAR
         */
        System.out.println("\u001B[31mFALTA IMPLEMENTAR findItem\033[0m");
        return item;
    }


    @Override
    public String toString() {
        StringBuilder itemsString = new StringBuilder();
        itemsString.append("Inventory => itemLength=")
                .append(itemLength)
                .append(", MAX_SIZE=")
                .append(MAX_SIZE)
                .append("\n\n");

        for (int i = 0; i < itemLength; ++i) {
            itemsString.append(items[i]).append("\n");
        }

        return itemsString.toString();
    }
}
