import CellPhone.*;
import TV.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Start program = new Start();
        Scanner scanner = new Scanner(System.in);
        Headers header = new Headers();


        //main menu
        header.supermarket(header.supermkt);
        System.out.println("1 - Buy item");
        System.out.println("2 - Sell item");
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
                        header.supermarket(header.supermkt);
                        header.supermarket(header.tv);
                        System.out.println("1 - Samsung");
                        System.out.println("2 - Sony");
                        System.out.println("1 - TCL");
                        break;
                    }//end cas1 itemChoice

                    case 2: {
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
                                System.out.println("\nYou bought an Apple cellphone.\n");
                                program.displayCellphones();
                                break;
                            }// end case 1 brandChoice
                        }// end switch brandChoice
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
        }// end switch main menu
    }// end void main
}// end class main
