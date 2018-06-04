CREATE DATABASE urizer_jobs;-- DROP DATABASE urizer_jobs

USE urizer_jobs;

CREATE TABLE credencial(-- DROP TABLE credencial
	id INT AUTO_INCREMENT,
    nombre VARCHAR(50),
    descripcion VARCHAR(500),
    PRIMARY KEY(id)
);-- SELECT * FROM credencial

CREATE TABLE clasificacion(-- DROP TABLE clasificacion
	id INT AUTO_INCREMENT,
    nombre VARCHAR(50),
    descripcion VARCHAR(500),
    PRIMARY KEY(id)
);-- SELECT * FROM clasificacion

CREATE TABLE tipo_perfil(-- DROP TABLE tipo_perfil
	id INT AUTO_INCREMENT,
    descripcion VARCHAR(500),
    PRIMARY KEY(id)
);-- SELECT * FROM tipo_perfil

CREATE TABLE tema_interes(-- DROP TABLE tema_interes
	id INT AUTO_INCREMENT,
    descripcion VARCHAR(500),
    PRIMARY KEY(id)
);-- SELECT * FROM tema_interes

CREATE TABLE usuario(-- DROP TABLE usuario
	id INT AUTO_INCREMENT,
    run VARCHAR(50) UNIQUE,
    nombre VARCHAR(50),
    correo VARCHAR(500),
    pass VARCHAR(50),
    PRIMARY KEY(id),
);-- SELECT * FROM usuario

CREATE TABLE usuario_credencial(-- DROP TABLE usuario_credencial
	id INT AUTO_INCREMENT,
    usuario_fk INT,
    credencial_fk INT,
    PRIMARY KEY(id),
    FOREIGN KEY (usuario_fk) REFERENCES usuario(id),
    FOREIGN KEY (credencial_fk) REFERENCES credencial(id)
);-- SELECT * FROM usuario_credencial

CREATE TABLE usuario_tema(-- DROP TABLE usuario_tema
	id INT AUTO_INCREMENT,
    usuario_fk INT,
    tema_fk INT,
    PRIMARY KEY(id),
    FOREIGN KEY (usuario_fk) REFERENCES usuario(id),
    FOREIGN KEY (tema_fk) REFERENCES tema_interes(id)
);-- SELECT * FROM usuario_tema

CREATE TABLE perfil(-- DROP TABLE perfil
	id INT AUTO_INCREMENT,
    mi_descripcion VARCHAR(500),
    usuario_fk INT,
    tipo_fk INT,
    PRIMARY KEY(id),
    FOREIGN KEY (usuario_fk) REFERENCES usuario(id),
    FOREIGN KEY (tipo_fk) REFERENCES tipo(id)
);-- SELECT * FROM perfil

CREATE TABLE trabajo(-- DROP TABLE perfil
	id INT AUTO_INCREMENT,
    descripcion VARCHAR(500),
    fecha DATETIME,
    duracion INT,
    valor INT,
    empleador_fk INT,
    PRIMARY KEY(id),
    FOREIGN KEY (empleador_fk) REFERENCES perfil(id)
);-- SELECT * FROM trabajo

CREATE TABLE contrato(-- DROP TABLE contrato
	id INT AUTO_INCREMENT,
    empleado_fk INT,
    trabajo_fk INT,
    PRIMARY KEY(id),
    FOREIGN KEY (empleado_fk) REFERENCES usuario(id),
    FOREIGN KEY (trabajo_fk) REFERENCES trabajo(id)
);-- SELECT * FROM contrato

CREATE TABLE trabajo_clasificacion(-- DROP TABLE trabajo_clasificacion
	id INT AUTO_INCREMENT,
    trabajo_fk INT,
    clasificacion_fk INT,
    PRIMARY KEY(id),
    FOREIGN KEY (trabajo_fk) REFERENCES trabajo(id),
    FOREIGN KEY (clasificacion_fk) REFERENCES clasificacion(id)
);-- SELECT * FROM trabajo_clasificacion