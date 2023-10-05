package TV;

public class TclTv implements IBuilderTv{

    private TV tv;

    public TclTv(){
        this.tv = new TV();
    }

    public void buildBrand(){
        this.tv.setBrand("TCL");
    }

    public void buildScreenSize(){
        this.tv.setScreenSize(42);
    }

    public void buildPrize(){
        this.tv.setPrice(500.00);
    }

    public TV getTv(){
        return this.tv;
    }

}