package com.ecreditpal.chain.bare.model.po;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class ${FMT.XyzAbc($table)}PO extends BasePO {

        #foreach($item in $values)#if(${FMT.xyzAbc(${item.name})} != 'id' && ${FMT.xyzAbc(${item.name})} != 'gmtCreate' && ${FMT.xyzAbc(${item.name})} != 'gmtModified' && ${FMT.xyzAbc(${item.name})} != 'creator' && ${FMT.xyzAbc(${item.name})} != 'modifier' && ${FMT.xyzAbc(${item.name})} != 'isDeleted')
private ${item.type} ${FMT.xyzAbc(${item.name})};//${item.comment}
        #end
        #end
        }
