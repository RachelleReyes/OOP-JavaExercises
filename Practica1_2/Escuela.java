import javax.swing.*; //Componente grafico
import java.util.*;
import java.lang.String;

//Clase para usar las clases de Alumnos y Personas
class Escuela{

	//Metodo principal
  public static void main(String[] args) {
	
	//Declaracion de variables
	int i,j=0,opcion,contador=0, total_al,o_persona=-1,total_p, salir=0,total_alumnos=0,captura=-1,total_profesores =0;
	float promedioGrupo =0, promedioPo,promedio;
	String matricula,nombre,correo,direccion, sexo, telefono,num_emp,grado,fecha,apellido_p, apellido_m, rfc;
	int dia,mes,anio;
	
	//Declaracion de las listas de arreglos que se usaran para los alumnos y profesores
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	
	String[] personas = {"Alumno","Profesor"}; //Primera ventana para mas de un alumno
			
	//Opciones de las diferentes ventanas que se despliegan al imprimir los datos de los registros
	String[] option1 = {"Capturar de nuevo", "Salir"}; //Ventana para un solo registro
	String[] option2 = {"Siguiente"}; //Primera ventana para mas de un registro
	String[] option3 = {"Anterior","Capturar de nuevo","Salir"}; //Ultima ventana para mas de un registro
	String[] option4 = {"Anterior","Siguiente"}; //Ventana para navegar en los registros
	
	String [] op_sexo = {"Masculino","Femenino"};
	
	//Ciclo que se para cuando el usuario desea salirse del programa
	do{
		//Guarda la opcion elegida por el usuario en el menu
		o_persona = JOptionPane.showOptionDialog(null, "Cual deseas capturar","MENU", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, personas,personas[0]);
		
		//Condicion si la persona elegida es un alumno
		if(o_persona == 0)
		{
			total_al= Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de alumnos que vas a dar de alta al sistema "));//Captura del total_al de alumnos
		
			for(i=0;i<total_al;i++){ //ciclo para capturar la cantidad de Alumnos a dar de alta en una captura 
			contador=contador+1;
			
					/*Guarda los valores ingresadas en las ventanas en sus variables*/
					 matricula = (JOptionPane.showInputDialog("Matricula del Alumno nuevo: " + (i +total_alumnos+1)));
					 apellido_p = (JOptionPane.showInputDialog("Apellido paterno del Alumno nuevo: " + (i +total_alumnos+1)));
					 apellido_m = (JOptionPane.showInputDialog("Apellido materno del Alumno nuevo: " + (i +total_alumnos+1)));
					 nombre = (JOptionPane.showInputDialog("Nombre del Alumno nuevo: " + (i +total_alumnos+1)));
					 correo = (JOptionPane.showInputDialog("Correo del Alumno nuevo: " + (i +total_alumnos+1)));
					 promedioPo= Float.parseFloat(JOptionPane.showInputDialog("Promedio del Alumno nuevo : " + (i + total_alumnos+1)));
					if(promedioPo<0){promedioPo=0;}
						 else if (promedioPo>100){promedioPo=100;}
					 promedio = (promedioPo); 
					 direccion = (JOptionPane.showInputDialog("Direccion del Alumno nuevo: " + (i +total_alumnos+1)));
					 sexo = (String)(JOptionPane.showInputDialog(null,"Elige tu genero","Genero del Alumno nuevo: " + (i +total_alumnos+1),
					 JOptionPane.QUESTION_MESSAGE,null,op_sexo,op_sexo[0]));
					 
					 fecha = (JOptionPane.showInputDialog(null,"ANO-MES-DIA(1998-12-20)","Fecha de nacimiento Alumno nuevo: " + (i +total_alumnos+1),JOptionPane.QUESTION_MESSAGE));
					 //Component parentComponent, Object message, String title, int messageType)
				
					 telefono = (JOptionPane.showInputDialog("Telefono del Alumno nuevo: " + (i +total_alumnos+1)));
					 promedioGrupo+=(promedioPo);
					 
					 //rfc = apellido_p.substring(0,2).toUpperCase()+apellido_m.substring(0,1).toUpperCase()+nombre.substring(0,1).toUpperCase()+fecha.substring(6,8)+fecha.substring(3,5)+fecha.substring(0,2);
					 RFC Rfc = new RFC(nombre, apellido_p,apellido_m, fecha);
					 rfc = Rfc.calcularRFC(nombre, apellido_p,apellido_m, fecha);
					 Alumno al = new Alumno(matricula,nombre,apellido_p, apellido_m,correo,promedio,direccion,sexo,telefono,fecha,rfc);//Inicializa un alumno
					 alumnos.add(i+total_alumnos,al); //Agrega el registro al final de la lista de arreglo
					
				}
				total_alumnos+= total_al; //Guarda el total ingresado en la nueva captura en la variable total de todas las capturas	
				
				//Comparacion para desplegar la ventana adecuada dependiendo de la cantidad de los alumnos
				if (total_al==1 && captura !=1) { //Si es para un solo alumno
					Alumno a = alumnos.get(j);
					opcion = JOptionPane.showOptionDialog(null, "MATRICULA: " + a.getMatricula() +"\n" + "NOMBRE: " +a.getApellido_p()+" " +a.getApellido_m()+ " " + a.
					getNombre() +"\n"+"SEXO: " +a.getSexo() +"\n"+ "FECHA DE NACIMIENTO: " +a.getFecha() +"\n"+ "DIRECCION: " +a.getDireccion() +"\n"+ "PROMEDIO: "+
					a.getPromedio() +"\n" + "TELEFONO: "+ a.getTelefono()+"\n"+"CORREO: " +a.getCorreo()+"\n"+"RFC: " +a.getRfc()+"\n", "ALUMNO " + (j+1)+ " de "+ total_al, JOptionPane.DEFAULT_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, option1, option1[0]);
					if(opcion==1){salir=1;}
						else if(opcion==0){captura=1;}
				}
				
				else //Si es para mas de un alumno
				{
					for(j=0;j<=(total_alumnos);j++)
					{
						if (j==0) { //Ventana si es el primero de los registros
						Alumno a = alumnos.get(j);
						opcion = JOptionPane.showOptionDialog(null, "MATRICULA: " + a.getMatricula() +"\n" + "NOMBRE: " +a.getApellido_p()+" "  +a.getApellido_m() +" " + a.
					getNombre() +"\n"+"SEXO: " +a.getSexo() +"\n"+ "FECHA DE NACIMIENTO: " +a.getFecha() +"\n"+ "DIRECCION: " +a.getDireccion() +"\n"+ "PROMEDIO: "+
						a.getPromedio() +"\n" + "TELEFONO: "+ a.getTelefono()+"\n"+"CORREO: " +a.getCorreo()+"\n"+"RFC: " +a.getRfc()+"\n", "ALUMNO " 
						+ (j+1)+ " de "+ total_alumnos, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option2, option2[0]);
						}
						
						else if(j==total_alumnos){ //Ventana si ya llego al final de los registros
						opcion = JOptionPane.showOptionDialog(null, promedioGrupo/contador, "PROMEDIO GRUPAL", JOptionPane.DEFAULT_OPTION, 
						JOptionPane.INFORMATION_MESSAGE, null, option3, option3[0]);
							if(opcion==0){j= j-2;}
								else if(opcion==1){captura=1;}
									else if(opcion==2){salir=1;}
						}
						else {
							Alumno a = alumnos.get(j);
							opcion = JOptionPane.showOptionDialog(null, "MATRICULA: " + a.getMatricula() +"\n" + "NOMBRE: " +a.getApellido_p()+" "  +a.getApellido_m() +" "+ a.
					getNombre() +"\n"+"SEXO: " +a.getSexo() +"\n"+ "FECHA DE NACIMIENTO: " +a.getFecha() +"\n"+ "DIRECCION: " +a.getDireccion() +"\n"+ "PROMEDIO: "+
						a.getPromedio() +"\n" + "TELEFONO: "+ a.getTelefono()+"\n"+"CORREO: " +a.getCorreo()+"\n"+"RFC: " +a.getRfc(), "ALUMNO " 
						+ (j+1)+ " de "+ total_alumnos, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option4, option4[0]);
								if(opcion==0){j=j-2;}
						}
					}
				}
		}
		else if(o_persona == 1) //Comparacion si se desea dar de alta un profesor
		{
			total_p= Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de profesores que vas a dar de alta al sistema "));//Captura del total_p
	
			for(i=0;i<total_p;i++){ //ciclo para capturar la cantidad de Profesores a dar de alta en una captura 
			
					/*Guarda los valores ingresadas en las ventanas en sus variables*/
					 num_emp = JOptionPane.showInputDialog("Numero del profesor nuevo: " + (i +total_profesores+1));
					 nombre =  JOptionPane.showInputDialog("Nombre del Profesor nuevo: " + (i +total_profesores+1));
					 apellido_p =  JOptionPane.showInputDialog("Apellido paterno del Profesor nuevo: " + (i +total_profesores+1));
					 apellido_m =  JOptionPane.showInputDialog("Apellido materno  del Profesor nuevo: " + (i +total_profesores+1));
					 correo =  JOptionPane.showInputDialog("Correo del Profesor nuevo: " + (i +total_profesores+1));
					 grado =   JOptionPane.showInputDialog("Grado del Profesor nuevo: " + (i +total_profesores+1));
					 direccion = JOptionPane.showInputDialog("Direccion del Profesor nuevo: " + (i +total_profesores+1));
					 sexo = (String)(JOptionPane.showInputDialog(null,"Elige tu genero","Genero del Profesor nuevo: " + (i +total_profesores+1),
					 JOptionPane.QUESTION_MESSAGE,null,op_sexo,op_sexo[0]));
					 fecha = (JOptionPane.showInputDialog(null,"DIA-MES-ANO(25-12-90)","Fecha de nacimiento Profesor nuevo: " + (i +total_profesores+1),JOptionPane.QUESTION_MESSAGE));
					 telefono = JOptionPane.showInputDialog("Telefono del Profesor nuevo: " + (i +total_profesores+1));
					RFC Rfc = new RFC(nombre, apellido_p,apellido_m, fecha);
					 rfc = Rfc.calcularRFC(nombre, apellido_p,apellido_m, fecha);
					 Profesor pr = new Profesor(num_emp,nombre,apellido_p,apellido_m,correo, grado,direccion,sexo,telefono,fecha,rfc); //Incializa un profesor
					 profesores.add(i+total_profesores,pr); //Agrega el registro al final de la lista del arreglo
				}

			total_profesores+= total_p;	//Guarda el total ingresado en la nueva captura en la variable total de todas las capturas	
			
			//Comparacion para desplegar la ventana adecuada dependiendo de la cantidad de los profesores
			if (total_p==1 && captura !=1) {
				
				Profesor p = profesores.get(j);
				
				opcion = JOptionPane.showOptionDialog(null, "N. DE EMPLEADO: " + p.getNum_emp() +"\n" + "NOMBRE: " +p.getApellido_p() +" " +p.getApellido_m() +" " +p.getNombre()+"\n" + 
				"SEXO: " +p.getSexo() +"\n"+ "FECHA DE NACIMIENTO: " +p.getFecha()+"\n"+ "DIRECCION: " +p.getDireccion() +"\n" + "TELEFONO: "+ p.getTelefono()+"\n"+ "GRADO: "+ 
				p.getGrado()+"\n"+ "CORREO: "+ p.getCorreo()+"\n"+"RFC: " +p.getRfc()+"\n", "PROFESOR " + (j+1)+ " de "+ total_profesores, JOptionPane.DEFAULT_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, null, option1, option1[0]);
					if(opcion==1){salir=1;}
						else if(opcion==0){captura=1;}
			}
			else //Para mas de un profesor
			{
				for(j=0;j<total_profesores;j++)
				{
					if (j==0) { //Ventana si es el primer registro
					Profesor p = profesores.get(j);
					opcion = JOptionPane.showOptionDialog(null, "N. DE EMPLEADO: " + p.getNum_emp() +"\n" +  "NOMBRE: " +p.getApellido_p() +" " +p.getApellido_m() +" " +p.getNombre()+"\n" + 
					"SEXO: " +p.getSexo()  +"\n" + "FECHA DE NACIMIENTO: " +p.getFecha()+"\n"+ "DIRECCION: " +p.getDireccion() +"\n" + "TELEFONO: "+ p.getTelefono()+"\n"+ "GRADO: "+ 
					p.getGrado()+"\n"+ "CORREO: "+ p.getCorreo()+"\n"+"RFC: " +p.getRfc()+"\n", "PROFESOR " + (j+1)+ " de "+ total_profesores, JOptionPane.DEFAULT_OPTION, 
					JOptionPane.INFORMATION_MESSAGE, null, option2, option2[0]);
					}
					
					else if(j==(total_profesores-1)){ //Ventana si ya llego al final de los registros
					Profesor p = profesores.get(j);
					opcion = JOptionPane.showOptionDialog(null, "N. DE EMPLEADO: " + p.getNum_emp() +"\n" +  "NOMBRE: " +p.getApellido_p() +" " +p.getApellido_m() +" " +p.getNombre()+"\n" + 
					"SEXO: " +p.getSexo() +"\n"+ "FECHA DE NACIMIENTO: " +p.getFecha()+"\n"+ "DIRECCION: " +p.getDireccion() +"\n" + "TELEFONO: "+ p.getTelefono()+"\n"+ "GRADO: "+ 
					p.getGrado()+"\n"+ "CORREO: "+ p.getCorreo()+"\n"+"RFC: " +p.getRfc()+"\n", "PROFESOR " + (j+1)+ " de "+ total_profesores, JOptionPane.DEFAULT_OPTION, 
					JOptionPane.INFORMATION_MESSAGE, null, option3, option3[0]);
						if(opcion==0){j= j-2;}
							else if(opcion==1){captura=1;}
								else if(opcion==2){salir=1;}
					}
		
					else {
					Profesor p = profesores.get(j);
					opcion = JOptionPane.showOptionDialog(null, "N. DE EMPLEADO: " + p.getNum_emp() +"\n" +  "NOMBRE: " +p.getApellido_p() +" " +p.getApellido_m() +" " +p.getNombre()+"\n" + 
					"SEXO: " +p.getSexo() +"\n"+ "FECHA DE NACIMIENTO: " +p.getFecha()+"\n"+ "DIRECCION: " +p.getDireccion() +"\n" + "TELEFONO: "+ p.getTelefono()+"\n"+ "GRADO: "+ 
					p.getGrado()+"\n"+ "CORREO: "+ p.getCorreo()+"\n"+"RFC: " +p.getRfc()+"\n", "PROFESOR " + (j+1)+ " de "+ total_profesores, JOptionPane.DEFAULT_OPTION, 
					JOptionPane.INFORMATION_MESSAGE, null, option4, option4[0]);
						if(opcion==0){j=j-2;}
					}
				}
			}
		}
		else  {salir=1;}
	}while(salir!=1);
  }
}