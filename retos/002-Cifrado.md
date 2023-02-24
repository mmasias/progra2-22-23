# 💻 ¿Puedes crear un programa para cifrar y descifrar mensajes secretos?

Desde tiempos antiguos, los seres humanos han estado interesados en mantener sus comunicaciones privadas y seguras. Uno de ellos es el cifrado por sustitución. 
> En criptografía, el cifrado por sustitución es un método de cifrado por el que unidades de texto plano son sustituidas con texto cifrado siguiendo un sistema regular; las "unidades" pueden ser una sola letra (el caso más común), pares de letras, tríos de letras, mezclas de lo anterior, entre otros. El receptor descifra el texto realizando la sustitución inversa. [1](https://es.wikipedia.org/wiki/Cifrado_por_sustituci%C3%B3n)



# 📘 Descripción
Supongamos que queremos cifrar la frase "**Hola mundo**" utilizando un cifrado por sustitución. Para ello, elegimos una clave (que puede ser una palabra o una frase) que se usará como base para el cifrado. En este caso, elegimos la clave "**criptografia**".

```
input: Hola mundo
key: criptografia
```

## Paso 1
Lo primero que se hace es eliminar las letras duplicadas de la clave, para evitar que se repitan las sustituciones. Así, nuestra clave queda como "**criptogaf**".

## Paso 2

A continuación, se escribe el alfabeto en orden. En este caso, usaremos el alfabeto español:

```
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
```

Después, se sustituye cada letra del alfabeto por la letra correspondiente en la clave. Por ejemplo, la letra "**A**" se sustituye por la primera letra de la clave, que es "**C**". La letra "**B**" se sustituye por la segunda letra de la clave, que es "**R**", y así sucesivamente. Si alguna letra no aparece en la clave, se deja sin sustituir.

Así, nuestro cifrado por sustitución quedaría como sigue:

```
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
C R I P T O G A F H J K L M N Q S U V W X Y Z E D B
```

# Paso 3
Para cifrar la frase "**Hola mundo**", se sustituye cada letra por la letra correspondiente en el cifrado por sustitución. Por ejemplo, la letra "**H**" se sustituye por la letra "**A**", la letra "**O**" se sustituye por la letra "**N**", y así sucesivamente. El resultado sería la frase cifrada "ANKC LXMPN".

```
A     D       H       L M N O          U
C R I P T O G A F H J K L M N Q S U V W X Y Z E D B
```

```sh
output: ANKC LXMPN
```


Para descifrar la frase, se hace el proceso inverso, es decir, se utiliza la clave para sustituir cada letra de la frase cifrada por la letra correspondiente en el alfabeto original.

## 🧠 ¿Qué se necesita?
* Implementar cifrado donde:
```
input: Hola mundo
key: criptografia
output: ANKC LXMPN
```

Y permitir descifrarlo

```
input: ANKC LXMPN
key: criptografia
output: HOLA MUNDO
```

¿Te animas a descubrir cómo funciona este método y poner en práctica tus habilidades de programación? ¡Acepta el reto y descubre lo emocionante que puede ser el cifrado por sustitución!

# 👁️ Nota
Para la entrega se recomienda leer las instrucciones [acá](./entregas/readme.md).