package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("curso-java-io2");
//		Writer wsr = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(wsr);		
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter("curso-java-io2"));
		
		//PrintStream ps = new PrintStream("curso-java-io2");
		
		PrintWriter pw = new PrintWriter("curso-java-io2");		
		
		
		pw.println("aquivo par aprender java.io no curso alura que será de grande valia");
		pw.println();
		pw.println();
		pw.println();
		pw.println("Finalizando nosso teste");
		
		pw.close();
	}

}
