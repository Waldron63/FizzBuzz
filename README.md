# FizzBuzz

## Introducción

**FizzBuzz** es un clásico problema de programación que consiste en iterar sobre una secuencia de números enteros y aplicar la siguiente regla: si el número es divisible por 3 se imprime `Fizz`, si es divisible por 5 se imprime `Buzz`, si es divisible por ambos se imprime `FizzBuzz`, y en cualquier otro caso se imprime el número tal cual.

Este repositorio fue generado siguiendo la metodología **TDD (Test-Driven Development)**: primero se escribieron todas las pruebas unitarias que definían el comportamiento esperado de la función `fizzbuzz`, y posteriormente se implementó el código base para que dichas pruebas pasaran satisfactoriamente. Esto garantiza que cada línea de código producida tiene un propósito claro y verificable.

---

## Prerrequisitos

Asegúrate de tener instaladas las siguientes herramientas antes de ejecutar el proyecto:

| Herramienta | Versión mínima | Comando de verificación |
|-------------|---------------|------------------------|
| Java (JDK)  | 17            | `java -version`        |
| Maven       | 3.8+          | `mvn -version`         |

---

## Instalación

Sigue estos pasos para ejecutar el proyecto localmente:

1. **Clona el repositorio**
   ```bash
   git clone https://github.com/Waldron63/FizzBuzz.git
   cd FizzBuzz
   ```

2. **Compila el proyecto con Maven**
   ```bash
   mvn compile
   ```

3. **Ejecuta las pruebas unitarias**
   ```bash
   mvn test
   ```

4. **Ejecuta la aplicación principal**
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.fizzBuzz.App"
   ```

---

## Entorno

### Estructura del proyecto

```
FizzBuzz/
├── pom.xml
└── src/
    ├── main/com/example/
    │   └── fizzBuzz/
    │       ├── App.java
    │       ├── FizzBuzz.java
    │       ├── FizzBuzzRefactor.java
    │       └── FizzBuzzRefactor2.java
    └── test/com/example/
        └── fizzBuzz/
            └── FizzBuzzTest.java
```

### TDD

Las pruebas unitarias de `FizzBuzzTest.java` se escribieron antes del código base siguiendo el ciclo Red-Green-Refactor. A continuación se explica el propósito de cada una:

| Test | Descripción |
|------|-------------|
| `given_FizzBuzz_When_Input1_Then_Expected1` | Verifica que un número entero positivo que no es múltiplo de 3 ni de 5 devuelve el número como cadena. Cubre el caso base más simple del problema. |
| `given_FizzBuzz_When_Input3_Then_ExpectedFizz` | Verifica que un múltiplo de 3 (y no de 5) devuelve `"Fizz"`. Valida la primera regla de la lógica FizzBuzz. |
| `given_FizzBuzz_When_Input5_Then_ExpectedBuzz` | Verifica que un múltiplo de 5 (y no de 3) devuelve `"Buzz"`. Valida la segunda regla de la lógica FizzBuzz. |
| `given_FizzBuzz_When_Input15_Then_ExpectedFizzBuzz` | Verifica que un múltiplo de 15 (divisible por 3 y por 5) devuelve `"FizzBuzz"`. Cubre la regla combinada del problema. |
| `given_FizzBuzz_When_Input0_Then_ExpectedFizzBuzz` | Verifica que el 0, divisible tanto por 3 como por 5, devuelve `"FizzBuzz"`. Cubre el caso límite del número neutro. |
| `given_FizzBuzz_When_InputMinus3_Then_ExpectedFizz` | Verifica que un número negativo múltiplo de 3 como `-3` devuelve `"Fizz"`. Asegura que la lógica funciona con enteros negativos. |
| `given_FizzBuzz_When_InputMinus5_Then_ExpectedBuzz` | Verifica que un número negativo múltiplo de 5 como `-5` devuelve `"Buzz"`. Extiende la cobertura de negativos a la segunda regla. |
| `given_FizzBuzz_When_InputMinus15_Then_ExpectedFizzBuzz` | Verifica que `-15`, múltiplo negativo de 3 y 5, devuelve `"FizzBuzz"`. Confirma la regla combinada para números negativos. |
| `given_FizzBuzz_When_InputMinus4_Then_Expected1` | Verifica que un número negativo que no cumple ninguna regla, como `-4`, devuelve la cadena `"-4"`. Cierra la cobertura del caso base para negativos. |

---

## Servicios

### `FizzBuzz`
Implementación original con estructura `if / else if / else`. Evalúa primero la condición combinada (divisible por 3 **y** 5) y luego las condiciones individuales, devolviendo directamente el resultado en cada rama.

### `FizzBuzzRefactor`
Versión refactorizada que construye la respuesta de forma acumulativa usando una cadena vacía. Evalúa cada divisor de forma independiente con `if` (no `else if`), lo que elimina la necesidad de una condición combinada explícita.

### `FizzBuzzRefactor2`
Segunda refactorización orientada a la extensibilidad: utiliza un `HashMap<Integer, String>` para almacenar los pares divisor→etiqueta. Permite añadir nuevas reglas sin modificar la lógica central del método `fizzbuzz`.

### `App`
Clase principal con el método `main` que ejecuta el programa. Itera del 1 al 100, imprime por consola el resultado de `FizzBuzz.fizzbuzz(i)` para cada número y sirve como punto de entrada de la aplicación.

---

## Ejecución

Ejecución del proyecto mediante App:

<img width="1819" height="942" alt="image" src="https://github.com/user-attachments/assets/078bd617-1af6-4ae2-a25e-bf0cb647dcfb" />

Ejecución de las pruebas unitarias:

<img width="1808" height="950" alt="image" src="https://github.com/user-attachments/assets/e9b95a54-4259-454e-b952-8e93b0cde7cb" />

---

## Construido con

- [Java 17](https://www.java.com/es/) — Lenguaje de programación principal
- [Maven 3.8+](https://maven.apache.org/index.html) — Gestión de dependencias y ciclo de vida del proyecto
- [JUnit Jupiter 5.7.1](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.7.1) — Framework de pruebas unitarias
- [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/) — Entorno de desarrollo recomendado
- [Git y Github](https://git-scm.com) — Plataforma y control de versiones

---

## Autor

**Waldron63** — [Waldron63](https://github.com/Waldron63)
