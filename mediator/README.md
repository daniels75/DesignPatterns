---
title: Mediator
categories: Behavioral
tags:
 - Java
 - Gang Of Four
 - Difficulty-Intermediate
---

## Intent
Define an object that encapsulates how a set of objects interact.
Mediator promotes loose coupling by keeping objects from referring to each
other explicitly, and it lets you vary their interaction independently.

![alt text](./img/mediator001.png "Mediator")

## Mediator in the Real World 

An airport control tower is an excellent example of the mediator pattern.
The tower looks after who can take off and land - all communications are done from the airplane to control tower, rather than having plane-to-plane communication.
This idea of a central controller is one of the key aspects to the mediator pattern. 

## Applicability
Use the Mediator pattern when

* a set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured and difficult to understand
* reusing an object is difficult because it refers to and communicates with many other objects
* a behavior that's distributed between several classes should be customizable without a lot of subclassing

## Real world examples

* All scheduleXXX() methods of [java.util.Timer](http://docs.oracle.com/javase/8/docs/api/java/util/Timer.html)
* [java.util.concurrent.Executor#execute()](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Executor.html#execute-java.lang.Runnable-)
* submit() and invokeXXX() methods of [java.util.concurrent.ExecutorService](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)
* scheduleXXX() methods of [java.util.concurrent.ScheduledExecutorService](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ScheduledExecutorService.html)
* [java.lang.reflect.Method#invoke()](http://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Method.html#invoke-java.lang.Object-java.lang.Object...-)

