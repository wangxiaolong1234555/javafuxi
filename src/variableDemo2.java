public class variableDemo2 {
    public static void main(String[] args) {
        //1.基本用法
        //定义变量，再进行输出
        int a = 10;
        System.out.println(a);//10
        System.out.println(a);//10
        System.out.println(a);//10


        //2.变量参与计算
        int b =10;
        int c =20;
        System.out.println(b+c);


        //3. 修改变量记录的值
        int d = 30;
        System.out.println(d);//30
        d=40;
        System.out.println(d);//40

        //注意事项
        System.out.println("_____________________________________");

        //3.一条语句可以定义多个变量。
        int e=100, f=200,g=300;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        //4.变量在使用前一定要进行赋值。

        //建议：以后定义变量要直接赋值
        //不要分开写赋值和定义
        int h;//定义变量 h
        h = 500;//赋值变量 h
        System.out.println(h);
        //5.变量的作用域范围。
    }
}
