# Ejercicio práctico de introducción a la programación orientada a objetos

Se recomienda que antes de empezar a programar, leas el enunciado completo y te hagas una idea de cómo se va a resolver el problema.

## 📝 Instrucciones de entrega

1. Clonar tu repositorio de la asignatura o actualizarlo si ya lo tenías clonado.
2. Crear una rama con el nombre `EX003Inheritance` tal como se indica en [este archivo](./entregas/readme.md).
3. En la carpeta `ejercicios/entregas` tal como se indica en [este archivo](./entregas/readme.md), crear un proyecto con el nombre `EX002UserManagement` basado en este [ejemplo](../temario/EX001PooStudent).
4. Implementar la solución del ejercicio en el proyecto `EX003Inheritance` con las clases que se indican en el enunciado.
5. Ejecutar los tests y verificar que todos pasen.
6. Subir el proyecto a tu repositorio de GitHub.
7. Pedir revisión de código (Pull request).

## 🧠 Enunciado
Del ejercicio anterior de EX002UserManagement, vamos a crear una jerarquía de clases para gestionar los usuarios y las opciones de un sistema de gestión de usuarios.
Para implementar herencia en este ejercicio, se pueden crear dos clases hijas que hereden de la clase User: Admin y RegularUser. La clase Admin tendría un atributo adicional para indicar si el usuario es un administrador o no, y la clase RegularUser no tendría ningún atributo adicional.

También se puede crear una clase hija de la clase Option, llamada MenuOption, que tenga un atributo adicional para indicar la descripción de la opción.

Finalmente, se puede crear una clase hija de la clase Manager, llamada UserManager, que tenga métodos adicionales para registrar y autenticar usuarios, y que utilice las clases Admin y RegularUser para distinguir entre los diferentes tipos de usuarios.

La estructura de las clases podría quedar así:

###  Clase `User`

- login: String
- password: String
- name: String
- getUsername(): String
- getPassword(): String
- getName(): String
- setUsername(String username): void
- setPassword(String password): void
- setName(String name): void

### Clase `Admin`

- isAdmin: boolean
- isAdmin(): boolean
- setAdmin(boolean isAdmin): void

### Clase `RegularUser`
(no tiene atributos adicionales)

### Clase `Option`

- options: List<String>
- selectedOption: int
- maxOptions: int
- addOption(String option): void
- getOption(int index): String
- selectOption(int index): void
- getSelectedOption(): String

### Clase `MenuOption`

- description: String
- getDescription(): String
- setDescription(String description): void

### Clase `Manager`

- users: List<User>
- authenticatedUser: User
- selectedOption: MenuOption
- maxUsers: int
- addUser(User user): void
- authenticateUser(String username, String password): boolean
- showMenu(): void

Clase `UserManager` (hereda de Manager)

- registerUser(User user): void
- isUserAdmin(User user): boolean

## Tests
Se pueden implementar los tests necesarios para validar el correcto funcionamiento de todas las funcionalidades implementadas en las diferentes clases.

# 👁️ Nota
- Recuerda que todo lo que se pide en este ejercicio debe estar en Inglés.
- Para cada ejercicio, se recomienda crear una nueva rama en el repositorio de GitHub y, posteriormente, 
solicitar un Pull Request. De esta manera, se podrá mantener un registro claro y organizado de cada ejercicio, lo que facilitará su revisión y seguimiento.
- Recuerda que todo lo que se pide en este ejercicio debe estar en el proyecto `EX003Inheritance` tal como se indica en las instrucciones de entrega.
- Recuerda que todos los tests que realice deben pasar para que el ejercicio sea considerado como entregado.
