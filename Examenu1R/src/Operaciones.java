public class Operaciones {
    Pila pila = new Pila();

    public String postfija(String expresion){
        String postfija="";
        for (int i = 0; i <= expresion.length()-1; i++) {
            if(expresion.charAt(i) == 'A' || expresion.charAt(i) == 'B' || expresion.charAt(i) == 'C' || expresion.charAt(i) == 'D'
                    || expresion.charAt(i) == 'E'){
                postfija+=expresion.charAt(i);
            }
            if(expresion.charAt(i)=='*' || expresion.charAt(i)=='/' || expresion.charAt(i)=='+' || expresion.charAt(i)=='-'){
                pila.pushPila(expresion.charAt(i));
            }
            if(expresion.charAt(i)==')'){
                postfija+=pila.popPila();
            }
        }
        while(!pila.pilaVacia()){
            postfija+=pila.popPila();
        }
        return postfija;
    }

    
    public String prefija(String expresion){
        String prefija="";
        for (int i = expresion.length()-1; i>=0 ; i--) {
            if(expresion.charAt(i)>='A' && expresion.charAt(i)<='E'){
                prefija+=expresion.charAt(i);
            }
            if(expresion.charAt(i)=='*' || expresion.charAt(i)=='/' || expresion.charAt(i)=='+' || expresion.charAt(i)=='-'){
                pila.pushPila(expresion.charAt(i));
            }
            if(expresion.charAt(i)=='('){
                prefija+=pila.popPila();
            }
        }
        while(!pila.pilaVacia()){
            prefija+=pila.popPila();
        }
        return prefija;
    }
}
