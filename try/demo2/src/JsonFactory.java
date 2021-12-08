import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class JsonFactory {

    private static JsonFactory jsonFactory1 = new JsonFactory();

    private final Map<Class<?>, IResponseStrategy> typeToStrategyMap =new ConcurrentHashMap<>();

    public <T> BaseResponse getjson(String yes,int i,  T dataObj) {
        IResponseStrategy strategy= typeToStrategyMap.getOrDefault(dataObj.getClass(), new IResponseStrategy() {
            @Override
            public BaseResponse handleWhenJsonBody(Object objFromController) {
                return new BaseResponse(objFromController,null,"");
            }
        });
        return strategy.handleWhenJsonBody(dataObj);
    }

    public static JsonFactory getInstance(){
        return jsonFactory1;
    }

}
