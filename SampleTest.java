import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
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
		String st=null;
		System.out.println(st);
		
		
			//Java 8 comparator
		List<Node> nodes = new ArrayList();
				
				
		nodes.sort(Comparator.comparing(Node::getValue)
                .thenComparing(Node::getName));
		
		StringBuilder sb = new StringBuilder("CompileOnline");
		System.out.println(sb.capacity());
		sb= new StringBuilder(" ");
		System.out.println(sb.capacity());

		String ll="13213";
		Character.isDigit(ll.charAt(0));
		
		char[] ch= ll.toCharArray();
		
	
		
	
		System.out.println("0123456789ABCDEF".charAt(15%16));
		
		
		System.out.println(Integer.parseInt("F", 16)+" "+Integer.toHexString(15));

		
		List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                "GeeksQuiz", "GeeksforGeeks"); 
		
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
