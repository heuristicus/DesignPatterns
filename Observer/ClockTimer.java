package Observer;

/**
 *
 */
public abstract class ClockTimer extends Subject {

    public ClockTimer(){}
    
    public abstract int getHour();
    public abstract int getMinute();
    public abstract int getSecond();
    
    
    void tick(){
        // update internal time state
        this.doNotify();
    }
    
}
