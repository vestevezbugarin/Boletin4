package boletin4_4;

public class Calculo {

    private float polbo;
    private float patacas;
    private int clientes;

    public Calculo() {
    }

    public Calculo(float polvo, float patacas) {
        this.polbo = polvo;
        this.patacas = patacas;
    }

    public Calculo(float polvo, float patacas, int clientes) {
        this.polbo = polvo;
        this.patacas = patacas;
        this.clientes = clientes;
    }

    public float getPolbo() {
        return polbo;
    }

    public void setPolbo(float polbo) {
        this.polbo = polbo;
    }

    public float getPatacas() {
        return patacas;
    }

    public void setPatacas(float patacas) {
        this.patacas = patacas;
    }

    public int getClientes() {

        float auxPolbo = this.polbo;

        while (auxPolbo > 0) {
            auxPolbo /= 2;
            this.clientes++;
        }
        if (this.clientes > Math.abs(this.patacas)) {
            this.clientes = (int) this.patacas;
            return (this.clientes * 3);
        }

        return (clientes * 3);
    }

}
