package users;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @ToString @Setter
public class Reciever implements User{
    String status;
    int id;

    public Reciever() {
        this.id = IdCount.generateID();
    }

    @Override
    public void update(String status) {
        this.status = status;
    }
}
