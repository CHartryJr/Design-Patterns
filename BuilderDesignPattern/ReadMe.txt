https://www.youtube.com/watch?v=9XnsOpjclUg&list=PLF206E906175C7E07&index=8
Derek Banas - Builder Design Pattern
This a object used to create an object from a bunch of other objects
the parts are independent from the main object
The builder know all specifics and other classes know nothing

The Builder design pattern is a creational pattern that separates the construction of a complex object from its representation. 
By doing so, the same construction process can create different representations.
Simply said, it builds a complex object using simple objects and a step-by-step approach.

For example, let's say we need to build cars. 
Each car has many options. The combination of options would lead to a huge list of constructors for the Car class. 
To avoid this, we will create a builder class, CarBuilder. We will send each option step by step to the CarBuilder and then construct the final car with the correct options.
This approach makes it flexible to add and remove options from the car.