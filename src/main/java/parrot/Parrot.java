package parrot;

public class Parrot {

    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        return switch (type) {
            case EUROPEAN -> getSpeedForEuropean();
            case AFRICAN -> getSpeedForAfrican();
            case NORWEGIAN_BLUE -> getSpeedForNorwegianBlue();
        };
    }

    private double getSpeedForEuropean() {
        return getBaseSpeed();
    }

    private double getSpeedForAfrican() {
        double baseSpeed = getBaseSpeed();
        double load = getLoadFactor() * numberOfCoconuts;
        return baseSpeed - load;
    }


    private double getSpeedForNorwegianBlue() {
        if (isNailed) {
            return 0;
        }
        double baseSpeed = getBaseSpeed();
        double calculatedSpeed = voltage * baseSpeed;
        double maxSpeed = 24.0;
        return Math.min(maxSpeed, calculatedSpeed);
    }


    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }

    public String getCry() {
        return switch (type) {
            case EUROPEAN -> "Sqoork!";
            case AFRICAN -> "Sqaark!";
            case NORWEGIAN_BLUE -> voltage > 0 ? "Bzzzzzz" : "...";
        };
    }
}
