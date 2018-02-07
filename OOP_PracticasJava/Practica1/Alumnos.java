import java.io.*;
import javax.swing.*; //Componente grafico

public class Alumnos{

    public static void main(String[] args) {

	int i,j=0,opc,promedioGrupo=0,contador=0,promedioPo, total;

	total= Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de alumnos que vas a dar de alta al sistema "));

	Alumno al[]= new Alumno[total]; //arreglo del tipo Alumno simple. Se usa para capturar los datos del Alumno
        
	for(i=0;i<total;i++){ //ciclo para capturar la cantidad de Alumnos a darl de alta en una captura 
	contador=contador+1;
             al[i] = new Alumno();
             al[i].nombre = JOptionPane.showInputDialog("Nombre del Alumno nuevo: " + (i +1));
             promedioPo= Integer.parseInt(JOptionPane.showInputDialog("promedioPoo del Alumno nuevo : " + (i + 1)));
			 
			 if(promedioPo<0){promedioPo=0;}
				 else if (promedioPo>100){promedioPo=100;}
				 
			 al[i].promedioPoo=promedioPo; 
             al[i].direccion = JOptionPane.showInputDialog("Direccion del Alumno nuevo: " + (i +1));
             al[i].sexo = JOptionPane.showInputDialog("Sexo del Alumno nuevo: " + (i +1));
			 al[i].telefono = JOptionPane.showInputDialog("Telefono del Alumno nuevo: " + (i +1));
			 promedioGrupo+=(promedioPo);
			 
		}

		String[] option1 = {"Salir"};
		String[] option2 = {"Siguiente"};
		String[] option3 = {"Anterior","Salir"};
		String[] option4 = {"Anterior","Siguiente"};
		
		int opcion;
	
		if (total==1) {
			opcion = JOptionPane.showOptionDialog(null, "NOMBRE: " + al[j].nombre +"\n" + "SEXO: " +al[j].sexo +"\n"+ "DIRECCION: " +al[j].direccion +"\n"+ "PROMEDIO: "+al[j].promedioPoo +"\n" + "TELEFONO: "+ al[j].telefono+"\n", "ALUMNO " + (j+1)+ " de "+ total, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option1, option1[0]);
			}
			
		else 
		{
			for(j=0;j<=total;j++)
			{
				if (j==0) {
				opcion = JOptionPane.showOptionDialog(null, "NOMBRE: " + al[j].nombre +"\n" + "SEXO: " +al[j].sexo +"\n"+ "DIRECCION: " +al[j].direccion +"\n"+ "PROMEDIO: "+al[j].promedioPoo +"\n" + "TELEFONO: "+ al[j].telefono+"\n", "ALUMNO " + (j+1)+ " de "+ total, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option2, option2[0]);
				}
				
				else if(j==total){
				opcion = JOptionPane.showOptionDialog(null, promedioGrupo/contador, "PROMEDIO GRUPAL", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option3, option3[0]);
					if(opcion==0){j= j-2;}
				}
				
				else {
				opcion = JOptionPane.showOptionDialog(null, "NOMBRE: " + al[j].nombre +"\n" + "SEXO: " +al[j].sexo +"\n"+ "DIRECCION: " +al[j].direccion +"\n"+ "PROMEDIO: "+al[j].promedioPoo +"\n" + "TELEFONO: "+ al[j].telefono+"\n", "ALUMNO " + (j+1)+ " de "+ total, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option4, option4[0]);
					if(opcion==0){j=j-2;}
				}
			}
		}
	}
}

//Clase Alumno normal, solo con atributos
class Alumno {
 String nombre, telefono, direccion, sexo;
 int promedioPoo;
}