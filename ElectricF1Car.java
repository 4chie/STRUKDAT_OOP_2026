class ElectricF1Car extends F1Car {

    public ElectricF1Car(String team, String model, String color) {
        super(team, model, color);
    }

    @Override
    public void accelerate(int speedIncrease) {
        System.out.println("Electric F1 car boosts +" + speedIncrease + " km/h!");
    }
}
