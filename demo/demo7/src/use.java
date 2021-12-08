public class use {
    public static void main(String[] args) {
        IndexOutOfBoundsException t = new IndexOutOfBoundsException();
        BaseResponse<?> br= ResponseFactory.getInstance().make(t);
        System.out.println("ERROR:"+br.error);
        System.out.println("MSG:"+br.msg);
        System.out.println("DATA:"+br.data);
    }
}
