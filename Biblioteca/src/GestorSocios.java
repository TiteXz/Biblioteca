import java.sql.SQLException;
import java.util.Scanner;

public class GestorSocios {
	public void run() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		int opcion_menu;
		GestorBBDD gbd = new GestorBBDD();
		Socio socio = new Socio();
		
	
		
		do {
			Menu.mostrarMenuLibros();
			opcion_menu = Integer.parseInt(sc.nextLine());
			
		switch (opcion_menu) {
		case Menu.INSERTAR_SOCIO:
			gbd.insertarSocio(FormularioDeDatos.pedirDatosSocio(sc));;
			break;
		case Menu.ELIMINAR_SOCIO:
			gbd.eliminarSocio(FormularioDeDatos.pedirIdSocio(sc));;
			break;
		case Menu.MODIFICAR_SOCIO:
			FormularioDeDatos.modificarDatosSocio(socio, sc);
			break;
		case Menu.VER_SOCIOS:
			gbd.getSocio(FormularioDeDatos.pedirIdSocio(sc));
			break;
		default:
			System.out.println("Opcion incorrecta!");
		}
		
			}while(opcion_menu != Menu.SALIR);
	
	sc.close();
	}
}
