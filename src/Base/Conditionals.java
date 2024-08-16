package Base;

import java.util.Scanner;

public class Conditionals {
    
    public static void main (String[] args){
        //if
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese dos valores booleanos y le dié si son iguales o no");
        boolean boolean1 = entrada.nextBoolean();
        boolean boolean2 = entrada.nextBoolean();
        if (boolean1 == boolean2){
            System.out.println("Las variables booleanas son iguales");
        }
        else{
            System.out.println("Las variable son diferentes ");
            
            entrada.close();
        }
        
        System.out.println("Ingrese la cantidad que desea repetir");
        byte fin = entrada.nextByte();
        //for
        for (int i = 0; i< fin; i++) {
            System.out.println("Faltan " + fin + " para terminar");
        }
        int j = 1;
        //while
        while (j < 5){
            System.out.println(j);
            j+=j;
        }


        }
    }
    

