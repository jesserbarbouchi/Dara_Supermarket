package TV;

public class SamsungTv implements IBuilderTv{

    private TV tv;

    public SamsungTv(){
        this.tv = new TV();
    }

    public void buildBrand(){
        this.tv.setBrand("Samsung");
    }

   public void buildScreenSize(){
        this.tv.setScreenSize(60);
    }

    public void buildPrize(){
        this.tv.setPrice(1200.00);
    }

    public TV getTv(){
        return this.tv;
    }

}

