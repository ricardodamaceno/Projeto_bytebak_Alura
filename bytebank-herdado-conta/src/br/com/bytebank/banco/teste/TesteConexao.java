package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conexao;

public class TesteConexao {

    public static void main(String[] args) {
    	
    	try(Conexao conexao = new Conexao() ){
    	    conexao.leDados();
    	} catch(IllegalStateException ex){
    	    System.out.println("Deu erro na conexão");
    	}
    	
    	
    	
    	
    	
    	
    	
    	

//    	Conexao con = null;
//    	try{
//    	    con = new Conexao();
//    	    con.leDados();
//    	    con.fecha();
//    	} catch(IllegalStateException ex){
//    	    System.out.println("Deu erro na conexão");
//    	} finally {
//    	    con.fecha();
//    	}
    }
}