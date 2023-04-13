// implicit parameter
def foo = {
    println it
}
/*
The implicit parameter, if no name is given to that parameter, is always going to be the keyword
it.
 */
foo('implicit')

def noparams = { ->
    println "no params..."
}

//noparams(6) will show an error
noparams()

def sayHello = { String first, String last ->
    println "Hello, $first $last"
}

sayHello("Alex","Simple")

// default values
def greet = { String name, String greeting = "Howdy" ->
    println "$greeting, $name"
}

greet("Dan","Hello")
greet("Joe")

// var-arg
def concat = { String... args -> 
    args.join('')
}

println concat('abc','def')
println concat('abc','def','123','456')


def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = { int x, int y -> x + y }
someMethod(someClosure)


