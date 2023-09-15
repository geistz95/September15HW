# Chapter 3 4 Book Notes and Chapter9 Videos
When you use inheritance, you also inherit and call the constructor as a child. 
You get all the methods from the parent as a child

Both constructors should have the same format, THe child constructor may have addition parameters
Using super() can import the values from the parent class's constructor.
A child can use the same method with more information/changed format by using the @Override


Chapter 3

When you make a new object, it points it to memory.
That object has a pointer in the meory and if you remove it you lose the previous data forever.

Arrays are objects also.
When you initialize a primite variable, it is just a straight representation in memory.
When you initialize and object, you point to a particular place in memory.

When naming variables, it should start with a letter, underscore, or dollarsign. Make sure you obey convention (lowercase first letter, and the first letter uppercase each following word i.e. fireTruck)
Make sure if you want to copy a variable's value to another variable that they are the same type.

Java is really particular about type. For example

Frog frog = new Lion(); will not work because the variable frog is a Frog object

Chapter 4

A class is a blueprint for an object.

When you make a class, you describe the format to the JVM on how to produce an opbject.

You can make methods inside of classes
Each methods have an access modifier, return type, and a method name.
If a method uses parameters, it is the invoker/caller that sends those needed parameters.
Methods can have multiple parameters
You can pass anything as a parameter, just make sure you match what its asking for.

Encapsulation hides and protects data from unauthorize access and editting.
We use 'protected' or 'private' to avoid accidental edits

You can compare primitive types to eachother, but not objects.

