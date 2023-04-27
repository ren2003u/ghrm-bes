package cn.vcorp.ghrm.orgstruct.domain;

import cn.vcorp.ghrm.common.core.domain.GhrmBaseEntity;
import lombok.Data;

import java.util.Date;


@Data
public class JobRank extends GhrmBaseEntity {
    // JobRank
    private String jrId;
    private Date jrInTime;
    private String jcId;
    private String ranks;
    private String jrNote;
}
