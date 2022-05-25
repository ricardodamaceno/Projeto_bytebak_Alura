package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteReescrita {

	public static void main(String[] args) throws IOException {
		
		//Socket s = new Socket();
		
		
		InputStream fis = /*s.getInputStream();*/ /*System.in;*/ new FileInputStream("curso-java-io2");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = /*s.getOutputStream();*/ /*System.out;*/ new FileOutputStream("reescrita");
		Writer wsr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(wsr);
		
				
		String linha = br.readLine();
		

		
		while (linha != null && !linha.isEmpty()) {
					
			
			bw.write(linha);
			bw.newLine();
			bw.flush();
			
			linha = br.readLine();
		}
		
		bw.close();
		br.close();
	}

}
