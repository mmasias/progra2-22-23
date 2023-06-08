# Ejercicio práctico de introducción a la programación orientada a objetos

Se recomienda que antes de empezar a programar, leas el enunciado completo y te hagas una idea de cómo se va a resolver el problema.

## 📝 Instrucciones de entrega

1. Clonar tu repositorio de la asignatura o actualizarlo si ya lo tenías clonado.
2. Crear una rama con el nombre `EX002UserManagement` tal como se indica en [este archivo](./entregas/readme.md).
2. En la carpeta `ejercicios/entregas` tal como se indica en [este archivo](./entregas/readme.md), crear un proyecto con el nombre `EX002UserManagement` basado en este [ejemplo](../temario/EX001PooStudent).
3. Implementar la solución del ejercicio en el proyecto `EX002UserManagement` con las clases que se indican en el enunciado.
3. Ejecutar los tests y verificar que todos pasen.
10. Subir el proyecto a tu repositorio de GitHub.
11. Pedir revisión de código (Pull request).

## 🧠 Enunciado
En la construcción de un Portal Web, una de las tareas a realizar es la definición del subsistema de gestión de usuarios. La gestión de usuarios que vamos a tratar contempla mostrar un menú de opciones personalizado al usuario, una vez  ́este ha llevado acabo la autentificación de manera satisfactoria.

La interacción del usuario con el sistema presenta los siguientes pasos:

* El usuario se autentifica ante el sistema introduciendo login y password.
* El sistema de gestión de usuarios ante un login y password correcto muestra al usuario
el menú de operaciones que puede realizar, y un mensaje de autentificación incorrecta en
caso contrario.

El modelado del problema se puede realizar con las siguientes clases:
* User
* Option (Opciones del menú)
* Manager

### Clase `User`
La clase Usuario recoge la información referente a un usuario potencial del Portal Web:
login, su password y su nombre.

## Clase `Option`
La clase `Option` contiene una lista finita de opciones, y métodos para añadir y obtener los
valores de las mismas.
Atributos recomendados:
* Lista de opciones
* Opción seleccionada
* Número máximo de opciones

## Clase `Manager`
La clase gestor es la encargada de gestionar la autentificación de los usuarios, y de mostrar el menú de opciones personalizado al usuario.
Atributos recomendados:
* Lista de usuarios
* Usuario autentificado
* Opción seleccionada
* Número máximo de usuarios

## Tests
Implementar los tests necesarios para validar las opciones de un sistema de gestión
de usuarios, registre una serie de usuarios con opciones personalizados, y pruebe una
autentificación exitosa (listando las opciones) y otra fallida (mostrando un
mensaje por consola).

# 👁️ Nota
- Recuerda que todo lo que se pide en este ejercicio debe estar en Inglés.
- Para cada ejercicio, se recomienda crear una nueva rama en el repositorio de GitHub y, posteriormente, 
solicitar un Pull Request. De esta manera, se podrá mantener un registro claro y organizado de cada ejercicio, lo que facilitará su revisión y seguimiento.
- Recuerda que todo lo que se pide en este ejercicio debe estar en el proyecto `EX002UserManagement` tal como se indica en las instrucciones de entrega.
- Recuerda que todos los tests que realice deben pasar para que el ejercicio sea considerado como entregado.
