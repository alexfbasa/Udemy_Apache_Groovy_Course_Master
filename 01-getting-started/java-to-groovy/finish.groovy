import groovy.transform.ToString

@ToString()
class User {

    Long id
    String firstName
    String lastName
    String email
    Date dob

    void printFullName() {
        println "FullName: $firstName $lastName"
    }

}

User user = new User(firstName: "Dan", lastName: "Vega")
User user1 = new User(firstName: "Alexandre", lastName: "Basilio", email: "alexandre@basilio.com")

println user
println user1