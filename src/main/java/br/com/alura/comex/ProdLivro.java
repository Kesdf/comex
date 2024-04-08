package br.com.alura.comex;

public class ProdLivro extends Produto implements Identificavel{
    private String isbn;
    private int totalpaginas;

    public ProdLivro(String nome, String descricao, double precoUnitario, int quantidade) {
        super(nome, descricao, precoUnitario, quantidade);
        this.isbn = isbn;
        this.totalpaginas = totalpaginas;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getTotalpaginas() {
        return totalpaginas;
    }
    public void setTotalpaginas(int totalpaginas) {
        this.totalpaginas = totalpaginas;
    }

    @Override
    public void ImpressaoDadosProduto() {
        super.ImpressaoDadosProduto();
        System.out.println(":: ISBN:: " + isbn);
        System.out.println(":: Total de Páginas: " + totalpaginas);
    }

    @Override
    public String identificar() {
        return "Nome do Livro: " + this.getNome() + " - ISBN: " + isbn;
    }
}
