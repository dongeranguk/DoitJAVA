package exersice.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExam {
	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("신짱아", 1, null));
		personList.add(new Person("신짱구", 5, null));
		personList.add(new Person("봉미선", 30, "010-1111-5555"));
		personList.add(new Person("신형만", 35, "010-4444-5555"));
		
		Person person = personList.stream()
				.filter(p -> p.getAge() == 5)
				.findFirst().get();
		
		System.out.println("이름 : " + person.getName() + ", 나이 : " + person.getAge());
	}
}
