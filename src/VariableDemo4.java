import java.util.Scanner;
//导包 ————Scanner这个类在哪
public class VariableDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建对象————表示我要开始用Scanner这个类了
        System.out.println("请输入i值:");
        int i = sc.nextInt();
        //接收数据————真正开始干活了。
        //变量i记录了键盘录入的数据
        System.out.println(i);
    }

}
