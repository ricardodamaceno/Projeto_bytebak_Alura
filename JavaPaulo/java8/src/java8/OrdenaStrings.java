

import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Comparator.*;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavra = new ArrayList<>();

		palavra.add("Ricardooooooooooooooooooo");
		palavra.add("Damascenooooooo");
		palavra.add("Oliveira");

		//palavra.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		//palavra.sort(Comparator.comparing(s -> s.length()));
		palavra.sort(Comparator.comparing(String::length));
		
		
		System.out.println(palavra);

		System.out.println("-----------");

		//palavra.forEach(t -> System.out.println(t)); /*lambda*/
		palavra.forEach(System.out::println); /*método reference*/
		
		System.out.println("-----------");
		
		Consumer<String> impressor =  System.out::println;
		palavra.forEach(impressor);

		System.out.println("-----------");
		 
		//new Thread(() -> System.out.println("Executando um Runnable")).start();
		
		
//		palavra.sort(Comparator.comparing(s -> s.length()));
//		palavra.sort(Comparator.comparing(String::length));
//		palavra.sort(comparing(String::length));
		palavra.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(palavra);
	}

}
