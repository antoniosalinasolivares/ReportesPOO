public class Gerente extends Empleado {

  private int presupuesto;
  public int getPresupuesto(){
    return this.presupuesto;
  }
  
  public void setPresupuesto(int presupuesto){
    if(presupuesto > 0) this.presupuesto = presupuesto;
  }
  
}
