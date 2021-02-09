import java.io.File;
import java.io.IOException;

class Escribe {

// En este caso, partimos de la condicion inical en la que el directorio
// Prueba_Uno/Prueba_Dos existen, pero estan vacios
  public static void main(String [] args){
    // Pero, en el caso de que estas condiciones no se cumplan,
    // manejamos los errores con un Try Catch 
    try{
      // Instanciamos un objeto de la clase File, apuntando a un archivo en la direccion
      // predefinida
      File archivo = new File("./Prueba_Uno/Prueba_Dos/archivo.txt");
      // Usamos el metodo File.exists() para verificar si el archivo existe
      System.out.println(archivo.exists());
      // como sabemos que no existe, lo creamos usando 
      // File.createNewFile()
      boolean seCreo = archivo.createNewFile();
      // y checamos que ese metodo nos haya dado true como resultado
      System.out.println(seCreo);
      // Checamos de nuevo si el archivo existe
      System.out.println(archivo.exists());
    } catch (IOException e){
      System.out.println("Algo salio mal");
    }
  }
}
