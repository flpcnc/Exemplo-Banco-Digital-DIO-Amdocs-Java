public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta poupanca ===");
        super.ImprimirInfoComuns();

    }
}
