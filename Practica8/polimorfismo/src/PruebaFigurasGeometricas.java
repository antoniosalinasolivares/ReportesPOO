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
