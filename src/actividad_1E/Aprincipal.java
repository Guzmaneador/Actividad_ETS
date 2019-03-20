package actividad_1E;



import actividad_1E_2.Tabla;
import java.util.Scanner;
/**
 *
 * @author munchi
 */
public class Aprincipal {
    public static void main (String[] args){
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del matriz n:");
        Tabla.crearTabla(Teclado.nextInt());
        //vamos hacer un print 
        System.out.println("HOLA HOLA CARACOLA");
        //fin de la preuba
    }
    
    
}
