package cn.vcorp.ghrm.orgstruct.service;

import cn.vcorp.ghrm.orgstruct.domain.OrgRelationship;

import java.util.List;

public interface IOrgRelationshipService {
    int createOrgRelationship(OrgRelationship orgRelationship);
    int updateOrgRelationship(OrgRelationship orgRelationship);
    int deleteOrgRelationship(String orId);
    List<OrgRelationship> getAllOrgRelationships();
    OrgRelationship getOrgRelationshipById(String orId);
}