package model;

public class Veterinario {
    private Long id; // chave primária
    private Long usuarioId; // ref ao usuario
    private int tempoMedioServico; // em minutos
    private double raioAtendimento; // em km


    public Veterinario() {}


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getTempoMedioServico() {
        return tempoMedioServico;
    }

    public void setTempoMedioServico(int tempoMedioServico) {
        this.tempoMedioServico = tempoMedioServico;
    }

    public double getRaioAtendimento() {
        return raioAtendimento;
    }

    public void setRaioAtendimento(double raioAtendimento) {
        this.raioAtendimento = raioAtendimento;
    }
}
