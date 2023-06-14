
package banco;

/**
 *
 * @author daiana
 */
public class TestaDeposita {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        
        try {
            cp.deposita(-100);
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
