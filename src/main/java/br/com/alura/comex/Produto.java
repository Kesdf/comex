package br.com.alura.comex;

//Criação da Classe     Produto

public class Produto {
    private String nome;
    private String descricao;
    private double precoUnitatrio;
    private int quantidade;


    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitatrio() {
        return precoUnitatrio;
    }

    public void setPrecoUnitatrio(double precoUnitatrio) {
        this.precoUnitatrio = precoUnitatrio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Comportamento de Impressão de Dados

    public void ImpressaoDadosProduto() {
        System.out.println(">>>Dados do Produto");
        System.out.println(":: Nome: " + nome);
        System.out.println(":: Descrição: " + descricao);
        System.out.println(":: Preço Unitario: R$ " + precoUnitatrio);

    }

    // Solicitação de Nome
    public Produto(String nome, String descricao, double precoUnitario, int quantidade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto não pode ser nulo ou vazio.");
        }
    }
}