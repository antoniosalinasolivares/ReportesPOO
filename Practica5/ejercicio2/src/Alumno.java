public class Alumno{
  private String noCuenta;
  private String nombre;
  private String carrera;
  private float promedio;
  private int semestre;
  private int edad;

  public Alumno(){
    
  }
  
  public Alumno(String noCuenta, String nombre, String carrera, float promedio, int semestre, int edad  ){
    setNoCuenta(noCuenta);
    setNombre(nombre);
    setCarrera(carrera);
    setPromedio(promedio);
    setSemestre(semestre);
    setEdad(edad);
  }
  
  
  public float getPromedio (){
    return this.promedio;
  }
  public int getEdad (){
    return this.edad ;
  }
  public int getSemestre (){
    return this.semestre ;
  }
  public String getNombre (){
    return this.nombre ;
  }
  public String getCarrera (){
    return this.carrera ;
  }
  public String getNoCuenta (){
    return this.noCuenta ;
  }

  public void setNoCuenta (String noCuenta) {
    if(noCuenta.length() != 0){
      this.noCuenta = noCuenta;
      return;
    }
    System.out.println("Error: noCuenta vacio");

  }
  public void setNombre (String nombre) {
    if(nombre.length() != 0){
      this.nombre = nombre;
      return;
    }
    System.out.println("Error: nombre vacio");

  }
  public void setCarrera (String carrera) {
    if(carrera.length() != 0){
      this.carrera = carrera;
      return;
    }
    System.out.println("Error: carrera vacio");
  }
  public void setSemestre (int semestre ){
    if(semestre > 0){
      this.semestre = semestre;
      return;
    }
    System.out.println("Error: semestre menor a 0");
  }
  public void setPromedio (float promedio ){
    if(promedio > 0){
      this.promedio = promedio;
      return;
    }
    System.out.println("Error: promedio menor a 0");
  }
  public void setEdad (int edad ){
    if(edad > 0){
      this.edad = edad;
      return;
    }
    System.out.println("Error: edad menor a 0");
  }
}
