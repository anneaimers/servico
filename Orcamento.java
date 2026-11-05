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

    public double calcularTotal(){
        double soma = 0;
        if (servicos.isEmpty()) {
            return 0;
        } else {
            for (Servico servico : servicos) {
            soma = soma + servico.calcularValor();
        }
        return soma;
        }
    }

}
