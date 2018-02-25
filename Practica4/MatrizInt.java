import javax.swing.*; //Componente grafico
import java.util.*;

//Clase para la matriz de enteros
class MatrizInt extends Matriz{
	int arre [][];
	
	//Metodo constructor
	public MatrizInt(int f, int c, int r_inicial, int r_final)
	{
		super(f,c,r_inicial,r_final);
		arre= new int[filas][columnas];
		//Inicializa la matriz
		initMatriz(inicio,fin);
	}
	
	//Metodo que inicializa la matriz
	public void initMatriz(int min, int max)
	{
		int i,j;
		
		//Ciclo que genera valores aleatorios de tipo int 
		for(i=0; i<filas;i++)
			for(j=0; j<columnas;j++){
				Random aleatorio = new Random(); 
				//Usa los valores minimos y maximos ingresados por el ususario como rango
				arre[i][j] = min + aleatorio.nextInt(max - min); 
			}
	}
	//Metodo que imprime la matriz
	public void int_imprimir()
	{
		int i,j;
		String cadena="";
			
			//Ciclo que concatena los numeros en una cadena para su impresion
			for(i=0; i<filas;i++)
			{
				for(j=0; j<columnas;j++)
				{	
					cadena+= String.format("%10d",arre[i][j]);
				}
				cadena+= "\n";
			}
			//Muestra la matriz en una ventana
			JOptionPane.showMessageDialog(null,cadena);
	}
}