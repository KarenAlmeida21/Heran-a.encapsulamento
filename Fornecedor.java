package br.com.zup;

public class Fornecedor extends Pessoa {
    // //Considere, como subclasse da classe Pessoa
    //        //(desenvolvida no item anterior) a classe Fornecedor.
    //        // Considere que cada instância da classe Fornecedor tem,
    //        // para além dos atributos que caracterizam a classe Pessoa,
    //        // os atributos valorCredito
    //        // (correspondente ao crédito máximo atribuído ao fornecedor)
    //        // e valorDivida (montante da dívida para com o fornecedor).
    //        //Implemente na classe Fornecedor, para além dos usuais métodos seletores
    //        // e modificadores, um método obterSaldo() que devolve a diferença entre os
    //        // valores dos atributos valorCredito e valorDivida.
    //        //Depois de implementada a classe Fornecedor,
    //        // crie um programa de teste adequado que lhe permita verificar o funcionamento
    //        // dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.
    private double valor_credito;
    private double valor_divida;


    public void setValor_credito(double valor_credito) {
        this.valor_credito = valor_credito;
    }

    public double getValor_credito() {
        return valor_credito;
    }

    public void setValor_divida(double valor_divida) {
        this.valor_divida = valor_divida;
    }

    public double getValor_divida() {
        return valor_divida;
    }

    public Fornecedor(String nome, String endereço, String telefone, double valor_credito, double valor_divida) {
        super(nome, endereço, telefone);
        this.valor_credito = valor_credito;
        this.valor_divida = valor_divida;
    }

    public double obter_saldo  (){
        double saldo= valor_credito - valor_divida;
        return saldo;
    }
}
