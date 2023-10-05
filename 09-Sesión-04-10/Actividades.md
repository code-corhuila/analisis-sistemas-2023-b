# 1. UML - RUP.

## Una entidad de base de datos es la equivalencia a una clase en diagrama de clases UML.

* Las entiades planteadas en el presente ejercicio son:
** Continente [id, nombre]
** Pais [id, nombre, ref id continente]
** Estado [id, nombre, ref id pais]
** Ciudad [id, nombre, ref id estado]

** Los campos de auditoría son:
** fecha_creacion
** fecha_modificacion
** fecha_eliminacion
** estado

Nota: Todas las entidades deben llevar auditoría para este caso de estudio.

# Tipos de relaciones en UML

* Herencia
* Asociación [Unidireccional, Bidireccional]
* Agregación
* Composición
* Implementación

# Tipos de relaciones en base de datos

* Uno a uno
* Uno a muchos
* Muchos a muchos

# Diferncias entre UML y base de datos

* En base de datos se tiene (nombre, atributos)
** Entidad (Tabla)
** Atributo (Campo tiene tipo de dato) //Validar con tipo de dato según el motor de base de datos
** Relación (Restrictiva, No restrictiva)
** Cardinalidad

* En UML se tiene
** Clase (Entidad) (Nombre, atributos, métodos)
** Atributo (Campo, tiene tipo de dato) //Validar con tipo de dato según lenguaje de programación
** Relación (Asociación, Agregación, Composición, Herencia, Implementación)
** Métodos (Funciones)

NOTA:En el diagrama de clases, los métodos son las acciones de la clase, estos pueden ser de tipo público, privado o protegido, a su vez puede retornar o no infomración.


## Actividad a realizar: 
-  Investigar y establecer ejemplos sobre los tipos de relaciones en UML.
* Herencia
* Asociación [Unidireccional, Bidireccional]
* Agregación
* Composición
* Implementación

