
package banco;

/**
 *
 * @author daiana
 */
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    
    void roda(Conta c) {
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.setSaldo((c.getSaldo() + (c.getSaldo() * this.getSelic())));
        System.out.println("Saldo atualizado: " + c.getSaldo());
        this.setSaldoTotal(this.getSaldoTotal() + c.getSaldo());
    }

    /**
     * @return the saldoTotal
     */
    public double getSaldoTotal() {
        return saldoTotal;
    }

    /**
     * @param saldoTotal the saldoTotal to set
     */
    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    /**
     * @return the selic
     */
    public double getSelic() {
        return selic;
    }

    /**
     * @param selic the selic to set
     */
    public void setSelic(double selic) {
        this.selic = selic;
    }
}
