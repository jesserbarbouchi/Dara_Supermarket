import java.util.ArrayList;
import java.util.Scanner;
import TV.*;
import CellPhone.*;
import java.util.List;
public class Start {

    private List<Cellphone> cellphones;



    //constructors
    private Apple apple = new Apple();
    private Samsung samsung = new Samsung();
    private Oppo oppo = new Oppo();
    private SamsungTv samsungTv = new SamsungTv();
    private SonyTv sonyTv = new SonyTv();
    private TclTv tclTv = new TclTv();

    //create apple

    private Cellphone createCellphone(IBuilderPhone phone) {
        Assembler assembler = new Assembler(phone);
        assembler.createCellphone();
        return assembler.getCellphone();
    }


    public Start() {
        cellphones = new ArrayList<>();
    }
    public void startProgram(){
        Cellphone cellphoneApple = createCellphone(new Apple());
        cellphones.add(cellphoneApple);

        for (Cellphone cellphone : cellphones) {
            cellphone.Display();
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        }

    }




//    //create samsung
//    Assembler assemblerSamsung = new Assembler(samsung);
//        assemblerSamsung.createCellphone();
//    Cellphone cellphoneSamsung = assemblerSamsung.getCellphone();
//        cellphoneSamsung.Display();
//    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
//
//
//    //create oppo
//    Assembler assemblerOppo = new Assembler(oppo);
//        assemblerOppo.createCellphone();
//    Cellphone cellphoneOppo = assemblerOppo.getCellphone();
//        cellphoneOppo.Display();
//        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
//
//    //create samsungtv
//    AssemblerTv assemblerSamsungTv = new AssemblerTv(samsungTv);
//        assemblerSamsungTv.createTv();
//    TV tvSamsung = assemblerSamsungTv.getTv();
//        tvSamsung.Display();
//        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
//
//    //create sonytv
//    AssemblerTv assemblerSonyTv = new AssemblerTv(sonyTv);
//        assemblerSonyTv.createTv();
//    TV tvSony = assemblerSonyTv.getTv();
//        tvSony.Display();
//        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
//
//    //create tcl
//    AssemblerTv assemblerTclTv = new AssemblerTv(tclTv);
//        assemblerTclTv.createTv();
//    TV tvTcl = assemblerTclTv.getTv();
//        tvTcl.Display();
//        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
//

        //**************************************************

//
//    public void buyInventory() {
//        Scanner scanner = new Scanner(System.in);
//
//        // Display available items for purchase
//        System.out.println("Items for Purchase:");
//        for (int i = 0; i < ItemCatalog.catalog.size(); i++) {
//            Item item = ItemCatalog.catalog.get(i);
//            System.out.println(i + 1 + ". " + item.getName() + " - Price: $" + item.getPrice());
//        }
//
//        System.out.print("Enter the item number to buy (0 to cancel): ");
//        int itemNumber = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        if (itemNumber >= 1 && itemNumber <= ItemCatalog.catalog.size()) {
//            Item selectedItem = ItemCatalog.catalog.get(itemNumber - 1);
//            System.out.print("Enter the quantity to buy: ");
//            int quantityBought = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            double totalCost = selectedItem.getPrice() * quantityBought;
//            selectedItem.buy(quantityBought);
//            expenses += totalCost;
//            System.out.println("Bought " + quantityBought + " " + selectedItem.getName() + " for $" + totalCost);
//        } else if (itemNumber != 0) {
//            System.out.println("Invalid item number.");
//        }
//    }

}
