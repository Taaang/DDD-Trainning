package priv.taaang.ddd.demo.example.epl4

class PayServiceImpl : PayService {

    private lateinit var bankService: BankService

    private lateinit var currencyExchangeRateService: CurrencyExchangeRateService

    override fun pay(money: Money, targetCurrency: Currency, recipientId: String) {
        val currencyExchangeRate = currencyExchangeRateService.getExchangeCurrency(money.currency, targetCurrency)
        val targetMoney = currencyExchangeRate.exchange(money)
        bankService.transfer(targetMoney, recipientId)
    }
}