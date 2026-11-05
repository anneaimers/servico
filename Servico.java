public class Servico {

    protected String descricao;
    protected double valorBase;

    public Servico(String descricao, double valorBase) {
        this.descricao = descricao;
        this.valorBase = valorBase;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getValorBase(){
        return valorBase;
    }

    public double calcularValor(){
        return valorBase + 10;
    }

}
