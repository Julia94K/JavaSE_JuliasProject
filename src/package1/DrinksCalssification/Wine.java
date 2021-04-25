package package1.DrinksCalssification;

public class Wine extends Drink{
    private String type;
//    private int year;
//    private String country;

    public static void WineInfo() {
        Wine Red = new Wine("Красные вина");
        Wine White = new Wine("Белые вина");
        Red.getInfo();
        White.getInfo();
    }

    private Wine(String type){
        this.type = type;
    }
    public void getInfo() {
        System.out.println("Группа вин: " +getType());
        getPrice();
        setShop();
    }

    public String getType() {
        return type;
    }
}
