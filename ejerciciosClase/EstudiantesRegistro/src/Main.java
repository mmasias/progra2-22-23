import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		String time;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el nombre del estudiante");
		name = input.nextLine();
		
		System.out.println("Ingresa la hora en la que ingresó");
		time = input.nextLine();
		
		System.out.println("Hola estudiante " + name);
		System.out.println("Hora registrada " + time);
		
		input.close();
	}
	
}
