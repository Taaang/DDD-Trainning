package priv.taaang.ddd.demo.example.epl4

import java.lang.IllegalArgumentException

class CurrencyExchangeRate {

    var srcCurrency: Currency

    var targetCurrency: Currency

    var rate: Double

    constructor(srcCurrency: Currency, targetCurrency: Currency, rate: Double) {
        this.srcCurrency = srcCurrency
        this.targetCurrency = targetCurrency
        this.rate = rate
    }

    fun exchange(money: Money): Money {
        if (money.currency != srcCurrency) {
            throw IllegalArgumentException()
        }

        return Money(money = money.money * rate, targetCurrency)
    }
}