package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class BaseDTO {
    private long id;
    private long warehouseCode;
    private  String name;
    private Date creatDate;
    private Date updateDate;



}
