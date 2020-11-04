package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PackageName:com.atguigu.springcloud.entities
 * @ClassName:CommonResult
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/4 14:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T      data;

    //返回结果为null
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
