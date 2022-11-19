package AI;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Neuronio {
    private int x1, x2;
    private int w1, w2; //peso do neurônio

    public Neuronio(int x1, int x2){
        this.x1=x1;
        this.x2=x2;
    }

    /**
     * Função que atualiza peso do neurônio
     * @param x1 - entrada x1
     * @param x2 - entrada x2
     */
    public void X(int x1, int x2){
        this.x1 = x1;
        this.x2 = x2;
    }
    /**
     * Função que atualiza peso do neurônio
     * @param w1 - peso da entrada x1
     * @param w2 - peso da entrada x2
     */
    public void W(int w1, int w2){
        this.w1 = w1;
        this.w2 = w2;
    }

    /**
     * Retorna os valores de entrada do neurônio
     * @return x[x1..xn]
     */
    public int[] X(){
        return new int[]{x1, x2};
   }

    /**
     * Função que calcula o v, que considera os pesos das entradas
     * @return v[j]
     */
    public int v(){
        int v = 0;
        for(int i=0;i<X().length;i++){
            v += X()[i]*W()[i];
        }
        return v;
    }

    /**
     * Função fi (geralmente sigmoide)
     * @param v - o v calculado com as entradas
     * @return fi
     */
    public int fi(int v){
        return (int) ((int) 1/(1+Math.exp(-v)));
    }

    /**
     * Retorna os pesos de cada entrada
     * @return w[w1..wn]
     */
   public int[] W(){
       return new int[]{w1, w2};
   }

    /**
     * Sinais de saída da camada
     * @return conjunto de sinais
     */
    public int sinal(){
        return fi(v());
    }
}
