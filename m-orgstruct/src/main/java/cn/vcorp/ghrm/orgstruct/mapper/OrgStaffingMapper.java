package cn.vcorp.ghrm.orgstruct.mapper;

import cn.vcorp.ghrm.common.annotation.DataSource;
import cn.vcorp.ghrm.common.enums.DataSourceType;
import cn.vcorp.ghrm.orgstruct.domain.OrgStaffing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
@DataSource(DataSourceType.SLAVE)
public interface OrgStaffingMapper {
    int createOrgStaffing(OrgStaffing orgStaffing);
    int deleteOrgStaffing(@Param("os_id") String os_id);
    int updateOrgStaffing(OrgStaffing orgStaffing);
    List<OrgStaffing> selectAllOrgStaffings();
    OrgStaffing selectOrgStaffingById(@Param("os_id") String os_id);
}