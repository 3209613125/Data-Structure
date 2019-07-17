import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 class Main extends JApplet implements ActionListener {
     private JTextField textField = new JTextField("请输入", 12);
     String operator = "";      //操作
     String input = "";        //输入的 式子
     boolean flag = true;

     public void init()     //重写Applet里边的init方法
     {
         textField.setFont(new Font("宋体", Font.PLAIN, 50));//设置字体格式
         textField.setEditable(false);           //设置文本框不可更改
         Container C = getContentPane();
         JButton b[] = new JButton[17];
         JPanel panel = new JPanel();
         JPanel panel1 = new JPanel();
         panel1.add(textField);
         panel.setLayout(new GridLayout(4, 4, 5, 5));
         panel1.setLayout(new FlowLayout(3));
         C.add(panel, BorderLayout.CENTER);
         C.add(panel1, BorderLayout.NORTH);
         String name[] = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", ".", "0", "=", "/", "C"};//设置按钮
         for (int i = 0; i < 17; i++)//添加按钮
         {
             b[i] = new JButton(name[i]);
             b[i].setBackground(new Color(192, 192, 192));
             b[i].setForeground(Color.BLACK);  //设置按键颜色
             if (i % 4 == 3)
                 b[i].setForeground(Color.RED);//设置按键颜色
             b[i].setFont(new Font("宋体", Font.PLAIN, 16));//设置字体格式
             panel.add(b[i]);//将按键添加到界面
             b[i].addActionListener(this);
         }
         panel1.add(b[16]);
         b[16].setPreferredSize(new Dimension(65, 65));


         b[13].setForeground(Color.RED);
     }

     public void actionPerformed(ActionEvent e) {
         int cnt = 0;
         String actionCommand = e.getActionCommand();
         if (actionCommand.equals("+") || actionCommand.equals("-") || actionCommand.equals("*") || actionCommand.equals("/"))
             input += " " + actionCommand + " ";//设置输入，把输入的样式改成 需要的样子
         else if (actionCommand.equals("C"))
             input = "";
         else if (actionCommand.equals("="))//当监听到等号时，则处理 input
         {
             input += "=" + compute(input);
             textField.setText(input);
             input = "";
             cnt = 1;
         } else
             input += actionCommand;//数字为了避免多位数的输入 不需要加空格
         if (cnt == 0)
             textField.setText(input);
     }

     /*使用栈对数据进行计算*/
     private String compute(String input)//
     {
         String str[];
         str = input.split(" ");
         Stack<Double> s = new Stack<Double>();
         double m = Double.parseDouble(str[0]);
         s.push(m);
         for (int i = 1; i < str.length; i++) {
             if (i % 2 == 1) {
                 if (str[i].compareTo("+") == 0) {
                     double help = Double.parseDouble(str[i + 1]);
                     s.push(help);
                 }
                 if (str[i].compareTo("-") == 0) {
                     double help = Double.parseDouble(str[i + 1]);
                     s.push(-help);
                 }
                 if (str[i].compareTo("*") == 0) {
                     double help = Double.parseDouble(str[i + 1]);
                     double ans = s.peek();//取出栈顶元素
                     s.pop();//消栈
                     ans *= help;
                     s.push(ans);
                 }
                 if (str[i].compareTo("/") == 0) {
                     double help = Double.parseDouble(str[i + 1]);
                     double ans = s.peek();
                     s.pop();
                     ans /= help;
                     s.push(ans);
                 }
             }
         }
         double ans = 0d;
         while (!s.isEmpty()) {
             ans += s.peek();
             s.pop();
         }
         String result = String.valueOf(ans);
         return result;
     }

     public static void main(String args[]) {
         JFrame frame = new JFrame("Counter");//创建顶级窗口
         frame.setResizable(false);
         Main applet = new Main();
         frame.getContentPane().add(applet, BorderLayout.CENTER);
         applet.init();     //applet的init方法
         applet.start();    //线程开始
         frame.setSize(400, 450);  //设置窗口大小
         frame.setVisible(true);    //设置窗口可见
     }
 }
