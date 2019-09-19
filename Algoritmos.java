/*
Utiliza el lenguaje de programación java y utiliza recursividad para poner en practica tus conocimientos. Elije un programa de los siguientes y programalo:

a).- Diseña un programa para que una persona suba una escalera. (recuerda el ejemplo que diseñamos en la clase anterior).
b).- Diseña un programa para que la computadora te presente la tabla de multiplicar de cualquier número desde el 1 hasta el 20.
c).- Diseña un programa que resuelva el problema de la serie fibonacci.
Nota.- solo necesitas subir el archivo que tiene la extesión .java de tu proyecto.

Criterios para evaluar el programa:

    Diseño del algoritmo y su funcionamiento 50%
    
    Diseño del programa:
        Funcionamiento del programa-----30%
        Documentación del código--------10%
        Presentación en pantalla--------15%
        Identación correcta del código---5%
 */
package algoritmos;

import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Francisco Israel Castillo Gutierrez.
 */
public class Algoritmos 
{
    int b = 1;//Variable global b.
    int c = 1;//Variable global c.
    int tope; //Variable global tope.
    
// Este es un metodo constructor.    
public Algoritmos(int tope){
    this.tope = tope;
}

// Metodo Principal
    public static void main(String[] args){
        
        
        boolean opcion = true;
       
        while (opcion == true){    
            // Un bloque try, catch para atrapar excepciones cuando se ingrese letras o valores reales.
            try{
                int tope1 = Integer.parseInt(JOptionPane.showInputDialog( "Bienbenido a la sucecion de Fibonacci.\n Ingresa el numero limite para imprimir la serie de Fibonacci."));
                if (tope1 <=0){
                    tope1 = Integer.parseInt("letra");
                }
                    
                //Aqui se instancia y se crea el objeto al, de las instrucciones anteriores se le ingresara un dato y ese dato (tope1) sera el argumento.
                Algoritmos al = new Algoritmos(tope1);
                al.fibonacci(1);
                opcion = false;
            }
            
            
            catch(java.lang.NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error Fatal\n Ingrese un valor entero positivo.");
            }
        }
        

    }
    
    //Aqui está el metodo fibonacci que por medio del algoritmo imprimirá todos los numeros de fibonacci.
    public void fibonacci(int a){
  
        if (a>this.tope){
            JOptionPane.showMessageDialog(null, "Este es el final de la sucecion de Fibonacci hasta el "+tope+".\nGracias.");
            JOptionPane.showMessageDialog(null, "Este programa fue hecho por: \nFrancisco Israel Castillo Gutierrez.");
        }
        
        else{  
           
            try{
            Thread.sleep(200);//Un retardo para mostrar los numeros.
            System.out.println(a);
            b = c;
            c = a;
            fibonacci(a = b + c);//Aqui es donde esta la recursivida cuando el mismo metodo se vuelve a llamar.
            } 
            
            catch (InterruptedException ex){
                Logger.getLogger(Algoritmos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
  
}


