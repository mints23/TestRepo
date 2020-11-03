import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ClassChild extends ClassParent{

	
	
	public static void main(String[] args) throws InterruptedException {
		test();
		TestInterface.test3();

		new ClassChild().test2();
		
		List<String> strList = new ArrayList<String>();
        strList.add("An");
        strList.add("example");
        strList.add("string");
        // joining with comma as delimiter
        String finalStr = String.join(",", strList);
        
        System.out.print(finalStr);
        
        int [] arr= null;
        
        TreeSet ts = new TreeSet();
        HashSet hs = new HashSet();
        hs.iterator();
        Object ob= new Object();
        synchronized(Thread.currentThread()){
        	ob.wait();
        	
        }

	}
	
	private int abcd;

	@Override
	void sum(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}
