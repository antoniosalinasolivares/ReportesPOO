// definimos una clase que implementa runnable
public class Hilo implements Runnable {


  // implementamos el metodo run, condicionado de la interfaz
  public void run(){


    // Abstraemos, de la clase thread, el nombre del hilo
    String name = Thread.currentThread().getName();
    for(int i = 0; i < 6;i++){
      // imprimimos iteraciones 
      System.out.println("Iteracion "+ (i+1)+ " de: " + name);
    }

    System.out.println("Termina el: "+ name);
  }

  public static void main(String [] args){
    // Creamos hilos, con un constructor que recibe un objeto que 
    // implemente runnable, junto con los argumentos que recibiria el constructor
    // Thread y los echamos a andar
    new Thread(new Hilo(), "Primer hilo").start();
    new Thread(new Hilo(), "Segundo hilo").start();
    System.out.println("Termina el hilo principal");
  }
}
