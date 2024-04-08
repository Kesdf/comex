package br.com.alura.comex;

public class Clientes implements Identificavel{
    private String nome;
    private String cpf;
    private String email;
    private String profissao;
    private String telefone;
    Endereco endereco;

    public Clientes(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return  nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String identificar() {
        return "Cliente: " + nome + " CPF: " + cpf;
    }
}
