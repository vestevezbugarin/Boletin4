package boletin4_3;

public class Circulo {

    private double radio;
    private final double PI = 3.1415;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    public double calcArea() {
        double area = this.PI * Math.pow(this.radio, 2);
        return area;
    }

    public float calcLonxitude() {
        float lonxitude = (float) (2 * this.PI * this.radio);
        return lonxitude;
    }

}
