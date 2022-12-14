package visualStudio;

import java.util.ArrayList;

public class Bichos extends Juego {
    public int salud;
    public static int bala = 5;
    public static int nd = 0;

    public void setSalud(int s) {
        this.salud = s;
    }

    public int getSalud() {
        return this.salud;
    }

    public static void dispararBala(int a) {
        if (a == 1) {
            nd++;
            if (tablero[0][0] == null) {
                System.out.println("\nLa posicion 1 (0.0) esta vacia, disparo fallido");
            }
            if (tablero[0][0] != null) {
                int t = tablero[0][0].getSalud() - bala;
                tablero[0][0].setSalud(t);
                if (tablero[0][0].getSalud() > 0) {
                    System.out.println("\nEl bicho atacado en la posicion 1 (0.0) esta a " + tablero[0][0].getSalud()
                            + " de salud");
                } else if (tablero[0][0].getSalud() <= 0) {
                    System.out.println("\nEl bicho atacado en la posicion 1 (0.0) ha muerto");
                }
            }
            if (tablero[0][0] == null && tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|     |     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString()
                        + "|     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|     |\n-------------");
            } else {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|" + tablero[1][1].toString()
                        + "|\n-------------");
            }
        } else if (a == 2) {
            nd++;
            if (tablero[0][1] == null) {
                System.out.println("\nLa posicion 2 (0.1) esta vacia, disparo fallido");
            }
            if (tablero[0][1] != null) {
                int t = tablero[0][1].getSalud() - bala;
                tablero[0][1].setSalud(t);
                if (tablero[0][1].getSalud() > 0) {
                    System.out.println("\nEl bicho atacado en la posicion 2 (0.1) esta a " + tablero[0][1].getSalud()
                            + " de salud");
                } else if (tablero[0][1].getSalud() <= 0) {
                    System.out.println("\nEl bicho atacado en la posicion 2 (0.1) ha muerto");
                }
            }
            if (tablero[0][0] == null && tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|     |     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString()
                        + "|     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|     |\n-------------");
            } else {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|" + tablero[1][1].toString()
                        + "|\n-------------");
            }
        } else if (a == 3) {
            nd++;
            if (tablero[1][0] == null) {
                System.out.println("\nLa posicion 3 (1.0) esta vacia, disparo fallido");
            }
            if (tablero[1][0] != null) {
                int t = tablero[1][0].getSalud() - bala;
                tablero[1][0].setSalud(t);
                if (tablero[1][0].getSalud() > 0) {
                    System.out.println("\nEl bicho atacado en la posicion 3 (1.0) esta a " + tablero[1][0].getSalud()
                            + " de salud");
                } else if (tablero[1][0].getSalud() <= 0) {
                    System.out.println("\nEl bicho atacado en la posicion 3 (1.0) ha muerto");
                }
            }
            if (tablero[0][0] == null && tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|     |     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString()
                        + "|     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|     |\n-------------");
            } else {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|" + tablero[1][1].toString()
                        + "|\n-------------");
            }
        } else if (a == 4) {
            nd++;
            if (tablero[1][1] == null) {
                System.out.println("\nLa posicion 4 (1.1) esta vacia, disparo fallido");
            }
            if (tablero[1][1] != null) {
                int t = tablero[1][1].getSalud() - bala;
                tablero[1][1].setSalud(t);
                if (tablero[1][1].getSalud() > 0) {
                    System.out.println("\nEl bicho atacado en la posicion 4 (1.1) esta a " + tablero[1][1].getSalud()
                            + " de salud");
                } else if (tablero[1][1].getSalud() <= 0) {
                    System.out.println("\nEl bicho atacado en la posicion 4 (1.1) ha muerto");
                }
            }
            if (tablero[0][0] == null && tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|     |     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString()
                        + "|     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|     |\n-------------");
            } else {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|" + tablero[1][1].toString()
                        + "|\n-------------");
            }
        } else if (a < 1 || a > 4) {
            System.out.println("\nNo existe esa posicion, porfavor ingrese una posicion del 1 al 4");
        }
    }

    public String toString() {
        return "T-" + getSalud();
    }

    public static void bombaAtomica() {
        int numero = (int) (Math.random() * 4 + 1);
        if (numero == 1) {
            if (tablero[0][0] == null) {
                System.out.println("\nLa posicion esta vacia, bomba atomica fallo");
            }
            if (tablero[0][0] != null) {
                int t = tablero[0][0].getSalud() - tablero[0][0].getSalud();
                tablero[0][0].setSalud(t);
                System.out.println("\nEl bicho en la posicion 1 (0.0) ha muerto");
            }
            if (tablero[0][0] == null && tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|     |     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString()
                        + "|     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|     |\n-------------");
            } else {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|" + tablero[1][1].toString()
                        + "|\n-------------");
            }
        }
        if (numero == 2) {
            if (tablero[0][1] == null) {
                System.out.println("\nLa posicion esta vacia, bomba atomica fallo");
            }
            if (tablero[0][1] != null) {
                int t = tablero[0][1].getSalud() - tablero[0][1].getSalud();
                tablero[0][1].setSalud(t);
                System.out.println("\nEl bicho en la posicion 2 (0.1) ha muerto");
            }
            if (tablero[0][0] == null && tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|     |     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString()
                        + "|     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|     |\n-------------");
            } else {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|" + tablero[1][1].toString()
                        + "|\n-------------");
            }
        }
        if (numero == 3) {
            if (tablero[1][0] == null) {
                System.out.println("\nLa posicion esta vacia, bomba atomica fallo");
            }
            if (tablero[1][0] != null) {
                int t = tablero[1][0].getSalud() - tablero[1][0].getSalud();
                tablero[1][0].setSalud(t);
                System.out.println("\nEl bicho en la posicion 3 (1.0) ha muerto");
            }
            if (tablero[0][0] == null && tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|     |     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString()
                        + "|     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|     |\n-------------");
            } else {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|" + tablero[1][1].toString()
                        + "|\n-------------");
            }
        }
        if (numero == 4) {
            if (tablero[1][1] == null) {
                System.out.println("\nLa posicion esta vacia, bomba atomica fallo");
            }
            if (tablero[1][1] != null) {
                int t = tablero[1][1].getSalud() - tablero[1][1].getSalud();
                tablero[1][1].setSalud(t);
                System.out.println("\nEl bicho en la posicion 4 (1.1) ha muerto");
            }
            if (tablero[0][0] == null && tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|     |     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString()
                        + "|     |\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][0] == null && tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|     |     |\n-------------");
            } else if (tablero[1][1] == null) {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|     |\n-------------");
            } else {
                System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                        + "|\n-------------\n|" + tablero[1][0].toString() + "|" + tablero[1][1].toString()
                        + "|\n-------------");
            }
        }
    }

    public static void BichoMutante() {
        if (tablero[0][0] != null && tablero[0][1] != null && tablero[1][0] != null && tablero[1][1] != null) {

            System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                    + "|\n-------------\n|" + tablero[1][0].toString() + "|" + tablero[1][1].toString()
                    + "|\n-------------");
        } else if (tablero[0][0] != null && tablero[0][1] != null && tablero[1][0] != null && tablero[1][1] == null) {

            System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                    + "|\n-------------\n|" + tablero[1][0].toString() + "|     |\n-------------");
        } else if (tablero[0][0] != null && tablero[0][1] != null && tablero[1][0] == null && tablero[1][1] == null) {

            System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                    + "|\n-------------\n|     |     |\n-------------");
        } else if (tablero[0][0] != null && tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {

            System.out.print("-------------\n|" + tablero[0][0].toString()
                    + "|     |\n-------------\n|     |     |\n-------------");
        }
    }

    public static void fraseAbuela() {
        System.out.println("\nMatar bichos no es tan complicado, deja de quejarte");
        if (tablero[0][0] == null && tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
            System.out.print("-------------\n|     |     |\n-------------\n|     |     |\n-------------");
        } else if (tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
            System.out.print("-------------\n|" + tablero[0][0].toString()
                    + "|     |\n-------------\n|     |     |\n-------------");
        } else if (tablero[1][0] == null && tablero[1][1] == null) {
            System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                    + "|\n-------------\n|     |     |\n-------------");
        } else if (tablero[1][1] == null) {
            System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                    + "|\n-------------\n|" + tablero[1][0].toString() + "|     |\n-------------");
        } else {
            System.out.print("-------------\n|" + tablero[0][0].toString() + "|" + tablero[0][1].toString()
                    + "|\n-------------\n|" + tablero[1][0].toString() + "|" + tablero[1][1].toString()
                    + "|\n-------------");
        }
    }

    public static int finJuego() {
        int p = 0;
        if (tablero[0][0] != null && tablero[0][1] != null && tablero[1][0] != null && tablero[1][1] != null) {
            if (tablero[0][0].getSalud() == 0 && tablero[0][1].getSalud() == 0 && tablero[1][0].getSalud() == 0
                    && tablero[1][1].getSalud() == 0) {
                System.out.println("\nBichos muertos, Fin del juego");
                p++;
            }
        } else if (tablero[0][0] != null && tablero[0][1] != null && tablero[1][0] != null && tablero[1][1] == null) {
            if (tablero[0][0].getSalud() == 0 && tablero[0][1].getSalud() == 0 && tablero[1][0].getSalud() == 0) {
                System.out.println("Bichos muertos, Fin del juego");
                p++;
            }
        } else if (tablero[0][0] != null && tablero[0][1] != null && tablero[1][0] == null && tablero[1][1] == null) {
            if (tablero[0][0].getSalud() == 0 && tablero[0][1].getSalud() == 0) {
                System.out.println("\nBichos muertos, Fin del juego");
                p++;
            }
        } else if (tablero[0][0] != null && tablero[0][1] == null && tablero[1][0] == null && tablero[1][1] == null) {
            if (tablero[0][0].getSalud() == 0) {
                System.out.println("\nBichos muertos, Fin del juego");
                p++;
            }
        }
        return p;
    }
}