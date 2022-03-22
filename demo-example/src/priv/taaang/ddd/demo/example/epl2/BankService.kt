package priv.taaang.ddd.demo.example.epl2

interface BankService {

    fun transfer(money: Long, currency: String, recipientId: String)
}