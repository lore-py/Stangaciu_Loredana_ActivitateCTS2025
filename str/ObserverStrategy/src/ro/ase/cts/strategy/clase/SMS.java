package ro.ase.cts.strategy.clase;

public class SMS implements IMetodaPlata {
    public SMS() {
    }

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Ati platit prin SMS");
    }
}
