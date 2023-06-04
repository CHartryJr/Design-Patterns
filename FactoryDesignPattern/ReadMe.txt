https://www.youtube.com/watch?v=ub0DXaeV6hA&list=PLF206E906175C7E07&index=5
Derek Banas - Factory Design Pattern
The Factory Design Pattern  uses a tactic to better organize polymorphism use cases. The factory class
uses a method that returns one of serveral possible classes that share a common super class.
the classes are choosen at run time.
The Factory pattern is used when you don't know ahead of time what class object you need and all 
potential classes uses the same subclass Factory Method is a creational pattern that defines an interface for creating an object, but lets subclasses decide which class to instantiate. 

The best time to use the factory method pattern is when you have multiple variations of a single entity. For example, let's consider a program that creates different shapes. For this program, we need to define a ShapeFactory that will act as a common interface for creating shapes. Using this interface, each subclass will create the specific shape by implementing the ShapeFactory's corresponding "create" method. 

To better understand the Factory Method concept, consider a real-world employment agency. 
The agency helps clients fill positions for their company. 
The client provides the hiring criteria and then leaves the details of assessing candidates to the agency. 
The hiring agency takes care of a potential candidate’s eligibility, skill, and experience verification to ensure that the candidate matches the hiring criteria. 
In this case, the hiring agency acts as the factory. It allows the client to create new objects without having to know the details of how they're created


