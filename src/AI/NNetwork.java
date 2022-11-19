package AI;

public class NNetwork {
    private final Layer entrada;
    private final Layer oculta;
    private final Layer saida;

    public NNetwork(){
        this.entrada = new Layer();
        this.oculta = new Layer();
        this.saida = new Layer();
    }

    public void init(int x1, int x2){
        Neuronio o = new Neuronio(x1, x2);
        o.W(2,3); //atribui pesos aleatórios
        entrada.inserirNeuronio(o);
        //Adiciona neurônios da camada oculta
        for(int i=0;i<2;i++){
            oculta.inserirNeuronio(new Neuronio(entrada.state().get(0).sinal(),entrada.state().get(1).sinal()));
        }
    }
}
