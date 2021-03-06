class Bird {
	public String reproduction = "egg";
	public String outerCovering = "feather";
	public String name = "bird";

	public void flyUp() {
		System.out.println("Flying up...");
	}
	public void flyDown() {
		System.out.println("Flying down...");
	}
}

class Eagle extends Bird {
	public String name = "eagle";
	public int lifespan = 15;
		public void flyUp() {
		System.out.println("Flying up... eagle");
	}
	public void flyDown() {
		System.out.println("Flying down...eagle");
	}
}


class TestEagle {
	public static void main(String[] args) {		
		Eagle myEagle = new Eagle();

		System.out.println("Name: " + myEagle.name); 			System.out.println("Reproduction: " + myEagle.reproduction);
		System.out.println("Outer covering: " + myEagle.outerCovering);
		System.out.println("Lifespan: " + myEagle.lifespan); 		
		myEagle.flyUp();
		myEagle.flyDown(); 		
	}
}