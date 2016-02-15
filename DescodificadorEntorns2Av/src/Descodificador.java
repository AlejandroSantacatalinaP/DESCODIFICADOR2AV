
public class Descodificador {
	
		public static String mensaje="APUQTI OSEE  LIT OAM SUGPA OUQ EOCONCZO"; //Ponemos la oración a descodificar.
		public static String mensajeDescodificado=""; //Preparamos un string para descodificar la oración.
		public static String temporal=""; //Dejamos un string para los cambios.
		

		public static void main(String[] args){	

			mensajeDescodificado=mensaje.toLowerCase();
			
			for(int i=0;i<mensaje.length()-1;i+=2){   //Este for recorre de dos en dos el string mensaje.

				temporal=temporal+mensajeDescodificado.charAt(i+1)+mensajeDescodificado.charAt(i);
				
				if(i+3==mensajeDescodificado.length()){
					temporal=temporal+mensajeDescodificado.charAt(i+2);
				
				}
		}
			mensajeDescodificado=temporal; //Pasamos el string temporal al string definitivo.
			System.out.println(mensajeDescodificado); //Sacamos por pantalla el resultado.
			
		}
}
