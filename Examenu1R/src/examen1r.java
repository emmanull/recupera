
import java.util.Scanner;
public class examen1r {
    public static void main(String[] args) {
        Evaluador evaluador = new Evaluador();
        Pila pila = new Pila();
        Operaciones operaciones = new Operaciones();
        Scanner user = new Scanner(System.in);
        String expresion = "";
        boolean correcta=false;

        do{
            System.out.println("Ingrese su expresión: ");
            expresion = user.next();

            if(evaluador.expresionCorrecta(expresion)){
                System.out.println("Expresión correcta");
                pila.crearPila(expresion);
               
                correcta=true;
            }else{
                System.out.println("Expresión incorrecta");
                expresion = "";
            }
        }while (correcta==false);
        
        for (int i = 0; i < expresion.length()-1; i++) {

        }
        System.out.println("Postfija: "+operaciones.postfija(expresion));
        System.out.println("Prefija: "+operaciones.prefija(expresion));
    }
}

