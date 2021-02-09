public class Cuadrilatero extends Poligono {
  private int alfa, beta;
  private float a, b;
  private float base, altura;

  public void setBase(){
  
  }

  public void setAltura(){
  
  }
  
  public double area(){
    return base*altura;
  }

  public double perimetro(){
    return 2*a*b;
  }

  public String toString(){
    return "Cuadrilaterio";
  }
}

