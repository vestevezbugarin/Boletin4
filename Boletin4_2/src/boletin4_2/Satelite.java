package boletin4_2;

public class Satelite {

    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    public Satelite() {

        meridiano = paralelo = distanciaTerra = 0;
    }

    public void Satelite(double m, double p, double d) {

        this.meridiano = m;
        this.paralelo = p;
        this.distanciaTerra = d;

    }
    //Getters & Setters

    public double getMeridiano() {
        return meridiano;
    }

    public void setMeridiano(double meridiano) {
        this.meridiano = meridiano;
    }

    public double getParalelo() {
        return paralelo;
    }

    public void setParalelo(double paralelo) {
        this.paralelo = paralelo;
    }

    public double getDistanciaTerra() {
        return distanciaTerra;
    }

    public void setDistanciaTerra(double distanciaTerra) {
        this.distanciaTerra = distanciaTerra;
    }

    //Methods
    public void verPosicion() {

        System.out.println("O satelite atopase no paralelo: " + paralelo + ", e no meridiano"
                + meridiano + ", a unha distancia da terra de " + distanciaTerra);
    }
}
