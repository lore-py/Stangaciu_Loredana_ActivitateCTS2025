package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class ReceptieFactory {
    private Map<String, PacientAbstract> pacienti;

    public ReceptieFactory() {
        this.pacienti = new HashMap<>();
    }

    public PacientAbstract getPacient(String nume, String adresa, String numarTelefon){
        if(!pacienti.containsKey(nume)){
            return pacienti.put(nume, new Pacient(nume, numarTelefon, adresa));
        }
        return pacienti.get(nume);
    }

    public PacientAbstract getPacient(String nume) throws Exception{
        if(pacienti.containsKey(nume)){
            return pacienti.get(nume);
        }
        throw new Exception("Nu avem acest pacient");
    }


}
