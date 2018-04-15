public class OperacionesMatrices{
	
	//Metodo que valida las dimensiones de dos matrices para la suma y resta
	public static boolean validarDim (Matriz a, Matriz b) {
		boolean valido;
		if (a.filas == b.filas && a.columnas == b.columnas) {
			valido = true;
		}
		else {
			valido = false;
		}
		return valido;
	}
	//Metodo que valida las dimensiones de dos matrices para la multiplicacion
	public static boolean validarDim_mult (Matriz a, Matriz b) {
		boolean valido;
		if (a.columnas == b.filas) {
			valido = true; 
		}
		else {
			valido = false;
		}
		return valido;
	}
	
	//Metodo que suma dos matrices enteras
	public static MatrizInt sumaMat(MatrizInt a, MatrizInt b) {
		int i,j;
		
		MatrizInt sum = new MatrizInt(a.filas,a.columnas);
		for (i=0;i<a.filas;i++) {
			for (j=0;j<a.columnas;j++) {
				sum.arre[i][j] = a.arre[i][j] + b.arre[i][j];
			}
		}
		return sum;
	}
	
	//Metodo que suma una matriz entera con una flotante
	public static MatrizFlo sumaMat(MatrizInt a, MatrizFlo b)  {
		int i,j;
		
		MatrizFlo sum = new MatrizFlo(a.filas,a.columnas);
		for (i=0;i<a.filas;i++) {
			for (j=0;j<a.columnas;j++) {
				sum.arre[i][j] = a.arre[i][j] + b.arre[i][j];
			}
		}
		return sum;
	}
	
	//Metodo que suma dos matrices flotantes
	public static MatrizFlo sumaMat(MatrizFlo a, MatrizFlo b) {
		int i,j;
		
		MatrizFlo sum = new MatrizFlo(a.filas,a.columnas);
		for (i=0;i<a.filas;i++) {
			for (j=0;j<a.columnas;j++) {
				sum.arre[i][j] = a.arre[i][j] + b.arre[i][j];
			}
		}
		return sum;
	}
	
	//Metodo para realizar la resta de dos matrices enteros
	public static MatrizInt restaMat(MatrizInt a, MatrizInt b) {
		int i,j;
		
		MatrizInt resta = new MatrizInt(a.filas,a.columnas);
		for (i=0;i<a.filas;i++) {
			for (j=0;j<a.columnas;j++) {
				resta.arre[i][j] = a.arre[i][j] - b.arre[i][j];
			}
		}
		return resta;
	}
	
	//Metodo para realizar la resta de una matriz entera menos una matriz flotante
	public static MatrizFlo restaMat(MatrizInt a, MatrizFlo b) {
		int i,j;
		
		MatrizFlo resta = new MatrizFlo(a.filas,a.columnas);
		for (i=0;i<a.filas;i++) {
			for (j=0;j<a.columnas;j++) {
				resta.arre[i][j] = a.arre[i][j] - b.arre[i][j];
			}
		}
		return resta;
	}
	
	//Metodo para realizar la resta de una matriz flotante menos una matriz entera
	public static MatrizFlo restaMat(MatrizFlo a, MatrizInt b) {
		int i,j;
		
		MatrizFlo resta = new MatrizFlo(a.filas,a.columnas);
		for (i=0;i<a.filas;i++) {
			for (j=0;j<a.columnas;j++) {
				resta.arre[i][j] = a.arre[i][j] - b.arre[i][j];
			}
		}
		return resta;
	}
	//Metodo para realizar la resta de dos matrices flotantes
	public static MatrizFlo restaMat(MatrizFlo a, MatrizFlo b) {
		int i,j;
		
		MatrizFlo resta = new MatrizFlo(a.filas,a.columnas);
		for (i=0;i<a.filas;i++) {
			for (j=0;j<a.columnas;j++) {
				resta.arre[i][j] = a.arre[i][j] - b.arre[i][j];
			}
		}
		return resta;
	}
	
	//Metodo para realizar la multilpicacion de una matriz entera por un numero entero
	public static MatrizInt multEscalar(MatrizInt a, int b) {
		int i,j;
		
		MatrizInt m_escalar = new MatrizInt(a.filas,a.columnas);
		for (i=0;i<a.filas;i++) {
			for (j=0;j<a.columnas;j++) {
				m_escalar.arre[i][j] = a.arre[i][j]*b;
			}
		}
		return m_escalar;
	}
	
	//Metodo para realizar la multilpicacion de una matriz entera por un numero flotante
	public static MatrizFlo multEscalar(MatrizInt a, float b) {
		int i,j;
		
		MatrizFlo m_escalar = new MatrizFlo(a.filas,a.columnas);
		for (i=0;i<a.filas;i++) {
			for (j=0;j<a.columnas;j++) {
				m_escalar.arre[i][j] = a.arre[i][j]*b;
			}
		}
		return m_escalar;
	}
	
	//Metodo para realizar la multilpicacion de una matriz flotante por un numero entero
	public static MatrizFlo multEscalar(MatrizFlo a, int b) {
		int i,j;
		
		MatrizFlo m_escalar = new MatrizFlo(a.filas,a.columnas);
		for (i=0;i<a.filas;i++) {
			for (j=0;j<a.columnas;j++) {
				m_escalar.arre[i][j] = a.arre[i][j]*b;
			}
		}
		return m_escalar;
	}
	
	//Metodo para realizar la multilpicacion de una matriz flotante por un numero flotante
	public static MatrizFlo multEscalar(MatrizFlo a, float b) {
		int i,j;
		
		MatrizFlo m_escalar = new MatrizFlo(a.filas,a.columnas);
		for (i=0;i<a.filas;i++) {
			for (j=0;j<a.columnas;j++) {
				m_escalar.arre[i][j] = a.arre[i][j]*b;
			}
		}
		return m_escalar;
	}
	
	//Metodo para realizar la multilpicacion de dos matrices enteros
	public static MatrizInt multMatriz(MatrizInt a, MatrizInt b) {
		int i,j,k;
		
		MatrizInt multiplicacion = new MatrizInt(a.filas,b.columnas);
		for (i=0;i<a.filas;i++) {
			for (k=0;k<b.columnas;k++) {
					multiplicacion.arre[i][k] =0;
				for(j=0;j<a.columnas;j++) {
					multiplicacion.arre[i][k]+= a.arre[i][j]*b.arre[j][k];
				}
			}
		}
		return multiplicacion;
	}
	
	//Metodo para realizar la multilpicacion de una matriz entero por una matriz flotante
	public static MatrizFlo multMatriz(MatrizInt a, MatrizFlo b) {
		int i,j,k;
		
		MatrizFlo multiplicacion = new MatrizFlo(a.filas,b.columnas);
		for (i=0;i<a.filas;i++) {
			for (k=0;k<b.columnas;k++) {
					multiplicacion.arre[i][k] =0;
				for(j=0;j<a.columnas;j++) {
					multiplicacion.arre[i][k]+= a.arre[i][j]*b.arre[j][k];
				}
			}
		}
		return multiplicacion;
	}
	
	//Metodo para realizar la multilpicacion de una matriz flotante por una matriz entera
	public static MatrizFlo multMatriz(MatrizFlo a, MatrizInt b) {
		int i,j,k;
		
		MatrizFlo multiplicacion = new MatrizFlo(a.filas,b.columnas);
		for (i=0;i<a.filas;i++) {
			for (k=0;k<b.columnas;k++) {
					multiplicacion.arre[i][k] =0;
				for(j=0;j<a.columnas;j++) {
					multiplicacion.arre[i][k]+= a.arre[i][j]*b.arre[j][k];
				}
			}
		}
		return multiplicacion;
	}	
	//Metodo para realizar la multilpicacion de dos matrices flotantes
	public static MatrizFlo multMatriz(MatrizFlo a, MatrizFlo b) {
		int i,j,k;
		
		MatrizFlo multiplicacion = new MatrizFlo(a.filas,b.columnas);
		for (i=0;i<a.filas;i++) {
			for (k=0;k<b.columnas;k++) {
					multiplicacion.arre[i][k] =0;
				for(j=0;j<a.columnas;j++) {
					multiplicacion.arre[i][k]+= a.arre[i][j]*b.arre[j][k];
				}
			}
		}
		return multiplicacion;
	}
}
