# Dependency Lab

Dependencies within an application, not across applications

# How Dependencies _Appear_

* imports
* calling a method of another class
* extending a class
* Using an enum
* Getting an object and just forward it
    * Except of renaming, changes in the class will never affect the forwarders

# Gained Insights

* IDEA diagrams do not visualize the decoupling gained by DI. The dependencies are still used, so the arrow stays.
* Getting data via callbacks with lambdas reduces the number of arrows, because the class executing the callback has no
  dependency on its caller. However, what stays is the dependency on the callers _object_ during runtime.
* IDEA diagrams do not visualize the _strength_ of the coupling between classes
    * The classes within `niklase.intensity` are coupled absurdly high but on the diagram it looks like are regular
      _uses_ relationship
* Compile-time dependencies and the modularization are often mixed up. Two modules can be coupled at compile-time but
  decoupled regarding to changes as long as the interface stays the same.
  The compile-time coupling can also be reduced by introducing some kind of indirection (e.g. a java _interface_), but
  there is no evidence that this improves the evolvability of the application.
  Maybe, the compile-time dependencies are so in focus, because they appear more obviously. The kind of dependency that
  slows down development speed
  are not the ones appearing at compile-time but the ones that cross abstraction layers. Class A that knows too much
  about class B, just like the example implementation in `niklase.intensity`

# Experiments

## callbackLambda

## callbackObject

## direct

## iface

## intensity

The class `ClassThatExposesTooManyDetails` is intentionally implemented in a way that leads to high coupling to that
class.
However, the class diagram does not reflect this high coupling. It only shows that one class uses another one.

Introducing a java interface between those classes would make the situation even worse, because in addition to the
high coupling, we have one additional file.

## variations on orchestration implementations

### o1

Dependencies from orchestrator to collaborators and between collaborators

### o2

Dependencies from orchestrator to collaborators and back