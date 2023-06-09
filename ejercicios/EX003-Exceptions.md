# Ejercicio práctico de introducción a la programación orientada a objetos

Se recomienda que antes de empezar a programar, leas el enunciado completo y te hagas una idea de cómo se va a resolver el problema.

## 📝 Instrucciones de entrega

1. Clonar tu repositorio de la asignatura o actualizarlo si ya lo tenías clonado.
2. Crear una rama con el nombre `EX004Exceptions` tal como se indica en [este archivo](./entregas/readme.md).
3. En la carpeta `ejercicios/entregas` tal como se indica en [este archivo](./entregas/readme.md), crear un proyecto con el nombre `EX004Exceptions` basado en este [ejemplo](../temario/EX001PooStudent).
4. Implementar la solución del ejercicio en el proyecto `EX004Exceptions` con las clases que se indican en el enunciado.
5. Para este ejercicio no hace falta realizar tests (Opcional).
6. Subir el proyecto a tu repositorio de GitHub.
7. Pedir revisión de código (Pull request).

## 🧠 Enunciado - Inventario

Según el proyecto base de Excepciones ([Lo puedes encontrar acá](../temario/Exceptions)), se requiere crear una aplicación demo para 
gestionar un inventario. Este inventario puede ser de cualquier tipo de producto, por ejemplo, un inventario de libros, de películas, de productos de supermercado, etc.

Actualmente, en el proyecto base se gestiona solo un array de `String` (Puede cambiarlo y manejar una clase) y se controla que no se agreguen más de 10 elementos, si esto sucede, se lanza una excepción de tipo `FullStorageException`.

Por lo que se requiere lo siguiente:

### 📝 Requisitos

1. En la clase Main, se debe crear un menú para que el usuario pueda agregar productos al inventario, listar los productos del inventario, cargar de un archivo el inventario inicial y salir de la aplicación.
2. La clase Inventory debe tener un constructor que reciba el tamaño máximo del inventario y un constructor por defecto que inicialice el inventario con un tamaño máximo de 10 elementos.
3. La clase `Inventory` debe tener un método `addItem` que reciba un item y lo agregue al inventario. Este método debe lanzar una excepción de tipo `FullStorageException` si el inventario está lleno.
3. La clase `Inventory` debe tener un método `listItems` que liste todos los items del inventario.
4. La clase `Inventory` debe tener un método `loadItems` que reciba un array de items y los agregue al inventario. Este método debe lanzar una excepción de tipo `FullStorageException` si el inventario está lleno.
5. La clase `Inventory` debe tener un método `loadItemsFromFile` que reciba el nombre de un archivo y cargue los items del inventario desde el archivo. Este método debe lanzar una excepción de tipo `FullStorageException` si el inventario está lleno.

> Nota: Recuerda que el inventario debe ser utilizado en la clase Main. En inventario no debe tener ningún método que imprima por consola o una acción que sea propia de la clase Main, solo debe tener los métodos que se indican en los requisitos.

### 📝 Consideraciones opcionales

1. El inventario debe ser un array de objetos de tipo `Item` (Puede cambiarlo y manejar una clase).
2. El inventario debe tener un tamaño máximo de 10 elementos.
3. El inventario debe tener un método `isFull` que retorne `true` si el inventario está lleno y `false` si no lo está.
4. El inventario debe tener un método `isEmpty` que retorne `true` si el inventario está vacío y `false` si no lo está.
5. El inventario debe tener un método `getItems` que retorne el array de items del inventario.
6. El inventario debe tener un método `getItemsCount` que retorne la cantidad de items del inventario.
7. El inventario debe tener un método `getItem` que reciba un índice y retorne el item del inventario en esa posición.

## Demo

### Menu
[Screenshot]

### Agregar item
[Screenshot]

### Listar items
[Screenshot]

### Cargar items desde archivo
[Screenshot]

### Salir
[Screenshot]

## Tests
Se pueden implementar los tests necesarios para validar el correcto funcionamiento de todas las funcionalidades implementadas en las diferentes clases.

# 👁️ Nota
- Recuerda que todo lo que se pide en este ejercicio debe estar en Inglés.
- Para cada ejercicio, se recomienda crear una nueva rama en el repositorio de GitHub y, posteriormente, 
solicitar un Pull Request. De esta manera, se podrá mantener un registro claro y organizado de cada ejercicio, lo que facilitará su revisión y seguimiento.
- Recuerda que todo lo que se pide en este ejercicio debe estar en el proyecto `EX004Exceptions` tal como se indica en las instrucciones de entrega.
- Recuerda que todos los tests que realice deben pasar para que el ejercicio sea considerado como entregado.
