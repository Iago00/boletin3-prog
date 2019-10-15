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
public class Coche {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
//    constructores
    public Coche(){
        
    }
    
    public Coche (float k, float l, float vM, float pG){
     km=k;
     litros=l;
     vMed=vM;
     pGas=pG;         
    }
    public void amosar(){
        System.out.println("KM : "+km+" litros : "+litros+ "vMed : "+vMed+ " pGas : "+pGas);
    }
    public void setKm(float k){
        km=k;
    }
    public float getKm(){
        return km;
    }
    public void setLitros(float l){
        litros=l;
    }
    public float getLitros(){
        return litros;
    }
    public void setvMed(float vM){
        vMed=vM;
    }
    public float getvMed(){
        return vMed;
    }
    public void setpGAs(float pG){
        pGas=pG;
    }
    public float getpGas(){
        return pGas;
    }            
    public float consuMedio(){
        float consu = 100*litros/km;
        return consu;
    }
    public float lConsumidos(){
        float l = 200;
        return l;
                }
    
}
