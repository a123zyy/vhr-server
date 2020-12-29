package org.example.vhr.controller.until;

public class Result <T>{
    private int status;
    private String msg;
    private T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Result() {
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     *  成功时候的调用
     * */
    public static  <T> Result<T> success(T data){
        Result obj = new Result(data) ;
        obj.setMsg("成功");
        obj.setStatus(200);
        obj.setData(data);
        return obj;
    }

    /**
     *  失败时候的调用
     * */
    public static  <T> Result<T> error(ResultMsg codeMsg){
        return new Result<T>((T) codeMsg);
    }

    private Result(T data) {
        this.data = data;
    }

    private Result(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

}
