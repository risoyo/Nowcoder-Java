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
        print(1,str.indexOf("e")); //元素e的位置，是否在在字符串中,找不到时返回-1
        print(2, str.charAt(1)); // 输出索引为1的元素
        print(3,str.codePointAt(1));//索引为1的元素的ascii码
        print(4,str.compareTo("hello"));//判断两个字符串是否相同
        print(2,str.charAt(1));
//        print(2,);
//        print(2,);
    }
    public static void main(String[] args) {
//        print(1,"hello");
        demoString();
    }
}
