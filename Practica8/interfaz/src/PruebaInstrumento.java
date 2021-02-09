public class PruebaInstrumento{
  public static void main(String [] args){
    InstrumentoMusical instrumento;

    instrumento = new Flauta();
    instrumento.tocar();
    System.out.println(instrumento.tipoInstrumento());
  }
}
