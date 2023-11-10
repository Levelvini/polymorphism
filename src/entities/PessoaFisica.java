package entities;

public class PessoaFisica extends Pessoa {
    private  double gastosComSaude;
    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String name, Double rendaAnual, double gastosComSaude) {
        super(name, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double rendaFinal(double rendaAnual) {
        if (rendaAnual <= 20000.00){
            rendaAnual -= (rendaAnual * 0.15) - (gastosComSaude - 0.50);
        }else if (rendaAnual >= 20000.00){
            rendaAnual-= (rendaAnual * 0.25) - (gastosComSaude - 0.50);
        }
        return rendaAnual;
    }
}
