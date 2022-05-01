
package prjconta;

import java.util.Scanner;


public class ContaUnc {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String aux;
        int opcao;
        double valor;
        
        System.out.println("Digite o Titular da conta: ");
        aux = in.nextLine();
        
        Conta c1 = new Conta(aux);
        
        do {
            System.out.println("-- MENU --");
            System.out.println("1)Dados Bancarios");
            System.out.println("2) Depósito");
            System.out.println("3) Saque");
            System.out.println("0) Sair");
            
            System.out.print("Opção: ");
            opcao = in.nextInt();
            
            if(opcao == 1 ) {
                
                c1.DadosBancarios();
                                
            } else if(opcao == 2){ 
                System.out.println("Digite o valor do depósito: ");
                valor = in.nextDouble();
                
                c1.Depositar(valor);
                
            } else if(opcao == 3) {
                System.out.println("Digite o valor que quer sacar: ");
               valor = in.nextDouble();
                       
                c1.Sacar(valor);
            } else if(opcao != 0) {
                System.out.println("Opção Invalida");
            }
            System.out.println("");
        }while( opcao != 0);
        
    }
    
}
