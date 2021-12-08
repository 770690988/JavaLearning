public class ResponseFactory {
    private static ResponseFactory Nresponsefactory = new ResponseFactory();

    public static ResponseFactory getInstance() {
        return Nresponsefactory;
    }

    public BaseResponse make(Throwable t){
        BaseResponse br1 = new BaseResponse(t);
        return br1;
    }
}
