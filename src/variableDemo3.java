public class variableDemo3 {
    public static void main(String[] args) {
        //byte
        byte b=10;
        System.out.println(b);//10
        //short
        short s = 20;
        System.out.println(s);//20
        //int
        int i = 30;
        System.out.println(i);
        //long
        /*如果要定义long类型的变量，在数值后面必须加L作为后缀，L可以大写也可以小写*/
        //建议使用大写L
        long f = 99999999999L;
        System.out.println(f);

        //flog
        /*注意点：定义float类型的时候，数据值也需要加一个F作为后缀*/
        float g = 10.1F;
        System.out.println(g);
        //double
        double d =20.2;
        System.out.println(d);

        //char
        char c ='中';
        System.out.println(c);

        //boolean
        //只有两个值：true false
        boolean t = true;
        System.out.println(t);
    }
}
