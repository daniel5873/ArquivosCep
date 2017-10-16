package br.cefet;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    
    public static void main(String args[]) throws IOException {
    	
    	String path = new Principal().getClass().getResource("Cep.dat").getPath();
    	String pathDois = new Principal().getClass().getResource("blocoOrdenado.txt").getPath();
    	
    	PrintWriter writer = new PrintWriter(pathDois);
    	writer.print("");
    	writer.close();
    	
    	System.out.println("Digite a quantidade de registros que deseja ordenar:");
    	Scanner scan = new Scanner(System.in);
    	int quantidadeRegistros = scan.nextInt();
    	Scanner scanner = new Scanner(new FileReader(path)).useDelimiter("\\n");
    	String textoPronto = null;
    	
    	while(scanner.hasNext()) {
    		ArrayList<Endereco> bloco = LeituraEscrita.leitor(scanner, quantidadeRegistros);
        	Collections.sort(bloco);
        	textoPronto = LeituraEscrita.quebraLinhas(bloco);
        	LeituraEscrita.escritor(pathDois, textoPronto);
    	}
    	
    }
    
}
