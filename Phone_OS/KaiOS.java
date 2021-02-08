package Phone_OS;

public class KaiOS implements OS
{
	@Override
	public void name() {
		System.out.println("<--KaiOS-->");
	}
	
	@Override
	public void specs()
	{
		System.out.println("Emerging OS.");
	}

	@Override
	public void secure() {
		System.out.println("Moderately Secured OS.");
		
	}
	@Override
	public void source() {
		System.out.println("Source Model: Open Source.");

	}

	@Override
	public void developer() {
		System.out.println("Product of KaiOS Technologies.");
		
	}

	@Override
	public void messaging() {
		System.out.println("Provide inbuilt messaging app.");
		
	}
	
	@Override
	public void written_language() {
		System.out.println("Written Language: HTML, CSS, JavaScript.");
		
	}
	
	@Override
	public void kernel_type() {
		System.out.println("Kernel Type: Monolithic");
		
	}
	
	@Override
	public void working_state() {
		System.out.println("Working State: Current");
		
	}
}
