package priv.taaang.ddd.demo.example.epl3

import java.util.*
import javax.xml.bind.ValidationException

class Phone {

    var phone: String = ""

    constructor(phone: String?) {
        if (phone == null || !isValidPhoneNumber(phone)) {
            throw ValidationException("phone")
        }

        this.phone = phone
    }

    public fun getAreaCode(): String? {
        var areaCode: String? = null
        val areas = arrayOf("0571", "021", "010")
        for (i in 0 until phone.length) {
            val prefix = phone.substring(0, i)
            if (Arrays.asList(*areas).contains(prefix)) {
                areaCode = prefix
                break
            }
        }
        return areaCode
    }

    private fun isValidPhoneNumber(phone: String): Boolean {
        val pattern = Regex("^0[1-9]{2,3}-?\\d{8}$")
        return phone.matches(pattern)
    }
}