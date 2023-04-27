package cn.vcorp.ghrm.orgstruct.domain;


import cn.vcorp.ghrm.common.core.domain.GhrmBaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class OrgRelationship extends GhrmBaseEntity {
    private String or_id;
    private String parent_org_id;
    private String child_org_id;
    private Date in_time;
}
