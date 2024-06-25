package destino.destino_viagens_api.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_collaborator")
public class Collaborator {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long collaboratorId;

    @Column(name = "collaboratorName", nullable = false)
    private String name;

    private Date birthDate;

    @Column(unique = true)
    private String email;

    private String phone;

    @Column(unique = true, length = 11, nullable = false)
    private String cpf;

    @Column(unique = true, length = 8)
    private String passport;

    //Getters and setters
    public Long getCollaboratorId() {
        return collaboratorId;
    }

    public void setCollaboratorId(Long collaboratorId) {
        this.collaboratorId = collaboratorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }


    
}
