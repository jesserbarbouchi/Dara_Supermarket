package CellPhone;

public class Assembler {
    public IBuilderPhone iBuilderPhone;

    public Cellphone cellphone;

    public Assembler(IBuilderPhone iBuilderPhone){
        this.iBuilderPhone = iBuilderPhone;
    }

    public void createCellphone(){
        iBuilderPhone.buildBrand();
        iBuilderPhone.buildColor();
        iBuilderPhone.buildScreenSize();
        iBuilderPhone.buildPrize();
        cellphone = iBuilderPhone.getCellphone();
    }

    public Cellphone getCellphone(){
        return  cellphone;
    }


}
