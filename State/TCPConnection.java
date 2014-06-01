package State;

/**
 * interface for transmitting data and handling requests to change state
 */
public class TCPConnection {
    
    TCPState state;

    public TCPConnection() {
        state = TCPClosed.instance();
    }
    
    public void activeOpen(){
        state.activeOpen(this);
    }
    
    public void passiveOpen(){
        state.passiveOpen(this);
    }
    
    public void close(){
        state.close(this);
    }
    
    public void send(){
        state.send(this);
    }
    
    public void ack(){
        state.ack(this);
    }
    
    public void sync(){
        state.sync(this);
    }
    
    public void processOctet(TCPOctetStream stream){}
    
    protected void changeState(TCPState state){
        this.state = state;
    }
}
