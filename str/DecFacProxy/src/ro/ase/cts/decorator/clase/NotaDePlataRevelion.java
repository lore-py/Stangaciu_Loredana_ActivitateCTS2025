package ro.ase.cts.decorator.clase;

public class NotaDePlataRevelion extends DecoratorPrinter{
    public NotaDePlataRevelion(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi ani!");
    }
}
