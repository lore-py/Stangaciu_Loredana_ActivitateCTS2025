package pb4;

import pb4.models.ARezervare;
import pb4.models.Rezervare;

public class Main {
    public static void main(String[] args){
        ARezervare r1 = new Rezervare("Andrei", 13, 2, 13, true);
        ARezervare r2 = r1.clonare(20);
        System.out.println(r2.toString());
    }
}
