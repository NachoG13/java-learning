package Base;

import java.util.Scanner;

public class Variables{
    public static void main(String[] args) {
    


//Tipos Primitivos
    //Tipos Numéricos Enteros:
    byte myByte = -128; //8 bits, rango de -128 a 127.
    short myShort = 32767; //16 bits, rango de -32,768 a 32,767.
    int myInt = 1; //32 bits, rango de -2^31 a 2^31 - 1.
    long myLong = 1; //64 bits, rango de -2^63 a 2^63 - 1

    //Tipos Numéricos de Punto flotante
    
    float myFloat = 1; //32 bits, rango de aproximadamente ±3.40282347E+38F, sufijo f
    double myDouble = 3.5; //64 bits, rango de aproximadamente ±1.79769313486231570E+308, sufijo d (o se puede omitir).
    

    //Tipo carácter
    char myChar = 'A'; //16 bits Unicode, rango de '\u0000' (0) a '\uffff' (65,535)

    //Tipo Booleano
    boolean myBoolean1 = true;
    boolean myBoolean2 = false;

//Tipo de Referencia (Objetos)
    //Clases y Tipos definidos por el usuario
    ///String
    String myString = "Mi cadena de texto";
    myString = "cambio el valor de la cadena";
    System.out.println(myString);
    ///Integer
    Integer myInteger = 10;
    System.out.println(myInteger);

//CONVERSIÓN ENTRE VARIABLES

///Ingresar una variable por consola
Scanner entrada  = new Scanner(System.in);//System.in es un flujo de entrada estándar que lee datos desde la consola.
System.out.println("Ingrese el primer número entero");//int intUser = entrada.nextInt(); //nextInt te permite leer por consola un entero y lo almacena en IntUser
int intUser1 = entrada.nextInt();//System.out.println("Ingrese el //egundo número entero");
int intUser2 = entrada.nextInt();
//-----------------------------

//No me deja convertir de un tipo de//dato entero numérico grande a uno más chico sin castearlo, Necesito colocarle el (tipo)
int resultado = intUser1 + intUser2;
System.out.println("el resultado es "+ resultado);
//------------------------------
System.out.println("Mi double normal "+ myDouble);
myDouble = (int) myDouble; // Conversión explícita de double a int
System.out.println("My Double inteado "+ myDouble);

///Truco, puedo setear el valor decimal a un flotante casteandoló sin signo y volviendo a colocarlo en un flotante:
myDouble = (int) myDouble;
System.out.println("omg " + myDouble);
entrada.close(); //tengo que cerrar el objeto tipo Scanner
    }
}