import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Controller implements ActionListener {
    Model model;
    Viewer viewer;

    Controller(Viewer var1) {
        this.viewer = var1;
        this.model = new Model(this.viewer);
    }

    public void actionPerformed(ActionEvent var1) {
        String var2 = var1.getActionCommand();
        if(var2.equals("1")) {
            this.model.setValue("1");
        } else if(var2.equals("2")) {
            this.model.setValue("2");
        } else if(var2.equals("3")) {
            this.model.setValue("3");
        } else if(var2.equals("4")) {
            this.model.setValue("4");
        } else if(var2.equals("5")) {
            this.model.setValue("5");
        } else if(var2.equals("6")) {
            this.model.setValue("6");
        } else if(var2.equals("7")) {
            this.model.setValue("7");
        } else if(var2.equals("8")) {
            this.model.setValue("8");
        } else if(var2.equals("9")) {
            this.model.setValue("9");
        } else if(var2.equals("0")) {
            this.model.setValue("0");
        } else if(var2.equals("+")) {
            this.model.setValue("+");
        } else if(var2.equals("-")) {
            this.model.setValue("-");
        } else if(var2.equals(String.valueOf('?'))) {
            this.model.setValue("/");
        } else if(var2.equals(String.valueOf('?'))) {
            this.model.setValue("*");
        } else if(var2.equals("=")) {
            this.model.setValue("=");
        } else if(!var2.equals("C") && !var2.equals("CE")) {
            if(var2.equals(String.valueOf('<'))) {
                this.model.setValue("Delete");
            } else if(var2.equals(",")) {
                this.model.setValue(",");
            } else if(var2.equals(String.valueOf('±'))) {
                this.model.setValue("MinusPlus");
            }
        } else {
            this.model.setValue("Clear");
        }

    }
}
