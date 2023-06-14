
package banco;

/**
 *
 * @author daiana
 */
public class TesteGerenciadorDeImpostoDeRenda {
    public static void main(String[] args) {
        
        GerenciadorDeImpostoDeRenda ger = new GerenciadorDeImpostoDeRenda();
        SeguroDeVida sv = new SeguroDeVida();
        
        ger.adiciona(sv);
        
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        
        ger.adiciona(cc);
        
        System.out.println(ger.getTotal());
        
        System.out.printf("O saldo e: %.2f", cc.getSaldo());
    }
}
