package AI;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

public class Layer {
    private final ArrayList<Neuronio> L;

    public Layer(){
        L = new ArrayList<>();
    }

    public ArrayList<Neuronio> state(){
        return this.L;
    }

    /**
     * Insere neurônios na camada
     * @param n - Neurônio a ser inserido na camada
     */
    public void inserirNeuronio(@NotNull Neuronio n){
        this.L.add(n);
    }
}
