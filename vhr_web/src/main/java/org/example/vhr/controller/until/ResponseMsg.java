package org.example.vhr.controller.until;

public class ResponseMsg {
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResponseMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public ResponseMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public ResponseMsg() {
    }

    //通用的错误码
    public static ResponseMsg SUCCESS = new ResponseMsg(0, "success");

}
