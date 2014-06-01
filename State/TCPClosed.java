package State;

/**
 *
 */
public class TCPClosed extends TCPState {
    
    private static TCPClosed INSTANCE;
    
    public static TCPState instance(){
        if (INSTANCE == null){
            INSTANCE = new TCPClosed();
        }
        return INSTANCE;
    }

    @Override
    public void activeOpen(TCPConnection c) {
        changeState(c, TCPEstablished.instance());
    }

    @Override
    public void passiveOpen(TCPConnection c) {
        changeState(c, TCPListen.instance());
    }
    
}