package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    private List<Observator> colectieObservatori = new ArrayList<>();

    public void abonareObservator(Observator o){
        colectieObservatori.add(o);
    }

    public void dezabonareObservator(Observator o){
        colectieObservatori.remove(o);
    }

    public void notificareObservator(String mesaj){
        colectieObservatori.forEach(o -> o.notificare(mesaj));
    }
}
