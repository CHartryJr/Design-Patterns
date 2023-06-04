https://www.youtube.com/watch?v=j40kRwSm4VE&list=PLF206E906175C7E07&index=11
Derek Banas -Decorator Pattern

It is more flexible than inheritance. The Decorator Design Pattern
simplifies code because you add functionality using many simple classes. 
Also, rather than rewrite old code you can extend it with new code.
Modifying an object dynamically
The Decorator design pattern allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class.
This is achieved by designing a new Decorator class that wraps the original class. 
This pattern is designed so that multiple decorators can be stacked on top of each other, each adding a new functionality.
The goal is to make it so that the extended behavior can be applied to one specific instance, and, at the same time, still be able to create an original instance that doesn't have the new behavior.
This pattern is an alternative to subclassing, which refers to creating a class that inherits functionality from a parent class. As opposed to subclassing, which adds the behavior at compile time, "decorating" allows you to add new behavior during runtime, if the situation calls for it.
For example, consider a window in a windowing system. Assume windows are represented by instances of the Window class, and assume this class has no functionality for adding scrollbars. 
We could create a subclass ScrollingWindow that provides them, or create a ScrollingWindowDecorator that adds this functionality to existing Window objects. At this point, either solution would be fine.
Now, assume one also desires the ability to add borders to windows. If we had used subclassing, then we have a problem, as we will need to create separate subclasses with the borders functionality for all possible types of windows.
With the decorator solution, we simply create a new BorderedWindowDecorator and decorate any window we need during runtime. 
So, using decorator, we have the ability to add scrollbars and/or borders to any of our Windows objects.
Notice that if the functionality needs to be added to all Windows, you could modify the base class and that will do. However, sometimes (e.g., when using external frameworks) it is not possible, legal, or convenient to modify the base class.