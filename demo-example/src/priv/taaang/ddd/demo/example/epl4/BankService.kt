package priv.taaang.ddd.demo.example.epl4

interface BankService {

    fun transfer(money: Money, recipientId: String)
}