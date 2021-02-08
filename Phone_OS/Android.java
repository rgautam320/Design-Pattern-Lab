package Phone_OS;

public class Android implements OS {
	@Override
	public void name() {
		System.out.println("<--Android-->");
	}
	
	@Override
	public void specs() {
		System.out.println("Most used phone OS.");
	}

	@Override
	public void secure() {
		System.out.println("Moderately Secured.");

	}

	@Override
	public void source() {
		System.out.println("Source Model: Open Source.");

	}

	@Override
	public void developer() {
		System.out.println("Product of Google.");

	}

	@Override
	public void messaging() {
		System.out.println("Provides Message app for messaging.");

	}

	@Override
	public void written_language() {
		System.out.println("Written Language: Java, C, C++.");
		
	}

	@Override
	public void kernel_type() {
		System.out.println("Kernel Type: Linux");
		
	}

	@Override
	public void working_state() {
		System.out.println("Working State: Current");
		
	}
}
