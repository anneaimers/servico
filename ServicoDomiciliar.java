public class ServicoDomiciliar extends Servico{

    protected double distanciaKm;

    public ServicoDomiciliar(String descricao, double valorBase, double distanciaKm) {
        super(descricao, valorBase);
        this.distanciaKm = distanciaKm;
    }

    public double getDistanciaKm(){
        return distanciaKm;
    }

     @Override 
     public double calcularValor(){
        if (distanciaKm <= 10) {
            return super.calcularValor() + 15;
        } else {
            return super.calcularValor() + 30;
        }
     }

}
