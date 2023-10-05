package TV;

public class AssemblerTv {
    private IBuilderTv iBuilderTv;

    private TV tv;

    public AssemblerTv(IBuilderTv iBuilderTv ){
        this.iBuilderTv = iBuilderTv;
    }

    public void createTv(){
        iBuilderTv.buildBrand();
        iBuilderTv.buildScreenSize();
        iBuilderTv.buildPrize();
        tv = iBuilderTv.getTv();
    }

    public TV getTv(){
        return tv;
    }


}