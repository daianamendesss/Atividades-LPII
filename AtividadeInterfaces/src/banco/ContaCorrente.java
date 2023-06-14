
package banco;

/**
 *
 * @author daiana
 */
public class ContaCorrente extends Conta implements Tributavel{
    
    public ContaCorrente() {
        super();
    }
    
    public void atualiza(double taxa) {
        this.deposita(this.getSaldo() * (taxa * 2));
    }
    
    public void deposita(double deposito) {
        super.deposita(deposito - 1.00);
    }
    
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
