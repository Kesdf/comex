package br.com.alura.comex;

import java.io.InputStream;
import java.util.InputMismatchException;

public class Scanner {
    public Scanner(InputStream in) {

    }

    public static void main(String[] args) {

        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o código do produto");
            int codProduto  = leitura.nextInt();
            System.out.println("Id do Produto: " + codProduto);

        } catch (InputMismatchException e) {
            System.out.println("Valor digitado inválido");
        }
    }
        private int nextInt() {
        return 0;
    }
}
