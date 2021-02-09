import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class ClaseFileWriter{
  public static void main(String [] args){
    // Creamos una variable primitiva String para capturar la entrada estandar
    String texto = "";
    try {
      // Creamos un Buffered reader apuntandolo a la entrada estandar del sistema
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("\nEscribir texto:\n");
      // Leemos la linea que popula la entrada estandar 
      // y la almacenamos en nuestra variable
      texto = br.readLine();
      // Creamos un objeto de la clase FileWriter, apuntando al archivo
      // archivo.txt
      FileWriter fw = new FileWriter("archivo.txt");
      // Creamos un buffered Writer, que usa el fileWriter que creamos
      BufferedWriter bw = new BufferedWriter(fw);
      // Instanciamos un printWriter, que recibe un flujo Buffered Reader
      PrintWriter salida = new PrintWriter(bw);
      // El printWriter, tiene el metodo println, el cual escribe sobre el archivo,
      // lo que tenemos almacenado en texto
      salida.println(texto);
      salida.close();
    } catch(IOException ioe){
      System.out.println("Error al abrir o al guardar el archivo");
      ioe.printStackTrace();
    } catch (Exception e){
      System.out.println("Error al leer del teclado");
      e.printStackTrace();
    }
  }
}
