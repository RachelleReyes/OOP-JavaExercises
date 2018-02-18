
//Clase Profesor, contiene los atributos de un profesor
class Profesor extends Persona{
 String grado; 
 int num_emp;
 
 //Metodos SET
	public void setGrado(String grado){
        this.grado= grado;
    }
	
	public void setNum_emp(int num_emp) {
		this.num_emp= num_emp;
	}
	
//Metodos GET

	public String getGrado(){
        return grado;
    }
	
	 public int getNum_emp(){
        return num_emp;
    }
}