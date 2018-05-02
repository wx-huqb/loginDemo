package com.huqb.logindemo.result;

public class ResultImpl {

    public static ResultBack success(){
        ResultBack rback = new ResultBack();
        rback.setReturn_code("20000");
        rback.setReturn_msg("success!");
        rback.setData(null);

        return rback;
    }

    public static ResultBack success(String code,String msg,Object data){
        ResultBack rback = new ResultBack();
        rback.setReturn_code(code);
        rback.setReturn_msg(msg);
        rback.setData(data);

        return rback;
    }

    public static ResultBack error(){
        ResultBack rback = new ResultBack();
        rback.setReturn_code("40000");
        rback.setReturn_msg("error!");
        rback.setData(null);

        return rback;
    }

    public static ResultBack error(String code,String msg,Object data){
        ResultBack rback = new ResultBack();
        rback.setReturn_code(code);
        rback.setReturn_msg(msg);
        rback.setData(data);

        return rback;
    }

}
