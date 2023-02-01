import java.sql.SQLException;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException, ClassNotFoundException, SQLException {
		GestorBiblioteca gB = new GestorBiblioteca();
		gB.run();
		//gb viene de GestorBliblioteca
	}
}
