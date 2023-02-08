/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_clases_java;

/**
 *
 * @author laura
 */
public class Persona {
    //datos --> atributos de la clase
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    //metodos --> comportamiento de la clase 
    //leer y escribir los atributos de la clase
    //leer --> get
    //escribir --> set
    // modificador de acceso valor de etorno nombre del metodo (argumentos) (implementacion)
    public String getNombre(){//GET
        return nombre;
       
    }
    public void setNombre(String Valor){//SET
        nombre = Valor;
    }
}
