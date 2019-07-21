package com.lcy.simplecard.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 返回结果类.
 *
 * @author renrk(1275) on 2018-07-16 9:01 PM
 **/
@ApiModel(value = "结果对象", description = "结果对象信息")
public class RestResult<T>
{
    @ApiModelProperty(value = "结果码", required = true)
    private String errcode;
    
    @ApiModelProperty(value = "结果信息", required = true)
    private String errmsg;
    
    @ApiModelProperty(value = "结果内容")
    private T data;
    
    public static RestResult success()
    {
        return success("");
    }
    
    /**
     * 成功.
     */
    public static <T> RestResult success(T data)
    {
        RestResult<T> restResult = new RestResult<>(Constant.SUCCESS, Constant.SUCCESS_MSG);
        restResult.setData(data);
        return restResult;
    }

    /**
     * 错误.
     */
    public static <T> RestResult error(String errcode, String errmsg, T data)
    {
        RestResult<T> restResult = new RestResult<>(errcode, errmsg);
        restResult.setData(data);
        return restResult;
    }
    
    public static RestResult error(String errcode, String errmsg)
    {
        return new RestResult<>(errcode, errmsg, "");
    }
    
    public RestResult()
    {
    }
    
    public RestResult(String errcode, String errmsg)
    {
        this.errcode = errcode;
        this.errmsg = errmsg;
    }
    
    /**
     * 构造方法.
     */
    public RestResult(String errcode, String errmsg, T data)
    {
        this.errcode = errcode;
        this.errmsg = errmsg;
        this.data = data;
    }
    
    public String getErrcode()
    {
        return errcode;
    }
    
    public void setErrcode(String errcode)
    {
        this.errcode = errcode;
    }
    
    public String getErrmsg()
    {
        return errmsg;
    }
    
    public void setErrmsg(String errmsg)
    {
        this.errmsg = errmsg;
    }
    
    public T getData()
    {
        return data;
    }
    
    public void setData(T data)
    {
        this.data = data;
    }
    
    @Override
    public String toString()
    {
        return "RestResult{" + "errcode='" + errcode + '\'' + ", errmsg='" + errmsg + '\'' + ", data=" + data + '}';
    }
}
