/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_constructores;

/**
 *
 * @author invitado
 */
public class CuentaBancaria {
    private double saldo;
    private String ncuenta;
    private String nomcliente;
    
    public void setSaldo (double valor){
        saldo = valor;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setNcuenta(String valor){
        ncuenta = valor;
    }
    public String getNcuenta(){
        return ncuenta;
    }
     public void setNomcliente (String valor){
         nomcliente = valor;
    }
     public String getNomcliente(){
        return nomcliente; 
     }
}
