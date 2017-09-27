package control;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Principal {
    
    public static void main(String args[]) throws IOException {
    	
    	String path = new Principal().getClass().getResource("Cep.dat").getPath();
    	String pathDois = new Principal().getClass().getResource("blocoOrdenado.txt").getPath();
    	
    	System.out.println("Digite a quantidade de Arquivos a ordenar:");
    	Scanner scan = new Scanner(System.in);
    	int quantidadeRegistros = scan.nextInt();
    	
    	ArrayList<Endereco> bloco = LeituraEscrita.leitor(path, quantidadeRegistros);
    	Collections.sort(bloco);
    	
    	String textoPronto = LeituraEscrita.quebraLinhas(bloco);
    	LeituraEscrita.escritor(pathDois, textoPronto);
    	
    	System.out.println(textoPronto);
    	
    }
    
}
