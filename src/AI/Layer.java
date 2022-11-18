package AI;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

public class Layer {
    private final ArrayList<Neuronio> L;

    public Layer(){
        L = new ArrayList<>();
    }

    /**
     * Insere neurônios na camada
     * @param n - Neurônio a ser inserido na camada
     */
    public void inserirNeuronio(@NotNull Neuronio n){
        this.L.add(n);
    }

    /**
     * Função que calcula o v, que considera os pesos das entradas
     * @param n - Neurônio
     * @return v[j]
     */
    public double v(@NotNull Neuronio n){
        double v = 0;
        for(int i=0;i<n.X().length;i++){
            v += n.X()[i]*n.W()[i];
        }
        return v;
    }

    /**
     * Função fi (geralmente sigmoide)
     * @param v - o v calculado com as entradas
     * @return fi
     */
    public double fi(double v){
        return 1/(1+Math.exp(-v));
    }

    public ArrayList<Double> sinais(){
        ArrayList<Double> s = new ArrayList<>();
        L.forEach(x -> s.add(v(x)));
        return s;
    }
}
