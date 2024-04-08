package br.com.alura.comex;

public class ProdEletronico extends Produto {
    private int voltagem;
    private int potencia;

    public ProdEletronico(String nome, String descricao, double precoUnitario, int quantidade) {
        super(nome, descricao, precoUnitario, quantidade);
        this.voltagem = voltagem;
        this.potencia = potencia;
    }
    public int getVoltagem() {
        return voltagem;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void ImpressaoDadosProduto() {
        super.ImpressaoDadosProduto();
        System.out.println(":: Voltagem: " + voltagem);
        System.out.println(":: Potência: " + potencia);
    }
}
