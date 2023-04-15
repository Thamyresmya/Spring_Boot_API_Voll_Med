package med.voll.api.medico;

import med.voll.api.endereco.Endereco;

public record DadosDetalhamentoMedico(
        Long id,
        String nome,
        String email,
        String telefone,
        String crm,
        Especialidade especialidade,
        Endereco endereco
) {

    //contrutor
    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getEmail(), medico.getCrm(), medico.getNome(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }

}
