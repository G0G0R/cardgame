DROP TABLE IF EXISTS Carte;

create table Carte(
    id int unsigned NOT NULL auto_increment,
    texte VARCHAR(200),
    PRIMARY KEY(id)
)