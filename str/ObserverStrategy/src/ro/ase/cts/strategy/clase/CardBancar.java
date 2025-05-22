package ro.ase.cts.strategy.clase;

public class CardBancar implements IMetodaPlata{
    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if(sold>=pretBilet){
            sold-=pretBilet;
            System.out.println("A fost efectuata plata cu card bancar");
        }
        else{
            System.out.println("Fonduri insuficiente card bancar");
        }
    }
}
