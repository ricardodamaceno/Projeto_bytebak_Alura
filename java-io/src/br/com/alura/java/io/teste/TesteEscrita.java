package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("curso-java-io2");
		Writer wsr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(wsr);		
		
		bw.write("aquivo par aprender java.io no curso alura que será de grande valia");
		bw.newLine();
		bw.newLine();
		bw.write("Finalizando o teste");
		
		bw.close();
	}

}
