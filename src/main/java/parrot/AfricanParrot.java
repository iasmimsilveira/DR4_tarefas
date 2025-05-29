package parrot;

public class AfricanParrot extends Parrot {

    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        double baseSpeed = 12.0;
        double loadFactor = 9.0;
        double speed = baseSpeed - (loadFactor * numberOfCoconuts);
        return Math.max(0.0, speed);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}
