import java.util.Scanner;

public class Funcoes {
    private float n1, n2, n3, total;
    private String op;

    Scanner entrada = new Scanner(System.in);
   
    public void Soma(){
        
        System.out.println("Digite o número: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite outro número: ");
        n2 = entrada.nextFloat();
        total = n1 + n2;
        
        System.out.printf("\n %.1f + %.1f = %.1f\n", n1, n2, total);
        
        do{
            
            System.out.println("Quer digitar mais números? [S/N]");
            op = entrada.next();

            if(op.equalsIgnoreCase("N"))
            {
                break;
            }
            else{
                System.out.println("Digite o número: ");
                n3 = entrada.nextFloat();
                total += n3;
                System.out.println("+ " + n3);
                System.out.println("= "  + total);
            }
            
        }while(op.equalsIgnoreCase("S"));
    }

    public void Substrair(){
        
        System.out.println("Digite o número: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite outro número: ");
        n2 = entrada.nextFloat();
        total = n1 - n2;
        
        System.out.printf("\n %.1f - %.1f = %.1f\n", n1, n2, total);
        
        do{
            
            System.out.println("Quer digitar mais números? [S/N]");
            op = entrada.next();

            if(op.equalsIgnoreCase("N"))
            {
                break;
            }
            else{
                System.out.println("Digite o número: ");
                n3 = entrada.nextFloat();
                total -= n3;
                System.out.println("- " + n3);
                System.out.println("= "  + total);
            }
            
        }while(op.equalsIgnoreCase("S"));
    }

    public void Multiplicacao(){
        
        System.out.println("Digite o número: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite outro número: ");
        n2 = entrada.nextFloat();
        total = n1 * n2;
        
        System.out.printf("\n %.1f x %.1f = %.1f\n", n1, n2, total);
        
        do{
            
            System.out.println("Quer digitar mais números? [S/N]");
            op = entrada.next();

            if(op.equalsIgnoreCase("N"))
            {
                break;
            }
            else{
                System.out.println("Digite o número: ");
                n3 = entrada.nextFloat();
                total -= n3;
                System.out.println("x " + n3);
                System.out.println("= "  + total);
            }
            
        }while(op.equalsIgnoreCase("S"));
    }

    public void Divisao(){
        System.out.println("Digite o número: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite outro número: ");
        n2 = entrada.nextFloat();
        total = n1 / n2;
        
        System.out.printf("\n %f / %f = %f\n", n1, n2, total);
        
        do{
            
            System.out.println("Quer digitar mais números? [S/N]");
            op = entrada.next();

            if(op.equalsIgnoreCase("N"))
            {
                break;
            }
            else{
                System.out.println("Digite o número: ");
                n3 = entrada.nextFloat();
                total -= n3;
                System.out.println("/ " + n3);
                System.out.println("= "  + total);
            }
            
        }while(op.equalsIgnoreCase("S"));
    }
}
