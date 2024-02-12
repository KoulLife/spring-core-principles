package tomist.core.singletone;

public class Coffee {
    private String name;
    private int price;

    public void register(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
