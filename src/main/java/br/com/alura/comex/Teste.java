package br.com.alura.comex;

//Teste 2 Produtos

public class Teste {
    public static void main(String[] ags) {
        Produto produto1 = new Produto("Teclado Mêcanico G915");
        produto1.setDescricao("Teclado gamer bluetooth Serie G");
        produto1.setPrecoUnitatrio(800.00);
        produto1.setQuantidade(5);

        Produto produto2 = new Produto("Teclado Mêcanico G915");
        produto2.setDescricao("Teclado gamer bluetooth Serie G");
        produto2.setPrecoUnitatrio(800.00);
        produto2.setQuantidade(5);

        if (produto1 == produto2) {
            System.out.println("Os objetos são idênticos");
        } else {
            System.out.println("Os objetos possuem referências diferentes");
        }
    }
}
