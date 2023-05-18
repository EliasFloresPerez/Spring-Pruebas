package PruebaWEB.example.demo.com_model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Persona {
    @Id
    private int idPersona;

    @Column(name = "Nombre", length = 50)
    private String name;

    //getter y setters

    public String getNombre(){
        return this.name;
    }

    public void setNombre(String a){
        this.name = a;
    }

    public int getID(){
        return this.idPersona;
    }

    public void setID(int a){
        this.idPersona = a;
    }
}
