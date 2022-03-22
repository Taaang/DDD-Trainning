package priv.taaang.ddd.demo.example.epl3

class Name {

    var name: String = ""

    constructor(name: String?) {
        // 校验逻辑
        if (name == null || name.isEmpty()){
            throw javax.xml.bind.ValidationException("name")
        }
        this.name = name
    }
}