
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
    public String getApellidos(){//GET
        return apellidos;
       
    }
    public void setApellidos(String Valor){//SET
        apellidos = Valor;
    }
    public int getEdad(){//GET
        return edad;
       
    }
    public void setEdad(int Valor){//SET
        edad = Valor;
    }
    public char getGenero(){//GET
        return genero;
       
    }
    public void setGenero(char Valor){//SET
        genero = Valor;
        
    }
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: "+ genero);
    }
}
