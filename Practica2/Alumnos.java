import javax.swing.*; //Componente grafico


public class Alumnos{

    public static void main(String[] args) {
	
	int i,j=0,opcion,promedioGrupo=0,contador=0,promedioPo, total;
	
	total= Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de alumnos que vas a dar de alta al sistema "));//Captura del total de alumnos
	
	Alumno al[]= new Alumno[total]; //arreglo del tipo Alumno simple. Se usa para capturar los datos del Alumno
        
	for(i=0;i<total;i++){ //ciclo para capturar la cantidad de Alumnos a dar de alta en una captura 
	contador=contador+1;
             al[i] = new Alumno();
             al[i].setNombre(JOptionPane.showInputDialog("Nombre del Alumno nuevo: " + (i +1)));
             promedioPo= Integer.parseInt(JOptionPane.showInputDialog("promedioPoo del Alumno nuevo : " + (i + 1)));
			if(promedioPo<0){promedioPo=0;}
				 else if (promedioPo>100){promedioPo=100;}
			 al[i].setpromedioPoo(promedioPo); 
             al[i].setDireccion(JOptionPane.showInputDialog("Direccion del Alumno nuevo: " + (i +1)));
             al[i].setSexo(JOptionPane.showInputDialog("Sexo del Alumno nuevo: " + (i +1)));
			 al[i].setTelefono(JOptionPane.showInputDialog("Telefono del Alumno nuevo: " + (i +1)));
			 promedioGrupo+=(promedioPo);
		}

		//Opciones de las diferentes ventanas que se despliegan al imprimir los datos de los alumnos
		String[] option1 = {"Salir"}; //Ventana para un solo alumno
		String[] option2 = {"Siguiente"}; //Primera ventana para mas de un alumno
		String[] option3 = {"Anterior","Salir"}; //Ultima ventana para mas de un 
		String[] option4 = {"Anterior","Siguiente"}; //Ventana para navegar en los registros
		
		//Comparacion para desplegar la ventana adecuada dependiendo de la cantidad de los alumnos
		if (total==1) {
			opcion = JOptionPane.showOptionDialog(null, "NOMBRE: " + al[j].getNombre() +"\n" + "SEXO: " +al[j].getSexo() +"\n"+ "DIRECCION: " +al[j].getDireccion() +"\n"+ "PROMEDIO: "+al[j].getpromedioPoo() +"\n" + "TELEFONO: "+ al[j].getTelefono()+"\n", "ALUMNO " + (j+1)+ " de "+ total, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option1, option1[0]);
		}
		else 
		{
			for(j=0;j<=total;j++)
			{
				if (j==0) { //Ventana para el primer alumno
				opcion = JOptionPane.showOptionDialog(null, "NOMBRE: " + al[j].getNombre() +"\n" + "SEXO: " +al[j].getSexo() +"\n"+ "DIRECCION: " +al[j].getDireccion() +"\n"+ "PROMEDIO: "+al[j].getpromedioPoo() +"\n" + "TELEFONO: "+ al[j].getTelefono()+"\n", "ALUMNO " + (j+1)+ " de "+ total,  JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option2, option2[0]);
				}
				
				else if(j==total){ //Ventana si ya llego al final de los registros
				opcion = JOptionPane.showOptionDialog(null, promedioGrupo/contador, "PROMEDIO GRUPAL", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option3, option3[0]);
					if(opcion==0){j= j-2;}
				}
				
				else {
					opcion = JOptionPane.showOptionDialog(null, "NOMBRE: " + al[j].getNombre() +"\n" + "SEXO: " +al[j].getSexo() +"\n"+ "DIRECCION: " +al[j].getDireccion() +"\n"+ "PROMEDIO: "+al[j].getpromedioPoo() +"\n" + "TELEFONO: "+ al[j].getTelefono()+"\n", "ALUMNO " + (j+1)+ " de "+ total,  JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option4, option4[0]);
				
					if(opcion==0){j=j-2;}
				}
			}
		}
		
	}
}

//Clase Alumno, contiene los atributos de un alumno
class Alumno {
 String nombre, telefono, direccion, sexo; 
 int promedioPoo;
 
 //Metodos SET
	public void setNombre(String nom){
        nombre = nom;
    }

	public void setSexo(String s){
        sexo = s;
    }

	public void setDireccion(String dir){
        direccion = dir;
    }

	public void setTelefono(String tel) {
		telefono= tel;
	}
	
	public void setpromedioPoo(int prom) {
		promedioPoo= prom;
	}
	
//Metodos GET

	public String getNombre(){
        return nombre;
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
	
	 public int getpromedioPoo(){
        return promedioPoo;
    }
}