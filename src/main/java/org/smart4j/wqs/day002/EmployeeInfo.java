package org.smart4j.wqs.day002;

/**
 * EmployeeInfo
 *
 * @Title: EmployeeInfo.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-13 9:40
 * @Author 90
 */
@ClassType(value = ClassType.ctype.SERVICE)
public class EmployeeInfo {

    @EmployeeName("小明")
    private String employeeName;

    @EmployeeSex(employeeSex = EmployeeSex.Sex.MAN)
    private String employeeSex;

    @Company(address = "山东烟台",id = 1,name = "大禹国际")
    private String company;
}
