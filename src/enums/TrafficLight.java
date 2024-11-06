package enums;

public enum TrafficLight {
    RED("stop"), YELLOW("caution"), GREEN("go");

    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}
