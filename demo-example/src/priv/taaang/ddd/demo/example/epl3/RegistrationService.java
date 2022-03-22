package priv.taaang.ddd.demo.example.epl3;

import javax.xml.bind.ValidationException;

public interface RegistrationService {

    public User register(Name name, Phone phone, String address) throws ValidationException;
}
