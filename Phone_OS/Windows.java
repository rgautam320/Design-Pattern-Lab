package Phone_OS;

public class Windows implements OS 
{
	@Override
	public void name() {
		System.out.println("<--Windows-->");
	}
	
	@Override
	public void specs() {
		System.out.println("I am about to die.");
	}

	@Override
	public void secure() {
		System.out.println("Not so Secured.");

	}
	@Override
	public void source() {
		System.out.println("Source Model: Closed Source.");

	}

	@Override
	public void developer() {
		System.out.println("Product of Microsoft.");

	}

	@Override
	public void messaging() {
		System.out.println("User needs to download separate app for messaging.");

	}
	
	@Override
	public void written_language() {
		System.out.println("Written Language: C, C++.");
		
	}
	
	@Override
	public void kernel_type() {
		System.out.println("Kernel Type: Hybrid.");
		
	}
	
	@Override
	public void working_state() {
		System.out.println("Working State: Discontinued");
		
	}
}
