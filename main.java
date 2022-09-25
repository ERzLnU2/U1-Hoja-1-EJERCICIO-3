package com.solomongo.ejercicio3_hoja1;
/**
 * @author DAW120
 * 📌 EJERCICIO 3, Hoja 1.
 * 🏴‍ Indica errores presentes en el siguiente código, corregir y ejecutar programa.
 */


/*
Ejercicio3.java
Programa que muestra el uso de los operadores aritméticos
*/
public class Ejercicio3_Hoja1 {         // error: en NombreClase
    public static void main(String[] args)  {  // error: faltaba llave apertura método
 
    short x = 7;
    int y = 5;
    float f1 = 13.5f;  // error: no llevaba atributo de tipo float (f)
    float f2 = 8f;

    System.out.println("El valor de x es "+ x +" y el valor de y es "+y); // error: concatenaba con comas(,) son (+)
    System.out.println("El resultado de x + y es " + (x + y));  // error; se esperaba (;) para cerrar sentencia
    System.out.println("El resultado de x - y es " + (x - y));
    System.out.printf("%s%s\n","Division entera:","x / y = " + (x / y)); // error: sobraba (\n) y faltaba (+)
    System.out.println("Resto de la division entera: x % y = " + (x % y));
    System.out.printf("El valor de f1 es %f y el de f2 es %f\n",f1,f2);
    System.out.println("El resultado de f1 / f2 es " + (f1 / f2)); // error; se esperaba (;) para cerrar sentencia
    }
} // error: faltaba llave de cierre de la Clase
