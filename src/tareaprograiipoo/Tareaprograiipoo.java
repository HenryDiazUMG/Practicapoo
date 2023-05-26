//Tarea de Programación "Práctica POO" 
//Henry Josue Díaz Duarte 0909-22-17965

package tareaprograiipoo;


import java.util.Scanner;

public class Tareaprograiipoo {

    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       Calculadora calculadora = new Calculadora("JP");
       boolean salir = false;
       
       CalculadoraEspecial calculadoraesp = new CalculadoraEspecial("HD");
       int opcion; 
       double angulo = 60;
       
       do{
           System.out.println("");
           System.out.println("=======================");
           System.out.println("Selecciona una opcion");
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Raiz Cuadrada");
           System.out.println("6. Verificar numero Primo");
           System.out.println("7.  Raiz cúbica");
           System.out.println("8.  Función Seno");
           System.out.println("9.  Función Coseno");
           System.out.println("10. Función Tangente");
           System.out.println("11. Logaritmo");
           System.out.println("12. Potencia");
           System.out.println("13. Salir");
           System.out.println("Selecciona una opcion");
           System.out.println("=======================");
           opcion = sn.nextInt();
            switch(opcion){
                case 1:
                   System.out.println("El resultado de la suma es = " + calculadora.sumar(10, 5));
                   break;
                case 2:
                   System.out.println("El resultado de la resta es = " +calculadora.restar(10, 5));
                   break;
                case 3:
                   System.out.println("El resultado de la multiplicacion es = " +calculadora.multiplicar(10, 5));
                   break;
                case 4:
                    System.out.println("El resultado de la division es = " +calculadora.dividir(10, 5));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es = " +calculadora.raizCuadrada(16));
                    break;
                case 6:
                    System.out.println("Es primo? = " +calculadora.esPrimo(11));
                    break;
                case 7:
                    System.out.println("El resultado de la raíz cubica es = " + calculadoraesp.raizCubica(27));
                    break;  
                case 8:
                    System.out.println("El resultado del seno de " + angulo + " grados es = " + calculadoraesp.seno(60));
                    break; 
                case 9:
                    System.out.println("El resultado del coseno de " + angulo + " grados es = " + calculadoraesp.coseno(60));
                    break;  
                case 10:
                    System.out.println("El resultado de la tangente de " + angulo + " grados es = " + calculadoraesp.tangente(60));
                    break;   
                case 11:
                    System.out.println("El resultado del logaritmo es = " + calculadoraesp.logaritmo(32, 2));
                    break;
                case 12:
                    System.out.println("El resultado de la potencia es = " + calculadoraesp.potencia(50, 2));
                    break;    
                case 13:
                    salir = true;
                    break;    
                default:
                   System.out.println("Solo puedes seleccionar números entre 1 y 13");
            }
       }
        while(!salir);   
        
    }
}
