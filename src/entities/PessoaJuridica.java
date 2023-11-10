package entities;

public class PessoaJuridica extends Pessoa {
    private int nuneroDeFuncionarios;
    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String name, Double rendaAnual, int nuneroDeFuncionarios) {
        super(name, rendaAnual);
        this.nuneroDeFuncionarios = nuneroDeFuncionarios;
    }

    @Override
    public double rendaFinal(double rendaAnual) {
        if (nuneroDeFuncionarios > 10){
            rendaAnual -= rendaAnual * 0.14;
        }
        else {
            rendaAnual -= rendaAnual * 0.16;
        }
        return rendaAnual;
    }
}
