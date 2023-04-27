package cn.vcorp.ghrm.orgstruct.domain;

import cn.vcorp.ghrm.common.core.domain.GhrmBaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 机构类型 org_type
 * 
 * @author huyong
 */
public class OrgType extends GhrmBaseEntity
{
    private String orgTypeId;

    private String OrgTypeName;

    /** 显示顺序 */
    private Integer orderNum = 0;

    public String getOrgTypeId()
    {
        return orgTypeId;
    }

    public void setOrgTypeId(String orgTypeId)
    {
        this.orgTypeId = orgTypeId;
    }

    @NotBlank(message = "机构类型名称不能为空")
    @Size(min = 0, max = 30, message = "机构类型名称长度不能超过30个字符")
    public String getOrgTypeName()
    {
        return OrgTypeName;
    }

    public void setOrgTypeName(String orgTypeName)
    {
        this.OrgTypeName = orgTypeName;
    }

    @NotNull(message = "显示顺序不能为空")
    public Integer getOrderNum()
    {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum)
    {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orgTypeId", getOrgTypeId())
            .append("orgTypeName", getOrgTypeName())
            .append("orderNum", getOrderNum())
            .toString();
    }
}
