package _16_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle();

        waterBottle.fill(500);
        waterBottle.drink(300);
        waterBottle.fill(500);
        waterBottle.drink(500);
        waterBottle.fill(500);
        waterBottle.drink(0);

    }



}
