package paquete;
public class TestCuenta{
  public static void main(String[] args){
    
    CCuenta cuenta01 = new CCuenta();
    cuenta01.asignarNombre("Un nombre: ");
    cuenta01.asignarCuenta("Una cuenta: ");
    cuenta01.asignarTipoDeInteres(2.5);
    cuenta01.ingreso(12000);
    cuenta01.reintegro(3000);

    System.out.println(cuenta01.obtenerNombre());
    System.out.println(cuenta01.obtenerCuenta());
    System.out.println(cuenta01.estado());
    System.out.println(cuenta01.obtenerTipoDeInteres());
    
    CCuenta cuenta02 = new CCuenta("Nombre chido", "Cuenta chida", 12000, 1.1);
    System.out.println(cuenta02.obtenerNombre());
    System.out.println(cuenta02.obtenerCuenta());
    System.out.println(cuenta02.estado());
    System.out.println(cuenta02.obtenerTipoDeInteres());
  }
}
