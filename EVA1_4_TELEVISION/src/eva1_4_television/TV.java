/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_4_television;

/**
 *
 *
 */
public class TV {
    //ATRIBUTOS: ESTADO
    private boolean power;
    private int volumen;
    private int canal;
    //METODOS: COMPORTAMIENTO 
    //CONSTRUCTOR
    public TV(){//constructor default
        power = false;
        volumen = 95;
        canal = 3;
    } public void cambiarPower(){
      if(power == false){
          power = true;
          System.out.println("Televisión encendida");
      }else{ 
         power = false; 
          System.out.println("Televisión apagada");
      }
    } 
    public void subirVolumen(){
        if(power == true){
            if(volumen < 100){
             volumen = volumen + 5;
            }System.out.println("volumen: " + volumen);
        }
    }public void bajarVolumen(){ 
        if(power == true){
            if (volumen > 0){
            volumen = volumen - 5;
            }System.out.println("volumen: " + volumen);     
        }
    }public void subirCanal(){
        if(power == true){
            if (canal < 100){
                canal = canal +1;
            }System.out.println("canal:" + canal);
        } else{
            canal = 0;
            System.out.println("canal:" + canal);
        }
    }public void bajarCanal(){
        if(power == true){
            if (canal > 0){
                canal = canal -1;
            }System.out.println("canal:" + canal);
     }
   } 
}
