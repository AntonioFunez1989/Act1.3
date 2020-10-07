package tema1_ej2;

import java.io.File;
import java.io.IOException;

public class PrincipalProcess extends Thread {

	String directorio;
	String palabraBuscar;
	
	PrincipalProcess(String directorio, String palabraBuscar){
		
		this.directorio=directorio;
		this.palabraBuscar=palabraBuscar;
		   
	}
	
  
	public void run() {
	
		try {
			
			// HAGO UN PATH
			String buscarArch = System.getProperty(directorio);
			
			// METO EN UN FILE TODO LO QUE HAY EN ESE DORECTORIO
			File carpeta = new File(buscarArch);
					
			// EN ARRAY METEMOS LOS ELEMENTOS DEL DIRECTORIO
			String [] listado = carpeta.list();
				
					    for (int i=0; i< listado.length; i++) {
					
					    	File archivo = new File(listado[i]);
					    
					    	if(archivo.exists()) {
					    		WordFileReader wfr = new WordFileReader(null);
					    	}
					    }
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {

		
		
	}
}
