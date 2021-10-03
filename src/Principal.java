import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        List<EnumPlanetas> planets = Arrays.asList(EnumPlanetas.values());
        planets.stream().forEach(enumPlanetas -> System.out.println(enumPlanetas));

        Scanner entrada = new Scanner(System.in);
        String planeta;
        System.err.println("Para onde vamos viajar ?");
        try {
            planeta = entrada.next().toUpperCase(Locale.ROOT);
            TestandoAsEnums testandoAsEnums = new TestandoAsEnums(planeta);
            System.out.println(testandoAsEnums.navegandoPelaGalaxia());
        }catch (IllegalArgumentException e){
            System.err.println("destino da viagem nao encontrado");
        }
        entrada.close();




    }
}