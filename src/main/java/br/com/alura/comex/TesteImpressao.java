package br.com.alura.comex;

public class TesteImpressao {
    public static void main(String[] args) {
        Produto livro = new Produto("As Crônicas de Nárnia");
        livro.setDescricao("Edição de luxo - Completa");
        livro.setPrecoUnitatrio(300.00);

        // Comando de Impressão de Dados
        livro.ImpressaoDadosProduto();
    }
}
