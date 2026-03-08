public class Main {
    public static void main(String[] args) {

        // Create object
        F1Car redbull = new F1Car("Red Bull", "RB20", "Blue");
        F1Car ferrari = new F1Car("Ferrari", "SF-24", "Red");
        F1Car mclaren = new F1Car("McLaren", "MCL38", "Orange");

        ElectricF1Car williams = new ElectricF1Car("Williams", "FW46", "Blue");

        System.out.println(redbull);
        System.out.println(ferrari);
        System.out.println(mclaren);
        System.out.println(williams);

        redbull.accelerate(50);
        williams.accelerate(70);
    }
}