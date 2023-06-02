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


