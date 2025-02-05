package ssii.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ssii.entity.Projet;

// This will be AUTO IMPLEMENTED by Spring 

public interface ProjetRepository extends JpaRepository<Projet, Integer> {
    @Query("SELECT p FROM Projet p WHERE p.nom = :nom")
    public Projet findByNom(@Param("nom") String nom);
}
