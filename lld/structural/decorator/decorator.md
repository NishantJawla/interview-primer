# Decorator Pattern

Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

## What is object composition?

Object composition is a design principle in which a class is composed of one or more objects from other classes. This allows for greater flexibility and reusability of code, as well as the ability to create complex behaviors by combining simpler objects.

## How Open/Closed Principle relates to Decorator

The Open/Closed Principle states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. This means that you should be able to add new functionality to a class without changing its existing code.

The Decorator pattern allows you to achieve this by creating new classes that extend the functionality of existing classes without modifying their code. Instead of changing the original class, you create a new class that wraps the original class and adds new behavior. This way, you can extend the functionality of the original class without modifying it, adhering to the Open/Closed Principle.

## What are the challenges of using Decorator?

1. Complexity: The Decorator pattern can introduce additional complexity to the codebase, as it requires creating multiple classes and managing their relationships. This can make the code harder to understand and maintain.

2. Decorator chain: When using multiple decorators, it can be challenging to manage the order in which they are applied. The behavior of the final object may depend on the order of the decorators, leading to unexpected results if not carefully managed. Example: mocha mocha soy HouseBlend is same as mocha soy HouseBlend mocha.

3. Can't interact with the original class: Decorators are typically used to add behavior to an object without modifying its original class. This means that you cannot directly access or modify the original class's properties or methods from within the decorator, which can limit the flexibility of the design.

## Why does base condiment extend the beverage class?

The base condiment class extends the beverage class to ensure that all condiments are treated as beverages. This allows for a consistent interface and behavior when adding condiments to beverages. By extending the beverage class, the condiment can inherit properties and methods from the beverage class, making it easier to manage and manipulate both beverages and condiments in a uniform way.

This design choice also allows for the use of polymorphism, where condiments can be treated as beverages, enabling the decorator pattern to work seamlessly. This way, you can add condiments to beverages without needing to create separate classes or interfaces for each condiment type, promoting code reusability and maintainability.
