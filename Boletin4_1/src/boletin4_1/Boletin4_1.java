package boletin4_1;

public class Boletin4_1 {
    
    public static void main(String[] args) {
        
        Coche coche1 = new Coche();
        
        System.out.println("Velocidade actual: " + coche1.getVelocidade());
        
        coche1.acelerar(60);
        
        System.out.println("Velocidade acelerada: " + coche1.getVelocidade());
        
        coche1.frenar(20);
        System.out.println("Velocidade diminuida: " + coche1.getVelocidade());
        
    }
    
}
