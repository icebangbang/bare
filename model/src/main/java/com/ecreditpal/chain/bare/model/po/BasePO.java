package com.ecreditpal.chain.bare.model.po;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BasePO {

    private Long id;

    private Integer isDeleted;

    private Long creator;

    private Date gmtCreate;

    private Long modifier;

    private Date gmtModified;

    public void setDefaultValue() {

        modifier = 1L;
        if (creator == null) creator = modifier;
        if (isDeleted == null) isDeleted = 0;
        gmtModified = new Date();
        if (gmtCreate == null) gmtCreate = gmtModified;
    }

}