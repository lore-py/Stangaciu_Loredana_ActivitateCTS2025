package ro.ase.cts.template.main;

import ro.ase.cts.template.clase.MetrouSimplu;
import ro.ase.cts.template.clase.MetrouSpecial;
import ro.ase.cts.template.clase.TemplateMetrou;

public class Main {
    public static void main(String[] args) {
        TemplateMetrou metrouSimplu = new MetrouSimplu(6);
        metrouSimplu.circulaTur();

        TemplateMetrou metrouSpecial = new MetrouSpecial();
        metrouSpecial.circulaTur();
        metrouSpecial.circulaRetur();
    }
}