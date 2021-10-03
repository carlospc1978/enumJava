public class TestandoAsEnums {

    EnumPlanetas enumPlanetas;

    public TestandoAsEnums(String planetas) {
        this.enumPlanetas = EnumPlanetas.valueOf(planetas);
    }

    public void navegandoPelaGalaxia(){
        switch (enumPlanetas){
            case MARTE:
                System.out.println("Leve um casaco pois pode esfriar 😃");
            case TERRA:
                System.out.println("Muita vida por aqui");
        }
    }

}
