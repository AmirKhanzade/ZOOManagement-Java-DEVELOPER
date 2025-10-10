🐯🐬🐧 Zoo Animal Management System (Java OOP Project)
📖 Overview

This project is a Zoo Animal Management System built entirely with Object-Oriented Programming (OOP) principles in Java.
It simulates interactions with different zoo animals — Tiger, Dolphin, and Penguin — allowing users to view, modify, and display each animal’s details and behaviors through a simple console interface.

The project demonstrates the power of inheritance, abstraction, encapsulation, interfaces, and method overriding — all core OOP concepts — in an engaging, easy-to-understand way.

🧩 Key Features

🐅 Tiger, 🐬 Dolphin, and 🐧 Penguin classes extending a common abstract parent class Animal

💬 Fully interactive console menus for selecting animals and actions

🧠 Demonstrates OOP fundamentals:

Abstraction: The abstract Animal class and interface-based design (Eat, Walk, Swim)

Inheritance: Each animal inherits from Animal and implements one or more interfaces

Encapsulation: All properties are private, accessed only through getters and setters

Polymorphism: Each animal provides its own version of methods like eatingFood() and walking()

🔄 Dynamic user interaction — input animal attributes (age, weight, speed, etc.) and view outputs instantly

🧮 Clear and organized code with full comments explaining each part

🏗️ Class Structure
🐾 Abstract Class: Animal

Defines common properties (e.g., name, age, height, weight) and methods for all animals.
Implements the Eat interface.

Key Methods:

eatingFood() — overridden by subclasses

Getters and setters for encapsulated fields

🐅 Class: Tiger

Extends Animal and implements the Walk interface.
Adds properties like number of stripes, speed, and roar sound level.

Key Behaviors:

Walks using walking() method

Eats using overridden eatingFood() and eatingCompleted()

🐬 Class: Dolphin

Extends Animal and implements the Swim interface.
Adds color and swimming speed.

Key Behaviors:

Swims using swimming()

Eats fish using overridden eatingFood()

🐧 Class: Penguin

Extends Animal and implements both Walk and Swim interfaces.
Adds a boolean property isSwimming, plus walk speed and swim speed.

Key Behaviors:

Switches between walking and swimming

Overrides eating methods

⚙️ Interfaces

Eat → eatingFood(), eatingCompleted()

Walk → walking()

Swim → swimming()

These interfaces ensure that each animal type implements the appropriate behaviors.

🖥️ Console Menu Flow

When the program runs, it displays:

Main Menu: Choose an animal (Tiger, Dolphin, Penguin)

Animal Menu:

1 → Set properties (speed, age, weight, etc.)

2 → Display current properties

3 → Show movement (walk/swim)

4 → Show eating behavior

Option to continue with the same or another animal
