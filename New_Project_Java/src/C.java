
 class C {  

	public static void main(String[] args) { // It is method hiding but not overriding  -- Static method
	
		System.out.println("Parent main");

	}

}
 
 class D extends C  // Inheritence
 {
		public static void main(String[] args) {  // It is method hiding but not overriding

			
			System.out.println("Child main");

		}

 }

 
 // for static methods overloading and inheritance concepts are applicable
 // but overriding concepts are not applicable but instead of overriding  methods hiding concept is applicable.