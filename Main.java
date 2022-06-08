
package exercicioSemana6;


 import java.util.Scanner;
 
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int opc;
    int num;
    double conta;
    char resp = 's';
    char loopExt;
    
    System.out.println("informe a cotação atual do dólar");
    float cota;
    cota = scan.nextFloat();
    do{
  
    do {
    System.out.println("Digite 1 para converter real para dólar");
    System.out.println("Digite 2 para converter dólar para real");
    opc = scan.nextInt();    
    switch (opc) {
        case 1 ->{
            System.out.println("valor em real: R$");
            num = scan.nextInt();
            conta = num / cota;
            System.out.println("valor convertido: $" + conta);
        }
        case 2 ->{
            System.out.println("valor em dólar: $");
            num = scan.nextInt();
            conta = num * cota;
            System.out.println("valor convertido: R$" + conta);
        }
        default ->{ System.out.println("inválido");
        }
        }
        System.out.println("continuar conversão de moeda? s/n");
        resp = scan.next().charAt(0);
      }while (resp == 's'); or (resp == 'S'); 
      
    do {
        System.out.println("Digite 1 para converter celsius para fahrenheit");
        System.out.println("Digite 2 para converter fahrenheit para celsius");
        opc = scan.nextInt();

            switch (opc){
                case 1 -> {
                    System.out.println("graus celsius:");
                    num = scan.nextInt();
                    conta = (num * 1.8 + 32);
                    System.out.println("fahrenheit: " + conta);
                }
                case 2 -> {
                    System.out.println("graus fahrenheit");
                    num = scan.nextInt();
                    conta = (num - 32) / 1.8;
                    System.out.println("para celsius :" + conta);

                }
                default ->{ System.out.println("inválido");
                }
            }
        System.out.println("continuar conversão de temperatura? s/n");
        resp = scan.next().charAt(0);
    }while (resp == 's'); or (resp == 'S');
      
      System.out.println("continuar conver5sões? s/n");
      loopExt = scan.next().charAt(0);
      
    }while (loopExt == 's'); or (loopExt == 'S');
    
   
    }

    private static void or(boolean b) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }

//   private static void or(boolean b) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    

//}
    

    