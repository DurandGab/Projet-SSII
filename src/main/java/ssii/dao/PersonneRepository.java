package ssii.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ssii.entity.Personne;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring 

public interface PersonneRepository extends JpaRepository<Personne, Integer> {
    @Query("SELECT p FROM Personne p WHERE p.nom = :nom")
    public List<Personne> findByNom(@Param("nom") String nom);
}
