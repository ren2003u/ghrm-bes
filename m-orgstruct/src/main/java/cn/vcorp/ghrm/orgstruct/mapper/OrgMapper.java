package cn.vcorp.ghrm.orgstruct.mapper;

import cn.vcorp.ghrm.common.annotation.DataSource;
import cn.vcorp.ghrm.common.enums.DataSourceType;
import cn.vcorp.ghrm.orgstruct.domain.Org;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
@DataSource(DataSourceType.SLAVE)
public interface OrgMapper {

    int createOrg(@Param("org") Org org);
    int updateOrg(@Param("org") Org org);
    int deleteOrg(@Param("org_id") String org_id);
    List<Org> selectAllOrgs();
    Org selectOrgById(@Param("org_id") String org_id);
}