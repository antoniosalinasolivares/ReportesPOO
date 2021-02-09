// La clase hilo hereda de thread
public class Hilo extends Thread {

  // Usamos el constructor de Thread
  public Hilo(String nombre){
    super(nombre);
  }
  
  // redefinimos el metodo run, que usa la clase Thread
  public void run(){
    for(int i = 0; i < 6;i++){
      // imprimimos un numero y el nombre que le dimos
      System.out.println("Iteracion "+ (i+1)+ " de: " + getName());
    }

    System.out.println("Termina el: "+ getName());
  }

  public static void main(String [] args){
    // Definimos dos hilos con nombre distinto y los echamos a andar
    new Hilo("Primer hilo").start();
    new Hilo("Segundo hilo").start();

    // esta es la ultima instruccion del hilo main
    System.out.println("Termina el hilo principal");
  }
}
