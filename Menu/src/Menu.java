import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	//METODO QUE IMPRIME LAS OPCIONES QUE TENEMOS EN EL MENU
	public static void printMenu() {
		
		System.out.println("\n****** MENU *******\n");
		System.out.println("1. Opcion 1\n"
				+ "2. Opcion 2\n"
				+ "3. Opcion 3\n"
				+ "4. Salir\n");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int opcion; // GUARDAMOS LA OPCION DEL USUARIO
		
		while (!salir) {

			printMenu();
			try {
				System.out.print("Elije una opcion: ");
				opcion = sc.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("Aqui se ejecuta la opcion 1");
					break;
				case 2:
					System.out.println("Aqui se ejecuta la opcion 2");
					break;
				case 3:
					System.out.println("Aqui se ejecuta la opcion 3");
					break;
				case 4:
					salir = true;
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Error, elije una opcion del 1 al 4");
				sc.next();
			}
		}
	}
}
