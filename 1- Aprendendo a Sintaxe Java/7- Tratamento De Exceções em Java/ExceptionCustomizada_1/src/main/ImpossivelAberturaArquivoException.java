package main;

public class ImpossivelAberturaArquivoException extends Exception {
	private String nomeArquivo;
	private String diretorio;
	
	public ImpossivelAberturaArquivoException () {
		// contrutor vazio
	}
	public ImpossivelAberturaArquivoException (String nomeArquivo, String diretorio) {
		super("O arquivo " + nomeArquivo + " não foi encontrado no diretório");
		this.nomeArquivo = nomeArquivo;
		this.diretorio = diretorio;
	}
}
