<h1>Udemy The Complete Apache Groovy Dev Course</h1>

<a href="https://github.com/danvega/apache-groovy-course/tree/master/ast/transformations/.idea">
Apache Groovy Course
The Groovy constructor is dynamic. You don't need to create a new constructor to define different arguments.

Read more - Java version [here](01-getting-started/java-to-groovy/start.groovy)
Read more - Groovy version [here](01-getting-started/java-to-groovy/finish.groovy)

<h2>1 Datatypes</h2>

The main difference between Java and Groovy is that in Groovy there are no primitive types –
everything is an object. To show this, take a look at the following example program:
Groovy by default treat variables with its related Wrapper class. So every variable in Groovy is an object.

Read more [here](03-simple-data-types/wrapper_classes.groovy)

<h2>1.1 Assigning Multiple Variables At Once</h2>

Groovy allows for assigning values to multiple variables at once:
```groovy
/* Assigning values to two variables at the same time when defining the variables. */
def (theNumber, theString, theObject) = [1, "one"]
println "The number is: $theNumber"
println "The string is: $theString"
println "The object is: $theObject\n"
/* Assigning values to two variables that are already defined. */
(theNumber, theString) = [2, "two", "two and a half"]
println "The number is: $theNumber"
println "The string is: $theString\n"
/* Assigning values to two variables using a list variable. */
def theValues = [3, "three"]
(theNumber, theString) = theValues
println "The number is: $theNumber"
println "The string is: $theString"
```
Output:
```text
The number is: 1
The string is: one
TheObject is: null
The number is: 2
The string is: two
The number is: 3
The string is: three
```
Note that:
* The x number of variables enclosed in parentheses will be assigned the x first values in the
list.
* If the list contains more than x values, the additional values will be ignored.
If the list contains less than x values, variables for which there is no value will be assigned
null.
* The list of values to be assigned to the variables can be a list variable.

<h2>1.2 Optional Typing</h2>
A simple way to define a variable in Groovy you can use ***"def"***, when you don't care:
<h5>def x = 10</h5>
<h5>def x = "Ldap"</h5>
<h5>def x = 10.0</h5>
Read more [here](03-simple-data-types/optional_type.groovy)
However, if your variable is not going to change, then we should go ahead and assign the right type.
In Groovy variables does not have to be assigned a type, as shown in the following example.
```groovy
def theVar
printVarInfo(theVar)
theVar = 1.0d
printVarInfo(theVar)
theVar = "Hello!"
printVarInfo(theVar)
theVar = new Date()
printVarInfo(theVar)
def printVarInfo(def inVar)

{
    println "The type of the variable: ${inVar.getClass()}, contents: $inVar"
}
```
Output:
```text
The type of the variable: class org.codehaus.groovy.runtime.NullObject, contents: null
The type of the variable: class java.lang.Double, contents: 1.0
The type of the variable: class java.lang.String, contents: Hello!
The type of the variable: class java.util.Date, contents: Tue Sep 08 21:01:14 CST 2009
Note that:
```
* The variable theVar is defined only using the def keyword.
* Variables are initialized with an instance of NullObject.
* Values of different types can be assigned to the variable theVar.
* Parameters of methods can also be untyped.
In fact, the def keyword can be omitted for method parameters.
In the following sections we will see examples of typed variables of different kinds.
