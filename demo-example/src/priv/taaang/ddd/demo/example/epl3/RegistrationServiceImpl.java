package priv.taaang.ddd.demo.example.epl3;

import javax.xml.bind.ValidationException;
import java.util.Arrays;

public class RegistrationServiceImpl implements RegistrationService {

    private SalesRepRepository salesRepRepo;
    private UserRepository userRepo;

    @Override
    public User register(Name name, Phone phone, String address) throws ValidationException {
        SalesRep rep = salesRepRepo.findRep(phone.getAreaCode());
        // 最后创建用户，落盘，然后返回
        User user = User.buildFrom(name, phone, address, rep);
        return userRepo.save(user);
    }



}
