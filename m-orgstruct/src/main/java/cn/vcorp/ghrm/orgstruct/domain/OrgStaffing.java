package cn.vcorp.ghrm.orgstruct.domain;

import cn.vcorp.ghrm.common.core.domain.GhrmBaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class OrgStaffing extends GhrmBaseEntity {
    private String os_id;
    private Date in_time;
    private String org_id;
    private String jt_id;
    private int position_num;
}