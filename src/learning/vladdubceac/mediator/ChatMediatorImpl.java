package learning.vladdubceac.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        users = new ArrayList<User>();
    }

    @Override
    public void sendMessage(final String message, User user) {
        // the message should not be received by the user sending it
        for(User u:users){
            if(u!=user){
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
