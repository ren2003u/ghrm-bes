package cn.vcorp.ghrm.orgstruct.domain;

import cn.vcorp.ghrm.common.core.domain.GhrmBaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class JobCategory extends GhrmBaseEntity {
    // JobCategory
    private String jcatId;
    private Date jcatInTime;
    private String jcatCode;
    private String jcatName;
    private String jcatNote;
}
