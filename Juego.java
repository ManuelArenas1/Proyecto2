package visualStudio;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    public static Bichos tablero[][] = new Bichos[2][2];

    public static void empezarJuego() {
        ArrayList<Bichos> juego = new ArrayList<>();

        int numero = (int) (Math.random() * 4 + 1);

        for (int i = 0; i < numero; i++) {
            int numero2 = (int) (Math.random() * (2 - 1 + 1) + 1);
            if (numero2 == 1) {
                BichoNormal BN = new BichoNormal();
                juego.add(BN);
            } else if (numero2 == 2) {
                BichoAlien BA = new BichoAlien();
                juego.add(BA);
            }
        }

        if (numero == 1) {
            tablero[0][0] = juego.get(0);
            tablero[0][1] = null;
            tablero[1][0] = null;
            tablero[1][1] = null;
            System.out.print("-------------\n|" + tablero[0][0].toString()
                    + "|     |\n-------------\n|     |     |\n-------------");
        }
        if (numero == 2) {
            tablero[0][0] = juego.get(0);
            tablero[0][1] = juego.get(1);
            tablero[1][0] = null;
            tablero[1][1] = null;
            System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                    + "|\n-------------\n|     |     |\n-------------");
        }
        if (numero == 3) {
            tablero[0][0] = juego.get(0);
            tablero[0][1] = juego.get(1);
            tablero[1][0] = juego.get(2);
            tablero[1][1] = null;
            System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                    + "|\n-------------\n|" + tablero[1][0].toString() + "|     |\n-------------");
        }
        if (numero == 4) {
            tablero[0][0] = juego.get(0);
            tablero[0][1] = juego.get(1);
            tablero[1][0] = juego.get(2);
            tablero[1][1] = juego.get(3);
            System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                    + "|\n-------------\n|" + tablero[1][0].toString() + "|" + tablero[1][1].toString()
                    + "|\n-------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 1 para iniciar el juego\nIngrese 2 para cerrar el juego");
        System.out.print("Ingrese su opcion: ");
        int op = sc.nextInt();
        if (op == 1) {
            Juego.empezarJuego();
            while (true) {
                System.out.println(
                        "\nIngrese 1 para Disparar una bala\nIngrese 2 para Activar bomba atomica\nIngrese 3 para Activar Bicho mutante\nIngrese 4 para La frase de la abuela\nIngrese 5 para cerrar el juego");
                System.out.print("Ingrese su opcion: ");
                int in = sc.nextInt();
                if (in == 1) {
                    System.out.print("Ingrese la posicion en la que quiere Disparar: ");
                    int p = sc.nextInt();
                    Bichos.dispararBala(p);
                    if (Bichos.finJuego() == 1) {
                        break;
                    }
                } else if (in == 2) {
                    Bichos.bombaAtomica();
                    if (Bichos.finJuego() == 1) {
                        break;
                    }
                } else if (in == 3) {
                    Bichos.BichoMutante();
                    if (Bichos.finJuego() == 1) {
                        break;
                    }
                } else if (in == 4) {
                    Bichos.fraseAbuela();
                    if (Bichos.finJuego() == 1) {
                        break;
                    }
                }

                else if (in == 5) {
                    break;
                }
            }
        }
        if (op == 2) {
            System.out.println("Gracias por cerrar el juego");
            System.exit(op);
        }
    }
}
