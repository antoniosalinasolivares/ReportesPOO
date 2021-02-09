public class Instancias{
  public static void main(String [] args){
    Gerente gerente = new Gerente();
    if (gerente instanceof Gerente )
      System.out.println("Instance of Gerente");
    if (gerente instanceof Empleado )
      System.out.println("Instance of Empleado");
    if (gerente instanceof Object )
      System.out.println("Instance of Object ");
  }
}
