
//Proyecto 2 Manuel Arenas y Miguel Angel Montoya
import java.util.Scanner;

public class Principal {
    public static String getVehiculosVerdes() {

        String texto = "Estos son los vehiculos con color verde: " + "\n";
        int vehiverdes = 1;
        for (int num = 0; num < Vehiculo.vehiculos.size(); num++) {
            if (Vehiculo.vehiculos.get(num).getColor().equalsIgnoreCase("verde")) {
                texto = texto + vehiverdes + Vehiculo.vehiculos.get(num).toString() + "\n";
                vehiverdes++;
            }
        }
        return texto;
    }

    public static void main(String[] args) {
        mostrarmenu();
    }

    public static void mostrarmenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Bienvenido al programa," + "\n"
                        + "a continuacion digita un numero del 1 al 10 ó el 666 para ejecutar el programa: ");
        int num = sc.nextInt();
        boolean continuacion = true;

        if (num == 0) {
            System.out.println("no has ejecutado el programa, vuelve pronto");
            continuacion = false;
        }
        while (continuacion) {
            if (num == 0) {
                System.out.println("Haz cerrado el programa, gracias por usarnos");
                continuacion = false;
                break;
            } else if (num == 1) {

                System.out.println("por favor ingrese el modelo: ");
                int modelo = sc.nextInt();
                System.out.println("por favor ingrese la marca: ");
                String marca = sc.next();
                System.out.println("por favor ingrese el valor comercial: ");
                double valor = sc.nextDouble();
                System.out.println("ingrese el color");
                String color = sc.next();
                Vehiculo vehiculo = new Vehiculo(modelo, marca, valor, color);
                Vehiculo.IdActual++;
            } else if (num == 2) {
                System.out.println(Vehiculo.toStringVehiculos());
            } else if (num == 3) {
                System.out.println(
                        "Cantidad de vehiculos registrados hasta el momento: " + "\n" + Vehiculo.cantidadVehiculos());
            } else if (num == 4) {
                System.out.println(Principal.getVehiculosVerdes());
            } else if (num == 5) {
                System.out.println("ingrese un id.");
                int id = sc.nextInt();
                if (id <= Vehiculo.vehiculos.size()) {
                    System.out.println(Vehiculo.vehiculos.get(id - 1).toString());
                } else {
                    System.out.println("No existe este vehiculo con este id.");
                }
            } else if (num == 6) {
                System.out.println("ingrese el id de un vehiculo existente");
                int id = sc.nextInt();
                System.out.println();
            }
            System.out.println("Ingrese otro numero");
            num = sc.nextInt();
        }

    }
}
