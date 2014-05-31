package Observer;

/**
 *
 */
public class AnalogClock extends Observer{

    ClockTimer subject;

    public AnalogClock(ClockTimer subject) {
        this.subject = subject;
        subject.attach(this);
    }
    
    @Override
    public void update(Subject changed) {
        if (changed.equals(subject)){
            draw();
        }
    }

    private void draw() {
        int h = subject.getHour();
        int m = subject.getMinute();
        int s = subject.getSecond();
        
        System.out.println("Drawing analog clock");
    }
    
}
