# Java Projects

Welcome to the Java Projects repository! This repository contains various Java-based projects, each with its unique functionality and purpose. Below, you will find an overview of the projects, setup instructions, and guidelines for contributing.

## Table of Contents
- [Projects](#projects)
- [Weather App GUI](#weather-app-gui)
- [Requirements](#requirements)
- [Setup](#setup)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Projects

### Weather App GUI

#### Introduction
The Weather App is a Java-based application that provides users with real-time weather information for a specified location. It fetches weather data from an external API and displays it in a graphical user interface (GUI). The application presents weather details, including temperature, weather condition, humidity, and wind speed.

#### Technologies Used
- Java 18
- [JSON Simple](https://code.google.com/archive/p/json-simple/downloads) - Used to parse and read JSON data.
- [HTTPURLConnection](https://docs.oracle.com/en/java/javase/11/docs/api/java.net/java/net/HttpURLConnection.html) - Java's built-in library for making HTTP requests to fetch data from an external API.

#### Class Summaries
- **AppLauncher**: Serves as the entry point for the Weather App. It initializes the GUI and displays the main application window.
- **WeatherAppGui**: Represents the graphical user interface (GUI) of the Weather App. It is responsible for displaying weather information for a specified location.
- **WeatherApp**: Contains the backend logic for fetching weather data from an external API. It retrieves geographic coordinates for a location, fetches weather data, and updates the GUI with the retrieved information.

For more details, check the [WeatherApp README](WeatherApp/README.md).

## Requirements
- Java 18 or higher
- Gradle
- Internet connection (for API-based projects)

## Setup
1. **Clone the repository**:
   ```sh
   git clone https://github.com/Mamiololo01/Java_Projects.git
   cd Java_Projects

./gradlew build


Running the Weather App GUI
1. Navigate to the WeatherApp directory:  cd WeatherApp 
2. Run the application:  ./gradlew run

