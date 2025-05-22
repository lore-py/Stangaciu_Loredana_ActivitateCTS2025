package ro.ase.cts.decorator.clase;

public class NotaDePlata implements Nota {
    private float totalPlata;

    public NotaDePlata(float totalPlata) {
        this.totalPlata = totalPlata;
    }

    @Override
    public void printare(){
        System.out.println("Aveti de platit " + totalPlata+ " de lei");
    }
}
