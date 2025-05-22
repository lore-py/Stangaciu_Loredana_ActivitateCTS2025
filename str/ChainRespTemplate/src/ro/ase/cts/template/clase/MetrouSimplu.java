package ro.ase.cts.template.clase;

public class MetrouSimplu extends TemplateMetrou{
    private int nrMetrou;

    public MetrouSimplu(int nrMetrou) {
        this.nrMetrou = nrMetrou;
    }

    @Override
    public void opresteStatie1() {
        System.out.println("Metroul "+ nrMetrou + " a oprit in statiqa cu nr 1");
    }

    @Override
    public void opresteStatie2() {
        System.out.println("Metroul "+ nrMetrou + " a oprit in statiqa cu nr 2");

    }

    @Override
    public void opresteStatie3() {
        System.out.println("Metroul "+ nrMetrou + " a oprit in statiqa cu nr 3");
    }
}
