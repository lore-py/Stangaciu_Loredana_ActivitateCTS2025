package ro.ase.cts.template.clase;

public abstract class TemplateMetrou {
    public final void circulaTur(){
        opresteStatie1();
        opresteStatie2();
        opresteStatie3();
    }

    public final void circulaRetur() {
        opresteStatie3();
        opresteStatie2();
        opresteStatie1();
    }

    public abstract void opresteStatie1();
    public abstract void opresteStatie2();
    public abstract void opresteStatie3();
}
