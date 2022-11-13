public class Sensor {
    private String tipo;
    private double valor;

    public Sensor() {

    }

    public Sensor(String tip, double val) {
        this.tipo = tip;
        this.valor = val;
    }

    // Instanciamos los Setters
    public void setTipo(String tip) {
        this.tipo = tip;
    }

    public void setValor(double val) {
        this.valor = val;
    }

    // Instanciamos los getters
    public String getTipo() {
        return this.tipo;
    }

    public double getValor() {
        return this.valor;
    }

    // Hacemos el toString
    public String toString() {
        return "Su sensor de tipo " + tipo + " y de un valor de " + valor;
    }

}