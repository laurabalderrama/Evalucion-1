/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_20_calculos_geometricos;

/**
 *
 * @author invitado
 */
public class Geometria {
    //constantes
    public static double PI = 3.1416;  

//PERIMETRO DE UN CIRCULO
    public static double perimetroCirculo(double radio){
        return PI * (radio * 2);
   } 
    //area de un circulo
    public static double areaCirculo(double radio){
        return PI * (radio * radio);
    }
    //volumen de una esfera
    public static double volumenEsfera(double radio){
        return (4.0/3.0) * (PI * radio * radio * radio);
    }
    
}
