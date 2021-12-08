import java.util.ArrayList;
import java.util.List;

public class UseJson {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        IntListResponse intResponseData=new IntListResponse();
        intResponseData.intList=list1;
        BaseResponse json1 = new JsonFactory().getjson("未加工的情况",12,intResponseData);
        System.out.println(json1.body);
        System.out.println(json1.headers);
        System.out.println(json1.redirect);

        System.out.println("下面输出json的格式");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("马云");
        list2.add("比尔·盖兹");
        list2.add("福布斯");
    }
}
