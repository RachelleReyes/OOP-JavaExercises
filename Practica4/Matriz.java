import javax.swing.*; //Componente grafico
import java.util.*;

//Clase padre llamada Matriz
class Matriz extends CapturarDatos{
	int filas, columnas,inicio,fin;
	
	//Metodo constructor
	public Matriz (int f, int c, int r_inicial,int r_final)
	{
		filas = f;
		columnas = c;
		inicio = r_inicial;
		fin = r_final;
	}
	
	//Metodo principal
	public static void main(String[] args) 
	{
			//Utilizacion de la clase ArrayList para generar arreglos dinamicos
			ArrayList<MatrizInt> entero = new ArrayList<MatrizInt>();
			ArrayList<MatrizFlo> flotante = new ArrayList<MatrizFlo>();			

			nuevaCaptura(entero, flotante);			
			
	} // END MAIN	

	//Metodo que genera matrices
	static void nuevaCaptura(ArrayList<MatrizInt> entero, ArrayList<MatrizFlo> flotante){

		int fil,col,rango_a, rango_b, t_mat=-1,i=-1,f=-1,op=-1,i2=0,f2=0;

		//Ciclo que despliega la ventana de menu
		while(op<=1)
			{
				op = numopcion();

				//Comparacion si se eligio la opcion de Capturar o Imprimir
				if(op==0) //Captura
				{
					t_mat = tipomatriz();
					
					if(t_mat==0) //Condicion si el usuario eligio el tipo int
					{
						i++;
						
						//Capturas en ventanas
						fil = capturar("Cantidad de filas de la matriz: ",i);
						col = capturar("Cantidad de columnas de la matriz: ",i);
						rango_a = capturar("Rango minimo del numero aleatorio: ", i);
						rango_b = capturar("Rango maximo del numero aleatorio: ",i);
						
						//Instancia de la matriz int
						MatrizInt m1 = new MatrizInt(fil,col,rango_a,rango_b);
						//Agrega la matriz en el arreglo
						entero.add(i,m1);
		
					}
					else if(t_mat==1)//Condicion si el usuario eligio el tipo float
					{
						f++;
						
						//Captura en ventanas
						fil = capturar("Cantidad de filas de la matriz: ",f);
						col = capturar("Cantidad de columnas de la matriz: ",f);
						rango_a = capturar("Rango minimo del numero aleatorio: ", f);
						rango_b = capturar("Rango maximo del numero aleatorio: ",f);
								
						//Instancia de la matriz float
						MatrizFlo m2 = new MatrizFlo(fil,col,rango_a,rango_b);
						//Agrega la matriz en el arreglo
						flotante.add(f,m2);
						
					}
				}
				else if(op==1 && (i>=0 || f>=0)) //Imprimir
				{
		
					t_mat = tipomatriz();
					
					//Condicion si eligio imprimir las matrices generadas de tipo int
					if(t_mat==0 && i>=0)
					{
						i2 = nummatriz();
						//Condicion si eligio imprimir todas las matrices
						if(i2==-1)
						{
							for(i2=0; i2<=i;i2++)
							{
								//Obtiene la matriz del arreglo
								MatrizInt mi = entero.get(i2);
								//Imprime la matriz float
								mi.int_imprimir();
							}
						}
						else
						{
							//Obtiene la matriz del arreglo
							MatrizInt mi = entero.get(i2);
							//Imprime la matriz float
							mi.int_imprimir();
						}
						
					}
					//Condicion si eligio imprimir las matrices generadas de tipo float
					else if(t_mat==1 && f>=0)
					{
						f2 = nummatriz();
						
						//Condicion si eligio imprimir todas las matrices
						if(f2==-1)
						{
							for(f2=0; f2<=f;f2++)
							{
								//Obtiene la matriz del arreglo
								MatrizFlo mf = flotante.get(f2);
								//Imprime la matriz float
								mf.float_imprimir();
							}
						}
						else 
						{
							//Obtiene la matriz del arreglo
							MatrizFlo mf = flotante.get(f2);
							//Imprime la matriz flotante
							mf.float_imprimir();
						}
						
					}
				}	
			}

	}

}

//Clase que se usa para capturar datos
class CapturarDatos{
	
	static String []opcion = {"CAPTURAR","IMPRIMIR","SALIR"}; 	
	static String []t_matriz = {"INT","FLOAT","SALIR"};
	
	//Metodo generico para la captura de int
	static int capturar(String cadena,int x)
	{
		int valor;
		valor= Integer.parseInt(JOptionPane.showInputDialog(cadena + x));
		return valor;
	}
	
	//Metodo para desplegar la opcion de escoger el tipo de dato: int o float
	static int tipomatriz()
	{
		int t_mat;
		t_mat = JOptionPane.showOptionDialog(null, "MATRIZ:","MENU", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, t_matriz,t_matriz[0]);
		return t_mat;
	}
	
	//Metodo para ingresar el numero de la matriz que se desea imprimir
	static int nummatriz()
	{
		int n_matriz;
		n_matriz = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la matriz que deseas imprmir: (ingresar -1 para imprimir todas)" ));
		return n_matriz;
	}
	
	//Metodo para desplegar la opcion de escoger si usuario desea capturar, imprimir o salir
	static int numopcion()
	{
		int n_opcion;
		n_opcion = JOptionPane.showOptionDialog(null, "OPCION","MENU", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcion,opcion[0]);
		return n_opcion;
	}
	

}

