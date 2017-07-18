class Model {
    Viewer viewer;
    char action;
    String firstNumber;
    String secondNumber;
    String temp;
    int result;

    Model(Viewer var1) {
        this.viewer = var1;
        this.action = 33;
        this.firstNumber = "";
        this.secondNumber = "";
        this.temp = "";
    }

    public void setValue(String var1) {
        if(!var1.equals("+") && !var1.equals("-") && !var1.equals("/") && !var1.equals("*")) {
            if(var1.equals("=")) {
                this.doAction();
            }

            if(var1.equals("1") || var1.equals("2") || var1.equals("3") || var1.equals("4") || var1.equals("5") || var1.equals("6") || var1.equals("7") || var1.equals("8") || var1.equals("9") || var1.equals("0")) {
                this.temp = this.temp + var1;
                this.viewer.update(this.temp);
            }

            if(var1.equals("Clear")) {
                this.action = 33;
                this.firstNumber = "";
                this.secondNumber = "";
                this.temp = "";
                this.viewer.update(this.temp);
            }

            if(var1.equals("Delete")) {
                this.temp = this.temp.substring(0, this.temp.length() - 1);
                this.viewer.update(this.temp);
            }

            if(var1.equals(",")) {
                this.temp = this.temp + ".";
            }

            if(var1.equals("MinusPlus")) {
                if(this.temp.charAt(0) == 45) {
                    this.temp = this.temp.substring(1, this.temp.length());
                } else if(this.temp.charAt(0) != 45) {
                    this.temp = "-" + this.temp;
                }

                this.viewer.update(this.temp);
            }

        } else {
            this.action = var1.charAt(0);
            this.firstNumber = this.temp;
            this.temp = "";
        }
    }

    public void doAction() {
        this.secondNumber = this.temp;
        this.temp = "";
        int var1 = Integer.parseInt(this.firstNumber);
        int var2 = Integer.parseInt(this.secondNumber);
        int var3 = 0;
        switch(this.action) {
            case '*':
                var3 = var1 * var2;
                break;
            case '+':
                var3 = var1 + var2;
            case ',':
            case '.':
            default:
                break;
            case '-':
                var3 = var1 - var2;
                break;
            case '/':
                try {
                    var3 = var1 / var2;
                } catch (ArithmeticException var5) {
                    this.viewer.update("Деление на ноль");
                    return;
                }
        }

        if(var3 % 1 != 0) {
            this.temp = "" + var3;
            this.viewer.update(this.temp);
        } else {
            this.temp = "" + var3;
            this.viewer.update(this.temp);
        }

    }
}
