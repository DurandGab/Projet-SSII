package ssii.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ssii.entity.Participation;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring 

public interface ParticipationRepository extends JpaRepository<Participation, Integer> {
    @Query("SELECT p FROM Participation p WHERE p.id = :idProjet")
    public List<Participation> findByIdProjet(@Param("idProjet") Integer idProjet);
}
