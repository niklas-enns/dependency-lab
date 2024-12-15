# Dependency Lab
Dependencies within an application, not across applications

# How it appears
* Importing a class
* Calling a method
* Using an enum
* Getting an object and just forward it
  * Except of renaming, changes in the class will never affect the forwarders

# Insights
* IDEA diagrams cannot do not visualize the decoupling gained by DI. The dependencies are still used, so the arrow stays.
* Getting data via callbacks with lambdas reduces the number of arrows, because the class executing the callback has no dependency on its caller. However, what stays is the dependency on the callers _object_ during runtime.
* IDEA diagrams do not visualize the strength of the coupling between classes
  * The classes within `niklase.intensity` are coupled absurdly high

# Experiments
## callbackLambda
## callbackObject
## direct
## iface
## intensity
The class `ClassThatExposesTooManyDetails` is intentionally implemented in a way that leads to high coupling to that class.
However, the class diagram does not reflect this high coupling. It only shows that one class uses another one.

Introducing a java interface between those classes would make the situation even worse, because in addition to the
high coupling, we have one additional file.

## orchestrator