public class Triangulo extends Poligono {
  private int alfa, beta, gama;
  private float a, b, c;
  private float base, altura;

  public void setBase(){
  
  }

  public void setAltura(){
  
public class PruebaFigurasGeometricas{

  public static void main(String [] args){
    Poligono poligono = new Poligono();

    Object objeto = poligono;

    System.out.println(objeto);


    poligono = new Triangulo();
    System.out.println(poligono);

    poligono = new Cuadrilatero();
    System.out.println(poligono);
  }

}
  }

  public String toString(){
    return "Triangulo";
  }
}

