
package banco;

/**
 *
 * @author daiana
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
}
