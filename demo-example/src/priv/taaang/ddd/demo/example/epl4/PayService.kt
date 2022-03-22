package priv.taaang.ddd.demo.example.epl4

interface PayService {

    fun pay(money: Money, targetCurrency: Currency, recipientId: String)
}