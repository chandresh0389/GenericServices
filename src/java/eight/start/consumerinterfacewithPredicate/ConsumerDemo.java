package java.eight.start.consumerinterfacewithPredicate;

import java.eight.start.Printer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("as", "df");

		Consumer<String> c = (String o) -> {
			System.out.println(">> " + o);
		};
		
		list.forEach(c);

		list.forEach(str -> {
			System.out.println("+++" + str);
			Printer.staticmetod();
		});
		
		System.out.println("now we know about functional interface and lambda expressin littlebit NOW ITS TIME FOR PREDICATE");
		
		List<Integer> l = new LinkedList<Integer>(Arrays.asList(1,2,3,4));
		
		l.removeIf(i->i%2==0);
		
		l.removeIf(i->{return i%2==0;});
		System.out.println(l);
	}

}
