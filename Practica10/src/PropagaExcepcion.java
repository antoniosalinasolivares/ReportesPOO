public class PropagaExcepcion{
  public static int miMetodo(int a, int b) throws ArithmeticException{
    return a/b;
  }

  public static void main(String [] args){
    try{
      int division = miMetodo(10,0);
      System.out.println(division);
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}
