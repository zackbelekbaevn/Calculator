import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class Viewer {
    Controller controller = new Controller(this);
    private JLabel textField;

    Viewer() {
        JFrame var1 = new JFrame();
        var1.setTitle("My Calculator");
        var1.setSize(316, 400);
        var1.setLayout((LayoutManager)null);

        this.textField = new JLabel();
        this.textField.setBackground(Color.white);
        this.textField.setOpaque(false);
        this.textField.setBounds(0, 0, 303, 180);
        this.textField.setHorizontalAlignment(4);
        this.textField.setVerticalAlignment(3);
        Font var2 = new Font("Century Gothic", 0, 30);
        this.textField.setFont(var2);
        Border var3 = BorderFactory.createEtchedBorder(0);
        Border var4 = BorderFactory.createEtchedBorder(1);
        this.textField.setBorder(var4);
        byte var5 = 0;
        byte var6 = 30;
        Font var7 = new Font("Century Gothic", 0, 20);
        Font var8 = new Font("Century Gothic", 0, 18);


        JButton var9 = new JButton("CE");
        var9.setBounds(var5 + 0, var6 + 150, 70, 35);
        var9.addActionListener(this.controller);
        var9.setFont(var8);
        var9.setForeground(Color.WHITE);
        var9.setBackground(new Color(45, 186, 153));
        var9.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var10 = new JButton("C");
        var10.setBounds(var5 + 71, var6 + 150, 70, 35);
        var10.addActionListener(this.controller);
        var10.setFont(var8);
        var10.setForeground(Color.WHITE);
        var10.setBackground(new Color(45, 186, 153));
        var10.setBorder(new EmptyBorder(0, 0, 0, 0));


        char var11 = 8592;
        String var12 = "" + var11;
        JButton var13 = new JButton(var12);
        var13.setBounds(var5 + 142, var6 + 150, 70, 35);
        var13.addActionListener(this.controller);
        var13.setFont(var8);
        var13.setForeground(Color.WHITE);
        var13.setBackground(new Color(45, 186, 153));
        var13.setBorder(new EmptyBorder(0, 0, 0, 0));


        char var14 = 247;
        String var15 = "" + var14;
        JButton var16 = new JButton(var15);
        var16.setBounds(var5 + 213, var6 + 150, 90, 35);
        var16.addActionListener(this.controller);
        var16.setFont(var8);
        var16.setForeground(Color.WHITE);
        var16.setBackground(new Color(45, 186, 153));
        var16.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var17 = new JButton("7");
        var17.setBounds(var5 + 0, var6 + 186, 70, 35);
        var17.addActionListener(this.controller);
        var17.setFont(var7);
        var17.setBackground(new Color(150, 150, 150));
        var17.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var18 = new JButton("8");
        var18.setBounds(var5 + 71, var6 + 186, 70, 35);
        var18.addActionListener(this.controller);
        var18.setFont(var7);
        var18.setBackground(new Color(150, 150, 150));
        var18.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var19 = new JButton("9");
        var19.setBounds(var5 + 142, var6 + 186, 70, 35);
        var19.addActionListener(this.controller);
        var19.setFont(var7);
        var19.setBackground(new Color(150, 150, 150));
        var19.setBorder(new EmptyBorder(0, 0, 0, 0));


        char var20 = 215;
        String var21 = String.valueOf(var20);
        JButton var22 = new JButton(var21);
        var22.setBounds(var5 + 213, var6 + 186, 90, 35);
        var22.addActionListener(this.controller);
        var22.setFont(var8);
        var22.setForeground(Color.WHITE);
        var22.setBackground(new Color(45, 186, 153));
        var22.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var23 = new JButton("4");
        var23.setBounds(var5 + 0, var6 + 222, 70, 35);
        var23.addActionListener(this.controller);
        var23.setFont(var7);
        var23.setBackground(new Color(150, 150, 150));
        var23.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var24 = new JButton("5");
        var24.setBounds(var5 + 71, var6 + 222, 70, 35);
        var24.addActionListener(this.controller);
        var24.setFont(var7);
        var24.setBackground(new Color(150, 150, 150));
        var24.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var25 = new JButton("6");
        var25.setBounds(var5 + 142, var6 + 222, 70, 35);
        var25.addActionListener(this.controller);
        var25.setFont(var7);
        var25.setBackground(new Color(150, 150, 150));
        var25.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var26 = new JButton("-");
        var26.setBounds(var5 + 213, var6 + 222, 90, 35);
        var26.addActionListener(this.controller);
        var26.setFont(var8);
        var26.setForeground(Color.WHITE);
        var26.setBackground(new Color(45, 186, 153));
        var26.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var27 = new JButton("1");
        var27.setBounds(var5 + 0, var6 + 258, 70, 35);
        var27.addActionListener(this.controller);
        var27.setFont(var7);
        var27.setBackground(new Color(150, 150, 150));
        var27.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var28 = new JButton("2");
        var28.setBounds(var5 + 71, var6 + 258, 70, 35);
        var28.addActionListener(this.controller);
        var28.setFont(var7);
        var28.setBackground(new Color(150, 150, 150));
        var28.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var29 = new JButton("3");
        var29.setBounds(var5 + 142, var6 + 258, 70, 35);
        var29.addActionListener(this.controller);
        var29.setFont(var7);
        var29.setBackground(new Color(150, 150, 150));
        var29.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var30 = new JButton("+");
        var30.setBounds(var5 + 213, var6 + 258, 90, 35);
        var30.addActionListener(this.controller);
        var30.setFont(var8);
        var30.setForeground(Color.WHITE);
        var30.setBackground(new Color(45, 186, 153));
        var30.setBorder(new EmptyBorder(0, 0, 0, 0));


        char var31 = 177;
        String var32 = String.valueOf(var31);
        JButton var33 = new JButton(var32);
        var33.setBounds(var5 + 0, var6 + 294, 70, 35);
        var33.addActionListener(this.controller);
        var33.setFont(var7);
        var33.setBackground(new Color(150, 150, 150));
        var33.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var34 = new JButton("0");
        var34.setBounds(var5 + 71, var6 + 294, 70, 35);
        var34.addActionListener(this.controller);
        var34.setFont(var7);
        var34.setBackground(new Color(150, 150, 150));
        var34.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var35 = new JButton(",");
        var35.setBounds(var5 + 142, var6 + 294, 70, 35);
        var35.addActionListener(this.controller);
        var35.setFont(var7);
        var35.setBackground(new Color(150, 150, 150));
        var35.setBorder(new EmptyBorder(0, 0, 0, 0));


        JButton var36 = new JButton("=");
        var36.setBounds(var5 + 213, var6 + 294, 90, 35);
        var36.addActionListener(this.controller);
        var36.setFont(var8);
        var36.setForeground(Color.WHITE);
        var36.setBackground(new Color(45, 186, 153));
        var36.setBorder(new EmptyBorder(0, 0, 0, 0));


        var1.add(this.textField);
        var1.add(var9);
        var1.add(var10);
        var1.add(var13);
        var1.add(var16);
        var1.add(var17);
        var1.add(var18);
        var1.add(var19);
        var1.add(var22);
        var1.add(var23);
        var1.add(var24);
        var1.add(var25);
        var1.add(var26);
        var1.add(var27);
        var1.add(var28);
        var1.add(var29);
        var1.add(var30);
        var1.add(var33);
        var1.add(var34);
        var1.add(var35);
        var1.add(var36);
        var1.setVisible(true);
    }

    public void update(String var1) {
        this.textField.setText(var1);
    }
}
