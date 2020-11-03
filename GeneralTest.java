import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GeneralTest {
	
	public static int find(int num,int[] ar){
		
		if(num==ar[num]) {
			return num;
		}
		
		return ar[num]=find(ar[num],ar);
	}
	
	  static int[][] findPairsWithGivenDifference(int[] arr, int k) {
		    // your code goes here
		  
		  int[] ar = {3,2,4,3,3};
		  
		  find(1,ar);
		  
		    
		    Map<Integer,Integer> mp = new HashMap();
		    
		    for(int i=0;i<arr.length;i++){
		      
		      mp.put(arr[i],i);
		      
		    }
		    
		    int count=0;
		    Map result = new HashMap();
		    Map bad = new HashMap();
		for (int j = 0; j < arr.length; j++) {

			if(bad.containsKey(j))
				continue;
			
			if (mp.containsKey(arr[j] + k)) {
				int a=arr[j];
				int b= arr[mp.get(arr[j] + k)];
				System.out.println(a + " , " + b);
				if(a> b) {
					result.put(a, b);
				}else {
					result.put(b, a);
					}
				mp.remove(arr[j] + k);
				bad.put(j, arr[j] + k);
			} else if (mp.containsKey(arr[j] - k)) {
				int a=arr[j];
				int b= arr[mp.get(arr[j] - k)];
				System.out.println(a + " , " + b);
				if(a> b) {
					result.put(a, b);
				}else {
					result.put(b, a);
					}
				mp.remove(arr[j] - k);
				bad.put(j, arr[j] - k);

			}

		}
		
	   final int[][] res = new int[result.size()][2];
	   
	   Set entries = result.entrySet();
 

	   Iterator entriesIterator = entries.iterator();

	   int i = 0;
	   while(entriesIterator.hasNext()){
		    Map.Entry mapping = (Map.Entry) entriesIterator.next();

	    	res[i][0]=(int) mapping.getKey();
	    	res[i][1]=(int) mapping.getValue();
	    	i++;
	    }
	     		
	// System.out.print(Arrays.toString(res));
		    return res;
		    
		    
		  }

	
	public static void main(String[] args) throws InterruptedException{
		
		int[] arr1 = {1,5,11,7};
		 
		findPairsWithGivenDifference(arr1,4);
		
		String[] strings = {"ABCDABDCADCAB","AABCDA","ABCDZADC","ABCDBCA","ABCDABDCA"};
		char tmp='\0';
		Set<String> hs1 = new HashSet();
		
		String characters="ABCD";

		for (String st : strings) {
			hs1.add(st);
			 tmp = '\0';
			for (char ch : st.toCharArray()) {
				if(tmp==ch) {
					hs1.remove(st);
					break;
				}
				tmp=ch;
			}
		}
		

		
	}

	
}




