public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 17.0;
        double valorSolicitado = 25.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Seu saldo R$: "+ saldo);
        }
        else 
            System.out.println("Saldo insuficiente ! R$" + saldo);
        
    }
}
