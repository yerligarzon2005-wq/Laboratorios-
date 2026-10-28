java-lab-06/
├── practice-6-1/      # Verificación y herramientas del JDK, JRE y JVM
├── practice-6-2/      # Compilación, bytecode y desensamblado
│   ├── ExecutionFlow.java
│   └── out/
│       └── ExecutionFlow.class
├── practice-6-3/      # Stack, marcos de ejecución y llamadas a métodos
│   └── MethodStack.java
├── practice-6-4/      # Heap, objetos, referencias e identidad
│   └── ObjectReferences.java
├── practice-6-5/      # Paso de parámetros por valor (Caso PetMatch)
│   └── MemoryDemo.java
└── memory-challenge/  # Reto integrador de referencias y objetos
    ├── PetProfile.java
    └── MemoryChallenge.java


Resumen de Prácticas y Resultados

Práctica 6.1 — Herramientas del entorno (JDK, JRE y JVM)

Se verificaron las herramientas del kit de desarrollo mediante la consola:

java --version: Verifica la versión de la máquina virtual/lanzador.

javac --version: Comprueba la disponibilidad del compilador de Java.

javap -version: Valida la herramienta de desensamblado de bytecode.

Práctica 6.2 — Compilación, Bytecode y Ciclo de Ejecución

Se compiló el archivo ExecutionFlow.java redirigiendo la salida hacia el directorio out/ e inspeccionando su bytecode con javap.

Comandos:

cd practice-6-2
javac -d out ExecutionFlow.java
java -cp out ExecutionFlow
javap -classpath out -c -p ExecutionFlow


Resultado de ejecución:

Total: 12


Práctica 6.3 — Stack: Métodos, Parámetros y Variables Locales

Se analizó cómo la JVM gestiona los Stack Frames (marcos de ejecución) en cada invocación y retorno de método con MethodStack.java.

Comandos:

cd practice-6-3
javac MethodStack.java
java MethodStack


Resultado de ejecución:

Final result: 11


Práctica 6.4 — Heap: Objetos, Referencias e Identidad

Se estudió la diferencia entre variables de tipo referencia y objetos almacenados en el Heap con ObjectReferences.java.

Comandos:

cd practice-6-4
javac ObjectReferences.java
java ObjectReferences


Resultado de ejecución:

First and alias: true
First and independent: false
First name: Sol
Independent name: Luna


Práctica 6.5 — Paso de Parámetros y Caso Real PetMatch

Se demostró que Java pasa todos los argumentos por valor, analizando la mutación de estado frente a la reasignación de parámetros locales con MemoryDemo.java.

Comandos:

cd practice-6-5
javac MemoryDemo.java
java MemoryDemo


Resultado de ejecución:

Dentro: Otra
Fuera: Sol


Práctica 6.6 — Reto Integrador y Diagnóstico

Se integraron múltiples clases (PetProfile.java y MemoryChallenge.java) para validar el manejo de alias, estados, parámetros e identidad de objetos.

Comandos:

cd memory-challenge
javac PetProfile.java MemoryChallenge.java
java MemoryChallenge


Resultado de ejecución:

Inside: Nova (1)
Outside: Luna (1)
Same reference: true
Replacement: Max (0)


📌 Conceptos Clave Aprendidos

Bytecode e Instrucciones JVM: javac genera código intermedio (.class) que la JVM interpreta o compila a código nativo mediante JIT.

Stack (Pila de ejecuciones): Almacena marcos de llamada con variables locales y parámetros. Se destruyen al retornar el método.

Heap (Memoria compartida): Reserva espacio para las instancias de objetos y arreglos.

Paso por Valor: Java copia el valor del argumento. En tipos de objeto, copia el valor de la referencia, permitiendo modificar las propiedades del objeto pero no cambiar la variable original del llamador mediante reasignación local.