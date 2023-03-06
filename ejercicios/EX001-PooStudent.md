# Ejercicio práctico de introducción a la programación orientada a objetos

Se recomienda que antes de empezar a programar, leas el enunciado completo y te hagas una idea de cómo se va a resolver el problema.

## 📝 Instrucciones de entrega

1. Clonar tu repositorio de la asignatura o actualizarlo si ya lo tenías clonado.
2. Crear una rama con el nombre `EX001PooStudent` tal como se indica en [este archivo](./entregas/readme.md).
2. En la carpeta `ejercicios/entregas` tal como se indica en [este archivo](./entregas/readme.md), crear un proyecto con el nombre `EX001PooStudent` basado en este [ejemplo](../temario/EX001PooStudent).
3. Implementar los métodos de la clase `Student` tal como se indica en el enunciado.
4. Implementar los métodos de la clase `Subject` tal como se indica en el enunciado.
5. La clase `Main` debe contener el método `main` para mostrar la solución del problema, en el ejemplo se tiene el código base.
6. Implementar la clase `StudentTest` tal como se indica en el enunciado.
7. Implementar la clase `SubjectTest` tal como se indica en el enunciado.
8. Crear el diagrama de clases para  `Student` y `Subject` con `PlantUML` tal como se indica en el enunciado.
9. Ejecutar los tests y verificar que todos pasen.
10. Subir el proyecto a tu repositorio de GitHub.
11. Pedir revisión de código (Pull request).

## 🧠 Enunciado

Se necesita gestionar las notas de los alumnos relacionadas con una
asignatura. Para solucionar el problema se ha creado un programa principal
donde utiliza las clases `Student` y `Subject`.

Como un agregado importante añadir comentario de documentación apropiados a los métodos de las clases `Student` y `Subject`.

### Clase `Student`
- Tendrá los siguientes atributos:
  - `name` (String): Nombre del alumno.
  - `surname` (String): Apellidos del alumno.
  - `id` (String): Identificador del alumno.
  - `grade` (float): Nota del alumno.

Implementar los getters y setters de los atributos de la clase `Student`.

## Clase `Subject`
- Tendrá los siguientes atributos:
  - `name` (String): Nombre de la asignatura.
  - `students` (Student[]): Alumnos matriculados en la asignatura.
  - `isOrdered` (boolean): Indica si los alumnos están ordenados por nota.
  - `position` (int): Posición del último alumno matriculado.
  - `capacity` (int): Capacidad máxima de alumnos que puede tener la asignatura.

- Implementar los getters y setters de los atributos de la clase `Subject`.
- Revisar la implementación del método `addStudent` que añade un alumno a la asignatura.
- Revisar la implementación del método `orderStudents` que ordena los alumnos por nota.
- Implementar el método `getStudent` que devuelve el alumno que ocupa la posición indicada.
- Implementar el método `getBestStudent` que devuelve el alumno con la mejor nota.
- Implementar el método `getWorstStudent` que devuelve el alumno con la peor nota.
- Implementar el método `getAverage` que devuelve la nota media de la asignatura.
- Implementar el método `getMedian` que devuelve la nota mediana de la asignatura.

## Tests
- Tests de la clase `StudentTest`.
   - Implementar tests para los métodos `getName`, `getSurname`, `getId`, `getGrade` y `setGrade`.
   - Implementar un test para el constructor de la clase `Student`.
- Implementar los tests de la clase `SubjectTest`.
   - Implementar tests para los métodos `getName`, `getCapacity`, `getIsOrdered`, `getPosition` y `getStudent`.
   - Implementar un test para el constructor de la clase `Subject`.
   - Implementar tests para los métodos `addStudent`, `orderStudents`, `getBestStudent`, `getWorstStudent`, `getAverage` y `getMedian`.

# 👁️ Nota
- Recuerda que todo lo que se pide en este ejercicio debe estar en Inglés.
- Para cada ejercicio, se recomienda crear una nueva rama en el repositorio de GitHub y, posteriormente, 
solicitar un Pull Request. De esta manera, se podrá mantener un registro claro y organizado de cada ejercicio, lo que facilitará su revisión y seguimiento.
- Recuerda que todo lo que se pide en este ejercicio debe estar en el proyecto `EX001PooStudent` tal como se indica en las instrucciones de entrega.
- Recuerda que todos los tests que realice deben pasar para que el ejercicio sea considerado como entregado.
