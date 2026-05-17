# Analizador Léxico, Sintáctico y Semántico con ANTLR4 + JavaScript

Trabajo práctico realizado utilizando ANTLR4 y JavaScript con Node.js.

El proyecto implementa:

* Análisis léxico
* Análisis sintáctico
* Generación de árbol de derivación
* Interpretación básica mediante Visitor
* Manejo de errores sintácticos

---

REQUISITOS

Antes de ejecutar el proyecto es necesario tener instalado:

* Node.js
* Java JDK 11 o superior
* ANTLR4

---

CLONAR EL REPOSITORIO

Ejecutar:

git clone https://github.com/TU_USUARIO/TU_REPOSITORIO.git

Luego ingresar a la carpeta del proyecto:

cd ssl-antlr-calculator

---

INSTALAR DEPENDENCIAS

Ejecutar:

npm install

---

GENERAR LEXER Y PARSER

Ubicar el archivo:

antlr-4.13.2-complete.jar

en la raíz del proyecto y ejecutar:

java -jar antlr-4.13.2-complete.jar -Dlanguage=JavaScript -visitor -o generated Calculator.g4

Esto generará automáticamente:

* Lexer
* Parser
* Visitor
* Listener

dentro de la carpeta:

generated/

---

EJECUTAR LA APLICACIÓN

El archivo analizado por el programa es:

input.txt

Para ejecutar el analizador:

node index.js

---

PROBAR LOS EJEMPLOS INCLUIDOS

El repositorio incluye ejemplos válidos e inválidos:

Ejemplos correctos:

* correct_example_1.txt
* correct_example_2.txt

Ejemplos incorrectos:

* incorrect_example_1.txt
* incorrect_example_2.txt

Para probar cualquiera de ellos:

1. Abrir el archivo deseado
2. Copiar el contenido
3. Pegarlo dentro de input.txt
4. Ejecutar:

node index.js

---

EJEMPLO VÁLIDO

Entrada:

function suma(a,b){
console.log(a+b);
}

Salida esperada:

TABLA DE TOKENS

Lexema: function -> Token: FUNCTION
Lexema: suma -> Token: Identifier
...

Entrada válida.

Árbol de derivación:
(program ...)

Función detectada: suma

Variable encontrada: a
Variable encontrada: b

console.log => 2

---

EJEMPLO INVÁLIDO

Entrada:

function test(x){
console.log(x+);
}

Salida esperada:

Error sintáctico en línea X, columna Y

