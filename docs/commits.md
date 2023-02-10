# Convenciones 

Tal como lo indican los de [Commits Convencionales
](https://www.conventionalcommits.org/en/v1.0.0/) estas normas son para tener commits más legibles para humanos y máquinas.

* Escribir todo en Inglés
* Cada línea no debe sobrepasar los 80 caracteres.

Para la clase se sugieren lo siguiente.

```
<tipo>[ámbito opcional]: <descripción>

[cuerpo opcional]

[nota(s) al pie opcional(es)]
```

## Tipos
* **fix**: corrige un error en la base del código
* **feature**: introduce una nueva funcionalidad en la base del código
* **docs**: cambios en la documentación
* **test**: cuando se ha agregado o corregido algún test
* **refactor**: cambios en codigo ya existente que no sean para corregir bugs o agregar una nueva funcionalidad.

## Ámbitos

Un ámbito puede ser añadido al tipo de un commit, para proveer información adicional contextual y debe ser contenido entre paréntesis, ej., ``` feature(parser): add ability to parse arrays.```

A modo de ejemplo se listan algunos.

* **class**: al añadir una clase
* **diagram**: al añadir un diagrama
* **method**: al agregar un nuevo metodo a una clase

