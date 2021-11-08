package users;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @ToString @Setter
public class Sender implements User{
    int id;
    String status;

    @Override
    public void update(String status) {
        this.status = status;
    }

    public Sender() {
        this.id = IdCount.generateID();
    }
}
