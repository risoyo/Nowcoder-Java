public class Main {
    /**
     *
     * @param index 序号
     * @param object object
     */
    public static void print(int index,Object object){
        System.out.println(String.format("{%d},%s",index,object.toString()));
        int a=0;
    }

    public static void demoString(){
        String str = "hello";
        print(0,str+str);//string对象不可变,但是可以直接加减,两个字符串相加会返回一个新的字符串
        print(1,str.indexOf("e")); //元素e的位置，是否在在字符串中,找不到时返回-1
        print(2, str.charAt(1)); // 输出索引为1的元素
        print(3,str.codePointAt(1));//索引为1的元素的ascii码
        print(4,str.compareTo("hello"));//判断两个字符串是否相同
        print(5,str.contains("e"));//判断字符串包含指定字符
        print(6,str.concat("!!!"));//str.append
        print(7,str.toUpperCase());//转大写
        print(8,str.endsWith("o"));//判断是否以该字符结尾
        print(9,str.startsWith("h"));//判断是否以该字符开头
        print(10,str.replace('e','n'));//替换字符
        print(11,str.replaceAll("hello","hi"));//替换全部,支持正则表达式

        StringBuilder sb = new StringBuilder();//StringBuilder对象创建了一个可以改变的string对象,但是线程不安全
        sb.append('x');
        sb.append(1.2);
        print(12,sb);
    }
    public static void main(String[] args) {
//        print(1,"hello");
        demoString();
    }
}
