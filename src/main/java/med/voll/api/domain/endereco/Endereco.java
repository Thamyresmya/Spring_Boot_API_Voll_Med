package med.voll.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.numero = dados.numero();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
        this.bairro = dados.bairro();
        this.complemento = dados.complemento();
        this.cep = dados.cep();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
       //conferencia se os dados existe para atualizar
       if (dados.logradouro() != null){
           this.logradouro = dados.logradouro();
       }
        if (dados.numero() != null){
            this.numero = dados.numero();
        }
        if (dados.cidade() != null){
            this.cidade = dados.cidade();
        }
        if (dados.uf() != null){
            this.uf = dados.uf();
        }
        if (dados.bairro() != null){
            this.bairro = dados.bairro();
        }
        if (dados.complemento() != null){
            this.complemento = dados.complemento();
        }
        if (dados.cep() != null){
            this.cep = dados.cep();
        }
    }
}
