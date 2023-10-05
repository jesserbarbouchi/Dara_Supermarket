package CellPhone;

public class Oppo implements IBuilderPhone {
    private Cellphone cellphone;

    public Oppo(){
        this.cellphone = new Cellphone();
    }

    public void buildBrand(){
        this.cellphone.setBrand("Oppo");
    }

    public void buildColor(){
        this.cellphone.setColor("Grey");
    }

    public void buildScreenSize(){
        this.cellphone.setScreenSize(5.0);
    }

    public void buildPrize(){
        this.cellphone.setPrice(800.00);
    }

    public Cellphone getCellphone(){
        return this.cellphone;
    }
}
