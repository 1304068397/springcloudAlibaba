package com.atguigu.springcloud.entities;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @PackageName:com.atguigu.springcloud.entities
 * @ClassName:Payment
 * @Description: Serializable序列化为分布式服务做准备
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/4 14:31
 */
@ApiModel("订单表")
@TableName(value = "payment", autoResultMap = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    //主键
    @ApiModelProperty(value = "id", example = "01")
    @TableId("ID")
    private Long id;
    //单号
    @ApiModelProperty(value = "单号", example = "01")
    @TableId("SERIAL")
    private String serial;
}
