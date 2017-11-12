package com.yb.base.util;

import com.google.gson.Gson;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.ui.ModelMap;

/**
 * Created by 80657 on 2017/11/8.
 */
public class ResultUtil {

    public static ModelMap getResult(boolean result, String errorMesg){
        ModelMap map = new ModelMap();
        if(result){
            map.put("error", "0");
            map.put("error_mesg", "");
        }else{
            map.put("error", "1");
            map.put("error_mesg", errorMesg);
        }
        return map;
    }
    public static String getJsonResult(boolean code, String errorMesg){
        Result result=new Result();
        if (code){
            result.setError(0);
            result.setError_mesg("");
        }else {
            result.setError(1);
            result.setError_mesg(errorMesg);
        }
       Gson gson=new Gson();
       return gson.toJson(result);


    }




}
class  Result{
    Integer error;
    String  error_mesg;

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getError_mesg() {
        return error_mesg;
    }

    public void setError_mesg(String error_mesg) {
        this.error_mesg = error_mesg;
    }
}