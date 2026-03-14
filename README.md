:boom: Pokedex JavaFX - PokeAPI

Aplicación de escritorio desarrollada en JavaFX que consume la API pública de Pokémon para mostrar información de distintos Pokémon en una interfaz gráfica sencilla.

La aplicación permite buscar Pokémon por nombre o ID y visualizar algunos de sus datos principales obtenidos desde la API.

🚀 Tecnologías utilizadas

Java

JavaFX

Maven

Gson

HTTP Client (java.net.http)

PokeAPI

API utilizada: https://pokeapi.co/

📸 Funcionalidades

✔ Buscar Pokémon por nombre o ID ✔ Mostrar nombre del Pokémon ✔ Mostrar altura ✔ Mostrar estadísticas principales

HP

Attack

Defense

✔ Mostrar sprite (imagen) del Pokémon ✔ Manejo básico de errores cuando el Pokémon no existe

🧠 Funcionamiento

La aplicación realiza una petición HTTP a la API de Pokémon y transforma la respuesta JSON en objetos Java utilizando Gson.

Ejemplo de petición a la API:

https://pokeapi.co/api/v2/pokemon/{nombre}

Los datos recibidos se transforman en clases Java como:

Atributos

Stat

Sprites

Posteriormente se muestran en la interfaz JavaFX.

📂 Estructura del proyecto src ├── main │ ├── java │ │ └── org.example.pokeapi │ │ ├── Main.java │ │ ├── MainController.java │ │ ├── Controller.java │ │ ├── model │ │ │ ├── Atributos.java │ │ │ ├── Stat.java │ │ │ └── Sprites.java │ │ │ └── resources │ └── main.fxml 🔎 Ejemplo de uso

1️⃣ Ejecutar la aplicación 2️⃣ Introducir el nombre o ID del Pokémon 3️⃣ Pulsar buscar 4️⃣ Se mostrarán los datos del Pokémon

⚠ Manejo de errores

Si el Pokémon no existe o hay un error en la petición, la aplicación muestra:

No encontrado

y limpia los datos de la interfaz.

📦 Instalación

Clonar el repositorio:

git clone https://github.com/tuusuario/pokedex-javafx.git

Abrir el proyecto en IntelliJ IDEA o cualquier IDE compatible con Maven.

Ejecutar la clase:

Main.java 💡 Mejoras futuras

Mostrar tipos de Pokémon

Mostrar más estadísticas

Historial de búsquedas

Autocompletado de Pokémon

Mostrar habilidades

Mejor diseño UI

📚 Recursos

https://pokeapi.co/

https://openjfx.io/

https://github.com/google/gson

👩‍💻 Autor

Proyecto desarrollado por Nerea como práctica de consumo de APIs con Java y JavaFX.

💡 Si quieres, también puedo hacerte:

un README con diseño brutal para GitHub (con badges, GIF y capturas)

un GIF de demostración de la app

una portada visual para tu repositorio (queda mucho más profesional).
