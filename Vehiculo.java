import java.util.ArrayList;

import visualStudio.Sensor;

public class Vehiculo {
    public static int IdActual = 1;
    public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private int id;
    private int modelo;
    private ArrayList<Sensor> sensores = new ArrayList<Sensor>();
    private String marca;
    private double valorcomercial;
    private String color;

    public Vehiculo() {

        Vehiculo.vehiculos.add(this);

    }

    public Vehiculo(int mo, String ma, double va) {
        this(mo, ma, va, "verde");

    }

    public Vehiculo(int mo, String ma, double va, String col) {
        this.modelo = mo;
        this.marca = ma;
        this.valorcomercial = va;
        this.color = col;
        Vehiculo.vehiculos.add(this);
        this.id = vehiculos.size();

    }

    // Inicialiacion de Setters
    public void setId(int i) {
        this.id = i;
    }

    public void setModelo(int mod) {
        this.modelo = mod;

    }

    public void setMarca(String mar) {
        this.marca = mar;
    }

    public void setValorComercial(double val) {
        this.valorcomercial = val;
    }

    public void setColor(String co) {
        this.color = co;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void setIdActual(int idac) {
        this.IdActual = idac;
    }
    // instanciamos getters

    public int getId() {
        return this.id;
    }

    public int getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getValorComercial() {
        return this.valorcomercial;
    }

    public String getColor() {
        return this.color;
    }

    public int getIdActual() {
        return this.IdActual;
    }

    public ArrayList<Sensor> getSensores() {
        return this.sensores;
    }

    public String toString() {
        return " Vehiculo de id " + id + " modelo " + modelo + " marca " + marca + " valor comercial " + valorcomercial
                + " y color " + color;

    }

    public static String toStringVehiculos() {
        String texto = "Datos de los vehiculos almacenados hasta el momento: " + "\n";
        int posvehi = 1;
        for (int num = 0; num < vehiculos.size(); num++) {
            texto = texto + posvehi + " | " + vehiculos.get(num).toString() + " |" + "\n";
            posvehi++;
        }
        return texto;
    }

    public static int cantidadVehiculos() {
        return vehiculos.size();

    }

    public int cantidadSensores() {
        return sensores.size();
    }

    public void anadirSensores(Sensor sensor) {
        sensores.add(sensor);
    }

    public static void obtnerVehiculosPorId(int id) {
        if (id <= Vehiculo.vehiculos.size()) {
            vehiculos.get(id - 1);

        } else {
            System.out.println("No existe este vehiculo con este id.");

        }
    }

}