import CellPhone.*;
import TV.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Start program = new Start();
        Scanner scanner = new Scanner(System.in);
        Headers header = new Headers();
        Tracker tracker = new Tracker();


        boolean option = true;

        //loop menu
        while( option == true) {
            //main menu
            header.supermarket(header.supermkt);
            System.out.println("1 - Buy item");
            System.out.println("2 - Sell item");
            System.out.println("3 - Exit");
            System.out.print("Insert your option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    header.supermarket(header.supermkt);
                    header.supermarket(header.buy);
                    System.out.println("1 - Television");
                    System.out.println("2 - Cellphone");
                    System.out.print("Insert your option: ");
                    int itemChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (itemChoice) {
                        case 1: {
                            boolean opt = true;
                            while (opt) {
                                header.supermarket(header.supermkt);
                                header.supermarket(header.tv);
                                System.out.println("1 - Samsung");
                                System.out.println("2 - Sony");
                                System.out.println("3 - TCL");
                                System.out.print("Insert your option: ");
                                int tvChoice = scanner.nextInt();
                                scanner.nextLine();
                                switch (tvChoice) {
                                    case 1: {
                                        program.buySamsungTv();
                                        System.out.println("You bought a Samsung television.");
                                        program.displayTelevisions();
                                        break;
                                    }// end case 1 tvChoice Samsung

                                    case 2: {
                                        program.buySonyTv();
                                        System.out.println("You bought a Sony television.");
                                        program.displayTelevisions();
                                        break;
                                    }// end case 2 tvChoice Sony

                                    case 3: {
                                        program.buyTclTv();
                                        System.out.println("You bought a TCL television.");
                                        program.displayTelevisions();
                                        break;
                                    }// end case 2 tvChoice TCL

                                } //end switch tvChoice
                                System.out.print("Buy another television ? ( 1- Yes , 2- No )");
                                int bChoice = scanner.nextInt();
                                if (bChoice == 2) {
                                    opt = false;
                                }
                            }// end loop
                            break;
                        }//end case1 itemChoice

                        case 2: {
                            boolean opt = true;
                            while (opt) {
                                header.supermarket(header.supermkt);
                                header.supermarket(header.phone);
                                System.out.println("1 - Apple");
                                System.out.println("2 - Samsung");
                                System.out.println("1 - Oppo");
                                System.out.print("Insert your option: ");
                                int brandChoice = scanner.nextInt();
                                scanner.nextLine();

                                switch (brandChoice) {
                                    case 1: {
                                        program.buyApplePhone();
                                        System.out.println("\nYou bought an Apple cellphone.\n1");
                                        program.displayCellphones();
                                        System.out.println(tracker.getTotalbuy());
                                        break;
                                    }// end case 1 brandChoice
                                    case 2: {
                                        program.buySamsungPhone();
                                        System.out.println("\nYou bought an Samsung cellphone.\n1");
                                        program.displayCellphones();
                                        break;
                                    }// end case 2 brandChoice
                                    case 3: {
                                        program.buyOppoPhone();
                                        System.out.println("\nYou bought an Oppo cellphone.\n1");
                                        program.displayCellphones();
                                        break;
                                    }// end case 3 brandChoice
                                }// end switch BrandChoice
                                    System.out.print("Buy another television ? ( 1- Yes , 2- No )");
                                    int bChoice = scanner.nextInt();
                                    if (bChoice == 2) {
                                        opt = false;
                                    }
                            }// end loop
                            break;
                        }//end case2 itemChoice
                    }//end switch itemChoice
                    break;
                }// end case1 main menu

                case 2: {
                    header.supermarket(header.supermkt);
                    header.supermarket(header.sell);
                    System.out.println("need to do");
                    break;
                }// end case2 main menu

                case 3: {
                    option = false;
                    break;
                }// end case3 main menu
            }// end switch main menu
        }// end while menu
    }// end void main
}// end class main
