package destino.destino_viagens_api.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "tb_destination")
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long destinationId;

    private String local;
    
    private Date date;

    @OneToMany
    private List<Client> clients;
    @OneToMany
    private List<Collaborator> collaborators;

    //Getters and setters
    public Long getDestinationId() {
        return destinationId;
    }
    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public List<Client> getClients() {
        return clients;
    }
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    public List<Collaborator> getCollaborators() {
        return collaborators;
    }
    public void setCollaborators(List<Collaborator> collaborators) {
        this.collaborators = collaborators;
    }


    
}
