create table Equipement (
    id int PRIMARY KEY,
    nom varchar(50)not NULL,
    adresseIP varchar(50) not NULL,
    etat varchar(50) not NULL
    )
    
create table Utilisateur(
    id int PRIMARY KEY,
    nomUtilisateur varchar(50) not null,
    motDePasse varchar(50) not null,
    role varchar(50) not null
    )
create table statistiques(
    id int PRIMARY KEY,
    equipement_id int,
    cpu_usage varchar(50),
    ram_usage varchar(50),
    disk_usage varchar(50),
    timestamp varchar(50),
    CONSTRAINT fk_statistique_equipement foreign key(equipement_id)
    references Equipement(id)
    )
create table logs(
    id int primary key,
    equipement_id int,
    message varchar(50),
    timestamp VARCHAR(50),
    constraint fk_logs_esuipement foreign key(equipement_id)
    references equipement(id)
    )
    