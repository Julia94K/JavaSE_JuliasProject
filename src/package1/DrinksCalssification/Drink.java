package package1.DrinksCalssification;

public class Drink {
    private String type;

    public static void main(String[] args) {
        System.out.println("ИНФОРМАЦИЯ О СОКАХ");
        Juice.JuiceInfo();
        System.out.println("ИНФОРМАЦИЯ О ВИНАХ");
        Wine.WineInfo();
        System.out.println("ИНФОРМАЦИЯ О ВОДЕ");
        Water.infoWater();

    }

    public void getPrice(){
        int price = 5;
        System.out.println("Цена: "+ price);

    }

    public void setShop(){
        String shop = "Simple Wine";
        System.out.println("Товар доступен в магазине "+ shop);
    }

    public void setShop2(){
        String shop2 = "Prisma";
        System.out.println("Товар доступен в магазине "+ shop2);
    }
}
