# Super-Hyper-Idol-Board
- Alberto Ferrada Rivas
- Tomás Contreras Kong
Java application for drawing UML diagrams.

# Usage
El uso para los diferentes botones, es similiar.
Lo primero que hay que hacer para comenzar, es crear una clase, esto se hace con el botón "Create Class".
Notar que al ser creada la clase, ésta tiene un borde azul, eso significa que el foco está en ella, y por 
ende los botones y modificadores actuarán sobre ella. Cualquier clase puede ser clickeada y arrastrada con el mouse.
Para eliminar una clase, ésta se debe focusear y posteriormente clickear en "Delete Class".
Para cambiar el color de una clase, hay que focusear la clase deseada, seleccionar un color, y presionar el botón
 "Change Color".
Para añadir un atributo o método a una clase, se debe escribir en el campo de text, el nombre del atributo o método
y presionar en Add Attribute o Add Method.

# Actualización Examen de Recuperación
Las principales mejoras que tuvimos en estos días fueron las siguientes.
- Mejoras en Experiencia de Usuario (la interfaz es más intuitiva).
- Al añadir atributos y métodos a una clase, ya no hay un JLabel en la esquina superior izquierda del Canvas.
<<<<<<< HEAD
- El punto anterior requirió de una reorganización completa de CanvasClass.java y sus atributos y métodos. Particularmente para su orden y legilibilidad.
- Implementamos correctamente el guardado de la pantalla mediante Serialización (a excepcion un bug).
=======
- El punto anterior requirió de una reorganización completa de CanvasClass.java y sus atributos y métodos.
Particularmente para su orden y legilibilidad.
- Implementamos correctamente el guardado de la pantalla mediante Serialización (a excepcion un bug)
>>>>>>> TomBranch
- Arreglamos bugs visuales importantes.
- Funcionalidad de pintado de trazo libre implementada, aún con algunos bugs.
- Botón "Erase all" funcionando correctamente.