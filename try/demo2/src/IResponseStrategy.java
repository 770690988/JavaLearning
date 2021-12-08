public interface IResponseStrategy<T> {
    BaseResponse<T,?,?> handleWhenJsonBody(T objFromController);
}
