package Mediator;

/**
 *
 */
public class FontDialogDirector implements DialogDirector {

    private Button ok;
    private Button cancel;
    private ListBox fontList;
    private EntryField fontName;
    
    @Override
    public void showDialog() {
        createWidgets();
    }

    @Override
    public void widgetChanged(Widget w) {
        if (w.equals(fontList)){
            fontName.setText(fontList.getSelection());
        } else if (w.equals(ok)){
            // change font and exit dialog
        } else if (w.equals(cancel)){
            // exit dialog
        }
    }

    @Override
    public void createWidgets() {
        ok = new Button(this);
        cancel = new Button(this);
        fontList = new ListBox(this);
        fontName = new EntryField(this);
    }
    
    public static void main(String[] args) {
        DialogDirector d = new FontDialogDirector();
        d.showDialog();
    }

}
