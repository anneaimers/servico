import java.util.ArrayList;

public class Orcamento {

    protected ArrayList<Servico> servicos;

    public Orcamento() {
        this.servicos = new ArrayList<>();
    }

    public void adicionarServico(Servico servico){
        servicos.add(servico);
    }
    
    public void listarServicos(){
        for (Servico servico : servicos) {
            System.out.println(servico.getDescricao());
            System.out.println(servico.calcularValor());
        }
    }

    public double calcularTotal() {
        double soma = 0;
        for (Servico servico : servicos) {
            soma += servico.calcularValor();
        }
        return soma;
    }

}
