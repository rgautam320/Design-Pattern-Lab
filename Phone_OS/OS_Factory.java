package Phone_OS;

public class OS_Factory {
	public OS getInstance(String str) {
		if (str.equals("Google")) {
			return new Android();
		}

		if (str.equals("Apple")) {
			return new IOS();
		}

		if (str.equals("KaiOS")) {
			return new KaiOS();
		}

		if (str.equals("Microsoft")) {
			return new Windows();
		}

		if (str.equals("Samsung")) {
			return new Tizen();
		}

		return null;
	}
}
