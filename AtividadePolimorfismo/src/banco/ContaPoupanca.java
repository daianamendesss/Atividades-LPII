
package banco;

/**
 *
 * @author daiana
 */
public class ContaPoupanca extends Conta{
    
    public ContaPoupanca() {
        super();
    }
    
    public void atualiza(double taxa) {
        this.deposita(this.getSaldo() * (taxa * 3));
    }
}
