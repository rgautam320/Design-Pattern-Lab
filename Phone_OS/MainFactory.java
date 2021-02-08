package Phone_OS;

import java.util.Scanner;

public class MainFactory {

	public static void main(String[] args) {
		OS_Factory myOS = new OS_Factory();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("<--- Select by Developer --->");
		System.out.println("1. Apple");
		System.out.println("2. Google");
		System.out.println("3. Microsoft");
		System.out.println("4. KaiOS");
		System.out.println("5. Samsung");
		System.out.print("Enter your choice: ");
		
		String choice = scanner.nextLine();
		scanner.close();
		
		OS obj = myOS.getInstance(choice);

		obj.name();
		obj.specs();
		obj.secure();
		obj.developer();
		obj.messaging();
		obj.source();
		obj.written_language();
		obj.kernel_type();
		obj.working_state();

	}

}
