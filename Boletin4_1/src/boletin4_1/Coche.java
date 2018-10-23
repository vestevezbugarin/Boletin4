package boletin4_1;

public class Coche {

    private int velocidade;

    public Coche() {
        this.velocidade = 0;
    }

    public Coche(int velocidade) {
        this.velocidade = velocidade;
    }

    //Getters & Setters
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    //Methods 
    public void acelerar(int valor) {
        this.velocidade += valor;
    }//Este método incrementa a velocidade na cantidade "valor".

    public void frenar(int menos) {
        this.velocidade -= menos;
    }//Este método diminue a velocidade na cantidade "menos".

}
