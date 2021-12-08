public class BaseResponse<T> {

    public int error;
    public String msg;
    public T data;
    public BaseResponse(T data){
        this.error=0;
        this.msg="success";
        this.data=data;
    }

    public BaseResponse(int error,String msg){
        this.error=error;
        this.msg=msg;
    }
}