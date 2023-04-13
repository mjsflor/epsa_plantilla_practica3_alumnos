package app;

import sales.SalesRegister;
import shop.ClothingItem;
import shop.Inventory;

import java.util.Scanner;

public class Main {

    private static Inventory inventory;
    private static Scanner keyboard;

    public static void main(String[] args) {

        // Inventory instantiation
        inventory = new Inventory(20);
        keyboard = new Scanner(System.in);

        initializeInventory();

        System.out.println("*** Welcome to Strafalarius ***");
        System.out.println("*******************************");
        System.out.println(inventory);

        System.out.println("\u001B[31m¡¡¡DEBES IMPLEMENTAR TU MENU Y LAS OPCIONES!!!\033[0m");


        System.out.println("\n\u001B[31m¡¡¡PRUEBA TU IMPLEMENTACION!!!\033[0m");
        SalesRegister.checkFuncionality(inventory);
        System.out.println("\u001B[31m¡¡¡FIN DE PRUEBAS!!!\033[0m");

    }

    private static void addProduct(String name, int numVeces) {
        ClothingItem productS = new ClothingItem(name, 29.5, 'S');
        ClothingItem productM = new ClothingItem(name, 30.5, 'M');
        ClothingItem productL = new ClothingItem(name, 31.5, 'L');

        for (int i = 0; i < numVeces; i++) {
            SalesRegister.addProduct(inventory,productS);
            SalesRegister.addProduct(inventory,productM);
            SalesRegister.addProduct(inventory,productL);
        }
    }

    private static void initializeInventory() {
            addProduct("Falda", 1);
            addProduct("Pantalon", 1);
            addProduct("Falda", 1);
    }

}
