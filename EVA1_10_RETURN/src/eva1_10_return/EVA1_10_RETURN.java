/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_return;

/**
 *
 * laura balderrama
 */
public class EVA1_10_RETURN {

    public static void main(String[] args) {
        
        square(10);
        int resu;
        resu = square(3);//llamada a fución, almacenando el resultado
        System.out.println(resu);
        System.out.println(square(5));//llamada a fución, enviando el resultado a otra función
    }
    public static int square(int num){
        return num * num;
    }
}
