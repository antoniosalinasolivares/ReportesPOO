package paquete;
public class CCuenta{
  private String nombre;
  private String cuenta;
  private double saldo;
  private double tipoDeInteres;
  
  public CCuenta(){
    
  }
  
  public CCuenta(String nombre, String cuenta, double saldo, double tipoDeInteres ){
    asignarNombre(nombre);
    asignarCuenta(cuenta);
    ingreso(saldo);
    asignarTipoDeInteres(tipoDeInteres);
  }

  public void asignarNombre(String nom){
    if(nom.length()==0){
      System.out.println("Error: cadena vacia");
    }   
    nombre = nom;
  }
  
  public String obtenerNombre(){
    return nombre;
  }

  public void asignarCuenta(String cue){
    if(cue.length()==0){
      System.out.println("Error: cuenta no valida");
    }   
    cuenta = cue;
  }

  public String obtenerCuenta(){
    return cuenta;
  }

  public double estado(){
    return saldo;
  }

  public void ingreso(double cantidad){
    if(cantidad < 0){
      System.out.println("Error: Cantidad negativa");
    }
    saldo = saldo + cantidad;
  }

  public void reintegro(double cantidad){
    if (saldo - cantidad < 0){
      System.out.println("Error: no se dispone de saldo");
    }
  }

  public void asignarTipoDeInteres(double tipo){
    if(tipo < 0){
      System.out.println("Error: tipo no valido");
    }
    tipoDeInteres = tipo;
  } 

  public double obtenerTipoDeInteres(){
    return tipoDeInteres;
  }

}
