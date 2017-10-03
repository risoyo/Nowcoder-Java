import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    /**
     * @param index  序号
     * @param object object
     */
    private static void print(int index, Object object) {
        System.out.println(String.format("{%d},%s", index, object.toString()));
        int a = 0;
    }

    public static void demoString() {
        String str = "hello";
        print(0, str + str);//string对象不可变,但是可以直接加减,两个字符串相加会返回一个新的字符串
        print(1, str.indexOf("e")); //元素e的位置，是否在在字符串中,找不到时返回-1
        print(2, str.charAt(1)); // 输出索引为1的元素
        print(3, str.codePointAt(1));//索引为1的元素的ascii码
        print(4, str.compareTo("hello"));//判断两个字符串是否相同
        print(5, str.contains("e"));//判断字符串包含指定字符
        print(6, str.concat("!!!"));//str.append
        print(7, str.toUpperCase());//转大写
        print(8, str.endsWith("o"));//判断是否以该字符结尾
        print(9, str.startsWith("h"));//判断是否以该字符开头
        print(10, str.replace('e', 'n'));//替换字符
        print(11, str.replaceAll("hello", "hi"));//替换全部,支持正则表达式

        StringBuilder sb = new StringBuilder();//StringBuilder对象创建了一个可以改变的string对象,但是线程不安全
        sb.append('x');
        sb.append(1.2);
        print(12, sb);
    }

    private static void demoControlFlow() {
        int a = 2;
        int target = a == 2 ? 1 : 3;//a == 2 ? 1 : 3,先判断a是否为2,如果是,走':'之前的分支,不是,走':'之后的分支
        print(1, target);
        //if,else,for,while,switch
    }

    private static void demoList() {
        List<String> strList = new ArrayList<String>(10);//定义字符串数组
        for (int i = 0; i < 4; i++) {
            strList.add(String.valueOf(i));//添加元素
        }
        List<String> strB = strList;
        strB.addAll(strList);//添加所有的元素
        print(1, strB);
        strB.remove(0);//删除第0个元素
        print(2, strB);
        strB.remove(String.valueOf(1));//删除值为1的对象
        print(3, strB);
        print(4, strB.get(1));//获取第1个元素
        Collections.reverse(strList);//逆转字符串
        print(5, strList);
        Collections.sort(strList);
        print(6, strList);
        Collections.shuffle(strList);//打乱顺序
        Collections.sort(strList, new Comparator<String>() { // 实现内部匿名类,可以指定排序算法
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(7, strList);
        for (String obj : strList) { //遍历对象(foreach)
            print(7, obj);
        }
        for (int i = 0; i < strList.size(); i++) { //for遍历
            print(8, strList.get(i));
        }

        int[] array = new int[]{1, 2, 3, 4};//定义数组
        print(9, array[2]);

    }

    private static void demoMapTable(){
        Map<String,String> map = new HashMap<String, String>();//定义hashmap
        for(int i = 0;i<4;i++){
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        print(1,map);
        print(2,map.get("3"));//查找
        print(3,map.containsKey("A"));//判断是否包含"A"
        print(4,map.values());//打印value
        print(5,map.keySet());//打印key
    }

    private static void demoSet(){
        Set<String> strEt = new HashSet<String>(); //定义set,set中元素非重复
        for(int i = 0;i<4;i++){
            strEt.add(String.valueOf(i));
        }
        print(1,strEt);
        strEt.remove(String.valueOf(1));//删除1
        print(2,strEt.contains(String.valueOf(1)));//判断是否存在
    }

    private static void demoException(){
        try {
            int k = 2;
//            k = k/0;
            if(k==2){
                throw new Exception("sss");//主动抛出异常
            }
        }catch (Exception e){
            e.printStackTrace();
            print(2,e.getMessage());
        }finally {
            print(3,"finally");
        }
    }

    private static void demoFunction(){
        Random randon = new Random();
        print(1,randon.nextInt(100));//0-100的随机数
        Date date = new Date();
        print(2,date);//获取时间
        print(3,date.getTime());//获取从1970年到当前的毫秒数,可用于比较时间的早晚
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(4,df.format(date));
    }

    public static void main(String[] args) {
//        print(1,"hello");
//        demoString();
//        demoControlFlow();
//        demoList();
//        demoMapTable();
//        demoSet();
//        demoException();
        demoFunction();
    }
}
