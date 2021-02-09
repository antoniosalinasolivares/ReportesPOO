public class InstrumentoViento extends Object implements InstrumentoMusical {
 public void tocar() {
  System.out.println("Tocando un insstrumento de viento.");
 }

 public void afinar(){
  System.out.println("Afinando instrumento de viento.");
 }

 public String tipoInstrumento(){
  return "Instrumento de Viento";
 }
}
