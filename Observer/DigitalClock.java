package Observer;

/**
 *
 * @author michal
 */
public class DigitalClock extends Observer {

    ClockTimer subject;

    public DigitalClock(ClockTimer subject) {
        this.subject = subject;
        subject.attach(this);
    }
    
    @Override
    public void update(Subject changed) {
        if (changed.equals(subject)){
            draw();
        }
    }
    
    public void draw(){
        int h = subject.getHour();
        int m = subject.getMinute();
        int s = subject.getSecond();
        
        System.out.println("Drawing digital clock");
    }
    
}