import javax.swing.*; //Componente grafico

//Clase Padre "Persona", contiene los atributos de una persona
class Persona{
	String nombre, correo,telefono, direccion, sexo;;
	
	//METODOS SET
	public void setNombre(String nombre){
        this.nombre = nombre;
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
	
	//METODOS GET
	public String getNombre(){
        return nombre;
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
	
	
}
