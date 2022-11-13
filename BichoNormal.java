package visualStudio;

public class BichoNormal extends Bichos {
    public BichoNormal() {
        super.salud = 10;
    }

    @Override
    public String toString() {
        return "BN-" + super.getSalud();
    }
}
