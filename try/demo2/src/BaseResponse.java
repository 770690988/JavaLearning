public class BaseResponse<T,S,E> {
    public T body;
    public S headers;
    public E redirect;


    public BaseResponse(T body, S second, E redirect) {
        this.body = body;
        this.second = second;
        this.redirect = redirect;
        if(redirect!=null && (body!=null)){
            throw new IllegalArgumentException();
        }
    }

    public BaseResponse(){
        this.body = null;
        this.second = null;
        this.redirect = null;
    }
}