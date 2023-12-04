
package actividad2pooe12;

//Importamos el java.util.Scanner para registrar los datos escritos
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        //Título y datos
        System.out.println("Ejercicio resuelto #12");
        
        //Definimos la variable scanner de tipo Scanner para que registre las entradas
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario  los datos de Nombres (NOM), Número de horas trabajadas (NHT) y valor por hora normal (VHN)
        System.out.print("Ingrese los nombres: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada1 = scanner.nextLine();
        String NOM =  entrada1;
        
        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada2 = scanner.nextLine();
        int NHT = Integer.parseInt(entrada2);
        
        System.out.print("Ingrese el valor recibido por una hora normal de trabajo: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada3 = scanner.nextLine();
        double VHN = Double.parseDouble(entrada3);
        
        //Definimos la variable Salario
        double SALARIO;
        
        //Toma de decisiones y declaración de la variable Horas extra trabajadas HET
        if ( NHT > 40) {
            int HET = NHT-40;
            if (HET > 8) {
               int HEE8 = HET - 8;
               SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
                
            } else {
                SALARIO = 40 * VHN + HET * 2 * VHN;
            }
            
        }
        else {
            SALARIO = NHT * VHN;
        }
        
        //Escribimos el valor del salario del trabahador a partir de la decisión que se haya tomado
        System.out.println("El trabajador: " + NOM + " devengó: $" + SALARIO);
    }
    
}
