package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class ExceptionMain {

	public static void main(String[] args) {
		
		String nomeArquivo = "a-bela-e-a-fera.txt";
		
		try {
			imprimirArquivoNoConsole(nomeArquivo);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! Entre em contato com o suporte!");
			e.printStackTrace();
		}
		finally {
			System.out.println("Fim");
		}
	}
	public static void imprimirArquivoNoConsole(String nomeArquivo) throws IOException {
		
		File file = new File(nomeArquivo);
		
		BufferedReader br = new BufferedReader(new FileReader(file.getName()));
		String linha = br.readLine();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		do {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		} while(linha != null);
		
		bw.flush();
		br.close();
		
	}

}
