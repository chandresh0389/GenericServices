package eight.start.stream;

import java.util.Arrays;
import java.util.List;

public class SampleStreams {
	 public  static int sum=0;
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3,4);
		int  sum1 = list.stream().filter(i -> i % 2 == 0).mapToInt(i->i*i).sum();
        System.out.println(sum1);
		
        
        list.stream().filter(i -> i % 2 == 0).forEach(i -> {
            i=i*i;
            t(i);
            System.out.println(i);
		});
		
		System.out.println("Final "+sum);
		
		

	}
	
	
	public static void t(int i){
		sum=sum+i;
	}

}
