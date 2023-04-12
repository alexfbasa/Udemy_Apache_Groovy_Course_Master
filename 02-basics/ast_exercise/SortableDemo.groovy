import groovy.transform.*

@ToString
@Sortable
class Person {

    String first
    String last

}

def p2 = new Person(first: "Brun", last: "Vega")
def p1 = new Person(first: "Alan", last: "Vega")

def people = [p2, p1]
println people

def sorted = people.sort(false /* do not mutate original collection */)
println sorted