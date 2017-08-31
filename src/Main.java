import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<InventoryItem> itemList = new ArrayList<>();

    private static void printList() {
        System.out.println("We currently have the following: ");

        int i = 1;
        for (InventoryItem item : itemList
                ) {
            System.out.println(i + ". " + "[" + item.itemQty + "] " + item.itemName);
            i++;
        }
    }

    private static void chooseOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do? ");
        System.out.println("1 - enter a new item");
        System.out.println("2 - remove an item");
        System.out.println("3 - update the quantity of an item");
        try {
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.println("Enter the new item name: ");
                    String itemName = scanner.nextLine();
                    System.out.println("Enter the quantity of the new item.");
                    int itemQty = Integer.parseInt(scanner.nextLine());
                    itemList.add(new InventoryItem(itemQty, itemName));
                    break;

                case 2:
                    System.out.println("Enter the number of the item you'd like to remove.");
                    printList();
                    int removeItem = Integer.parseInt(scanner.nextLine());
                    itemList.remove(removeItem - 1);
                    break;

                case 3:
                    System.out.println("Enter the number of the item you'd like to update.");
                    System.out.println();
                    printList();
                    System.out.println();
                    int indexToUpdate = Integer.parseInt(scanner.nextLine()) - 1;
                    System.out.println("Enter your new quantity.");
                    int newQty = Integer.parseInt(scanner.nextLine());
                    itemList.get(indexToUpdate).itemQty = newQty;
                    break;

                default:
                    System.out.println("You must enter a valid option!");
                    break;
            }

        } catch (Exception e) {
            System.out.println("You must enter a number!");
        }


    }

    public static void main(String[] args) {

        System.out.println("Hello and welcome to the inventory tracker system!");
        System.out.println();

        //initialize the list
        itemList.add(new InventoryItem(5, "books"));

        while (true) {
            printList();
            System.out.println();
            chooseOption();
            System.out.println();
        }
    }


}
