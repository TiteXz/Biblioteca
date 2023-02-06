import java.sql.SQLException;
import java.util.Scanner;

public class GestorSocios {
	public static void run(Scanner sc) throws ClassNotFoundException, SQLException {
		int opcion_menu;
		GestorBBDD gbd = new GestorBBDD();
		Socio socio = new Socio();
		
	
		
	do {
			Menu.mostrarMenuSocios();
			opcion_menu = Integer.parseInt(sc.nextLine());
			
		switch (opcion_menu) {
		case Menu.INSERTAR_SOCIO:
			gbd.conectar();
			gbd.insertarSocio(FormularioDeDatos.pedirDatosSocio(sc));;
			gbd.cerrar();
			break;
		case Menu.ELIMINAR_SOCIO:
			gbd.conectar();
			gbd.eliminarSocio(FormularioDeDatos.pedirIdSocio(sc));;
			gbd.cerrar();
			break;
		case Menu.MODIFICAR_SOCIO:
			gbd.conectar();
			FormularioDeDatos.modificarDatosSocio(socio, sc);
			gbd.cerrar();
			break;
		case Menu.VER_SOCIOS:
			gbd.conectar();
			gbd.getSocio(FormularioDeDatos.pedirIdSocio(sc));
			gbd.cerrar();
			break;
		default:
			System.out.println("Opcion incorrecta!");
		}
		
			
	}while(opcion_menu !=0);
	sc.close();
	}
}
