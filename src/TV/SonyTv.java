package TV;

public class SonyTv implements IBuilderTv{

    private TV tv;

    public SonyTv(){
        this.tv = new TV();
    }

    public void buildBrand(){
        this.tv.setBrand("Sony");
    }

    public void buildScreenSize(){
        this.tv.setScreenSize(70);
    }

    public void buildPrize(){
        this.tv.setPrice(2500.00);
    }

    public TV getTv(){
        return this.tv;
    }

}