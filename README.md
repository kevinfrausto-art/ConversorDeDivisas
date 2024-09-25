Descripción
El Conversor de Monedas es una aplicación simple de consola escrita en Java que permite convertir entre diferentes monedas utilizando la API de ExchangeRate-API. El usuario ingresa una moneda de origen, una moneda de destino y una cantidad a convertir, y la aplicación devuelve la cantidad convertida basada en la tasa de conversión actual entre las dos monedas.

Funcionalidades
Conversión de cualquier cantidad entre dos monedas (por ejemplo, de USD a EUR).
Obtención de la tasa de cambio en tiempo real utilizando la ExchangeRate-API.
Manejo de errores simples, como monedas no válidas o problemas de red.
Requisitos previos
Antes de ejecutar este proyecto, asegúrate de tener lo siguiente instalado en tu sistema:

JDK 11 o superior.
Maven (opcional, si quieres usar Maven para gestionar dependencias).
Conexión a Internet (para conectarse a la API de ExchangeRate).
Instalación
Paso 1: Clonar el repositorio
Clona este repositorio en tu máquina local:

bash
Copiar código
git clone https://github.com/tu-usuario/currency-converter-java.git
cd currency-converter-java
Paso 2: Agregar la biblioteca Gson
Si no usas Maven, descarga el archivo .jar de Gson desde Maven Central y añádelo a tu proyecto.

Si usas Maven, añade la siguiente dependencia en tu archivo pom.xml:

xml
Copiar código
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version> <!-- Asegúrate de usar la última versión disponible -->
</dependency>
Paso 3: Compilar el proyecto
Puedes compilar el proyecto desde tu IDE (IntelliJ IDEA, Eclipse, etc.) o desde la terminal:

bash
Copiar código
javac -cp gson-2.8.9.jar com/currency/converter/CurrencyConverter.java
Paso 4: Ejecutar la aplicación
Ejecuta la aplicación desde tu IDE o desde la terminal:

bash
Copiar código
java -cp .:gson-2.8.9.jar com.currency.converter.CurrencyConverter
Uso
Al ejecutar la aplicación, se te pedirá que ingreses los siguientes datos:

Moneda de origen: El código ISO de 3 letras de la moneda que quieres convertir (por ejemplo, USD para dólares estadounidenses).
Moneda de destino: El código ISO de 3 letras de la moneda a la que quieres convertir (por ejemplo, EUR para euros).
Cantidad a convertir: El monto que deseas convertir.
Ejemplo
bash
Copiar código
Ingresa la moneda de origen (ejemplo: USD): USD
Ingresa la moneda de destino (ejemplo: EUR): EUR
Ingresa la cantidad a convertir: 100
Resultado en consola:

bash
Copiar código
Tasa de conversión: 0.85
Cantidad convertida: 85.0 EUR
Personalización
Clave de la API
La aplicación utiliza la API de ExchangeRate para obtener las tasas de cambio. Se necesita una clave de API para utilizar este servicio. Si tienes tu propia clave de API, reemplaza el valor de API_KEY en el código:

java
Copiar código
private static final String API_KEY = "TU_CLAVE_DE_API_AQUI";
Puedes obtener una clave gratuita en ExchangeRate-API.

Monedas soportadas
Esta aplicación soporta todas las monedas listadas en la API de ExchangeRate-API. Asegúrate de utilizar los códigos de moneda ISO 4217, como USD para dólares, EUR para euros, JPY para yenes japoneses, etc.
 
