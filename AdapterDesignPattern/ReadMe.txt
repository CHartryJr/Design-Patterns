https://www.youtube.com/watch?v=qG286LQM6BU&list=PLF206E906175C7E07&index=13
Derek Banas -Adapter Design Pattern

This pattern is used when you want to translate one interface of a class into another interface.
Now, it makes sense that these 2 interfaces are compatible otherwise the pattern may not make sense. 
To accomplish this, all you need to do is bridge the differences using our old friend composition again.
The Adapter pattern is a structural design pattern that allows the interface of an existing class to be used as another interface. 
It is often used to make existing classes work with others without modifying their source code. 
For example, let's consider you have an old class that implements some functionality needed in your new project. 
However, the way it is written is not compatible with the philosophy and architecture of the system currently being developed. 
In order to use the old class without rewriting the whole functionality from scratch, we can create an adapter, also called a wrapper, that translates, or maps, the old component to the new system.
Your program will then call the wrapper, which will redirect to the corresponding methods in the old class.