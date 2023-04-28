package cn.vcorp.ghrm.emp.domain;

import cn.vcorp.ghrm.common.annotation.Excel;
import cn.vcorp.ghrm.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 学历编码对象 education
 * 
 * @author administrator
 * @date 2023-04-27
 */
public class Education extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学历id-edXX，ed-前缀,XX-序号 */
    private String eduId;

    /** 入库时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入库时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date inTime;

    /** 2位数字代码 */
    @Excel(name = "2位数字代码")
    private String code;

    /** 学历名 非空、唯一 */
    @Excel(name = "学历名 非空、唯一")
    private String name;

    /** 排序码 */
    @Excel(name = "排序码")
    private Long sortby;

    public void setEduId(String eduId)
    {
        this.eduId = eduId;
    }

    public String getEduId()
    {
        return eduId;
    }
    public void setInTime(Date inTime)
    {
        this.inTime = inTime;
    }

    public Date getInTime()
    {
        return inTime;
    }
    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setSortby(Long sortby)
    {
        this.sortby = sortby;
    }

    public Long getSortby()
    {
        return sortby;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("eduId", getEduId())
            .append("inTime", getInTime())
            .append("code", getCode())
            .append("name", getName())
            .append("sortby", getSortby())
            .toString();
    }
}
