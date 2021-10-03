public class TestandoAsEnums {

    EnumPlanetas enumPlanetas;

    public TestandoAsEnums(String planetas) {
        this.enumPlanetas = EnumPlanetas.valueOf(planetas);
    }

    public String navegandoPelaGalaxia(){
        switch (enumPlanetas){
            case MARTE:
                return ("Leve um casaco pois pode esfriar 😃");
            case TERRA:
                return ("Muita vida por aqui");
        }
        return "vazio";
    }

}
