import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ejecutable {

	public static void main(String[] args) {

		String linea = null;
		File archivo = new File("archivo.txt");
		
		try(FileReader fr = new FileReader(archivo); BufferedReader br = new BufferedReader(fr)){
			while((linea = br.readLine()) !=null){
				System.out.println(linea);
			}
		}
// Esto lo que hace es que todo lo que contenga el parentesis del try lo cierra al finalizar, tanto si va bien como
// si da error. Con lo que te ahorras muchas lineas de código intentando cerrar todo
 
// La forma tradicional era:
		
//		try {
//			// Apertura del fichero y creacion de BufferedReader para poder
//			// hacer una lectura comoda (disponer del metodo readLine()).
//			archivo = new File("archivo.txt");
//			fr = new FileReader(archivo);
//			br = new BufferedReader(fr);
//
//			// Lectura del fichero
//			String linea;
//			while ((linea = br.readLine()) != null) {
//				System.out.println(linea);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			// En el finally cerramos el fichero, para asegurarnos
//			// que se cierra tanto si todo va bien como si salta
//			// una excepcion.
//			try {
//				if (null != fr) {
//					fr.close();
//				}
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//	}

	
	// String linea = "colorOjos:rojo#colorPelo:rubio#tipoPelo:rizado"; 
	 String[] separado = linea.split("#"); for (int i = 0; i < separado.length; i++) {
	 String[] propiedad = separado[i].split(":"); if
	 (propiedad[0].equals("colorOjos")) {
	 System.out.println("Los ojos son de color: " + propiedad[1]); } else if
	 (propiedad[0].equals("colorPelo")) {
	 System.out.println("Los pelos son de color: " + propiedad[1]); } }
	}
