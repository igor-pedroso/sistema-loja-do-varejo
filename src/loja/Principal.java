package loja;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNomeCliente("joão");
		cliente1.setCpf("045");
		cliente1.setDataNascimento("130599");
		cliente1.setRua("sto antonio");
		cliente1.setBairro("iracema");
		cliente1.setCidade("caxias do sul");
		cliente1.setEstado("RS");
		cliente1.setCep("95059");

		System.out.println("nome do cliente" + cliente1.getNomeCliente());

		System.out.println("cpf do cliente" + cliente1.getCpf());

		System.out.println("Data de nascimento do cliente" + cliente1.getDataNascimento());

		System.out.println("rua do cliente" + cliente1.getRua());

		System.out.println("bairro do cliente" + cliente1.getBairro());

		System.out.println("cidade do cliente" + cliente1.getCidade());

		System.out.println("estado do cliente" + cliente1.getEstado());

		System.out.println("cep do cliente" + cliente1.getCep());

	}

}
