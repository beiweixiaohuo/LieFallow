package com.example.demo.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Data
public class User {
    @NotBlank(message = "帐号不能为空")
    private String userId;


    private String userPassword;

    private String salt;

    @Length(min = 2,max = 8,message = "昵称不得小于2位，不得超过8位")
    private String userName;

    @NotNull(message = "年龄不得为空")
    @Min(value = 16,message = "年龄不得小于16岁")
    private Integer userAge;

    private int isLock;

    private String userSex;
    private String userPhoto;

    private int isAdmin;

}
