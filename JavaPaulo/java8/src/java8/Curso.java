

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Curso {
	
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
//		cursos.sort(Comparator.comparing(Curso::getAlunos));
//		cursos.forEach(System.out::println);
		
		cursos.stream().filter(c -> c.getAlunos() > 100)
//		.forEach(c -> System.out.println(c.getNome()));
		.forEach(System.out::println);
		
		cursos.stream().filter(c -> c.getAlunos() > 100)
		//.map(c -> c.getAlunos()).forEach(System.out::println);
		.map(c -> c.getAlunos()).forEach(c -> System.out.println(c));
		
		
		int sum = cursos.stream().filter(c -> c.getAlunos() > 100)
		.mapToInt(c -> c.getAlunos()).sum();
		
		System.out.println(sum);
		
		System.out.println("----------");
		
//		Optional<Curso> optional = cursos.stream()
//		.filter(c -> c.getAlunos() > 100)
//		.findAny();
		
		cursos.stream()
		.filter(c -> c.getAlunos() > 100)
		.findAny().ifPresent(c -> System.out.println(c.getNome()));;
		
		System.out.println("----------");
		
		cursos = cursos.stream()
		.filter(c -> c.getAlunos() > 100)
		.collect(Collectors.toList());
		System.out.println(cursos);
		System.out.println("----------");
		
		Map mapa = cursos
				.stream()
				.filter(c -> c.getAlunos() > 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		System.out.println(mapa);
		
//		System.out.println("----------");
//		
//		OptionalDouble med = cursos.stream()
//	    .mapToInt(c -> c.getAlunos())
//	    .average();//média
//				
//				System.out.println(med);
		
//		List<Curso> stream = cursos.stream()
//				   .filter(c -> c.getAlunos() > 50)
//				   .collect(Collectors.toList());
		
		
		
//		System.out.println("----------");
//		 Optional<Object> alura = cursos.stream()
//		   .filter(c -> c.getAlunos() > 50).findFirst().map(t -> t.getNome());
//		 System.out.println(alura);
		
		//optional.ifPresent(c -> System.out.println(c.getNome()));
//		System.out.println(optional.orElse(null));
		
		
//		//Stream<Curso> teste = cursos.stream().filter(c -> c.getAlunos() > 100);
//		Stream<String> nomes = cursos.stream().map(Curso::getNome);
//		nomes.forEach(System.out::println);
				
		
		
	}

	private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}


	