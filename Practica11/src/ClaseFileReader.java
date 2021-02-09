import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClaseFileReader{
  public static void main(String[] args){
    // Creamos una variable para almacenar el texto proveniente del archivo
    String texto = "";
    try{
      // Creamos una instancia de FileReader y apuntamos el constructor a 'leer.txt'
      FileReader fr = new FileReader("leer.txt");

      // Creamos un bufferedReader y lo apuntamos al archivo
      BufferedReader br = new BufferedReader(fr);
      System.out.println("El texto contenido en el archivo leer.txt es: ");
      // Usamos el metodo readLine() de BufferedReader para leer linea a linea el archivo
      String linea = br.readLine();
      // Repetimos esto, de forma iterativa hasta que el archivo no tenga lineas siguientes
      while (linea != null) {
	System.out.println(linea);
	linea = br.readLine();
      }
      // Cerramos el buffered reader
      br.close();
    } catch (IOException ioe){
      System.out.println("\n\n Error al abrir o guardar el archivo.");
      ioe.printStackTrace();
    } catch (Exception e){
      System.out.println("\n\n Error al leer el teclado");
      e.printStackTrace();
    }

 }
}
