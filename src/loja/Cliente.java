package loja;

public class Cliente {
	private String nomeCliente;
	private String cpf;
	private String dataNascimento;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	public String getNomeCliente() {
		return nomeCliente;
	}
	public String getCpf() {
		return cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getRua() {
		return rua;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public String getCep() {
		return cep;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

}
