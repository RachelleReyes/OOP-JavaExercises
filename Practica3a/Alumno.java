
//Clase Alumno, contiene los atributos de un alumno
class Alumno extends Persona{
	
 String matricula;
 float promedio;
 
 //Metodos SET
	public void setMatricula(String matricula){
        this.matricula = matricula;
    }

	public void setPromedio(float promedio) {
		this.promedio= promedio;
	}
	
//Metodos GET

	public String getMatricula(){
        return matricula;
    }
		
	 public float getPromedio(){
        return promedio;
    }
}