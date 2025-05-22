package ro.ase.cts.chain.clase;

public class HandlerTramvai extends Handler{
    @Override
    public void recomanda(int distanta) {
        if(distanta>=5 && distanta <10){
            System.out.println("Va recomand tramvaiul");
        }
        else{
            next.recomanda(distanta);
        }
    }
}
