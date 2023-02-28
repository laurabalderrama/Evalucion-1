package paquete1;

import paquete2.claseE;

/**
 *
 * @author invitado
 */
public class claseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        //Todas estas clases estan en paquete1
        //mismo paquete public y default son visibles
        claseB objB = new claseB();
        //objB.publicB;
        //objB.defaultB;
        claseC objC = new claseC();
        //objC.publicC;
        //objC.defaultC;
        claseD objD = new claseD();
        //objD.publicD;
        //objD.defaultD;
         
        //clases del paquete 2
        //Todo lo que sea defaut es ahora invisible
        claseE objE = new claseE();
        //objE.publicE;
        
        //claseF --> es default y no es visible
        //claseF objF = new claseF();
    }
}

class claseB{
    public int publicB;
    int defaultB;
    private int privateB;
     
}