import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ObtenerConversion OC = new ObtenerConversion();

        Scanner s = new Scanner(System.in);

        Resultado conversion = OC.datosMoneda("USD", "ARS", 25);

        System.out.println(conversion.conversion_result());

    }
}