public class TestAlumno{
  public static void main(String[] args){
    Alumno alumno01 = new Alumno();
    alumno01.setNoCuenta("3335556767");
    alumno01.setNombre("John Smith");
    alumno01.setCarrera("Quimica");
    alumno01.setPromedio(9);
    alumno01.setSemestre(8);
    alumno01.setEdad(23);

    System.out.println(
	"Alumno01: \n" + 
	alumno01.getNoCuenta() + "\n" + 
	alumno01.getNombre() + "\n" + 
	alumno01.getCarrera() + "\n" + 
	alumno01.getPromedio() + "\n" + 
	alumno01.getSemestre() + "\n" + 
	alumno01.getEdad() + "\n");


    Alumno alumno02 = new Alumno(
	"315277700", 
	"Antonio Salinas",
	"Computacion",
	8,
	7,
	22);
    
    System.out.println(
	"Alumno02: \n" +
	alumno02.getNoCuenta() + "\n" + 
	alumno02.getNombre() + "\n" + 
	alumno02.getCarrera() + "\n" + 
	alumno02.getPromedio() + "\n" + 
	alumno02.getSemestre() + "\n" + 
	alumno02.getEdad() + "\n");
  }
}
