package cn.vcorp.ghrm.orgstruct.domain;

import cn.vcorp.ghrm.common.core.domain.GhrmBaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class Org extends GhrmBaseEntity {
    private String org_id;
    private Date in_time;
    private String ot_id;
    private String code;
    private String name;
    private String short_name;
    private String addr;
    private String create_time;
}
