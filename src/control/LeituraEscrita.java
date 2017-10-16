package br.cefet;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LeituraEscrita {
	
	public static ArrayList leitor(Scanner scanner, int quantidadeRegistros) throws IOException {
		String linha = "";
		String arrayLinha[] = null;
		ArrayList<Endereco> bloco = new ArrayList<Endereco>();
		int quantLinhas = 0;
		
		while (quantLinhas < quantidadeRegistros) {
			if (scanner.hasNext()) {
				linha = scanner.next();
			}else {
				break;
			}
			bloco.add(new Endereco(
					linha.substring(0,71), 
					linha.substring(72,143), 
					linha.substring(144,215), 
					linha.substring(216,287), 
					linha.substring(288,290), 
					linha.substring(290,299)));
			quantLinhas ++;
			
		}
		return bloco;
    	}
	
	public static String quebraLinhas(ArrayList<Endereco> bloco) {
		String texto = "";
		for (int i = 0; i < bloco.size(); i++) {
			texto += bloco.get(i) + "\r\n";
		}
		return texto;
	}
	
    	public static void escritor(String pathDois, String textoPronto) throws IOException {
		FileWriter arq = new FileWriter(pathDois,true);
		PrintWriter gravarArq = new PrintWriter(arq);
		gravarArq.print(textoPronto);
		arq.close();
	}
	
}
