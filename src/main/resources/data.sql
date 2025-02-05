-- Initialisation des tables
INSERT INTO PERSONNE(matricule, nom, prenom, poste, superieur_matricule) VALUES
    (default,'Bastide', 'Rémi', 'professeur', null),
    (default,'Lamine', 'Elyes', 'Directeur', 1),
    (default, 'Pécatte', 'Jean-Marie', 'Chef des devs', 1);

INSERT INTO PROJET (code, nom, debut, fin) VALUES
( default, 'Projet 1', '2020-01-01', '2020-12-31'),
( default, 'Projet 2', '2020-01-01', '2020-12-31');

INSERT INTO PARTICIPATION (id, role, pourcentage, personne_id, projet_id) VALUES
(default, 'Chef de projet', 100, 2, 1),
(default, 'Développeur', 50, 3, 1);