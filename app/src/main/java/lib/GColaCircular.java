package lib;


public class GColaCircular<T> {

    private static final int MAX_VALUE_DEFAULT = 5;
    private final Object cola[];
    private int head;
    private int tail;
    private int cont;
    private int max;

    public GColaCircular(int max){
        this.cola = new Object[max];
        this.head = 0;
        this.tail = 0;
        this.cont = 0;
        this.max = max;
    }
    
    public GColaCircular(){
        this(MAX_VALUE_DEFAULT);
    }

    /**
     * Añadir valores a la cola
     * @param num valor añadido
     * @return
     */
    public boolean add(T num){
        if (isFull())
            return false;
        cola[head] = num;
        if(head == max -1)
            head = 0;
        else
            head++;
        cont++;
        
        return true;
    }
    
    /**
     * Sacar el ultimo de la cola
     * @return el ultimo valor.
     */
    @SuppressWarnings("unchecked")
    public T remove(){
        if(isEmpty())
            return null;
        
        T num = (T) cola[tail]; 
        cola[tail] = 0;
        cont--;
        if(tail == max - 1)
            tail = 0;
        else 
            tail++;
        return num;
    }


    public boolean isFull(){
        return cont == max;
    }

    public boolean isEmpty(){
        return cont == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder();
        sb.append("[cola=[ ");
        for (int i = 0; i < cola.length; i++) {
            sb.append(cola[i]).append(" ");
        }
        sb.append("], head=\"").append(head).append("\", tail=\"").append(tail).append("\"]");
        return sb.toString();



        //return "ColaCirucular [cola=" + Arrays.toString(cola) + ", head=" + head + ", tail=" + tail + "]";
    }
}