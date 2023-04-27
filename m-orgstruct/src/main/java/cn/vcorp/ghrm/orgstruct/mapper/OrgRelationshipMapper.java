package cn.vcorp.ghrm.orgstruct.mapper;

import cn.vcorp.ghrm.common.annotation.DataSource;
import cn.vcorp.ghrm.common.enums.DataSourceType;
import cn.vcorp.ghrm.orgstruct.domain.OrgRelationship;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
@DataSource(DataSourceType.SLAVE)
public interface OrgRelationshipMapper {

    int createOrgRelationship(@Param("orgRelationship") OrgRelationship orgRelationship);
    int updateOrgRelationship(@Param("orgRelationship") OrgRelationship orgRelationship);
    int deleteOrgRelationship(@Param("or_id") String orId);
    List<OrgRelationship> selectAllOrgRelationships();
    OrgRelationship selectOrgRelationshipById(@Param("or_id") String or_id);
}