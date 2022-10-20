import java.util.Scanner;

public class menu {
    private int op;
    
    Scanner entrada = new Scanner(System.in);

    Funcoes calculadora = new Funcoes();

    menu(){
        System.out.println("Iniciando calculadora...");
    }

    public void opcao(){
        do{
            System.out.println("==============================");
            System.out.println("\tCalculadora");
            System.out.println("==============================");
            System.out.println("\t(1) - Adição");
            System.out.println("\t(2) - Subtração");
            System.out.println("\t(3) - Multiplicação");
            System.out.println("\t(4) - Divisão");
            System.out.println("\t(5) - Sair do programa");
            System.out.println("==============================");
            System.out.println("Selecione uma das opções: ");
            op = entrada.nextInt();
            
            interacao();
            if(op == 5){
                System.out.println("Finalizando o programa...");
                try{
                    Thread.sleep(1000);
                }catch(Exception erro){}
                break;
            }

        }while(op != 5);
    }

    public void interacao(){
        if(op == 1){
            calculadora.Soma();        
        }
        else if(op == 2){
            calculadora.Substrair();
        }
        else if(op == 3){
            calculadora.Multiplicacao();
        }
        else if(op == 4){
            calculadora.Divisao();
        }
    }

    public void interacao2(){

    }
}
