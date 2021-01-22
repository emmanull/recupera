public class Evaluador {
    public boolean expresionCorrecta(String expresion) {
        char aux = ' ';
        boolean operador = false;
        boolean operando = false;
        boolean valor_expresion=false;

        for (int i = 0; i <= expresion.length() - 1; i++) {
            
            operando = false;
            if (expresion.charAt(i) == 'A' || expresion.charAt(i) == 'B' || expresion.charAt(i) == 'C' || expresion.charAt(i) == 'D'
                    || expresion.charAt(i) == 'E') {
                operando = true;
                aux = expresion.charAt(i);
            } else {
                operando = false;
                aux = expresion.charAt(i);
            }
        }

        for (int i = 0; i <= expresion.length() - 1; i++) {
            operador = false;

            if(expresion.charAt(i) == '+' || expresion.charAt(i) == '-' || expresion.charAt(i) == '*' || expresion.charAt(i) == '/') {
                operador = true;
                aux = expresion.charAt(i);
            }else {
                operador = false;
                aux = expresion.charAt(i);
            }
        }
        if(aux=='+' || aux=='-' || aux=='*' || aux=='/' || aux == expresion.charAt(expresion.length()-2)){
            operador = false;
        }else
            operador = true;

        if(operador&&operando==true){
           valor_expresion=true;
        }else {
            valor_expresion=false;
        }
        return valor_expresion;
    }
}
