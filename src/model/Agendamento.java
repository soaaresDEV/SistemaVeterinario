package model;

public class Agendamento {
    private Long id;
    private Long clienteId; // id do cliente (usuario)
    private Long veterinarioServicoId; // qual serviço foi escolhido
    private String dataHoraAgendada; // data e hora agendada para o serviço
    private String status; // "pendente", "aceito", "recusado" e "concluido"


    public Agendamento() {}


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Long getVeterinarioServicoId() {
        return veterinarioServicoId;
    }

    public void setVeterinarioServicoId(Long veterinarioServicoId) {
        this.veterinarioServicoId = veterinarioServicoId;
    }

    public String getDataHoraAgendada() {
        return dataHoraAgendada;
    }

    public void setDataHoraAgendada(String dataHoraAgendada) {
        this.dataHoraAgendada = dataHoraAgendada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
