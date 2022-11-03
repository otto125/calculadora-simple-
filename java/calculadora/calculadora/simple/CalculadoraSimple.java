/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package calculadora.calculadora.simple;

import java.util.Scanner;

/**
 *
 * @author 50242
 */
public class CalculadoraSimple {

    public static void main(String[] args) {
   
         int operacion;
        float numeroUno, numeroDos, res;
        String respuesta;
        
        respuesta = "s";

        while (respuesta.toLowerCase().equals("s")) {

            operacion = 0;
            numeroUno = numeroDos = res = 0.0f;

            Scanner scan = new Scanner(System.in);

            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            System.out.print("Ingrese la operación que desea realizar: ");

            operacion = scan.nextInt();
        
            System.out.print("Ingrese primer operando: ");
            numeroUno = scan.nextFloat();

            System.out.print("Ingrese segundo operando: ");
            numeroDos = scan.nextFloat();
            
           switch (operacion) {
                case 1: res = suma(numeroUno, numeroDos);
                        break;
                case 2: res = resta(numeroUno, numeroDos);
                        break;
                case 3: res = multiplicar(numeroUno, numeroDos);
                       break;
                case 4: res = dividir(numeroUno, numeroDos);
                        break;
                default:System.out.println("Opción ingresada no es válida."); 
                        break;
            }
            //resultado = operandoUno * operandoDos;
            //resultado = operandoUno / operandoDos;
            
            System.out.println("El resultado de la operación es: " + res);
            
            System.out.print("Desea realizar otra operacion? (s/n) ");
            respuesta = scan.next();
        }
        
        
        
        
    }
     // Agregar nuevos métodos aquí
    //                                  Parámetros
    public static float suma(float operandoUno, float operandoDos) {
        float resultado;
        
        resultado = 0.0f;
        
        resultado = operandoUno + operandoDos;
        
        return resultado;
    }
    
    public static float resta(float operandoUno, float operandoDos) {
        float resultado;
        
        resultado = 0.0f;
        
        resultado = operandoUno - operandoDos;
        
        return resultado;
    }
    
       public static float multiplicar(float operandoUno, float operandoDos) {
        float resultado;
        
        resultado = 0.0f;
        
        resultado = operandoUno * operandoDos;
        
        return resultado;
    }
       
       
        public static float dividir(float operandoUno, float operandoDos) {
        float resultado;
        
        resultado = 0.0f;
        
        resultado = operandoUno / operandoDos;
        
        return resultado;
    }
    
    
    
}
