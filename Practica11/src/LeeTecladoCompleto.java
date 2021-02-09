import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeeTecladoCompleto {
  public static void main(String [] args){
    // Creamos variable auxiliar para guardar cadenas de texto
    String texto = "";
    try {
      // Usamos el mismo metodo de antes para capturar la entrada estandar del
      // teclado
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Escribir texto:");
      texto = br.readLine();

      System.out.println("/n/nEl texto separado por espacios es:");
      // Usamos String tokenizer para separar la cadena por espacios
      StringTokenizer st = new StringTokenizer(texto);
      // Mientras la cadena siga teniendo palabras despues del espacio,
      // se sigue ejecutando
      while(st.hasMoreTokens()){
	// Imprimimos el siguiente token en la fila
	System.out.println(st.nextToken());
      }
    } catch (Exception e){
      System.out.println("/n/nError al leer de teclado");
      e.printStackTrace();
    }
  }
}
