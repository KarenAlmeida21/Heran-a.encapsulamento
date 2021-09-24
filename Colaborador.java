package br.com.zup;

public class Colaborador extends Pessoa{
    //
    //Considere, como outra subclasse da classe Pessoa, a classe Colaborador. Considere
    // que cada instância da classe Colaborador tem, para além dos atributos que caracterizam
    // a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (double) e imposto (double).
    //Implemente a classe Colaborador com métodos seletores e modificadores e um
    // método calcularSalario.
    //Escreva um programa de teste adequado para a classe Colaborador .

    private int codigo_setor;
    private double salario_base;
    private double imposto;

    public int getCodigo_setor() {
        return codigo_setor;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public void setCodigo_setor(int codigo_setor) {
        this.codigo_setor = codigo_setor;
    }

    public Colaborador(String nome, String endereço, String telefone, int codigo_setor, double salario_base, double imposto) {
        super(nome, endereço, telefone);
        this.codigo_setor = codigo_setor;
        this.salario_base=salario_base;
        this.imposto=imposto;

    }
    public double calcular_salario(){
     double salario_liquido =   salario_base-imposto;
     return salario_liquido;
    }

}
