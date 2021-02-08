package Phone_OS;

public class IOS implements OS
{
	@Override
	public void name() {
		System.out.println("<--IOS-->");
	}
	
	@Override
	public void specs()
	{
		System.out.println("Most secure phone OS.");
	}

	@Override
	public void secure() {
		System.out.println("Most Secured Phone.");
		
	}
	@Override
	public void source() {
		System.out.println("Source Model: Closed Source.");

	}

	@Override
	public void developer() {
		System.out.println("Product of Apple.");
		
	}

	@Override
	public void messaging() {
		System.out.println("Provides iMessage for messaging.");
		
	}
	
	@Override
	public void written_language() {
		System.out.println("Written Language: C, C++, Swift.");
		
	}
	
	@Override
	public void kernel_type() {
		System.out.println("Kernel Type: Hybrid");
		
	}
	
	@Override
	public void working_state() {
		System.out.println("Working State: Current");
		
	}
}
