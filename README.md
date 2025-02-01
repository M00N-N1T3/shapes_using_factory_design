## **Exercise 1: Shape Factory**

### **Objective:**
Practice the **Factory Design Pattern** by creating a shape generator that returns different shape objects based on user input.

### **Requirements:**
1. Implement an interface `Shape` with a method `draw()`.
2. Create three classes that implement `Shape`:
    - `Circle`: Prints `"Drawing a Circle"` when `draw()` is called.
    - `Square`: Prints `"Drawing a Square"` when `draw()` is called.
    - `Rectangle`: Prints `"Drawing a Rectangle"` when `draw()` is called.
3. Implement a `ShapeFactory` class with a static method `getShape(String shapeType)`, which returns an instance of the requested shape.
4. In the `main` method, ask the user to enter a shape type and use `ShapeFactory` to create and call `draw()` on the shape.

### **Bonus Challenge:**
- Extend the factory to support new shapes without modifying existing code.
- Use an **Enum** to define shape types instead of a string.
