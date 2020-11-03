
@FunctionalInterface
public interface TestInterface {
	
	public void test();

	strictfp default  void test2() {
		System.out.println("TestInterface : Hi I am in test2");
		
	}
	
	
	
	public static void test3() {
		System.out.println("TestInterface : Hi I am in test3");
	}

}
