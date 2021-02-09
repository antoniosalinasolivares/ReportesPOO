import java.io.FileOutputStream;
import java.io.IOException;

public class ClaseFileOutputStream {
  public static void main(String [] args){

    // Creamos una variable de tipo FileOutputStream, pero no instanciamos un objeto
    FileOutputStream fos = null;
    // Creamos un arreglo de bytes que nos servira como buffer de la entrada estandar
    byte [] buffer = new byte[81];
    // Creamos una variable para almacenar el tamano de la entrada
    int nBytes;
    try{
      
      System.out.println("Escribir el texto a guardar en el archivo:");
      // Usamos System.in.read para almacenar en los elementos que vienen de la entrada estandar
      // Estemetodo regresa el tamano del buffer como resultado, lo almacenamos en nBytes
      nBytes = System.in.read(buffer);

      // instanciamos FOS, apuntando a un archivo nuevo
      fos = new FileOutputStream("fos.txt");
      // Y, usamos el metodo write para escribirle informacion
      fos.write(buffer, 0, nBytes);
    }catch(IOException ioe) { 
      System.out.println("Error: "+ ioe.toString());
    } finally { 
      try{
	// Al final de la ejecucion cerramos el flujo de datos, para 
	// permitir que otras aplicaciones accedan al archivo
	if (fos != null) fos.close();
      } catch(IOException ioe) {
	System.out.println("Error al cerrar el archivo");
      }
    }
  }
}
