package br.com.Alura;

import java.util.*;
import java.util.Map.Entry;

public class TesteMap {

	public static void main(String[] args) {

		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		// ...

//        nomesParaIdade.keySet().forEach(idade  ->{
//        	System.out.println("Nome: " + idade);
//        });
//        nomesParaIdade.values().forEach(nome -> {
//        	System.out.println("Idade: " + nome);
//        });

		Set<String> chaves = nomesParaIdade.keySet();
		for (String nome : chaves) {
			System.out.println(nome);
		}

		Collection<Integer> valores = nomesParaIdade.values();
		for (Integer idade : valores) {
			System.out.println(idade);
		}

		
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		System.out.println(associacoes);
		for (Entry<String, Integer> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		System.out.println("------------------");
		nomesParaIdade.entrySet().forEach(d -> {
			System.out.println(d);
		});

	}
}
