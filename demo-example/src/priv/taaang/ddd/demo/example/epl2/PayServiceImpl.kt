package priv.taaang.ddd.demo.example.epl2

class PayServiceImpl: PayService {

    private lateinit var bankService: BankService

    override fun pay(money: Long, recipientId: String) {
        bankService.transfer(money, "CNY", recipientId)
    }
}