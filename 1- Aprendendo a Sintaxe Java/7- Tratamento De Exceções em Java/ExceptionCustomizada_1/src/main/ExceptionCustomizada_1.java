package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class ExceptionCustomizada_1 {

	public static void main(String[] args) {
		String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo: ");
		
		imprimirArquivoConsole(nomeDoArquivo);
		System.out.println("Com exception ou não o programa continua...");
	}
	
	public static void imprimirArquivoConsole(String nomeArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeArquivo);
            String linha = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(linha);
                bw.newLine();
                linha = br.readLine();
            } while (linha != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaArquivoException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
            //e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }
    }
	
	public static BufferedReader lerArquivo (String nomeArquivo) throws ImpossivelAberturaArquivoException {
		
		File arquivo = new File(nomeArquivo);
		
		try {
			return new BufferedReader(new FileReader(nomeArquivo));
		} catch (FileNotFoundException e) {
			throw new ImpossivelAberturaArquivoException(arquivo.getName(), arquivo.getPath());
		}
		
	}
	

}
