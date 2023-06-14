
package banco;

/**
 *
 * @author daiana
 */
public class ContaCorrente extends Conta{
    
    public ContaCorrente() {
        super();
    }
    
    public void atualiza(double taxa) {
        this.deposita(this.getSaldo() * (taxa * 2));
    }
    
    public void deposita(double deposito) {
        super.deposita(deposito - 1.00);
    }
}
