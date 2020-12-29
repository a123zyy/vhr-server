package org.example.vhr.controller.until;


public class ResultMsg {
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

    public ResultMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public ResultMsg() {
    }

    //通用的错误码
    public static ResultMsg SUCCESS = new ResultMsg(0, "success");
    public static ResultMsg equipment_occupy = new ResultMsg(10004,"您已在另一台设备登录，本次登录已下线!");

}
