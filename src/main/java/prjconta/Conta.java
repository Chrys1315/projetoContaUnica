
package prjconta;


public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    static int qtdcontas = 0;
    
    public Conta(String pTitular) {
        this.titular = pTitular;
       qtdcontas++;
       this.numero = qtdcontas;
       this.saldo =  0;
              
    }
    
     public void DadosBancarios(){
         System.out.println("");
         System.out.println("--- Dados Bancarios --");
         System.out.println("- Número: " + this.numero);
         System.out.println("- Titular: " + this.titular);
         System.out.println("- Saldo: " + this.saldo);
         System.out.println("--- Fim Dados Bancarios --");
         System.out.println("");
         
     }
      public void Depositar(double pValor) {
          System.out.println("");
          System.out.println("--- Realizando Depósito ---");
          System.out.println(" - Saldo Anterior: " + this.saldo);
                        
           this.saldo += pValor; //this.saldo = this.saldo + pValor
          
           System.out.println("- Saldo Posterior: " + this.saldo);
           System.out.println("--- Fim do Depósito ---");
          System.out.println("");
     
      }
      public void Sacar(double pValor ){
          System.out.println("");
          System.out.println("-- Realizando Saque --");
          System.out.println("- Saldo Anterior: " + this.saldo);
          
          if (pValor <= this.saldo){ //caso eu tenha saldo
              this.saldo -= pValor;
          } else {  //caso eu não tenha saldo 
              System.out.println("Saldo Insuficiente");
          }
                            
          System.out.println("-- Fim do saque --");
      }
}
