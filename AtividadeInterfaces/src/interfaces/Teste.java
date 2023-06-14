
package interfaces;

/**
 *
 * @author daiana
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3, 2);
        System.out.println("Area: " + a.calculaArea());
        
        AreaCalculavel b = new Circulo(6);
        System.out.println("Area: " + b.calculaArea());
        
        AreaCalculavel c = new Quadrado(5);
        System.out.println("Area: " + c.calculaArea());
    }
    
}
