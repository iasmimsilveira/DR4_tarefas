package parrot;

public class EuropeanParrot extends Parrot {
    @Override
    public double getSpeed() {
        return 12.0;
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }
}
