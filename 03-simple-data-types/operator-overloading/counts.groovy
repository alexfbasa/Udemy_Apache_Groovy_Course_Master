class Contas {
    BigDecimal balanco
    String name

    Contas multiply(Contas outra) {
        new Contas(name: this.name, balanco: this.balanco * outra.balanco)
    }

    String toString() {
        "Contas balanco: $balanco"

    }
}

Contas cheques = new Contas(name: "Alexandre", balanco: 500.00)
Contas cartoes = new Contas(name: "Suzana", balanco: 5000.00)

println cheques * cartoes