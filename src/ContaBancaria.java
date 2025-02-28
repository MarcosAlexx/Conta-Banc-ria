public class ContaBancaria {
    // Atributos da conta bancária
    private String numeroConta;
    private String titular;
    private double saldoTotal;
    private double limiteTotal;
    private String tipoConta;

    // Construtor para inicializar os atributos
    public ContaBancaria(String numeroConta, String titular, double saldoInicial, double limiteTotal, String tipoConta) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldoTotal = saldoInicial;
        this.limiteTotal = limiteTotal;
        this.tipoConta = tipoConta;
    }

    // Método para mostrar as informações da conta
    public void mostrarInformacoes() {
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Tipo de Conta: " + this.tipoConta);
        System.out.println("Saldo Total: R$" + this.saldoTotal);
        System.out.println("Limite Total: R$" + this.limiteTotal);
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldoTotal += valor;  // Adiciona o valor ao saldo
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > 0 && this.saldoTotal + this.limiteTotal >= valor) {
            this.saldoTotal -= valor;  // Subtrai o valor do saldo
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    // Método para mostrar o saldo restante disponível (incluindo o limite total)
    public void consultarSaldo() {
        double saldoDisponivel = this.saldoTotal + this.limiteTotal;
        System.out.println("Saldo disponível (incluindo limite): R$" + saldoDisponivel);
    }
}
