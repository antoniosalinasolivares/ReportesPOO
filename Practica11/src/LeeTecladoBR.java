import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeeTecladoBR {
  public static void main(String [] args){
    try{
      // Usamos una variable string para almacenar valores temporales
      String texto = "";
      // Usamos un Buffered Reader como una cubeta para un stream proveniente 
      // de InputStreamReader, que elige la entrada estandar como origen
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Escribir el texto deseado:");
      //USamos el metodo ReadLine, de Buffered Reader, 
      //para capturar una linea de la entrada estandar, 
      // Estableciendo que el corte es en un salto de linea \n
      texto = br.readLine();
      // Lo imprimimos como demostracion
      System.out.println("El texto escrito fue:\n" + texto);
    } catch (IOException ioe){
      ioe.printStackTrace();
    }
  }
}
