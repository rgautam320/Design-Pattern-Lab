package Phone_OS;

public class Tizen implements OS 
{
	@Override
	public void name() {
		System.out.println("<--Tizen-->");
	}

	@Override
	public void specs() {
		System.out.println("Electronic Devices' OS.");

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
		System.out.println("Product of Samsung.");

	}

	@Override
	public void messaging() {
		System.out.println("Provides Messages app for messaging.");

	}

	@Override
	public void written_language() {
		System.out.println("Written Language: HTML5, C, C++.");

	}

	@Override
	public void kernel_type() {
		System.out.println("Kernel Type: Monolithic.");

	}

	@Override
	public void working_state() {
		System.out.println("Working State: Current");

	}

}
