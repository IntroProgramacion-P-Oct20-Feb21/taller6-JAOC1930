/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador = 1;
        String nombre;
        int nDias;
        double cDias;
        double totalp;
        String cadenaf="";
        while(contador <= 5){
        System.out.println("Ingrese el mombre del empleado");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el número de días trabajados");
        nDias = entrada.nextInt();
        System.out.println("Ingrese el costo del día trabajado");
        cDias = entrada.nextDouble();
        entrada.nextLine();
        
        totalp = nDias * cDias; 
            cadenaf = String.format("%s\t%s\t%d\t$%.2f\t$%.2f\n", cadenaf,
                    nombre, nDias, cDias, totalp);
        
        contador = contador + 1;
    }
        System.out.printf("%S\n",cadenaf);
        
    }
    }
