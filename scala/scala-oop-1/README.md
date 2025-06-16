Here's a progressive series of Scala OOP exercises to build your skills from fundamentals to advanced concepts:

## Exercise 1: Basic Classes and Objects
Create a `Person` class with properties for name, age, and email. Include a method to introduce themselves. Then create several Person instances and call their methods.

## Exercise 2: Constructors and Validation
Extend your Person class to validate input (age must be positive, email must contain @). Implement both primary and auxiliary constructors. Add a companion object with a factory method.

## Exercise 3: Case Classes and Pattern Matching
Create a `BankAccount` case class with account number, balance, and account type. Implement methods for deposit and withdrawal. Use pattern matching to handle different account types (Checking, Savings, Investment).

## Exercise 4: Inheritance Hierarchy
Build a shape hierarchy with an abstract `Shape` base class and concrete implementations like `Circle`, `Rectangle`, and `Triangle`. Each should calculate area and perimeter. Include an abstract method that must be implemented by subclasses.

## Exercise 5: Traits and Mixins
Create traits for `Flyable`, `Swimmable`, and `Walkable` with default implementations. Design animal classes that mix in appropriate traits. Experiment with trait linearization by creating a class that extends multiple traits.

## Exercise 6: Abstract Classes vs Traits
Design a media library system using both abstract classes (`Media`) and traits (`Playable`, `Downloadable`). Create concrete classes like `Song`, `Video`, and `Podcast` that demonstrate when to use each approach.

## Exercise 7: Polymorphism and Method Overriding
Create an employee management system with a base `Employee` class and subclasses like `Manager`, `Developer`, and `Designer`. Override salary calculation methods and demonstrate runtime polymorphism.

## Exercise 8: Companion Objects and Apply Methods
Build a `Temperature` class with companion object factory methods for creating temperatures in different scales (Celsius, Fahrenheit, Kelvin). Implement custom `apply` and `unapply` methods for pattern matching.

## Exercise 9: Generic Classes and Type Parameters
Create a generic `Container[T]` class that can hold any type. Implement methods for adding, removing, and finding elements. Add variance annotations (covariance/contravariance) and explore their implications.

## Exercise 10: Advanced Traits with Self-Types
Design a plugin system using traits with self-types. Create a `Logger` trait that requires the implementing class to have certain methods, and demonstrate how this enforces dependencies.

Each exercise should include writing test cases to verify your implementations work correctly. Start with the basics and gradually work through the more complex concepts. Would you like me to elaborate on any specific exercise or provide sample solutions for particular ones?