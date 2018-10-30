/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorioprueba;
import java.util.*;
/**
 *
 * @author admin
 */
public class RepositorioPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String cadena;
        char caracter;
        int contador=0;
        
        System.out.println("Introduce una cadena");
        cadena=sc.nextLine();
        System.out.println("Introduce un caracter");
        caracter=sc.nextLine().charAt(0);
        
        for(int i=0;i<cadena.length();i++){
            
            if(caracter==cadena.charAt(i)){
                contador++;
            }
            
        }
        System.out.println("El caracter "+caracter+" se ha encontrado "+contador+" veces en la cadena "+cadena);
    }
    
}
