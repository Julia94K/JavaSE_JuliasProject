package Labs.DrinksCalssification;

public class Drink {
    private String type;
    private int price = 5;
    private String shop = "Simple Wine";
    private String shop2 = "Prisma";

    public static void main(String[] args) {
        System.out.println("ИНФОРМАЦИЯ О СОКАХ");
        Juice.JuiceInfo();
        System.out.println("ИНФОРМАЦИЯ О ВИНАХ");
        Wine.WineInfo();
        System.out.println("ИНФОРМАЦИЯ О ВОДЕ");
        Water.infoWater();

    }

    public void getPrice(){
        System.out.println("Цена: "+price);

    }

    public void setShop(){
        System.out.println("Товар доступен в магазине "+shop);
    }

    public void setShop2(){
        System.out.println("Товар доступен в магазине "+shop2);
    }
}
