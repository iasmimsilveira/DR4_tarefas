package parrot;

public class Parrot {

    private final ParrotTypeEnum type;
    private final ParrotAttributes attributes;

    public Parrot(ParrotTypeEnum type, ParrotAttributes attributes) {
        this.type = type;
        this.attributes = attributes;
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
        double load = getLoadFactor() * attributes.numberOfCoconuts;
        return baseSpeed - load;
    }

    private double getSpeedForNorwegianBlue() {
        if (attributes.isNailed) {
            return 0;
        }
        double baseSpeed = getBaseSpeed();
        double calculatedSpeed = attributes.voltage * baseSpeed;
        double maxSpeed = 24.0;
        return Math.min(maxSpeed, calculatedSpeed);
    }

    private double getBaseSpeed() {
        return 12.0;
    }

    private double getLoadFactor() {
        return 9.0;
    }

    public String getCry() {
        return switch (type) {
            case EUROPEAN -> "Sqoork!";
            case AFRICAN -> "Sqaark!";
            case NORWEGIAN_BLUE -> attributes.voltage > 0 ? "Bzzzzzz" : "...";
        };
    }
}
