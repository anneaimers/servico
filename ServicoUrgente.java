public class ServicoUrgente extends Servico{

    public ServicoUrgente(String descricao, double valorBase) {
        super(descricao, valorBase);
    }

    @Override
    public double calcularValor() {
        return super.calcularValor() * 1.3;
    }

    

}
