package ro.ase.cts.facade.clase;

public class ReceptionistFacade {
    public String poateLuaLocLaMasa(Masa masa1){
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();

        if(masa1.isEsteLibera()){
            if(picolo.esteDebarasata(masa1)){
                if(ospatar.esteAranjataMasa(masa1)){
                    return ("Luati loc la masa cu numarul " + masa1.getNumarMasa());
                }
                else {
                    return "Asteptati sa aranjam masa";
                }

            }
            else{
                return "Asteptati sa debarasam masa";
            }
        }
        else{
            return ("Momentan nu avem locuri libere la masa "+masa1.getNumarMasa());
        }
    }
}
