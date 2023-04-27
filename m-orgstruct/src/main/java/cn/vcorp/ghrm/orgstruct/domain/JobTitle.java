package cn.vcorp.ghrm.orgstruct.domain;

import cn.vcorp.ghrm.common.core.domain.GhrmBaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class JobTitle extends GhrmBaseEntity {
    // JobTitle
    private String jtId;
    private Date jtInTime;
    private String jtCode;
    private String jtName;
    private String jtNote;
}
