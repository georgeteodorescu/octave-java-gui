# Octave Java GUI

This project is a Java-based graphical user interface (GUI) for [GNU Octave](https://www.gnu.org/software/octave/). It was developed as part of the coursework for the **User Interface Design and Graphics** course.

## About the Project

The purpose of this project is to create a simple, yet functional, GUI for Octave. This GUI was developed in Java using [JavaFX](https://openjfx.io/) for the graphical components.

> **Note:** This is an independent project and is not affiliated with or endorsed by the official GNU Octave project.

### Credits

The icons used in this project were sourced from the original Octave project [GNU Octave project](https://github.com/gnu-octave/octave).

## How to Compile and Run the Project

### Prerequisites

Before you can compile and run this project, you need to have the following software installed on your system:

- **Java Development Kit (JDK) 19 or later**
- **Apache Maven**
- **JavaFX SDK 19 or later**

### Step-by-Step Guide

1. **Clone the Repository**

   First, clone this repository to your local machine using the following command:

   ```bash
   git clone https://github.com/georgeteodorescu/octave-java-gui.git
   cd OctaveJavaGUI
    ```

2. **Install JavaFX SDK**

   Download the JavaFX SDK from the official [JavaFX website](https://openjfx.io/) and extract it to a directory on your system. Make sure to note the path where you extracted it.


3. **Compile the Project**

   Use Maven to compile the project. Navigate to the project directory and run:
    ```bash
    mvn clean install
    ``` 

4. **Run the Project**  

   After compiling, you can run the project using Maven:
    ```bash
    mvn javafx:run
    ```
   Alternatively, if you're using an IDE like IntelliJ IDEA, make sure the JavaFX SDK is correctly set up in your project settings, and run the main class `com.octavegui.octavegui.OctaveGUIApplication` from the IDE.


## License

This project is licensed under the [MIT License](https://github.com/georgeteodorescu/octave-java-gui/blob/main/LICENSE). You are free to use, modify, and distribute this software under the terms of this license.


## Disclaimer

This project is an academic assignment created for educational purposes only. It is not intended for commercial use and is provided "as-is" without any warranties or guarantees. For the official GNU Octave project, please visit https://www.gnu.org/software/octave/.
