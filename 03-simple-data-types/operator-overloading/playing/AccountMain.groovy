import groovy.transform.ToString

@ToString
class Account {
    BigDecimal balance = 0.0
    String type

    Account plus(Account other){
        new Account(balance: this.balance + other.balance)
    }
    BigDecimal deposit(BigDecimal amount) {
        balance += amount
    }

    BigDecimal withdraw(BigDecimal amount) {
        balance -= amount
    }
}
def savings = new Account(type: "Savings")
println savings.balance
savings.deposit(50.00)
println savings.balance
def checking = new Account(type: "Checking")
checking.deposit(100.00)

//def accountBalance = savings + checking
//println accountBalance
