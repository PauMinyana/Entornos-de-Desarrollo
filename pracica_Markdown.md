# Markdown

Markdown es un lenguaje de marcado ligero, una forma de agregar formatos como encabezados, negritas, cursivas, listas... a un texto sin formato utilizando un editor de texto simple. Es decir, una forma rápida de coger apuntes con ordenador y pasarlos a limpio en un solo paso.

```
-Elementos de bloque
  -Párrafos
  -Saltos de línea
  -Encabezados
  -Citas
  -Listas
  -Código de bloque
  -Líneas horizontales
-Elementos de línea
  -Énfasis
  -Links o enlaces
  -Código
  -Imágenes
-Otros elementos
  -Links automáticos
  -Omitir markdown
  -Símbolos matemáticos



```



## Saltos de bloque
Para generar un nuevo párrafo en markdown simplemente separa el textomediante una linea en blaco (pulsando dos veces INTRO).

Lorem ipsum dolor sit amet consectetur adipiscing elit quis odio, porttitor commodo imperdiet rhoncus cursus mollis venenatis sem, netus vitae sociis dictum etiam mus tellus platea.

 Id aliquet sociosqu convallis fermentum ligula lobortis mattis, scelerisque phasellus odio ac urna quis, placerat vestibulum commodo a vitae euismod. 



## Saltos de linea(=lineas de texto)

Para realizar un salto de línea y empezar una frase en una línea siguiente dentro del mismo párrafo, tendrás que pulsar dos veces la barra espaciadora antes de pulsar una vez INTRO  

nombre:  
apellidos:  
dirección:  


## Encabezados

Las almhoadillas o hashtags `# ` es el metodo utilizado en Markdown para crear encabezados. Debes usarlos añadiendo uno por cada nivel y dejando un espacio en blanco `Ejemplo`


## Encabezado 2

### Encabezado 3

#### Encabezado 4


Para poner *cursivas* se enciarra entre un asterisco. Para poner **negritas** encierra entre dos asteriscos. Para poner ***negritas y asterisco*** encierra entre dos asteriscos.

### Lineas horizontales

Para crearlas, en una linea en blanco deberás introducir tres de los sigientes elementos: asteriscos, guiones, o guiones bajos.

***
---
___


### Citas
> Lorem ipsum dolor sit amet consectetur adipiscing elit laoreet, mauris ultrices montes porta mi himenaeos lacinia, phasellus ac facilisis nibh taciti arcu potenti.


### Listas

Para crear listas desordenadas podemos utilizar 3 tipos de simbolos por cada item de la lista: Un asterisco, un gion medio o un simbolo más.

* item 1  
- item 1  
+ item 1
  
Para crear listas ordenadas debes utilizar la sintaxi del tipo 1.

Listas ordenadas  
1. item 1
2. item 2
3. item 3

Para generar listas anidadas (desordenadas u ordenadas) dentro de otras, simplemente tendras que añadair dos o cuatro espacios en blanco.

Listas anidadas

* item 1    
  * item12    
    * item 121
* item 2

### Links o enlaces

Se crean escribiendo la palabra o texto entre [] corchetes, y el link en cuestion entre () paraentesi.

[texto](https://es.wikipedia.org/wiki/Texto)

Sin texto enlazado escribe la URL entre ángulos.

Sin texto enlazado

<https://es.wikipedia.org/wiki/Texto>


### Imagenes

Insertar una imagen con Markdown se realiza de una manera identica a insertar links. En este caso, debes añadir un simbolo de  exclamación al principio y el enlace que es la ubicación de la imagen.

![texto_alternativo](https://upload.wikimedia.org/wikipedia/commons/f/fe/Portada_N%C2%BA1_de_La_Flaca.JPG "Miguel de cervantes")

### Tablas

Markdown permite dibujar mediante plecas |. Cada celda esta separada por uno de estos caracteres. Para crear encabezados que se distinguen visualmente del resto del contenido, se subrayan las celdas correspondientes con guines.

|columna 1| Columna 2|
|---------|----------|
|uno      |dos       |
|tres     |cuatro    |
|cinco    |seis      |


### Líneas de código

Encerrando el código entre acentos graves.

`<html lang="es">`

### Bloque de código

Para crear un bloque entero que contenga código lo único que tienes que hacer es encerrar dicho párrafo entre dos lineas formadas por tres ~ o tres acentos graves

```html
<head>
    <meta charset="UTF-8" />
    <meta http-euiv="X-UA-Compatible" content="IE=edge" />
    <title>Document</title>

</head>
```


### Omitir Markdown

Como escribir ciertos símbolos como \* o \#, sin que markdown los interprete para convertirlos en negrita.
Escribiendo justo delante del símbolo la barra invertida \.

Esto es un asterisco \*

### Escritura Matemàtica


En linea encerrando la formula entre signos\$.
En párrafos centrados, encerrando la fórmula entre dos signos de \$$.
* Fórmulas en línea: $(a+b)² = a²+b²+2ab$

* Fórmulas centradas:
  $$a²-b²=(a+b)·(a-b)$$

* Radiales:
  
    $$\sqrt{a²-b²}$$
* Fracciones:
    $$ \text x = \frac {-b \pm \sqrt {b^2-4ac}}{2a}$$
* Parentesis grandes:
    $$\left (\sqrt {x²}\right)^{2}$$

* Colores:
  $$\color{yellow}{A}\color{black}{aBb123}