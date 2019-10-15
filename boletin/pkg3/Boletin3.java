/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg3;

/**
 *
 * @author ipampillonvieitez
 */
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche obxCoche1 = new Coche();
        obxCoche1.amosar();
        obxCoche1.setKm(50f);
        obxCoche1.setpGAs(1.57f);
        obxCoche1.amosar();
        Coche obxCoche2 = new Coche (30,50,90.4f,7.3f);
        float valor = obxCoche2.consuMedio();
        System.out.println(" consumo medio = "+ valor);
        obxCoche2.setLitros(10);
        valor = obxCoche2.lConsumidos();
        System.out.println(" litros consumidos = "+ valor);
        obxCoche2.setLitros(200);
        float var = obxCoche2.getvMed();
        System.out.println(" velocidade media = "+ var);

        
        
    }
    
}
