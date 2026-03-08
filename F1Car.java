class F1Car {

    // Encapsulation
    private String team;
    private String model;
    private String color;

    // Constructor
    public F1Car(String team, String model, String color) {
        this.team = team;
        this.model = model;
        this.color = color;
    }

    // Abstraction
    public void accelerate(int speedIncrease) {
        System.out.println(team + " accelerates +" + speedIncrease + " km/h");
    }

    // Getter
    public String getTeam() { return team; }
    public String getModel() { return model; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return "Team: " + team + ", Model: " + model + ", Color: " + color;
    }
}