# practica2

## Tabla de contenidos
1. [Descripcion del proyecto](#descripcion)
2. [Estado del proyecto](#estado)
3. [Utilizacion del programa](#utilizacion)
4. [Acceso al proyecto](#acceso)
5. [Autor](#autor)

<a name="descripcion"></a>
### Descripcion del proyecto
#### El programa "mates.Matematicas", permite realizar una aproximación al número pi mediante el método de montecarlo, que funciona de la siguiente manera:
#### Se genera un número concreto de puntos aleatorios (dardos) dentro de un cuadrado de lado = 1 y cuenta cuántos de estos puntos caen dentro de un círculo inscrito en el cuadrado (cuantos dardos caen en la diana). Luego, la proporción de puntos dentro del círculo se divide entre el total de puntos generados y se multiplica por 4 para aproximar el valor de Pi. Cuanto mayor sea el número de pasos (puntos generados o dardos), más precisa será la aproximación al valor de Pi.
####
<a name="estado"></a>
### Estado del proyecto
#### El proyecto ya está desarrollado, y muestra la aproximación del valor del numero pi correctamente.
####
<a name="utilizacion"></a>
### Utilizacion del programa
#### Para ejecutar el programa se escribe "java aplicacion.Principal" y seguido, un número de pasos, que será el número de puntos/dardos generados (cuanto mayor sea este número, más precisión).
#### Un ejemplo de sentencia quedaría de la siguiente manera:
```
java aplicacion.Principal 1000000
```
#### Para compilar el código se puede hacer de dos maneras:
#### podemos escribir "javac" y seguido la ruta del fichero que queremos compilar
#### Un ejemplo para compilar la clase Matemáticas.java (situada en la ruta src/mates/Matemáticas.java) quedaría de la siguiente manera:
```
javac src/mates/Matemáticas.java
```
#### También podemos compilar todo ejecutando el siguiente comando:
```
make compilar
```
####

<a name="acceso"></a>
### Acceso al proyecto
#### El proyecto está en el repositorio remoto "git@github.com:pabloargaizramirez/practica1.git". En caso de requerir acceso, solicitar al autor.

<a name="autor"></a>
### Autor
#### Pablo Argaiz Ramírez (pablo.argaizramirez@usp.ceu.es)
