package priv.taaang.ddd.demo.example.epl4

interface CurrencyExchangeRateService {


    fun getExchangeCurrency(srcCurrency: Currency, targetCurrency: Currency): CurrencyExchangeRate
}