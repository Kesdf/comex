package br.com.alura.comex;

public class Endereco {
    private String Bairro;
    private String Cidade;
    private String Complemento;
    private String Estado;
    private String Rua;
    private int Numero;

    public Endereco(String nome){
        this.Bairro = nome;
    }
    public String getBairro() {
        return  Bairro;
    }
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getComplemento() {
        return Complemento;
    }
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getEstado() {
        return Estado;
    }
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getRua() {
        return Rua;
    }
    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public int getNumero() {
        return Numero;
    }
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
}
