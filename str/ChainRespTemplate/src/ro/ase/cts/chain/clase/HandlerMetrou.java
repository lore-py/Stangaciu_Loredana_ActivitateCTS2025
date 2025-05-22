package ro.ase.cts.chain.clase;

public class HandlerMetrou extends Handler{
    @Override
    public void recomanda(int distanta) {
        if(distanta>=10){
            System.out.println("Va recomand metroul");
        }
        else{
            System.out.println("Nu avem recomandare");
        }
    }
}
