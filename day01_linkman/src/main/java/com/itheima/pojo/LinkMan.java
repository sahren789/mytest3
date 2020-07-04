package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 包名:com.itheima.pojo
 *
 * @author Leevi
 * 日期2020-06-30  15:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkMan {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String address;
    private String qq;
    private String email;
}
