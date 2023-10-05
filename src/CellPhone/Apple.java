package CellPhone;

public class Apple implements IBuilderPhone {

        private Cellphone cellphone;

        public Apple(){
            this.cellphone = new Cellphone();
        }

        public void buildBrand(){
            this.cellphone.setBrand("Apple");
        }

        public void buildColor(){
            this.cellphone.setColor("White");
        }

        public void buildScreenSize(){
            this.cellphone.setScreenSize(4.5);
        }

        public void buildPrize(){
            this.cellphone.setPrice(1200.00);
        }

        public Cellphone getCellphone(){
            return this.cellphone;
        }

    }


