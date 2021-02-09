public class MetodoPolimorfico {
  public static void main (String [] args){
    
  }

  public static void getPoligono(Poligono p){
    if (p instanceof Triangulo)
      System.out.println("El objeto es un Triangulo");
    if (p instanceof Cuadrilatero)
      System.out.println("El objeto es un Cuadrilatero");
    if (p instanceof Poligono)
      System.out.println("El objeto es un Poligono");
  }
}
