package ${package.Entity};

<#list table.importPackages as pkg>
import ${pkg};
</#list>
import lombok.Data;

/**
* @author ${author}
* @since ${date}
*/
@Data
public class ${entity} implements Serializable {

    private static final long serialVersionUID = 1L;
<#-- ----------  BEGIN 字段循环遍历  ---------->
<#list table.fields as field>

    <#-- 主键 -->
        <#if field.keyIdentityFlag>
    @TableId(value = "${field.name}", type = IdType.AUTO)
        <#elseif idType??>
    @TableId(value = "${field.name}", type = IdType.${idType})
        <#elseif field.convert>
    @TableId("${field.name}")
        </#if>
    private ${field.propertyType} ${field.propertyName};//${field.comment}
</#list>
<#------------  END 字段循环遍历  ---------->

}
