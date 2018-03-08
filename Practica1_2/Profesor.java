
//Clase Profesor, contiene los atributos de un profesor
class Profesor extends Persona{
 String grado, num_emp;
 
 //Metodos SET
	public void setGrado(String grado){
        this.grado= grado;
    }
	
	public void setNum_emp(String num_emp) {
		this.num_emp= num_emp;
	}
	
//Metodos GET

	public String getGrado(){
        return grado;
    }
	
	 public String getNum_emp(){
        return num_emp;
    }
	
	Profesor(String num_emp,String nombre, String apellido_p, String apellido_m,String correo, String grado,String direccion, String sexo,String telefono,String fecha, String rfc)
	{
		this.num_emp = num_emp;
		this.nombre = nombre;
		this.apellido_p = apellido_p;
		this.apellido_m = apellido_m;
		this.correo = correo;
		this.grado = grado;
		this.direccion = direccion;
		this.sexo = sexo;
		this.telefono = telefono;
		this.fecha = fecha;
		this.rfc= rfc;
	}
}