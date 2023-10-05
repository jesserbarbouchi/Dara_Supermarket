import java.util.ArrayList;
import java.util.Scanner;
import TV.*;
import CellPhone.*;
import java.util.List;
public class Start {

    private List<Cellphone> cellphones;
    private List<TV> televisions;

    //constructors
    private Apple apple = new Apple();
    private Samsung samsung = new Samsung();
    private Oppo oppo = new Oppo();
    private SamsungTv samsungTv = new SamsungTv();
    private SonyTv sonyTv = new SonyTv();
    private TclTv tclTv = new TclTv();

    private Cellphone createCellphone(IBuilderPhone phone) {
        Assembler assembler = new Assembler(phone);
        assembler.createCellphone();
        return assembler.getCellphone();
    }

    private TV createTv(IBuilderTv tv) {
        AssemblerTv assembler = new AssemblerTv(tv);
        assembler.createTv();
        return assembler.getTv();
    }

    public Start() {
        cellphones = new ArrayList<>();
        televisions = new ArrayList<>();
    }
    public void buyApplePhone() {
        Cellphone applePhone = createCellphone(new Apple());
        cellphones.add(applePhone);
    }
    public void buySamsungPhone() {
        Cellphone samsungPhone = createCellphone(new Samsung());
        cellphones.add(samsungPhone);
    }

    public void buyOppoPhone() {
        Cellphone oppoPhone = createCellphone(new Oppo());
        cellphones.add(oppoPhone);
    }

    public void buySamsungTv() {
        TV samsungTv = createTv(new SamsungTv());
        televisions.add(samsungTv);
    }

    public void buySonyTv() {
        TV sonyTv = createTv(new SonyTv());
        televisions.add(sonyTv);
    }

    public void buyTclTv() {
        TV tclTv = createTv(new TclTv());
        televisions.add(tclTv);
    }

}


//        for (Cellphone cellphone : cellphones) {
//            cellphone.Display();
//            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
//        }



