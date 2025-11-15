Problem Statement

Design a Smart Home automation system where multiple devices (like Lights, Fan, AC) can be controlled.
Each device must implement:

turnOn()

turnOff()

getStatus()

A SmartHomeController should manage any number of devices and allow:

Add device

Turn on all devices

Turn off all devices

Show status of all devices

Requirements (to apply OOPS concepts)
Abstraction

Create an abstract class SmartDevice with abstract methods.

Encapsulation

Device name and status should be private.

Inheritance

Light, Fan, AC inherit SmartDevice.

Polymorphism

Controller works using SmartDevice parent reference.
