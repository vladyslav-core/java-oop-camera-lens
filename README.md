# Camera & Lens OOP Example (Java)

This small Java project demonstrates basic Object-Oriented Programming concepts.

The program models cameras and lenses using two classes: `Camera` and `Lens`.

## Features

- Camera class with the following properties:
  - brand
  - megapixels
  - display size
  - colored (color or black-and-white photos)
  - lens

- Lens class with:
  - minimum focal length
  - maximum focal length

- Validation of focal length values  
- Getter and setter methods for encapsulation  
- Static counters that track how many objects were created  
- Overridden `toString()` methods for readable output  

## Structure

Camera/
├── Camera.java
├── Lens.java
└── Main.java

## Example

The `Main` class demonstrates:

- creating multiple lenses
- creating multiple cameras
- switching the lens of a camera
- printing object information
- printing the number of created objects

Example output:
Camera{brand='Canon', megaPixels=24.2, displaySize=3.0, colored=true, lens=Lens{minFocalLength=18, maxFocalLength=55}}

## Concepts demonstrated

- Classes and objects
- Encapsulation
- Getters and setters
- Validation logic
- Static variables
- Method overriding

## Author

Vladyslav Petryshyn
