public class PruebaEmpleado{
  public static void main(String [] args){
    Gerente gerente = new Gerente();
    gerente.setNombre("Luis Aguilar");
    gerente.setNumEmpleado(5788);
    gerente.setSueldo(14000);
    System.out.println("Nombre: " + gerente.getNombre() + "\n" +
	"Numero de empleado: " + gerente.getNumEmpleado() + "\n" + 
	"Sueldo: " + gerente.getSueldo());

    gerente.aumentarSueldo(10);
    gerente.setPresupuesto(30000);

    System.out.println("Nuevo sueldo: "+ gerente.getSueldo() + "\n" + 
	"Presupuesto: "+ gerente.getPresupuesto());

    gerente.setPresupuesto(45000);
    System.out.println("Nuevo presupuesto: " + gerente.getPresupuesto());
  }
}
