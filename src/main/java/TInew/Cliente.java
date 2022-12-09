package TInew;

public class Cliente {

	//CRIAR ATRIBUTOS DO CLIENTE DO TIPO PRIVATE//
	
	private String cpf; 
	private String nome;
	private String telefone;
	private String escolhaDeCompra;
	
	//GERAR GET E SET//
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	public String getEscolhaDeCompra() {
		return escolhaDeCompra;
	}
	public void setEscolhaDeCompra(String escolhaDeCompra) {
		this.escolhaDeCompra = escolhaDeCompra;
	}
	
	
}
