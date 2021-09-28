package br.com.zup;

public class Administrador extends Colaborador{
    ////Implemente a classe Administrador como subclasse da classe Colaborador.
    //        // ]Um determinado administrador tem como atributos, para além dos atributos
    //        // da classe Pessoa e da classe Colaborador, o atributo ajudaDeCusto (double).
    //        // Note que deverá redefinir na classe Administrador o método herdado calcularSalario
    //        // (o salário de um administrador é equivalente ao salário de um empregado
    //        // usual acrescido das ajuda de custo).
    //        //Escreva um programa de teste adequado para esta classe.
    private double ajuda_custo;

    public Administrador(String nome, String endereço, String telefone, int codigo_setor, double salario_base, double imposto, double ajuda_custo) {
        super(nome, endereço, telefone, codigo_setor, salario_base, imposto);
        this.ajuda_custo = ajuda_custo;
    }

    public double getAjuda_custo() {
        return ajuda_custo;
    }

    public void setAjuda_custo(double ajuda_custo) {
        this.ajuda_custo = ajuda_custo;
    }

    @Override
    public double calcular_salario() {
        double salario_liquido= (this.getSalario_base() - this.getImposto() ) + this.ajuda_custo;
        return salario_liquido;
    }
}
