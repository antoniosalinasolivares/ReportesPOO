public class Triangulo extends Poligono {
  private int alfa, beta, gama;
  private float a, b, c;
  private float base, altura;

  public void setBase(){
    
  }

  public void setAltura(){
  
  }
  
  public double area(){
    return base*altura/2;
  }

  public double perimetro(){
    return a*b*c;
  }

  public String toString(){
    return "Triangulo";
  }
}

