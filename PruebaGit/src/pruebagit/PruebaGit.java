/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebagit;

/**
 *
 * @author Black_Travel
 */
public class PruebaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           for (int i = 1; i <= 10; i++) {
            System.out.println("");
            System.out.println("Tabla del "+i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }
    }
    
}