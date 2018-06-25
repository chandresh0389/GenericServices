package java.eight.start.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 23, 34, 12, 45, 65, 784, 2);
		list.stream().filter(i -> i % 2 == 1).forEach(i -> System.out.println(i));

		System.out.println("Another way of irterating list using streams");
		Stream s = list.stream().filter(p -> {
			System.out.println("filter is called on"+p);
			return p % 2 == 1;
		});
		
		 System.out.println("The pipeline is created ..... calling terminal operation");
		
		s.forEach(i->System.out.println(i));
		
		Stream s2 = list.stream().filter(p -> {
			System.out.println("filter is called on"+p);
			return p % 2 == 1;
		});
		
		Optional<Integer> result= s2.findFirst();
		
		System.out.println("----"+result);

	}
	
	

}
