package Pizza;

//pregunto si son prioritaria o no y si lo es entra al horno sino se va al final de la cola por lo que al final estaran ordenados todos
    // los no prioritarios y los prioritarios ya habran entrado al horno

public class Cola<T> implements AccionesEstructuras<T> {

    private T[] cola;
    private static int cont;
    private int numElementos;

    public Cola(int capacidad) {
        cola = (T[]) new Object[capacidad];
        numElementos=0;
    }

    public boolean colaLlena() {
        if(numElementos==cola.length)return true;
        return false;
    }
    

    @Override
    public boolean push(T elemento) {
        
        if(numElementos<cola.length){
            cola[this.numElementos++]= elemento;
            return true;
        }
        return false;
    }

    @Override
    public T pop() {
        T objectoDevuelto = cola[0];
        
        for(int i=0; i<numElementos; i++){
            cola[i]=cola[i+1];
        }
        this.numElementos--;
        
        return objectoDevuelto;
    }

    @Override
    public boolean esVacia() {
        return this.numElementos == 0;
    }

    @Override
    public int getNumElementos() {
        int cont=0;
        for(int i=0;i<cola.length; i++){
            if(cola[i]!=null){
                cont++;
            }
        }
        return cont;
    }
}
