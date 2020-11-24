import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class SampleTest {
	
class Node{
	int value;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
}


	public static void main(String[] args) {
		

		Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
		
        Map<String, Integer> result2 = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println(result2);

		
		
		
		List<Node> nodes = new ArrayList();		

		//Java 8 comparator
		nodes.sort(Comparator.comparing(Node::getValue)
                .thenComparing(Node::getName));
		
		
		
		
		
		/*
		 * An empty StringBuilder class contains the default 16 character capacity. If
		 * the number of the character increases from its current capacity, it increases
		 * the capacity by (oldcapacity*2)+2.
		 */		StringBuilder sb = new StringBuilder("CompileOnline");
		System.out.println(sb.capacity());
		sb= new StringBuilder(" ");
		System.out.println(sb.capacity());

		String ll="13213";
		Character.isDigit(ll.charAt(0));
		
		char[] ch= ll.toCharArray();
		
		
		
		
		
		
		int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12}; 
		
		
		//Sum Average
        OptionalDouble avg = Arrays.stream(numbers).average();
        int sum = Arrays.stream(numbers).sum();

        
        
        
	
		//The skip(n) method is an intermediate operation that discards the first n elements of a stream. 
		//The n parameter can't be negative, and if it's higher than the size of the stream, skip() returns an empty stream.


		

	
		System.out.println("0123456789ABCDEF".charAt(15%16));		
		System.out.println(Integer.parseInt("F", 16)+" "+Integer.toHexString(15));

		
		List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                "GeeksQuiz", "GeeksforGeeks","GFG","Geeks","Geeks"); 
		
		
		
		//Frequency > 1
		Set<String> collect  = words.stream()
		        .filter(word -> Collections.frequency(words, word) > 1)
		        .collect(Collectors.toSet());		
		System.out.println(collect);

		
		
		
		//Limit 9
		Set<String> collectLimit  = words.stream()
		        .filter(word -> Collections.frequency(words, word) > 1).limit(9)
		        .collect(Collectors.toSet());
		
		
		//Custom comparator
		Map<Node,Node> mp = new TreeMap<Node, Node>(new Comparator<Node>() {

			@Override
			public int compare(Node arg0, Node arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		
		Queue<Node> pq = new PriorityQueue(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		}
		);
		//Grouping By
        Map<String, Long> result =
        			words.parallelStream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String, Long> finalMap = new LinkedHashMap<>();
        
        Set<Entry<String, Long>> es=result.entrySet();
        Set<String> ks=result.keySet();
       result.put("jh", result.getOrDefault("h", (long) 545));    
        Iterator it=es.iterator();
        
        while(it.hasNext()) {
        	it.next();
        }

        //Sorting Map
		result.entrySet().stream()
        .sorted(Map.Entry.<String, Long>comparingByValue()
                .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		
		String[] str1 = {"abc", "", "bcd", "", "defg", "jk"};
		List<String> test=Arrays.asList(str1);

		List<String> strList = Arrays.asList("abc", "bbb", "bcd", "dd", "ee", "aab");
		List<String> strList1 = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		List<Integer> intList = Arrays.asList(1,2,3,4,5);

		//Reduce accumulator
		Optional<String> longestString = words.stream().parallel().reduce((word1, word2)-> word1.length() > word2.length() ? word1 : word2);		
		longestString.ifPresent(System.out::println); 
		Optional<String> longest = test.stream().parallel().reduce((word1, word2)-> (word1.compareTo(word2))>0 ? word1 : word2);		
		longest.ifPresent(System.out::println); 

		intList.stream().reduce((a,b)->a>b?a:b).ifPresent(System.out::println);

		OptionalInt result1=intList.stream().mapToInt(k->k*10).min();
		System.out.println(		result1.getAsInt());
		
		System.out.println(	("a"+"b") == "ab" ) ;

		////Predicate////////////////////////
		long count = strList.stream().filter(x -> x.startsWith("a")).count();
		System.out.println(count);
		
		strList.stream().sorted( (x,y)->(x.compareTo(y))).forEach(str -> System.out.println(str));;

		Predicate<Integer> pr = a -> (a > 18);
		System.out.println(pr.test(10));
		////////////////////////////

		//////Function/////////////////////
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining("++ "));
		System.out.println(G7Countries);
		
		Function<Integer, Double> half = a -> a / 2.0;
		System.out.println(half.apply(10));
		///////////////////////////////

		////////Consumer//////////////////////
		List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");
		cities.stream().forEach(str -> System.out.println(str));
		
		Consumer<Integer> display = a -> System.out.println(a);
		display.accept(10);
		///////////////////////////////////////

			
        /////Supplier////////////////////////////
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());
		//////////////////////////////////////

		Optional<String> reduced = strList1.stream().reduce((s1, s2) -> s1 + "#" + s2);

		reduced.ifPresent(System.out::println);
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		
		
		

	}

	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
	}

}
