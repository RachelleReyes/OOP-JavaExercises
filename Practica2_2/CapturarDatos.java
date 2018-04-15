import javax.swing.*; //Componente grafico
import java.util.*;
import java.lang.*;


//Clase que se usa para capturar datos
public class CapturarDatos{
	
	static String []opcion = {"CAPTURAR UNA MATRIZ","CAPTURAR MAS DE UNA MATRIZ","IMPRIMIR","TRANSPUESTA","SUMAR","RESTAR","MULTIPLICACION POR ESCALAR","MULTIPLICACION DE MATRICES","SALIR"}; 	
	static String []t_matriz = {"INT","FLOAT","SALIR"};
	static String []suma = {"ENTERO+ENTERO","ENTERO+FLOTANTE","FLOTANTE+FLOTANTE"}; 
	static String []resta = {"ENTERO-ENTERO","ENTERO-FLOTANTE","FLOTANTE-ENTERO","FLOTANTE-FLOTANTE"};
	static String []mult_escalar = {"ENTERO*ENTERO","ENTERO*FLOTANTE","FLOTANTE*ENTERO","FLOTANTE*FLOTANTE"}; 
	static String []multiplicacion = {"ENTERO*ENTERO","ENTERO*FLOTANTE","FLOTANTE*ENTERO","FLOTANTE*FLOTANTE"}; 
	
	//Metodo para desplegar la opcion de escoger si usuario desea capturar, imprimir o salir
	public static String eligeopcion() {
		String op;
		op = (String)(JOptionPane.showInputDialog(null,"Elige la opcion que deseas hacer","MENU", JOptionPane.QUESTION_MESSAGE, null, opcion,opcion[0]));
		return op;
	}
	
	//Metodo generico para la captura de int
	public static int capturar(String cadena,int x) {
		int valor;
		valor= Integer.parseInt(JOptionPane.showInputDialog(cadena + x));
		return valor;
	}
	
	//Metodo que pregunta al usuario la cantidad de matrices que desea capturar
	public static int cantidad_matriz() {
		int matriz;
		matriz = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de matriz que deseas capturar: "));
		return matriz;
	}
	
	//Metodo para desplegar la opcion de escoger el tipo de dato: int o float
	public static int tipomatriz() {
		int t_mat;
		t_mat = JOptionPane.showOptionDialog(null, "MATRIZ:","MENU", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, t_matriz,t_matriz[0]);
		return t_mat;
	}
	
	//Metodo para ingresar el numero de la matriz que se desea imprimir
	public static int nummatriz() {
		int n_matriz;
		n_matriz = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la matriz que deseas imprmir: (ingresar -1 para imprimir todas)" ));
		return n_matriz;
	}
	
	//Metodo para elegir una matriz
	public static int eligematriz(String tipo)	{
		int matriz;
		matriz = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la matriz " +tipo + ": "));
		return matriz;
	}

	//Metodo para mostrar un mensaje de error
	public static void mensajerror() {
		JOptionPane.showMessageDialog(null, "No se puede realizar esta operacion");
	}
	
	//Metodo para dar opciones al usuario que tipo matrices desea sumar
	public static String sumaopcion() {
		String op;
		op = (String)(JOptionPane.showInputDialog(null,"Elige el tipo de suma que deseas realizar","MENU", JOptionPane.QUESTION_MESSAGE, null, suma,suma[0]));
		return op;
	}
	
	//Metodo para dar opciones al usuario que tipo matrices desea restar
	public static String restaopcion() {
		String op;
		op = (String)(JOptionPane.showInputDialog(null,"Elige el tipo de resta que deseas realizar","MENU", JOptionPane.QUESTION_MESSAGE, null, resta,resta[0]));
		return op;
	}	
	
	//Metodo para dar opciones al usuario que tipo matrices desea multiplicar
	public static String multiplicacionopcion() {
		String op;
		op = (String)(JOptionPane.showInputDialog(null,"Elige el tipo de multiplicacion que deseas realizar","MENU", JOptionPane.QUESTION_MESSAGE, null, multiplicacion,multiplicacion[0]));
		return op;
	}
	
	//Metodo para dar opciones al usuario que tipo matriz desea multiplicar con un numero escalar
	public static String m_escalaropcion() {
		String op;
		op = (String)(JOptionPane.showInputDialog(null,"Elige el tipo de multiplicacion que deseas realizar (TIPO DE MATRIZ * TIPO DE NUMERO)","MENU", JOptionPane.QUESTION_MESSAGE, null, mult_escalar,mult_escalar[0]));
		return op;
	}
	
	//Metodo que pregunta por el numero escalar entero
	public static int numeroescalar_int() {
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero entero que deseas multiplicar: "));
		return numero;
	}
	
	//Metodo que pregunta por el numero escalar flotante
	public static float numeroescalar_float() {
		float numero;
		numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero entero que deseas multiplicar: "));
		return numero;
	}
	
}