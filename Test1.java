import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
      
		/*
		 * Stream<String> stream = Files.lines(Paths.get("src/input")); stream =
		 * stream.parallel();
		 * Files.lines(Paths.get("src/input")).forEach(System.out::println);
		 * Files.lines(Paths.get("src/input")).parallel().forEachOrdered(System.out::
		 * println);
		 * 
		 * System.out.println(stream.isParallel());//
		 * forEach(s->System.out.println("Output:"+s));
		 */
		
		int[] arr= new int[10];
		

		
		PriorityQueue pq = new PriorityQueue(10,Collections.reverseOrder());
		for (int i = 0; i < 10; i++) {
			pq.add(i);
			arr[i] = 8;

		}
		
		System.out.println(arr[0]++);
		System.out.println(arr[0]);

		
		while(pq.size()>0) {
		System.out.print(pq.poll()+" ");
		}
		
		 Stream<String> stream = Files.lines(Paths.get("src/input")); 
		 
        List<Employee> eList = new ArrayList<Employee>();
            eList.add(new Employee("A", 200000000));
            eList.add(new Employee("B", 3000));
            eList.add(new Employee("C", 15002));
            eList.add(new Employee("D", 7856)); 
            eList.add(new Employee("E", 200));    
            
            System.out.println (Integer.toHexString(15));
		
            

            /***** Here We Are Creating A 'Sequential Stream' & Displaying The Result *****/
           long t1 = System.currentTimeMillis();   
            System.out.println("Sequential Stream Count?= " + eList.stream().filter(e -> e.getNumber() > 15000).count());
     
           long t2 = System.currentTimeMillis();
            System.out.println("Sequential Stream Time Taken?= " + (t2-t1) + "\n");
     
            /***** Here We Are Creating A 'Parallel Stream' & Displaying The Result *****/
            t1 = System.currentTimeMillis();        
            System.out.println("Parallel Stream Count?= " + eList.parallelStream().filter(e -> e.getNumber() > 15000).count());
     
            t2 = System.currentTimeMillis();
            System.out.println("Parallel Stream Time Taken?= " + (t2-t1));
		
            long t3 = System.currentTimeMillis();        
            eList.stream().forEach(a->System.out.println(a.getName()+a.getNumber()*536547646));
            long t4 = System.currentTimeMillis();
            System.out.println("Sequential Stream Time Taken?= " + (t4-t3));
        
           t1 = System.currentTimeMillis();        
       eList.parallelStream().forEach(a->System.out.println(a.getName()+a.getNumber()*536547646));
       t2 = System.currentTimeMillis();
       System.out.println("Parallel Stream Time Taken?= " + (t2-t1));
}
	}
