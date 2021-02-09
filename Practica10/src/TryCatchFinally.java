public class TryCatchFinally{
  public static void main(String [] args){
    try{
      int equis = 5/0;
      System.out.println("Equis = "+ equis);
    } catch(ArithmeticException e){
      System.out.println("Error: division entre cero");
    } catch(Exception e){
      System.out.println("Error: Excepcion general");
    } finally{
      System.out.println("Este bloque siempre se ejecuta");
    }
  }
}
