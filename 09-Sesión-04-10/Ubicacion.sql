-- Datos de autenticación
-- Usuario: u342060465_analisis_sis
-- BD: u342060465_analisis_sis
-- PWD: 4|Wat]9a
-- server: 149.100.155.52

-- Eliminar base de datos
-- DROP DATABASE IF EXISTS ubicacion;

-- Creación de basa de datos
-- CREATE DATABASE ubicacion;

use ubicacion;

-- Creación de tabla continente
CREATE TABLE continente(
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    estado BIT NOT NULL DEFAULT 1,
    fecha_creacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_modificacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_eliminacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Creación de tabla pais
CREATE TABLE pais(
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    estado BIT NOT NULL DEFAULT 1,
    fecha_creacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_modificacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_eliminacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    continente_id BIGINT NOT NULL,
    CONSTRAINT fk_pais_continente_continente_id FOREIGN KEY (continente_id) REFERENCES continente(id)
);

-- Creación de tabla estado
CREATE TABLE estado(
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    estado BIT NOT NULL DEFAULT 1,
    fecha_creacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_modificacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_eliminacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    pais_id BIGINT NOT NULL,
    CONSTRAINT fk_estado_pais_pais_id FOREIGN KEY (pais_id) REFERENCES pais(id)
);

-- Creación de tabla estado
CREATE TABLE ciudad(
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    estado BIT NOT NULL DEFAULT 1,
    fecha_creacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_modificacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_eliminacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    estado_id BIGINT NOT NULL,
    CONSTRAINT fk_ciudad_estado_estado_id FOREIGN KEY (estado_id) REFERENCES estado(id)
);


-- DML (Lenguaje de Manipulación de Datos)
-- Insertar continentes
INSERT INTO continente(
    nombre,
    estado,
    fecha_creacion) 
VALUES(
    'América',
    '1',
     '2021-10-04 00:00:00'
);

-- Insertar continentes
INSERT INTO pais(
    nombre,
    estado,
    fecha_creacion,
    continente_id) 
VALUES(
    'América',
    '1',
    '2021-10-04 00:00:00',
    1
);