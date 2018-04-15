import javax.swing.*; //Componente grafico
import java.util.*;

//Clase para la matriz de valores flotantes
public class MatrizFlo extends Matriz{
	
	public float arre [][];
	
		//Metodo constructor
		public MatrizFlo(int f, int c) {
			super(f,c);
			arre= new float[filas][columnas];
			initMatriz();
		}
		//Metodo que inicializa la matriz 
		public void initMatriz() {
			int i,j,min=0, max=10;
			
			//Ciclo que genera numeros aleatorios de tipo float
			for(i=0; i<filas;i++) {
				for(j=0; j<columnas;j++){
					Random aleatorio = new Random(); 
					//Usa los valores minimos y maximos ingresados por el ususario como rango
					arre[i][j] = min + aleatorio.nextFloat()*(max-min);  
				}
			}
		}
	//Metodo que imprime la matriz flotante
		public void float_imprimir(String titulo) {
			int i,j;
			String cadena="";
			
			//Ciclo que concatena los numeros en una cadena para su impresion
			for(i=0; i<filas;i++) {
				for(j=0; j<columnas;j++) {	
					cadena+= String.format("%15.6f",arre[i][j]);
				}
				cadena+= "\n";
			}
			System.out.println(titulo);
			System.out.println(cadena);
			//Muestra la matriz en una ventana
			JOptionPane.showMessageDialog(null,cadena,titulo,1);

		}
		
		//Metodo que valida las dimensiones de la matriz
		public boolean validarDim_matriz () {
			boolean valido;
			if (filas==columnas) {
				valido = true;
			}
			else {
				valido = false;
			}
			return valido;
		}
		
		//Metodo que genera la matriz transpuesta
		public MatrizFlo transpuesta() {
			int i,j;
			float numero;
			MatrizFlo transpuesta = new MatrizFlo(filas,columnas);

			for(i=0; i<filas;i++) {
					for(j=0; j<columnas;j++) {	
						numero = arre[j][i];
						transpuesta.arre[i][j] = numero;				
					}
				}
			return transpuesta;
		}
}