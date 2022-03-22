package priv.taaang.ddd.demo.example.epl3;

public class User {

    Long userId;
    String name;
    String phone;
    String address;
    Long repId;

    public static User buildFrom(Name name, Phone phone, String address, SalesRep rep) {
        User user = new User();
        user.name = name.getName();
        user.phone = phone.getPhone();
        user.address = address;
        if (rep != null) {
            user.repId = rep.repId;
        }
        return user;
    }
}
