package ro.ase.cts.chain.main;

import ro.ase.cts.chain.clase.*;

public class Main {
    public static void main(String[] args) {
        Handler hTroleibuz = new HandlerTroleibuz();

        Handler hAutobuz = new HandlerAutobuz();
        hTroleibuz.setNext(hAutobuz);
        Handler hTramvai = new HandlerTramvai();
        hAutobuz.setNext(hTramvai);
        Handler hMetrou = new HandlerMetrou();
        hTramvai.setNext(hMetrou);

        hTroleibuz.recomanda(2);
        hTroleibuz.recomanda(10);
        hTroleibuz.recomanda(14);
        hTroleibuz.recomanda(4);

    }
}