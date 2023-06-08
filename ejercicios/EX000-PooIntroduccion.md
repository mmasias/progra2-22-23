
# Ejercicio práctico de introducción a la programación orientada a objetos

## 📝 Instrucciones de entrega

1. Clonar el repositorio de la materia o actualizarlo si ya lo tenías clonado.
2. En la carpeta `ejercicios/entregas` tal como se indica en [este archivo](./entregas/readme.md), crear un proyecto con el nombre `EX000PooIntroduction` basado en este [ejemplo](../temario/PooSession2).
3. Implementar la clase `BankAccount` tal como se indica en el enunciado.
4. Implementar la clase `BankAccountTest` tal como se indica en el enunciado.
5. Crear el diagrama de clases para  `BankAccount` con `PlantUML` tal como se indica en el enunciado.
6. Ejecutar los tests y verificar que todos pasen.
7. Subir el proyecto a tu repositorio de GitHub.
8. Pedir revisión de código (Pull request).

## 🧠 Enunciado

### Cuenta bancaria
Crea una clase llamada `BankAccount` que tendrá los siguientes atributos privados: 
- Titular
- Cantidad (puede tener decimales).
- Crea sus métodos get, set.

Tendrá dos métodos especiales:

`deposit(double amount)`: se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.

`withdraw(double amount)`: se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

### Test
Crea una clase `BankAccountTest` donde se pide que se realicen los tests para los siguientes casos:
* Crear una cuenta bancaria con un titular y una cantidad inicial.  
* Crear una cuenta bancaria, ingresar una cantidad en la cuenta.
* Crear una cuenta bancaria, ingresar y retirar una cantidad.

Como agregado extra, se pide que se realicen los tests para los siguientes casos:
* Crear una cuenta bancaria, ingresar una cantidad negativa.
* Crear una cuenta bancaria, retirar una cantidad negativa.
* Crear una cuenta bancaria, retirar una cantidad mayor a la que hay en la cuenta.

### Diagrama de clases
Crea un diagrama de clases para la clase `BankAccount` utilizando `PlantUML` con el nombre `BankAccount.puml` y el diagrama de clases generado con el nombre `BankAccount.png`.
Reflejar en el diagrama de clases los siguientes aspectos:
- La clase `BankAccount` tiene todos sus atributos privados.
- La clase `BankAccount` tiene los métodos `deposit` y `withdraw` públicos.


# 👁️ Nota
- Recuerda que todo lo que se pide en este ejercicio debe estar en Inglés.
- Recuerda que todo lo que se pide en este ejercicio debe estar en el proyecto `EX000PooIntroduction` tal como se indica en las instrucciones de entrega.
- Recuerda que todos los tests que realice deben pasar para que el ejercicio sea considerado como entregado.
