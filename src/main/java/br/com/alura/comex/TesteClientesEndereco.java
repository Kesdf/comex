package br.com.alura.comex;

public class TesteClientesEndereco {
    public static void  main(String[] args) {

        //Cadastro Endereço
        Endereco enderecocliente1 = new Endereco("Jardim Satélite");
        enderecocliente1.setCidade("São José dos Campos");
        enderecocliente1.setComplemento("casa amarela");
        enderecocliente1.setEstado("SP");
        enderecocliente1.setRua("Rua Boituva");
        enderecocliente1.setNumero(52);

        Clientes cliente1 = new Clientes("Joey Tribbiani");
        cliente1.setCpf("568.996.370-49");
        cliente1.setEmail("joey.tb@gg.com");
        cliente1.setProfissao("jardineiro");
        cliente1.setTelefone("12 96452 4548");
        cliente1.setEndereco(enderecocliente1);

        System.out.println("Dados do Cliente:");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("E-mail: " + cliente1.getEmail());
        System.out.println("Profissão: " + cliente1.getProfissao());
        System.out.println("Telefone: " + cliente1.getTelefone());

        System.out.println("\nEndereço do Cliente:");
        System.out.println("Bairro: " + cliente1.endereco.getBairro());
        System.out.println("Cidade: " + cliente1.endereco.getCidade());
        System.out.println("Complemento: " + cliente1.getEndereco().getComplemento());
        System.out.println("Estado: " + cliente1.getEndereco().getEstado());
        System.out.println("Rua: " + cliente1.getEndereco().getRua());
        System.out.println("Número: " + cliente1.getEndereco().getNumero());

    }
}
