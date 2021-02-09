public class Cuenta extends Thread {
  // Definimos una variable de clase
  private static long saldo = 0;
  // Usamos el metodo constructor de Thread para definir name
  public Cuenta(String nombre){
    super(nombre);
  }
  //Redefinimos el metodo Run para que, de acuerdo al nombre, unos hilos hagan depositos
  //y otros retiros
  public void run(){
    if(getName().equals("Deposito 1") || getName().equals("Deposito 2")){
      this.depositarDinero(100);
    } else {
      this.retirarDinero(50);
    }
    System.out.println("Terina el " + getName());

  }
  // Defnimos metodos sincronos para modificar el valor de saldo
  public synchronized void depositarDinero(int cantidad){
    saldo += cantidad;
    System.out.println("Se depositaron " + cantidad + " pesos");
    notifyAll();
  }

  // metodo que, si el saldo es negativo, espera a que se le notifique por 5 segundos
  public synchronized void retirarDinero(int cantidad){
    try{
      if(saldo <= 0){
	System.out.println(getName() + " espera deposito" + "\n saldo = " + saldo);
	sleep(5000);
      }
    } catch (InterruptedException e){
      System.out.println(e);
    }
    saldo -= cantidad;
    System.out.println(getName() + " extrajo " + cantidad + 
	"pesos. \n Saldo restante = " + saldo);
    notifyAll();
  }
  // instanciamos cuatro objetos y los corremos para que modifiquen de 
  // forma sincrona la variable saldo
  public static void main(String [] args){
    new Cuenta("Acceso 1").start();
    new Cuenta("Acceso 2").start();
    new Cuenta("Deposito 1").start();
    new Cuenta("Deposito 2").start();
    System.out.println("Termina el hilo principal");
  }
}
