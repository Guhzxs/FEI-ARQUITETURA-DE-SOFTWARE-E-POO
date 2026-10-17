
package com.mycompany.a07exemp02execption;
import java.util. InputMismatchException;
import java.util. Scanner;
/**
 *
 * @author unifgustasouza
 */
public class Main {

    public static int quociente(int num, int den) throws ArithmeticException{
        return num / den;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner( System. in );
        int numerador = 1;
        int denominador = 1;
        do{
            try{
                System.out.println("Entre o numerador: ");
                numerador = scanner.nextInt();
                System.out.println("Entre o denominador: ");
                denominador = scanner.nextInt();

                int result = quociente(numerador, denominador);
                System.out.println("Resp: " + result);
            }



            catch (InputMismatchException inpmisexp){
               System.err.printf("Exception: %s\n", inpmisexp);
                scanner.nextLine();
                System.out.println("Voce deve entrar com os numeros novamente: "); 
            }



            catch (ArithmeticException arithm){
                System.err.printf("Exception: %s\n", arithm);
            System.out.println("Zero nao e um denominador valido ");
            }
        } while (numerador != 0);
    }
}
