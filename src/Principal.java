import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // listar os valores possíveis para a enumeração:
//        for (EnumPlanetas p : EnumPlanetas.values()) {
//            System.out.printf("%s%n", p);
//        }

        Scanner entrada = new Scanner(System.in);
        String planeta;
        System.out.println("Para onde vamos viajar ?");
        planeta = entrada.next().toUpperCase(Locale.ROOT);
        entrada.close();

        TestandoAsEnums testandoAsEnums = new TestandoAsEnums(planeta);
        testandoAsEnums.navegandoPelaGalaxia();


    }
}