import javax.swing.*; //Componente grafico
import java.util.*;
import java.lang.String;

//Clase RFC
public class RFC
{
	public String nombre, apPaterno, apMaterno, fechaNac;
		
	//Constructor del rfc, recibe los cuatro parametros
	public RFC(String nombre, String apPaterno, String apMaterno, String fechaNac){
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.fechaNac = fechaNac;
		
		}

	//Metodo que busca vocales
	public boolean vocales (String cadena){
        char[] apellido = cadena.toCharArray();
		int resp = 0;
        for(int i = 0; i<cadena.length(); i++){
            char z = apellido[i];
            z = Character.toUpperCase(z);
            if (z=='A'||z=='E'||z=='I'||z=='O'||z=='U'){resp=1;} 
		}
       if(resp==0){return false;}
			else {return true;}
    }
	
	//Metodo que obtiene la letra vocal

	public char obtenervocal(String cadena){
        char[] apellido = cadena.toCharArray();
		char vocal = ' ';

		for(int i=0;i<cadena.length();i++){

			if(apellido[i]=='A' || apellido[i]=='E' || apellido[i]=='I' || apellido[i]=='O' || apellido[i]=='U')
				return apellido[i];
		}

		return apellido[0];
    }
	
	//Metodo que quita palabras de union
	public String quitarunion (String cadena)
	{
		cadena = cadena.replaceAll("DEL ","");
		cadena = cadena.replaceAll("DE ","");
		cadena = cadena.replaceAll("LAS ","");
		cadena = cadena.replaceAll("LA ","");
		cadena = cadena.replaceAll("LOS ","");
		cadena = cadena.replaceAll("DA ","");
		cadena = cadena.replaceAll("D ","");
		cadena = cadena.replaceAll("DES","");
		cadena = cadena.replaceAll("DU","");
		cadena = cadena.replaceAll("VON ","");
		cadena = cadena.replaceAll("VAN ","");
		cadena = cadena.replaceAll("VANDON ","");
		cadena = cadena.replaceAll("VANDER ","");
		cadena = cadena.replaceAll(" Y ","");
		cadena = cadena.replaceAll("'","");

		if(cadena.length()>4)
		{	
			if(cadena.substring(0,5).equals("MARIA") && cadena.length()>5){
				cadena = cadena.replaceAll("MARIA ","");
			} 
			if(cadena.substring(0,4).equals("JOSE") && cadena.length()>4){
				cadena = cadena.replaceAll("JOSE ","");
			} 
		}	
		return cadena;
	}
	
	//Metodo para validar palabras antisonantes
	public String antisionante (String letras)
	{
		if(letras.equals("CACA")||letras.equals("CACO")|| letras.equals("CAKA")||letras.equals("CAKO")||
		letras.equals("COGE")||letras.equals("COGI")||letras.equals("COJA")||letras.equals("COJE")||letras.equals("COJI")||
		letras.equals("COJO")||letras.equals("CULO")||letras.equals("CAGO")||letras.equals("FATO")||letras.equals("GUEI")||
		letras.equals("GUEY")||letras.equals("JOTO")||letras.equals("KACA")||letras.equals("KACO")||letras.equals("KAKA")||
		letras.equals("KAKO")||letras.equals("KOGE")||letras.equals("KOGI")||letras.equals("KOJA")||letras.equals("KOJE")||
		letras.equals("KOJI")||letras.equals("KOJO")||letras.equals("KULO")||letras.equals("MAME")||letras.equals("MAMO")||
		letras.equals("MEAR")||letras.equals("MEAS")||letras.equals("MEON")||letras.equals("MION")||letras.equals("MOCO")||
		letras.equals("MULA")||letras.equals("PEDA")||letras.equals("PEDO")||letras.equals("PENE")||letras.equals("PITO")||
		letras.equals("PUTA")||letras.equals("PUTO")||letras.equals("QULO")||letras.equals("RATA")||letras.equals("RUIN")){
		letras = letras.substring(0,3)+"X";
		}
		return letras;
	}
	
	//Metodo que sirve para calcular el RFC
	public String calcularRFC (String nombre, String apPaterno, String apMaterno, String fechaNac)
	{
		String rfc ="    ";

		apPaterno= (quitarunion(apPaterno.toUpperCase()));
		apMaterno=(quitarunion(apMaterno.toUpperCase()));
		nombre=(quitarunion(nombre.toUpperCase()));
		
		if(apPaterno.isEmpty() ==false &&apMaterno.isEmpty() ==false)
		{
			if(apPaterno.length()==2)
			{
				rfc = apPaterno.substring(0,1)+ apMaterno.substring(0,1) +nombre.substring(0,2);
			}
			else if(vocales(apPaterno)==true)
			{
				rfc = apPaterno.substring(0,1)+ obtenervocal(apPaterno.substring(1,apPaterno.length()))+apMaterno.substring(0,1) +nombre.substring(0,1);
			}
			else 
			{
				rfc = apPaterno.substring(0,1)+obtenervocal(apPaterno.substring(1,apPaterno.length()))+ apMaterno.substring(0,1) +nombre.substring(0,2);
			}
		}
		rfc = antisionante(rfc);
		rfc+= fechaNac.substring(2,4)+fechaNac.substring(5,7)+fechaNac.substring(8,10);

		return rfc;
	}
}