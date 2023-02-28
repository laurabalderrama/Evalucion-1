/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete2;

import paquete1.claseA;

/**
 *
 * @author invitado
 */
public class claseE {
    public int publicE;
    int defaultE;
    private int privateE;
    
}
class claseF{
    public int publicF;
    int defaultF;
    private int privateF;
    
    public void prueba(){
        claseA objA = new claseA();
         //objA.publicA;
        
        //claseD es defaut en otro paquete es invisible
        //claseD objD = new claseD();
    }
}    