/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_clases_java;

/**
 *
 * laura balderrama
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAR UN OBJETO
        //INSTANCICION --> DAR MEMORIA RAM
        //NOMBRE DE LA CLASE IDENTIFICADOR 
        Persona person1 = new Persona();//PERSONA() ES EL CONSTRUCTOR
        person1.setNombre("laura");
        person1.setApellidos("Balderrama Pando");
        person1.setEdad(18);
        person1.setGenero('F');
        /*System.out.println(person1.getNombre());
        System.out.println(person1.getApellidos());
        System.out.println(person1.getEdad());
        System.out.println(person1.getGenero());*/
        person1.imprimirDatos();
    }
    
}
