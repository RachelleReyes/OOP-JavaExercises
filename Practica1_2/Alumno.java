
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
	
	Alumno(String matricula,String nombre, String apellido_p, String apellido_m, String correo, float promedio, String direccion, String sexo,String telefono,String fecha, String rfc)
	{
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellido_p = apellido_p;
		this.apellido_m = apellido_m;
		this.correo = correo;
		this.promedio = promedio;
		this.direccion = direccion;
		this.sexo = sexo;
		this.telefono = telefono;
		this.fecha = fecha;
		this.rfc = rfc;
			
	}
}