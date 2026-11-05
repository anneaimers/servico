public class App {
    public static void main(String[] args) throws Exception {

    Servico comum = new Servico("geral", 150);
    Servico dom = new ServicoDomiciliar("luz na sala", 150, 20);
    Servico dom2 = new ServicoDomiciliar("fiacao do quarto", 150, 5);
    Servico urg = new ServicoUrgente("encanamento", 150);

    Orcamento o = new Orcamento();

    o.adicionarServico(comum);
    o.adicionarServico(urg);
    o.adicionarServico(dom);
    o.adicionarServico(dom2);

    o.listarServicos();

    System.out.println(o.calcularTotal());














    }
}
