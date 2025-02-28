public class Main {
    public static void main(String[] args) {
        //atribuindo valores aos atributos
        ContaBancaria conta1 = new ContaBancaria("12345", "João", 1000.00, 500.00, "Corrente");

        // Mostrando as informações da conta
        conta1.mostrarInformacoes();

        // Realizando algumas operações de depósito e saque
        conta1.depositar(200.00);   // João faz um depósito de R$200
        conta1.sacar(150.00);       // João faz um saque de R$150
        conta1.consultarSaldo();    // Consultando o saldo total disponível

        // Mostrando as informações da conta após as transações
        conta1.mostrarInformacoes();
    }
}
