public class Pila {
    int numero=0;
    static char pila[];
    int ultimo=0;

    public void crearPila(String expresion){
        numero=expresion.length();
        pila=new char[numero];
        
        
    }
    
    public void pushPila(char dato){
        ultimo=0;
    	pila[ultimo]=dato;
        ultimo++;
    }
    
    public char popPila(){
        char eliminado=pila[ultimo];
        pila[ultimo]=0;
        ultimo--;
        return eliminado;
    }
    public boolean pilaVacia(){
        return ultimo==-1;
    }
    public void mostrarPila(){
        for (int i = pila.length-1; i >=0; i--) {
            System.out.println(pila[i]);
        }
    }
}
