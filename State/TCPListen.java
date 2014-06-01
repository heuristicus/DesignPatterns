package State;

/**
 *
 */
public class TCPListen extends TCPState {
    
    private static TCPListen INSTANCE;
    
    public static TCPState instance(){
        if (INSTANCE == null){
            INSTANCE = new TCPListen();
        }
        return INSTANCE;
    }

    @Override
    public void transmit(TCPConnection c, TCPOctetStream s) {
        changeState(c, TCPEstablished.instance());
    }

}