import javax.swing.*; //Componente grafico

//Clase Padre "Persona", contiene los atributos de una persona
class Persona{
	public String nombre, correo,telefono, direccion, sexo,fecha, rfc,apellido_p,apellido_m;
	
	//METODOS SET
	public void setNombre(String nombre){
        this.nombre = nombre;
    }
	public void setApellido_p(String apellido_p){
        this.apellido_p = apellido_p;
    }
	public void setApellido_m(String apellido_m){
	this.apellido_m = apellido_m;
    }

	public void setCorreo(String correo){
        this.correo = correo;
    }
	
	public void setSexo(String sexo){
        this.sexo = sexo;
    }

	public void setDireccion(String direccion){
        this.direccion = direccion;
    }

	public void setTelefono(String telefono) {
		this.telefono= telefono;
	}
	
	public void setFecha(String fecha) {
		this.fecha= fecha;
	}
	
	public void setRfc(String rfc){
        this.rfc = rfc;
    }
	
	//METODOS GET
	public String getNombre(){
        return nombre;
    }
	public String getApellido_p(){
        return apellido_p;
    }
	public String getApellido_m(){
        return apellido_m;
    }
    public String getCorreo(){
        return correo;
    }
	
    public String getSexo(){
        return sexo;
    }
	
    public String getDireccion(){
        return direccion;
    }
	
	public String getTelefono() {
		return telefono;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public String getRfc(){
		return rfc;
    }
		
	
}
