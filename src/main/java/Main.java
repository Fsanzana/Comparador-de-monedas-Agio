import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        jsoutTesting2 Comp = new jsoutTesting2();

        Scanner tec = new Scanner(System.in);

        int eleccion = tec.nextInt();

        menu(eleccion, Comp);


    }

    private static void menu(int eleccion, jsoutTesting2 comp) {
        switch (eleccion){
            case 1: String pais0 = "chile";
                    String pais1 = "argentina";
                    porcentaje(comp.jsoutTesting2(pais0), comp.jsoutTesting2(pais1));

                    break;
<<<<<<< Updated upstream
            case 2:
                pais0 = "argentina";
                break;
            default:
                break;
        }
        System.out.println("1- Chile"+'\n'+"2- Argentina");
        System.out.println("Ingrese país a comparar:");
        eleccion = tec.nextInt();
        switch (eleccion){
            case 1:
                pais1 = "chile";
                break;
            case 2:
                pais1 = "argentina";
                break;
            default:
                break;
=======

>>>>>>> Stashed changes

        }
    }

    private static void porcentaje(List<Double> jsoutTesting2, List<Double> jsoutTesting21) {
        double divisor = jsoutTesting2.size();

        double porcentaje=0;
        for (int i = 0; i < jsoutTesting2.size(); i++) {
            porcentaje += (jsoutTesting21.get(i)*100)/jsoutTesting2.get(i);

        }
        porcentaje = porcentaje/divisor;
        System.out.println(porcentaje);


    }


}
