package br.com.maisvida.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;

@Entity
public class Medico implements Serializable {

    @NotNull(groups = Existing.class)
    @Null(groups = New.class)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "O campo 'especialiadade' é requerido.")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_especialidade")
    private Especialidade especialidade;

    @NotNull(message = "O campo 'cidade' é requerido.")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    @NotNull(message = "O campo 'primeiroNome' é requerido.")
    @Column
    private String primeiroNome;

    @NotNull(message = "O campo 'ultimoNome' é requerido.")
    @Column
    private String ultimoNome;

    @NotNull(message = "O campo 'email' é requerido.")
    @Column
    private String email;

    @NotNull(message = "O campo 'ativo' é requerido.")
    @Column
    private Boolean ativo;

    @NotNull(message = "O campo 'status' é requerido.")
    @Column
    private Boolean status;

    public interface Existing {
    }

    public interface New {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
