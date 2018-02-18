import javax.swing.*; //Componente grafico

//Clase que inicializa las clases Alumno y Profesor
class Escuela{

	//Metodo main
	public static void main(String[] args) {
		
		//Declaracion de variables
		int i,j=0,opcion,contador=0, total_al,o_persona,total_p;
		float promedioGrupo =0, promedioPo;
		
		//Opciones de las diferentes ventanas que se despliegan al imprimir los registros
		String[] option1 = {"Capturar datos de profesores"}; //Ventana para un solo alumno
		String[] option2 = {"Siguiente"}; //Primera ventana para mas de un alumno
		String[] option3 = {"Anterior","Capturar datos de profesores"}; //Ultima ventana para mas de un alumno
		String[] option4 = {"Anterior","Siguiente"}; //Ventana para navegar en los registros
		String[] option5 = {"Salir"}; //Ventana para un solo profesor
		String[] option6 = {"Anterior","Salir"}; //Ultima ventana para mas de un profesor

		total_al= Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de alumnos que vas a dar de alta al sistema "));//Captura del total_al de alumnos
		
		Alumno al[]= new Alumno[total_al]; //arreglo del tipo Alumno simple. Se usa para capturar los datos del Alumno
				
		for(i=0;i<total_al;i++){ //ciclo para capturar la cantidad de Alumnos a dar de alta en una captura 
		contador=contador+1;
			 al[i] = new Alumno();
			 al[i].setMatricula(JOptionPane.showInputDialog("Matricula del Alumno nuevo: " + (i +1)));
			 al[i].setNombre(JOptionPane.showInputDialog("Nombre del Alumno nuevo: " + (i +1)));
			 al[i].setCorreo(JOptionPane.showInputDialog("Correo del Alumno nuevo: " + (i +1)));
			 promedioPo= Float.parseFloat(JOptionPane.showInputDialog("Promedio del Alumno nuevo : " + (i + 1)));
			if(promedioPo<0){promedioPo=0;}
				 else if (promedioPo>100){promedioPo=100;}
			 al[i].setPromedio(promedioPo); 
			 al[i].setDireccion(JOptionPane.showInputDialog("Direccion del Alumno nuevo: " + (i +1)));
			 al[i].setSexo(JOptionPane.showInputDialog("Sexo del Alumno nuevo: " + (i +1)));
			 al[i].setTelefono(JOptionPane.showInputDialog("Telefono del Alumno nuevo: " + (i +1)));
			 promedioGrupo+=(promedioPo);
		}

			//Comparacion para desplegar la ventana adecuada dependiendo de la cantidad de los alumnos
			if (total_al==1) {//Comparacion si es solo un alumno
				opcion = JOptionPane.showOptionDialog(null, "MATRICULA: " + al[j].getMatricula() +"\n" + "NOMBRE: " + al[j].
				getNombre() +"\n" + "SEXO: " +al[j].getSexo() +"\n"+ "DIRECCION: " +al[j].getDireccion() +"\n"+ "PROMEDIO: "+
				al[j].getPromedio() +"\n" + "TELEFONO: "+ al[j].getTelefono()+"\n"+"CORREO: " +al[j].getCorreo()+"\n", "ALUMNO " 
				+ (j+1)+ " de "+ total_al, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option1, option1[0]);
			}
			else //Comparacion para mas de un alumno
			{
				for(j=0;j<=total_al;j++) //Ciclo para imprimir los datos en ventanas 
				{
					if (j==0) { //Ventana para el primer alumno
					opcion = JOptionPane.showOptionDialog(null, "MATRICULA: " + al[j].getMatricula() +"\n" + "NOMBRE: " + al[j].
					getNombre() +"\n" + "SEXO: " +al[j].getSexo() +"\n"+ "DIRECCION: " +al[j].getDireccion() +"\n"+ "PROMEDIO: "+
					al[j].getPromedio() +"\n" + "TELEFONO: "+ al[j].getTelefono()+"\n"+ "CORREO: " +al[j].getCorreo()+"\n", "ALUMNO " 
					+ (j+1)+ " de "+ total_al,  JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option2, option2[0]);
					}
					
					else if(j==total_al){ //Ventana si ya llego al final de los registros
					opcion = JOptionPane.showOptionDialog(null, promedioGrupo/contador, "PROMEDIO GRUPAL", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.INFORMATION_MESSAGE, null, option3, option3[0]);
						if(opcion==0){j= j-2;}
					}
					else {
						opcion = JOptionPane.showOptionDialog(null, "MATRICULA: " + al[j].getMatricula() +"\n" + "NOMBRE: " + 
						al[j].getNombre() +"\n" + "SEXO: " +al[j].getSexo() +"\n"+ "DIRECCION: " +al[j].getDireccion() +"\n"+ 
						"PROMEDIO: "+al[j].getPromedio() +"\n" + "TELEFONO: "+ al[j].getTelefono()+"\n"+ "CORREO: " + 
						al[j].getCorreo()+"\n", "ALUMNO " + (j+1)+ " de "+ total_al,  JOptionPane.DEFAULT_OPTION, 
						JOptionPane.INFORMATION_MESSAGE, null, option4, option4[0]);
					
						if(opcion==0){j=j-2;}
					}
				}	
		}
	
		total_p= Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de profesores que vas a dar de alta al sistema "));//Captura del total de profesores
		int n_emp;
		Profesor p[]= new Profesor[total_p]; //arreglo del tipo Profesor simple. Se usa para capturar los datos del Profesor
			
		for(i=0;i<total_p;i++){ //ciclo para capturar la cantidad de Profesor a dar de alta en una captura 
				 p[i] = new Profesor();
				 n_emp =Integer.parseInt(JOptionPane.showInputDialog("Numero del profesor nuevo: " + (i +1)));
				 p[i].setNum_emp(n_emp);
				 p[i].setNombre(JOptionPane.showInputDialog("Nombre del Profesor nuevo: " + (i +1)));
				 p[i].setCorreo(JOptionPane.showInputDialog("Correo del Profesor nuevo: " + (i +1)));
				 p[i].setGrado(JOptionPane.showInputDialog("Grado del Profesor nuevo: " + (i +1)));
				 p[i].setDireccion(JOptionPane.showInputDialog("Direccion del Profesor nuevo: " + (i +1)));
				 p[i].setSexo(JOptionPane.showInputDialog("Sexo del Profesor nuevo: " + (i +1)));
				 p[i].setTelefono(JOptionPane.showInputDialog("Telefono del Profesor nuevo: " + (i +1)));
			}

			//Comparacion para desplegar la ventana adecuada dependiendo de la cantidad de los profesores
			if (total_p==1) { //Comparacion si es un solo profesor
				opcion = JOptionPane.showOptionDialog(null, "N. DE EMPLEADO: " + p[j].getNum_emp() +"\n" + "NOMBRE: " + p[j].getNombre() +"\n" + 
				"SEXO: " +p[j].getSexo() +"\n"+ "DIRECCION: " +p[j].getDireccion() +"\n" + "TELEFONO: "+ p[j].getTelefono()+"\n"+ "GRADO: "+ 
				p[j].getGrado()+"\n"+ "CORREO: "+ p[j].getCorreo()+"\n", "PROFESOR " + (j+1)+ " de "+ total_p, JOptionPane.DEFAULT_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, null, option5, option5[0]);
			}
			else //Comparacion para mas de un profesor
			{
				for(j=0;j<total_p;j++) //Ciclo que imprime todos los registros del profesor
				{
					if (j==0) { //Ventana si es el primero de los registros
					opcion = JOptionPane.showOptionDialog(null, "N. DE EMPLEADO: " + p[j].getNum_emp() +"\n" + "NOMBRE: " + p[j].getNombre() +"\n" + 
					"SEXO: " +p[j].getSexo() +"\n"+ "DIRECCION: " +p[j].getDireccion() +"\n" + "TELEFONO: "+ p[j].getTelefono()+"\n"+ "GRADO: "+ 
					p[j].getGrado()+"\n"+ "CORREO: "+ p[j].getCorreo()+"\n", "PROFESOR " + (j+1)+ " de "+ total_p, JOptionPane.DEFAULT_OPTION, 
					JOptionPane.INFORMATION_MESSAGE, null, option2, option2[0]);
					}
					
					else if(j==(total_p-1)){ //Ventana si ya llego al final de los registros
						opcion = JOptionPane.showOptionDialog(null, "N. DE EMPLEADO: " + p[j].getNum_emp() +"\n" + "NOMBRE: " + p[j].getNombre() +"\n" + 
						"SEXO: " +p[j].getSexo() +"\n"+ "DIRECCION: " +p[j].getDireccion() +"\n" + "TELEFONO: "+ p[j].getTelefono()+"\n"+ "GRADO: "+ 
						p[j].getGrado()+"\n"+ "CORREO: "+ p[j].getCorreo()+"\n", "PROFESOR " + (j+1)+ " de "+ total_p, JOptionPane.DEFAULT_OPTION, 
						JOptionPane.INFORMATION_MESSAGE, null, option6, option6[0]);
						if(opcion==0){j= j-2;}
					}
		
					else {
						opcion = JOptionPane.showOptionDialog(null, "N. DE EMPLEADO: " + p[j].getNum_emp() +"\n" + "NOMBRE: " + p[j].getNombre() +"\n" + 
					"SEXO: " +p[j].getSexo() +"\n"+ "DIRECCION: " +p[j].getDireccion() +"\n" + "TELEFONO: "+ p[j].getTelefono()+"\n"+ "GRADO: "+ 
					p[j].getGrado()+"\n"+ "CORREO: "+ p[j].getCorreo()+"\n", "PROFESOR " + (j+1)+ " de "+ total_p, JOptionPane.DEFAULT_OPTION, 
					JOptionPane.INFORMATION_MESSAGE, null, option4, option4[0]);
						if(opcion==0){j=j-2;}
					}
				}
			}
	}
}