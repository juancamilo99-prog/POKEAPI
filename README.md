:boom: Pokedex JavaFX - PokeAPI

Aplicación de escritorio desarrollada en JavaFX que consume la API pública de Pokémon para mostrar información de distintos Pokémon en una interfaz gráfica sencilla.

La aplicación permite buscar Pokémon por nombre y visualizar algunos de sus datos principales obtenidos desde la API.

🚀 Tecnologías utilizadas

    1. Java

    2. JavaFX

    3. Maven

    4. Gson

    5. HTTP Client (java.net.http)
\
:eyes: PokeAPI 

:computer: API utilizada:

    https://pokeapi.co/

📸 Funcionalidades

    ✔ Buscar Pokémon por nombre o ID
    ✔ Mostrar nombre del Pokémon
    ✔ Mostrar altura
    ✔ Mostrar estadísticas principales
        Estadisticas principales: 
            1. HP
            2. Attack
            3. Defense

    ✔ Mostrar sprite (imagen) del Pokémon
    ✔ Manejo básico de errores cuando el Pokémon no existe
\
🧠 Funcionamiento

La aplicación realiza una petición HTTP a la API de Pokémon y transforma la respuesta JSON en objetos Java utilizando Gson.

Ejemplo de petición a la API:

    https://pokeapi.co/api/v2/pokemon/{nombre}

Los datos recibidos se transforman en clases Java como:

    Atributos
    Stat
    Sprites
    Posteriormente se muestran en la interfaz JavaFX.

\
📂 Estructura del proyecto
            
        ├── main\
        │   ├── java\
        │   │    └── org.example.pokeapi\
        │   │          ├── Main.java\
        │   │          ├── MainController.java\
        │   │          ├── Controller.java\
        │   │          ├── model\
        │   │          │     ├── Atributos.java\
        │   │          │     ├── Stat.java\
        │   │          │     └── Sprites.java\
        │   │
        │   └── resources\
        │         └── main.fxml\

\
🔎 Ejemplo de uso

    1️⃣ Ejecutar la aplicación
    2️⃣ Introducir el nombre del Pokémon
    3️⃣ Pulsar buscar
    4️⃣ Se mostrarán los datos del Pokémon
    
:warning: Manejo de errores

    1. Si el Pokémon no existe o hay un error en la petición, la aplicación muestra:
        
        No encontrado y limpia los datos de la interfaz.

📦 Instalación

    Clonar el repositorio:

    git clone https://github.com/tuusuario/pokedex-javafx.git

    Abrir el proyecto en IntelliJ IDEA o cualquier IDE compatible con Maven.

    Ejecutar la clase:

        1. Main.java💡 Mejoras futuras
        2. Mostrar tipos de Pokémon
        3. Mostrar más estadísticas
        4. Historial de búsquedas
        5. Autocompletado de Pokémon
        6. Mostrar habilidades
        7. Mejor diseño UI
\
📚 Recursos

    1. https://pokeapi.co/
    2. https://openjfx.io/
    3. https://github.com/google/gson
\
:man: Autor\
    Proyecto desarrollado por Camilo como práctica de consumo de APIs con Java y JavaFX.
