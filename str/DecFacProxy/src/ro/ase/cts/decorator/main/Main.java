package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.Nota;
import ro.ase.cts.decorator.clase.NotaDePlata;
import ro.ase.cts.decorator.clase.NotaDePlataCraciun;
import ro.ase.cts.decorator.clase.NotaDePlataRevelion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Nota nota1 = new NotaDePlata(107.5f);
        nota1.printare();

        Nota notaDeCraciun = new NotaDePlataCraciun(nota1);
        notaDeCraciun.printare();

        Nota notaDeRevelion = new NotaDePlataRevelion(nota1);
        notaDeRevelion.printare();
    }
}