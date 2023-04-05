// if 
if (true)
    println "value is true"

// false | null | empty strings | empty collections
if (!false)
    println "value is false"

String name = "Alex"
if (name)
    println "name has a value $name"

String last = ""
if (last)
    println "last has a value and is $last"


// if/else 
def x = 5
if (x == 10) {
    println "x is 10"
} else {
    println "x is NOT 10"
}

// classic while
def i = 1
while (i <= 10) {
    println i
    i++
}


// for in list
def list = [1, 2, 3, 4]
for (num in list) {
    println num
}

// closure
def list2 = [5, 6, 7, 8]
list2.each { println it }

// switch
def myNumber = 1

switch (myNumber) {

    case 1:
        println "number is 1"
        break
    default:
        println "we hit the default case"

}




