package java.eight.start.Collectors;

import java.eight.start.anonymousinterface.Person;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class CollectorDemo {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("abc", "def"), new Person("abc", "the"),
				new Person("chandresh", "singh"));

		Map<String, List<Person>> groupedMap = list.stream().collect(Collectors.groupingBy(Person::getFirstName));
		System.out.println(groupedMap.get("abc"));

		System.out.println("printing timezones");

		Map<String, Long> timezone = Arrays.asList(TimeZone.getAvailableIDs()).stream().filter(s -> s.indexOf("/") > 0)
				.collect(Collectors.groupingBy((String s) -> s, Collectors.counting()));
		System.out.println(timezone);

		Map<String, Long> timezone1 = Arrays.asList(TimeZone.getAvailableIDs()).stream().filter(s -> s.indexOf("/") > 0)
				.collect(Collectors.groupingBy((String s) -> s, Collectors.counting()));

	}

}
