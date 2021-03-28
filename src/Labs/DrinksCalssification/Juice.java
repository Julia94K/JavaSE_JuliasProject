package Labs.DrinksCalssification;

public class Juice extends Drink {
    public static void JuiceInfo() {
        Juice one = new Juice("яблоко",true,"J7",100);
        Juice two = new Juice ("grapefruit",false,"Rich",150);
        one.getInfoJuice();
        two.getInfoJuice();

    }

    public String getBrand(){
        return brand;
    }

    public String getFlavor() {
        return flavor;
    }


    String flavor;
    boolean isAvailable;
    String brand;
    int price;

    public Juice(String flavor,boolean isAvailable, String brand,int price){
    this.flavor = flavor;
    this.isAvailable = isAvailable;
    this.brand = brand;
    this.price = price;

    }

    public void getInfoJuice() {
        System.out.println("Харктеристики напитка "+getBrand()+":");
        System.out.println("вкус: "+ getFlavor());
        getPrice();
        setShop2();
    }

}