package cn.vcorp.ghrm.emp.domain;

import cn.vcorp.ghrm.common.annotation.Excel;
import cn.vcorp.ghrm.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 国籍对象 nationality
 * 
 * @author administrator
 * @date 2023-04-26
 */
public class Nationality extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 国籍id：naXXX，na-前缀，XXX-序号 */
    private String nationId;

    /** 入库时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入库时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date inTime;

    /** 3位大写字母 */
    @Excel(name = "3位大写字母")
    private String code;

    /** 国籍中文名 */
    @Excel(name = "国籍中文名")
    private String cname;

    /** 国籍英文名 */
    @Excel(name = "国籍英文名")
    private String ename;

    /** 2位简码 */
    @Excel(name = "2位简码")
    private String scode;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long sortby;

    public void setNationId(String nationId)
    {
        this.nationId = nationId;
    }

    public String getNationId()
    {
        return nationId;
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
    public void setCname(String cname)
    {
        this.cname = cname;
    }

    public String getCname()
    {
        return cname;
    }
    public void setEname(String ename)
    {
        this.ename = ename;
    }

    public String getEname()
    {
        return ename;
    }
    public void setScode(String scode)
    {
        this.scode = scode;
    }

    public String getScode()
    {
        return scode;
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
            .append("nationId", getNationId())
            .append("inTime", getInTime())
            .append("code", getCode())
            .append("cname", getCname())
            .append("ename", getEname())
            .append("scode", getScode())
            .append("sortby", getSortby())
            .toString();
    }
}
