package priv.taaang.ddd.demo.example.epl4

class Money {

    var money: Double

    var currency: Currency

    constructor(money: Double, currency: Currency) {
        this.money = money
        this.currency = currency
    }
}