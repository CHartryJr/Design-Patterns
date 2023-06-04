https://www.youtube.com/watch?v=NZaXM67fxbs&list=PLF206E906175C7E07&index=7
Derek Banas - Singleton Design Pattern
This design pattern when you want to only use one instance of an object.
simply implement it us the lazy instancation method.
Ex. 
private static Singleton firstAndOnlyInstance =null;
static Singleton getInstance()
    if firstAndOnlyInstance = null
        firstAndOnlyInstance = new Singleton()
    else
        return firstAndOnlyInstance

Singleton is a creational design pattern, which ensures that only one instance of a class is created.

Singleton may be used when: 
- you need access to a shared resource.
- access to a shared resource will be requested from multiple, separate parts of your program.
- only one object can be instantiated.

A good example is a Logger, which is used in every part of the system to log some information. 
For example, in a social network, every activity of a user should be logged (login, logout, comment, posts, likes).
Instead of instantiating a new Logger instance over and over again for each activity type, it would be better to have a single instance and access it when needed. 
In other words, it is better to use the same Logger instance to log user logins, logouts, comments, posts, and likes, when necessary.
