package State;

/**
 *
 */
public abstract class TCPState {
    
    public void transmit(TCPConnection c, TCPOctetStream stream){}
    public void activeOpen(TCPConnection c){}
    public void passiveOpen(TCPConnection c){}
    public void close(TCPConnection c){}
    
    public void send(TCPConnection c){}
    public void ack(TCPConnection c){}
    public void sync(TCPConnection c){}
    
    public void processOctet(TCPConnection c, TCPOctetStream stream){}
    
    protected void changeState(TCPConnection c, TCPState state){
        c.changeState(state);
    }
    
}
