:boom: Pokedex JavaFX - PokeAPI

Aplicación de escritorio desarrollada en JavaFX que consume la API pública de Pokémon para mostrar información de distintos Pokémon en una interfaz gráfica sencilla.

La aplicación permite buscar Pokémon por nombre y visualizar algunos de sus datos principales obtenidos desde la API.

🚀 Tecnologías utilizadas

Java

JavaFX

Maven

Gson

HTTP Client (java.net.http)

PokeAPI

API utilizada: https://pokeapi.co/

📸 Funcionalidades

 ✔ Buscar Pokémon por nombr
 ✔ Mostrar nombre del Pokémon 
 ✔ Mostrar altura 
 ✔ Mostrar estadísticas principales

HP

Attack

Defense

✔ Mostrar sprite (imagen) del Pokémon 
✔ Manejo básico de errores cuando el Pokémon no existe

🧠 Funcionamiento

La aplicación realiza una petición HTTP a la API de Pokémon y transforma la respuesta JSON en objetos Java utilizando Gson.

Ejemplo de petición a la API:

https://pokeapi.co/api/v2/pokemon/{nombre}

Los datos recibidos se transforman en clases Java como:

Atributos

Stat

Sprites

Posteriormente se muestran en la interfaz JavaFX.

src
 ├── main
 │   ├── java
 │   │    └── org.example.pokeapi
 │   │          ├── Main.java
 │   │          ├── MainController.java
 │   │          ├── Controller.java
 │   │          ├── model
 │   │          │     ├── Atributos.java
 │   │          │     ├── Stat.java
 │   │          │     └── Sprites.java
 │   │
 │   └── resources
 │         └── main.fxml

1️⃣ Ejecutar la aplicación 
2️⃣ Introducir el nombre del Pokémon 
3️⃣ Pulsar buscar 
4️⃣ Se mostrarán los datos del Pokémon

:warning: Manejo de errores

Si el Pokémon no existe o hay un error en la petición, la aplicación muestra:

No encontrado

y limpia los datos de la interfaz.

📦 Instalación

Clonar el repositorio:

1. git clone https://github.com/tuusuario/pokedex-javafx.git

2. Abrir el proyecto en IntelliJ IDEA o cualquier IDE compatible con Maven.

3. Ejecutar la clase:

4. Main.java 💡 Mejoras futuras

5. Mostrar tipos de Pokémon

6. Mostrar más estadísticas

7. Historial de búsquedas

8. Autocompletado de Pokémon

9. Mostrar habilidades

10. Mejor diseño UI

📚 Recursos

https://pokeapi.co/

https://openjfx.io/

https://github.com/google/gson

:man: Autor

Proyecto desarrollado por Camilo como práctica de consumo de APIs con Java y JavaFX.
