package Exercise4;

public enum Vehicles {
    BMW(30000,"Black"),
    AUDI(35000,"White"),
    HONDA(25000,"Red");

    int price;    String color;

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return "Марка: "+ super.toString()+ ", Колір: "+getColor()+", ціна: "+price;
    }

    Vehicles(int parPrice, String parColor){
        this.price=parPrice;
        this.color=parColor;
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println(Vehicles.HONDA);
        System.out.println(Vehicles.BMW);
        System.out.println(Vehicles.AUDI);
    }
}