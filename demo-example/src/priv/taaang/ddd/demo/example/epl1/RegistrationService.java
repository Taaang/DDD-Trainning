package priv.taaang.ddd.demo.example.epl1;

import javax.xml.bind.ValidationException;

public interface RegistrationService {

    public User register(String name, String phone, String address) throws ValidationException;
}
