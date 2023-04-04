import groovy.transform.Canonical

@Canonical
class Customer {
    String first, last
    int age
    Date since
    Collection favItems = ['Food']
    def object
}

def d = new Date()
def anyObject = new Object()
def c1 = new Customer(first: 'Tom', last: 'Jones', age: 21, since: d, favItems: ['Books', 'Games'], object: anyObject)
println c1
def c2 = new Customer('Tom', 'Jones', 21, d, ['Books', 'Games'], anyObject)
println c2
assert c1 == c2