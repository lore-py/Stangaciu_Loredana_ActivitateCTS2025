package ro.ase.cts.chain.clase;

public class HandlerAutobuz extends Handler{
    @Override
    public void recomanda(int distanta) {
        if(distanta>=3&&distanta<5){
            System.out.println("Va recomand autobuzul");
        }
        else{
            next.recomanda(distanta);
        }
    }
}
