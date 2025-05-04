package model;

public class VeterinarioServico {
    private Long id;
    private Long veterinarioId; // id do veterinário
    private Long servicoId; // id do serviço
    private Boolean ativo; // se o serviço está ativo para o veterinário


    public VeterinarioServico() {}


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getVeterinarioId() {
        return veterinarioId;
    }

    public void setVeterinarioId(Long veterinarioId) {
        this.veterinarioId = veterinarioId;
    }

    public Long getServicoId() {
        return servicoId;
    }

    public void setServicoId(Long servicoId) {
        this.servicoId = servicoId;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
