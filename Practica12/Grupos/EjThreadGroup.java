// Definimos una clase que herede de Thread
public class EjThreadGroup extends Thread{

  // Reusamos el constructor que recibe ThreadGroup y el nombre del hilo.
  public EjThreadGroup(ThreadGroup g, String n){
    super(g,n);
  }
  
  // Redefinimos el metodo Run(), el cual se echa a andar de forma asincrona con Objeto.start()
  public void run(){
    for (int i = 0; i<10; i++){
      System.out.println(getName());
    }
  }

  // Definimos una funcion que enlista los hilos que pertenecen al threadgroup
  // a nivel de clase, el cual recibe una referencia a un ThreadGroup
  public static void listarHilos(ThreadGroup grupoActual){
    
    // Los objetos ThreadGroup tienen el metodo activeCount()
    // El cual regresa el numero de hilos activos que tiene el threadgroup.
    int numHilos = grupoActual.activeCount();

    // Definimos un arreglo de hilos
    Thread listaDeHilos[] = new Thread[numHilos];

    //enumerate() copia los hilos del grupo a una lista de hilos que reciba como parametro.
    grupoActual.enumerate(listaDeHilos);


    //Imprimimos el numero de hilos, junto con su el nombre de cada uno.
    System.out.println("\n Numero de Hilos activos: " +numHilos+ "\n");
    for(int i = 0; i < numHilos; i++){
      System.out.println("Hilo Activo: "+ (i+1) 
	  + " = "+ listaDeHilos[i].getName());
    }
  }

  public static void main(String [] args){

    // Definimos un objeto ThreadGroup con el nombre del mismo
    ThreadGroup grupoHilos = new ThreadGroup("Grupo con prioridad normal");

    // Thread tiene un constructor que recibe una instancia de ThreadGroup,
    // en donde se "subscribe" al hilo al grupo.
    Thread hilo1 = new EjThreadGroup(grupoHilos, "Hilo 1 con prioridad maxima");
    Thread hilo2 = new EjThreadGroup(grupoHilos, "Hilo 2 con prioridad normal");
    Thread hilo3 = new EjThreadGroup(grupoHilos, "Hilo 3 con prioridad normal");
    Thread hilo4 = new EjThreadGroup(grupoHilos, "Hilo 4 con prioridad normal");
    Thread hilo5 = new EjThreadGroup(grupoHilos, "Hilo 5 con prioridad normal");
    

    // Las instancias de Thread, tienen un metodo para establecer una prioridad
    // tambien tiene definidas constantes para facilitar su lectura.
    hilo1.setPriority(Thread.MAX_PRIORITY);

    // Este metodo tambien lo tiene ThreadGroup, pero aqui, se establece la
    // prioridad para todos los hilos que pertenecen al grupo.
    grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);


    // Imprimimos los hilos con su prioridad.
    System.out.println("Prioridad del grupo: "+ grupoHilos.getMaxPriority());
    System.out.println("Prioridad del Thread = "+ hilo1.getPriority());
    System.out.println("Prioridad del Thread = "+ hilo2.getPriority());
    System.out.println("Prioridad del Thread = "+ hilo3.getPriority());
    System.out.println("Prioridad del Thread = "+ hilo4.getPriority());
    System.out.println("Prioridad del Thread = "+ hilo5.getPriority());

    //Iniciamos el proceso del hilo
    hilo1.start();
    hilo2.start();
    hilo3.start();
    hilo4.start();
    hilo5.start();
    

    //usamos el metodo estatico para enlistar los hilos del grupo.
    listarHilos(grupoHilos);
  }
}
