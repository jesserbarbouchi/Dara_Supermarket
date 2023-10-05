package CellPhone;

public class Samsung implements IBuilderPhone {
    private Cellphone cellphone;

    public Samsung(){
        this.cellphone = new Cellphone();
    }

    public void buildBrand(){
        this.cellphone.setBrand("Samsung");
    }

    public void buildColor(){
        this.cellphone.setColor("Black");
    }

    public void buildScreenSize(){
        this.cellphone.setScreenSize(4.0);
    }

    public void buildPrize(){
        this.cellphone.setPrice(1100.00);
    }

    public Cellphone getCellphone(){
        return this.cellphone;
    }
}