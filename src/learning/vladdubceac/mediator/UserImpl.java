package learning.vladdubceac.mediator;

public class UserImpl extends User {
    public UserImpl(ChatMediator mediator, String name){
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sending message: \""+message+"\"");
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this. name + " receiving message: \""+message+"\"");
    }
}
