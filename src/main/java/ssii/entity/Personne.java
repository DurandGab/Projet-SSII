package ssii.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor // lombok, pour générer un constructeur avec les champs @NonNull
@ToString
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricule;

    @NotBlank
    @NonNull // lombok
    private String nom;
    @NotBlank
    @NonNull
    private String prenom;
    @NotBlank
    @NonNull
    private String poste;

    @ManyToOne
    private Personne superieur;

    @OneToMany(mappedBy = "superieur")
    private List<Personne> subordonnes = new ArrayList<>();

    @OneToMany(mappedBy = "personne")
    private List<Participation> participations = new ArrayList<>();

}
