import javax.swing.*; //Componente grafico
import java.util.*;
import java.lang.*;

//Clase padre llamada Matriz
public class UsarMatrices{
	
	//Metodo principal
	public static void main(String[] args) {
		//Utilizacion de la clase ArrayList para generar arreglos dinamicos
		ArrayList<MatrizInt> entero = new ArrayList<MatrizInt>();
		ArrayList<MatrizFlo> flotante = new ArrayList<MatrizFlo>();			

		try {
			nuevaCaptura(entero, flotante);	
		} catch(NullPointerException e){}		
			
	} // END MAIN	

	//Metodo que genera matrices
	static void nuevaCaptura(ArrayList<MatrizInt> entero, ArrayList<MatrizFlo> flotante) {

		int fil,col, t_mat=-1,i=-1,f=-1,i2=0,f2=0,n1,n2,num_matriz,contador=0,numero=0;
		String op = " ",suma_op = " ",resta_op = " ",multescalar_op="",multiplicacion_op="";
		float numero_f=0;

		//Ciclo que despliega la ventana de menu
		while(op.equals("SALIR")== false) {
			op = CapturarDatos.eligeopcion();

			//Comparacion si se eligio la opcion de Capturar o Imprimir
			if(op.equals("CAPTURAR UNA MATRIZ")==true) { //Captura 
				t_mat = CapturarDatos.tipomatriz();
				
				if(t_mat==0) {//Condicion si el usuario eligio el tipo int
					i++;
					
					//Capturas en ventanas
					fil = CapturarDatos.capturar("Cantidad de filas de la matriz: ",i);
					col = CapturarDatos.capturar("Cantidad de columnas de la matriz: ",i);
					
					//Instancia de la matriz int
					MatrizInt m1 = new MatrizInt(fil,col);
					m1.int_imprimir("Matriz Entero "+i);
					//Agrega la matriz en el arreglo
					entero.add(i,m1);
				}
				else if(t_mat==1) {//Condicion si el usuario eligio el tipo float
					f++;
			
					//Captura en ventanas
					fil = CapturarDatos.capturar("Cantidad de filas de la matriz: ",f);
					col = CapturarDatos.capturar("Cantidad de columnas de la matriz: ",f);
					
					//Instancia de la matriz float
					MatrizFlo m2 = new MatrizFlo(fil,col);
					m2.float_imprimir("Matriz Flotante "+f);
					//Agrega la matriz en el arreglo
					flotante.add(f,m2);
				}
			}
			
			if(op.equals("CAPTURAR MAS DE UNA MATRIZ")==true) {//Captura
				contador =0;
				num_matriz = CapturarDatos.cantidad_matriz();
				
				while(contador<num_matriz){
					t_mat = CapturarDatos.tipomatriz();
					
					if(t_mat==0) {//Condicion si el usuario eligio el tipo int
						i++;
						
						//Capturas en ventanas
						fil = CapturarDatos.capturar("Cantidad de filas de la matriz: ",i);
						col = CapturarDatos.capturar("Cantidad de columnas de la matriz: ",i);
						
						//Instancia de la matriz int
						MatrizInt m1 = new MatrizInt(fil,col);
						m1.int_imprimir("Matriz Entero "+i);
						//Agrega la matriz en el arreglo
						entero.add(i,m1);
		
					}
					else if(t_mat==1) {//Condicion si el usuario eligio el tipo float
						f++;
						
						//Captura en ventanas
						fil = CapturarDatos.capturar("Cantidad de filas de la matriz: ",f);
						col = CapturarDatos.capturar("Cantidad de columnas de la matriz: ",f);
						
						//Instancia de la matriz float
						MatrizFlo m2 = new MatrizFlo(fil,col);
						m2.float_imprimir("Matriz Flotante "+f);
						//Agrega la matriz en el arreglo
						flotante.add(f,m2);
					}
					contador++;
				}
			}
			else if(op.equals("IMPRIMIR")==true && (i>=0 || f>=0)) {//Imprimir
				t_mat = CapturarDatos.tipomatriz();
				
				//Condicion si eligio imprimir las matrices generadas de tipo int
				if(t_mat==0 && i>=0) {
					i2 = CapturarDatos.nummatriz();
					//Condicion si eligio imprimir todas las matrices
					if(i2==-1) {
						for(i2=0; i2<=i;i2++) {
							//Obtiene la matriz del arreglo
							MatrizInt mi = entero.get(i2);
							//Imprime la matriz float
							mi.int_imprimir("Matriz Entero "+i2);
						}
					}
					else {
						//Obtiene la matriz del arreglo
						MatrizInt mi = entero.get(i2);
						//Imprime la matriz float
						mi.int_imprimir("Matriz Entero "+i2);
					}
					
				}
				//Condicion si eligio imprimir las matrices generadas de tipo float
				else if(t_mat==1 && f>=0) {
					f2 = CapturarDatos.nummatriz();
					
					//Condicion si eligio imprimir todas las matrices
					if(f2==-1) {
						for(f2=0; f2<=f;f2++) {
							//Obtiene la matriz del arreglo
							MatrizFlo mf = flotante.get(f2);
							//Imprime la matriz float
							mf.float_imprimir("Matriz Flotante "+f2);
						}
					}
					else {
						//Obtiene la matriz del arreglo
						MatrizFlo mf = flotante.get(f2);
						//Imprime la matriz flotante
						mf.float_imprimir("Matriz Flotante "+f2);
					}
				}
			}
			//Condicion si eligio la opcion de generar matriz transpuesta
			else if(op.equals("TRANSPUESTA")==true) {//TRANSPUESTA
				t_mat = CapturarDatos.tipomatriz();
				//Condicion si eligio matriz entero
				if(t_mat==0 && i>=0) {
					n1 = CapturarDatos.eligematriz("entero");
		
					MatrizInt mi, mi_transpuesta;
					mi = entero.get(n1);
					if(mi.validarDim_matriz()==true) {
						mi_transpuesta= mi.transpuesta();
						mi.int_imprimir("Matriz entero " +n1);
						mi_transpuesta.int_imprimir("Matriz Transpuesta");
					}
					else {
						CapturarDatos.mensajerror();						
					}
				}
				//Condicion si eligio matriz flotante
				else if(t_mat==1 && f>=0) {
					n1 = CapturarDatos.eligematriz("flotante");
		
					MatrizFlo mf, mf_transpuesta;
					mf = flotante.get(n1);
					
					if(mf.validarDim_matriz()==true) {
						mf_transpuesta= mf.transpuesta();
						mf.float_imprimir("Matriz Flotante "+n1);
						mf_transpuesta.float_imprimir("Matriz Transpuesta");
					}
					else { 
						CapturarDatos.mensajerror();						
					}
					
				}
			}
			
			//Condicion si eligio la opcion de realizar la suma de matrices
			else if(op.equals("SUMAR")) {
				suma_op = CapturarDatos.sumaopcion();
				//Condicion si eligio sumar dos matrices enteros
				if(suma_op.equals("ENTERO+ENTERO") && i>=1) {
					n1 = CapturarDatos.eligematriz("entero");
					n2 = CapturarDatos.eligematriz("entero");
					
					MatrizInt m1, m2, suma;
					m1 = entero.get(n1);
					m2 = entero.get(n2);
					
					//Valida las dimensiones antes de sumar e imprimir las matrices
					if(OperacionesMatrices.validarDim(m1,m2) == true)
					{
						suma = OperacionesMatrices.sumaMat(m1,m2);
						m1.int_imprimir("M1: Matriz entero "+n1);
						m2.int_imprimir("M2: Matriz entero "+n2);
						suma.int_imprimir("Suma: M1+M2");
					}
					else {
						CapturarDatos.mensajerror();
					}
				}
				//Condicion si eligio sumar una matriz entera con una matriz flotante
				else if(suma_op.equals("ENTERO+FLOTANTE") && i>=0 && f>=0) {
					n1 = CapturarDatos.eligematriz("entero");
					n2 = CapturarDatos.eligematriz("flotante");
					
					MatrizInt m1;
					MatrizFlo m2, suma;
					m1 = entero.get(n1);
					m2 = flotante.get(n2);
					
					//Valida las dimensiones antes de sumar e imprimir las matrices
					if(OperacionesMatrices.validarDim(m1,m2) == true)
					{
						suma = OperacionesMatrices.sumaMat(m1,m2);
						m1.int_imprimir("M1: Matriz entero "+n1);
						m2.float_imprimir("M2: Matriz flotante "+n2);
						suma.float_imprimir("Suma: M1+M2");
					}
					else {
						CapturarDatos.mensajerror();
					}
				}
				
				//Condicion si eligio sumar dos matrices flotantes
				else if(suma_op.equals("FLOTANTE+FLOTANTE") && f>=1) {
					n1 = CapturarDatos.eligematriz("flotante");
					n2 = CapturarDatos.eligematriz("flotante");
					
					MatrizFlo m1, m2, suma;
					m1 = flotante.get(n1);
					m2 = flotante.get(n2);
					
					//Valida las dimensiones antes de sumar e imprimir las matrices
					if(OperacionesMatrices.validarDim(m1,m2) == true)
					{
						suma = OperacionesMatrices.sumaMat(m1,m2);
						m1.float_imprimir("M1: Matriz flotante "+n1);
						m2.float_imprimir("M2: Matriz flotante "+n2);
						suma.float_imprimir("Suma: M1+M2");
					}
					else {
						CapturarDatos.mensajerror();
					}
				}
			}	
			
			//Condicion si eligio la opcion de realizar la resta de matrices
			else if(op.equals("RESTAR")) { //RESTA
				resta_op = CapturarDatos.restaopcion();
				
				//Condicion si eligio restar dos matrices enteros
				if(resta_op.equals("ENTERO-ENTERO") && i>=1) {
					n1 = CapturarDatos.eligematriz("entero");
					n2 = CapturarDatos.eligematriz("entero");
					
					MatrizInt m1, m2, resta;
					m1 = entero.get(n1);
					m2 = entero.get(n2);
					//Valida las dimensiones antes de restar e imprimir las matrices
					if(OperacionesMatrices.validarDim(m1,m2) == true)
					{
						resta = OperacionesMatrices.restaMat(m1,m2);
						m1.int_imprimir("M1: Matriz entero "+n1);
						m2.int_imprimir("M2: Matriz entero "+n2);
						resta.int_imprimir("Resta: M1-M2");
					}
					else {
						CapturarDatos.mensajerror();
					}
				}
				
				//Condicion si eligio restar una matriz entera menos una flotante
				else if(resta_op.equals("ENTERO-FLOTANTE") && i>=0 && f>=0) {
					n1 = CapturarDatos.eligematriz("entero");
					n2 = CapturarDatos.eligematriz("flotante");
					
					MatrizInt m1;
					MatrizFlo m2, resta;
					m1 = entero.get(n1);
					m2 = flotante.get(n2);
					//Valida las dimensiones antes de restar e imprimir las matrices
					if(OperacionesMatrices.validarDim(m1,m2) == true)
					{
						resta = OperacionesMatrices.restaMat(m1,m2);
						m1.int_imprimir("M1: Matriz entero "+n1);
						m2.float_imprimir("M2: Matriz flotante "+n2);
						resta.float_imprimir("Resta: M1-M2");
					}
					else {
						CapturarDatos.mensajerror();
					}
				}
				//Condicion si eligio restar una matriz flotante menos una entera
				else if(resta_op.equals("FLOTANTE-ENTERO") && i>=0 && f>=0) {
					n1 = CapturarDatos.eligematriz("flotante");
					n2 = CapturarDatos.eligematriz("entero");
					
					MatrizInt m2;
					MatrizFlo m1, resta;
					m1 = flotante.get(n1);
					m2 = entero.get(n2);
					//Valida las dimensiones antes de restar e imprimir las matrices
					if(OperacionesMatrices.validarDim(m1,m2) == true)
					{
						resta = OperacionesMatrices.restaMat(m1,m2);
						m1.float_imprimir("M1: Matriz flotante "+n1);
						m2.int_imprimir("M2: Matriz entero "+n2);
						resta.float_imprimir("Resta: M1-M2");
					}
					else {
						CapturarDatos.mensajerror();
					}
				}
				//Condicion si eligio restar una matriz flotante menos una flotante
				else if(resta_op.equals("FLOTANTE-FLOTANTE") && f>=1) {
					n1 = CapturarDatos.eligematriz("flotante");
					n2 = CapturarDatos.eligematriz("flotante");
					
					MatrizFlo m1, m2, resta;
					m1 = flotante.get(n1);
					m2 = flotante.get(n2);
					//Valida las dimensiones antes de restar e imprimir las matrices
					if(OperacionesMatrices.validarDim(m1,m2) == true)
					{
						resta = OperacionesMatrices.restaMat(m1,m2);
						m1.float_imprimir("M1: Matriz flotante "+n1);
						m2.float_imprimir("M2: Matriz flotante "+n2);
						resta.float_imprimir("Resta: M1-M2");
					}
					else {
						CapturarDatos.mensajerror();
					}
				}
			}
			//Condicion si se eligio la multiplicacion de una matriz por escalar
			else if(op.equals("MULTIPLICACION POR ESCALAR")) { //MULTIPLICACION POR ESCALAR
				multescalar_op = CapturarDatos.m_escalaropcion();
				//Condicion si se eligio multiplicar una matriz entera por un numero escalar
				if(multescalar_op.equals("ENTERO*ENTERO") && i>=0) {
					n1 = CapturarDatos.eligematriz("entero");
					numero = CapturarDatos.numeroescalar_int();
					
					MatrizInt m1, multiplicacion_escalar;
					m1 = entero.get(n1);
		
					multiplicacion_escalar = OperacionesMatrices.multEscalar(m1,numero);
					m1.int_imprimir("Matriz Entero " +n1+" por "+numero);
					multiplicacion_escalar.int_imprimir("Multiplicacion Escalar M*"+numero);
				}
				//Condicion si se eligio multiplicar una matriz entera por un numero escalar
				if(multescalar_op.equals("ENTERO*FLOTANTE") && i>=0 && f>=0) {
					n1 =CapturarDatos. eligematriz("entero");
					numero_f = CapturarDatos.numeroescalar_float();
					
					MatrizInt m1;
					MatrizFlo multiplicacion_escalar;
					m1 = entero.get(n1);
		
					multiplicacion_escalar = OperacionesMatrices.multEscalar(m1,numero_f);
					m1.int_imprimir("Matriz Entero " +n1+" por "+numero);
					multiplicacion_escalar.float_imprimir("Multiplicacion Escalar M*"+numero);
				}
				//Condicion si se eligio multiplicar una matriz flotante por un numero escalar
				if(multescalar_op.equals("FLOTANTE*ENTERO") && i>=0) {
					n1 = CapturarDatos.eligematriz("flotante");
					numero = CapturarDatos.numeroescalar_int();
					
					MatrizFlo m1,multiplicacion_escalar;
					m1 = flotante.get(n1);
		
					multiplicacion_escalar = OperacionesMatrices.multEscalar(m1,numero);
					m1.float_imprimir("Matriz Flotante " +n1+" por "+numero);
					multiplicacion_escalar.float_imprimir("Multiplicacion Escalar M*"+numero);
				}
				//Condicion si se eligio multiplicar una matriz flotante por un numero escalar
				if(multescalar_op.equals("FLOTANTE*FLOTANTE") && i>=0) {
					n1 = CapturarDatos.eligematriz("flotante");
					numero_f = CapturarDatos.numeroescalar_float();
					
					MatrizFlo m1, multiplicacion_escalar;
					m1 = flotante.get(n1);
		
					multiplicacion_escalar = OperacionesMatrices.multEscalar(m1,numero_f);
					m1.float_imprimir("Matriz Flotante " +n1+" por "+numero);
					multiplicacion_escalar.float_imprimir("Multiplicacion Escalar M*"+numero);
				}
			}
			//Condicion si se eligio multiplicar dos matrices
			else if(op.equals("MULTIPLICACION DE MATRICES")) {
				multiplicacion_op = CapturarDatos.multiplicacionopcion();
				//Condicion si se eligio multiplicar dos matrices enteras
				if(multiplicacion_op.equals("ENTERO*ENTERO") && i>=1) {
					n1 = CapturarDatos.eligematriz("entero");
					n2 = CapturarDatos.eligematriz("entero");
					
					MatrizInt m1, m2, multiplicacion;
					m1 = entero.get(n1);
					m2 = entero.get(n2);
					
					if(OperacionesMatrices.validarDim_mult(m1,m2) == true)
					{
						multiplicacion = OperacionesMatrices.multMatriz(m1,m2);
						m1.int_imprimir("M1: Matriz entero "+n1);
						m2.int_imprimir("M2: Matriz entero "+n2);
						multiplicacion.int_imprimir("Multiplicacion: M1*M2");
					}
					else {
						CapturarDatos.mensajerror();
					}
				}
				//Condicion si se eligio multiplicar una matriz entera por una flotante
				else if(multiplicacion_op.equals("ENTERO*FLOTANTE") && i>=0 && f>=0) {
					n1 = CapturarDatos.eligematriz("entero");
					n2 = CapturarDatos.eligematriz("flotante");
					
					MatrizInt m1;
					MatrizFlo m2, multiplicacion;
					m1 = entero.get(n1);
					m2 = flotante.get(n2);
					
					if(OperacionesMatrices.validarDim_mult(m1,m2) == true)
					{
						multiplicacion = OperacionesMatrices.multMatriz(m1,m2);
						m1.int_imprimir("M1: Matriz entero "+n1);
						m2.float_imprimir("M2: Matriz flotante "+n2);
						multiplicacion.float_imprimir("Multiplicacion: M1*M2");
					}
					else {
						CapturarDatos.mensajerror();
					}
				}
				//Condicion si se eligio multiplicar una matriz flotante por una entera
				else if(multiplicacion_op.equals("FLOTANTE*ENTERO") && i>=0 && f>=0) {
					n1 = CapturarDatos.eligematriz("flotante");
					n2 = CapturarDatos.eligematriz("entero");
					
					MatrizInt m2;
					MatrizFlo m1, multiplicacion;
					m1 = flotante.get(n1);
					m2 = entero.get(n2);
					
					if(OperacionesMatrices.validarDim_mult(m1,m2) == true)
					{
						multiplicacion = OperacionesMatrices.multMatriz(m1,m2);
						m1.float_imprimir("M1: Matriz flotante "+n1);
						m2.int_imprimir("M2: Matriz entero "+n2);
						multiplicacion.float_imprimir("Multiplicacion: M1*M2");
					}
					else {
						CapturarDatos.mensajerror();
					}
				}
				//Condicion si se eligio multiplicar una matriz flotante por una flotante
				else if(multiplicacion_op.equals("FLOTANTE*FLOTANTE") && f>=1) {
					n1 = CapturarDatos.eligematriz("flotante");
					n2 = CapturarDatos.eligematriz("flotante");
					
					MatrizFlo m1, m2, multiplicacion;
					m1 = flotante.get(n1);
					m2 = flotante.get(n2);
					
					if(OperacionesMatrices.validarDim_mult(m1,m2) == true)
					{
						multiplicacion = OperacionesMatrices.multMatriz(m1,m2);
						m1.float_imprimir("M1: Matriz flotante "+n1);
						m2.float_imprimir("M2: Matriz flotante "+n2);
						multiplicacion.float_imprimir("Multiplicacion: M1*M2");
					}
					else {
						CapturarDatos.mensajerror();
					}
				}
			}	
		}
	}

}

