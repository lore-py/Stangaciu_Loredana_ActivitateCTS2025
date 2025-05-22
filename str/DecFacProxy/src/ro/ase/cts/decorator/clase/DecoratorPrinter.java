package ro.ase.cts.decorator.clase;

public abstract class DecoratorPrinter implements Nota{
    protected Nota nota;

    public DecoratorPrinter(Nota nota) {
        this.nota = nota;
    }

    public void printare(){
        nota.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
