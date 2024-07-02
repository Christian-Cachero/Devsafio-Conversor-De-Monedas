import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ObtenerConversion OC = new ObtenerConversion();

        Scanner s = new Scanner(System.in);

        Resultado conversion;

        int opcion = 0, valor;

        String menu = """
                
                
                
                😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎
                
                Bienvenido/a al conversor de moneda 😉
                
                1) Dólar a Peso argentino
                2) Peso argentino a Dólar
                3) Dólar a Peso chileno
                4) Peso chileno a Dólar
                5) Dólar a Real brasileño
                6) Real brasileño a Dólar
                7) Salir
                
                Elegí una opción válida:
                😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎
                """;

        while(opcion != 7){
            System.out.println(menu);
         opcion = s.nextInt();

         switch (opcion){
             case 1:
                 System.out.println("Ingrese el valor a convertir: ");
                 valor = s.nextInt();
                 conversion = OC.datosMoneda("USD", "ARS", valor);
                 System.out.println("El valor "+valor+" [USD] corresponde al valor de "
                         +conversion.conversion_result()+" [ARS]");
                 break;
             case 2:
                 System.out.println("Ingrese el valor a convertir: ");
                 valor = s.nextInt();
                 conversion = OC.datosMoneda("ARS", "USD", valor);
                 System.out.println("El valor "+valor+" [ARS] corresponde al valor de "
                         +conversion.conversion_result()+" [USD]");
                 break;
             case 3:
                 System.out.println("Ingrese el valor a convertir: ");
                 valor = s.nextInt();
                 conversion = OC.datosMoneda("USD", "CLP", valor);
                 System.out.println("El valor "+valor+" [USD] corresponde al valor de "
                         +conversion.conversion_result()+" [CLP]");
                 break;
             case 4:
                 System.out.println("Ingrese el valor a convertir: ");
                 valor = s.nextInt();
                 conversion = OC.datosMoneda("CLP", "USD", valor);
                 System.out.println("El valor "+valor+" [CLP] corresponde al valor de "
                         +conversion.conversion_result()+" [USD]");
                 break;
             case 5:
                 System.out.println("Ingrese el valor a convertir: ");
                 valor = s.nextInt();
                 conversion = OC.datosMoneda("USD", "BRL", valor);
                 System.out.println("El valor "+valor+" [USD] corresponde al valor de "
                         +conversion.conversion_result()+" [BRL]");
                 break;
             case 6:
                 System.out.println("Ingrese el valor a convertir: ");
                 valor = s.nextInt();
                 conversion = OC.datosMoneda("BRL", "USD", valor);
                 System.out.println("El valor "+valor+" [BRL] corresponde al valor de "
                         +conversion.conversion_result()+" [USD]");
                 break;
         }
     }
    }
}