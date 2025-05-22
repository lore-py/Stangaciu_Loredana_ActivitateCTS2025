package ro.ase.cts.decorator.clase;

public class NotaDePlataCraciun extends DecoratorPrinter {

    public NotaDePlataCraciun(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun fericit!");
    }
}
