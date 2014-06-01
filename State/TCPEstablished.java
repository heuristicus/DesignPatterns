package State;

/**
 *
 */
public class TCPEstablished extends TCPState {
    
    private static TCPEstablished INSTANCE;
    
    public static TCPState instance(){
        if (INSTANCE == null){
            INSTANCE = new TCPEstablished();
        }
        return INSTANCE;
    }

    @Override
    public void close(TCPConnection c) {
        changeState(c, TCPListen.instance());
    }

    @Override
    public void processOctet(TCPConnection c, TCPOctetStream stream) {
        c.processOctet(stream);
    }

}