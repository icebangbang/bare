package com.ecreditpal.bare.model.po.activejdbc;

        import lombok.Getter;
        import lombok.Setter;
        import org.javalite.activejdbc.annotations.IdName;
        import org.javalite.activejdbc.annotations.Table;

@Table("$table")
@IdName("id")
public class ${FMT.XyzAbc($table)}PO extends BasePO {

        #foreach($item in $values)#if(${FMT.xyzAbc(${item.name})} != 'id' && ${FMT.xyzAbc(${item.name})} != 'gmtCreate' && ${FMT.xyzAbc(${item.name})} != 'gmtModified' && ${FMT.xyzAbc(${item.name})} != 'creator' && ${FMT.xyzAbc(${item.name})} != 'modifier' && ${FMT.xyzAbc(${item.name})} != 'isDeleted')
public void set${FMT.XyzAbc(${item.name})}(${item.type} ${FMT.xyzAbc(${item.name})}){
        set${FMT.XyzAbc(${item.type})}("${item.name}",${FMT.xyzAbc(${item.name})}); //设置${item.comment}
        }

public ${item.type} get${FMT.XyzAbc(${item.name})}() {
        return get${FMT.XyzAbc(${item.type})}("${item.name}"); //获取${item.comment}
        }
        #end
        #end
        }
