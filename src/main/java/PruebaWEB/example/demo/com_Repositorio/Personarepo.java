package PruebaWEB.example.demo.com_Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import PruebaWEB.example.demo.com_model.Persona;

public interface Personarepo extends JpaRepository<Persona,Integer>{
    

}
