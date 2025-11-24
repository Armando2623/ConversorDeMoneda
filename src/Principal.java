import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        var  api = new ConvertirPrincipal();
        var moneda = api.buscarmoneda();
        Scanner sc = new Scanner(System.in);

        int opcion;
        double coin;
        do {
            Principal.menu();
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese el monto a convertir: ");
                coin = sc.nextDouble();
            } else {
                coin = 0;
            }
            switch (opcion) {

                case 1:
                    System.out.println(coin + " dolares equivalen a: "
                            + coin * moneda.getTasa().get("ARS") +" Pesos argentinos");
                    System.out.println("ars " +moneda.getTasa().get("ARS"));

                break;

                case 2:

                    System.out.println(coin + " Pesos argentinos equivalen a: "
                            + coin / moneda.getTasa().get("ARS") +" Dolares");
                    break;
                case 3:
                    System.out.println(coin + " Dolares equivalen a: "
                            + coin * moneda.getTasa().get("BRL") +" Reales brasileños");

                break;
                case 4:
                    System.out.println(coin + " Reales brasileños equivalen a: "
                            + coin / moneda.getTasa().get("BRL") +" Dolares");
                break;
                case 5:
                    System.out.println(coin + " Dolares equivales a: "
                            + coin * moneda.getTasa().get("COP") +" Pesos colombianos");
                break;
                case 6:
                    System.out.println(coin + " Pesos colombianos equivalen a: "
                            + coin / moneda.getTasa().get("BRL") +" Dolares");
                break;
                case 7: System.out.println("Saliendo...");
                break;
                default: System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 7);

    }
    public static void menu(){
        System.out.println("""
            ******************************************************
                 Bienvenido/a al Conversor de Moneda =]

                 1) Dólar           => Peso argentino
                 2) Peso argentino  => Dólar
                 3) Dólar           => Real brasileño
                 4) Real brasileño  => Dólar
                 5) Dólar           => Peso colombiano
                 6) Peso colombiano => Dólar
                 7) Salir

                 Elija una opción válida:
            ******************************************************
            """);
    }
}
