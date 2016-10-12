/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p1;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double b,c,d;
        int a = pedirAño();
        b=calcularAño1(a);
        c=calcularAño3(a);
        d=calcularAño2(a);
        Determinar(b,c,d,a);                
    }
    public static int pedirAño(){
        int año;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el año:");
        año = entrada.nextInt();
        return año;
    }
    public static double calcularAño1(int a){
        double c1 = a%4;
        return c1;
    }
    public static double calcularAño2(int a){
        double c2 = a%100;
        return c2;
    }
    public static double calcularAño3(int a){
        double c3 = a%400;
        return c3;
    }
    public static void Determinar (double c1, double c2, double c3, int a){
        if(c1==0 && c2!=0 || c3==0){
            System.out.println("El año " +a +" si es Bisiesto");
        }else{
            System.out.println("El año " +a +" no es Bisiesto");
        }
        
    }
    
}
