# Assignment 3 — Bridge Pattern

## Software Design Patterns

This project demonstrates the Bridge Design Pattern in Java.

## Topic

Shape–Renderer

The project separates shapes from their rendering implementations, allowing both hierarchies to vary independently.

## Structure

### Abstraction
- Shape

### Refined Abstractions
- Circle
- Square

### Implementor
- Renderer

### Concrete Implementors
- VectorRenderer
- RasterRenderer

### Client
- Main

## Bridge Pattern

The Shape class contains a reference to the Renderer interface.  
This composition creates a bridge between the Shape hierarchy and the Renderer hierarchy.

The renderer implementation can be changed without modifying the Shape classes.

## Example

A Circle can use:
- VectorRenderer
- RasterRenderer

A Square can also use:
- VectorRenderer
- RasterRenderer

## Technologies

- Java
- JDK 17
- IntelliJ IDEA

## Author

Madiyar Kossaman