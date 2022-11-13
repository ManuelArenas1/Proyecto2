package visualStudio;

public class BichoAlien extends Bichos {
    public BichoAlien() {
        super.salud = 20;
    }

    @Override
    public String toString() {
        return "BA-" + super.getSalud();
    }
}
