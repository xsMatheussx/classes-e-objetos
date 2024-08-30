
package classeseobjetos;


public class contador {
    int contador = 0;
    int incremenador;
    int decrementador;

    public contador(int incremenador, int decrementador) {
        this.incremenador = incremenador;
        this.decrementador = decrementador;
        contador = contador + incremenador - decrementador;
    }

    public int getContador() {
        return contador;
    }

    
    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getIncremenador() {
        return incremenador;
    }

    public void setIncremenador(int incremenador) {
        this.incremenador = incremenador;
    }

    public int getDecrementador() {
        return decrementador;
    }

    public void setDecrementador(int decrementador) {
        this.decrementador = decrementador;
    }
    
  
    
}