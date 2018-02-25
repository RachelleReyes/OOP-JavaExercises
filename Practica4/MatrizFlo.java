import javax.swing.*; //Componente grafico
import java.util.*;

//Clase para la matriz de valores flotantes
class MatrizFlo extends Matriz{
	
	float arre [][];
	
		//Metodo constructor
		public MatrizFlo(int f, int c, int r_inicial, int r_final)
		{
			super(f,c,r_inicial,r_final);
			arre= new float[filas][columnas];
			initMatriz(inicio,fin);
		}
		//Metodo que inicializa la matriz 
		public void initMatriz(int min, int max)
		{
			int i,j;
			//Ciclo que genera numeros aleatorios de tipo float
			for(i=0; i<filas;i++)
			for(j=0; j<columnas;j++){
				Random aleatorio = new Random(); 
				//Usa los valores minimos y maximos ingresados por el ususario como rango
				arre[i][j] = min + aleatorio.nextFloat()*(max-min);  
			}
	}
	//Metodo que imprime la matriz flotante
		public void float_imprimir()
		{
			int i,j;
			String cadena="";
			
			//Ciclo que concatena los numeros en una cadena para su impresion
			for(i=0; i<filas;i++)
			{
				for(j=0; j<columnas;j++)
				{	
					cadena+= String.format("%15.6f",arre[i][j]);
				}
				cadena+= "\n";
			}
			//Muestra la matriz en una ventana
			JOptionPane.showMessageDialog(null,cadena);
		}
}