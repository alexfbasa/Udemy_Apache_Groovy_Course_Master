import groovy.transform.Immutable
import groovy.transform.ImmutableOptions

@ImmutableOptions
class Customer {

    String first, last
    int age
    Date since
    Collection favItems

    Customer(def first, def last) {
        this.first = first
        this.last = last

    }

}