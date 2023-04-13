package sales;

import shop.ClothingItem;
import shop.Inventory;

public class SalesRegister {
    private static long numSales=0;
    public static void addProduct(Inventory inventory, ClothingItem item){
        inventory.addItem(item);
    }
    public long getNumSales() {
        return numSales;
    }

    public static void checkFuncionality(Inventory inventory){
        System.out.println("Stock para Falda, S (debera mostrar el número de (Falda, S) que hay ==>" +  inventory.stockFor("Falda", 'S'));
        System.out.println("Stock para Jersey S (debera mostrar el número de (Falda, S) que hay  ==> " +  inventory.stockFor("Jersey", 'S'));

        ClothingItem itemFound = inventory.findItem("Falda", 'S');
        System.out.println("Prenda Encontrada (Deberá verse la prenda encontrada) ==> " + itemFound);


        ClothingItem itemNotFound = inventory.findItem("Jersey", 'S');
        System.out.println("Prenda(Jersey, S) , No Encontrada ==> " + itemNotFound);

        inventory.removeItem("Falda", 'S');
        System.out.println("\nDespues de eliminar una Falda, S :\n "+ inventory);

    }
}