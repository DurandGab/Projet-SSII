package ssii.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@RequiredArgsConstructor // lombok, pour générer un constructeur avec les champs @NonNull
@ToString
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    private String nom;
    private LocalDate debut;
    private LocalDate fin;

    @OneToMany(mappedBy = "projet")
    private List<Participation> participations = new ArrayList<>();
}
