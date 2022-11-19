package AI;

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
     * Retorna os pesos de cada entrada
     * @return w[w1..wn]
     */
   public int[] W(){
       return new int[]{w1, w2};
   }
}
