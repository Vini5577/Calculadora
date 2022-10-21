import java.util.Scanner;

public class Funcoes {
    private float n1, n2, n3, total, cont;
    private int opc;
    private String op;

    Scanner entrada = new Scanner(System.in);
   
    public void Soma(){
        
        System.out.println("Digite o número: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite outro número: ");
        n2 = entrada.nextFloat();
        total = n1 + n2;
        
        System.out.printf("\n %.1f + %.1f = %.1f\n", n1, n2, total);
        operacao();

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
        operacao();

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
        operacao();

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
        operacao();

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

    public void operacao(){
        System.out.println("===================================");
        System.out.println("Mudar a operação? [S/N]");
        op = entrada.next();
        
        if(this.op.equalsIgnoreCase("S")){
            
            System.out.println("===================================");
            System.out.println("\t(1) - Adição");
            System.out.println("\t(2) - Subtração");
            System.out.println("\t(3) - Multiplicação");
            System.out.println("\t(4) - Divisão");
            System.out.println("\t(5) - manter a operação atual");
            System.out.println("===================================");
            System.out.println("selecione agora uma nova operação: ");
            opc = entrada.nextInt();

            if(opc == 1){
                Soma();
                cont += total;
                System.out.println("Valor atual: " + cont);
            } 
            else if(opc == 2){
                Substrair();
                cont -= total;
                System.out.println("Valor atual: " + cont);
            } 
            else if(opc == 3){
                Multiplicacao();
                cont *= total;
                System.out.println("Valor atual: " + cont);
            }
            else if(opc == 4){
                Divisao();
                cont /= total;
                System.out.println("Valor atual: " + cont);
            }
        }
    }
}
