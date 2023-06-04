https://www.youtube.com/watch?v=xbjAsdAK4xQ&list=PLF206E906175C7E07&index=6
Derek Banas - Abstract Factory Design Pattern
This Design Pattern is simualar to the standard factory Design Pattern with 
the difference being everything is encapsulated
Methods that order the object 
factories that build the objecy and every object is final.
these final objects use the StrategyDesignPattern
allows you to create families of related objects without specifiying a concrete class 
you can dynamically change objcects  and model anything you want and have them interact through common
interfaces
downside things can get very complicated.
Other look on this design pattern:
The classes variable to a object are abstract objects that is then used to create the executable object

The Abstract Factory is a creational pattern, similar to the Factory Method pattern, with the key difference being that the Abstract Factory provides an interface for creating families of related or dependent objects without specifying their concrete classes.

Often, designs start out using Factory Method and evolve toward Abstract Factory as more flexibility is needed.

Imagine an application needs to run on different operating systems. In order to achieve this, we need to encapsulate the dependencies of our application. 
One approach is to have a "factory" object that has the responsibility of providing creation services for the entire platform family. Each time we need a new object for our application, we use the factory.
This makes a class independent of how its objects are created (which concrete classes are instantiated).

Consider a "factory" to create UI elements. The same factory can create buttons, textboxes, windows, and other elements for two operating systems - Windows and MacOS.
When we want to create a new button, we do not instantiate a new button class for a particular operating system. 
Instead, we request the factory create a button, and the factory does so, considering the parameters of the operating system. 
The same applies for any other UI object. 
As a result, we get the object we need without getting into detail of how the objects are created.

Basically, the Abstract Factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes.