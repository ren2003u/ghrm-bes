package cn.vcorp.ghrm.orgstruct.service.impl;

import cn.vcorp.ghrm.orgstruct.domain.OrgRelationship;
import cn.vcorp.ghrm.orgstruct.mapper.OrgRelationshipMapper;
import cn.vcorp.ghrm.orgstruct.service.IOrgRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgRelationshipServiceImpl implements IOrgRelationshipService {

    @Autowired
    private OrgRelationshipMapper orgRelationshipMapper;

    @Override
    public int createOrgRelationship(OrgRelationship orgRelationship) {
        return orgRelationshipMapper.createOrgRelationship(orgRelationship);
    }

    @Override
    public int updateOrgRelationship(OrgRelationship orgRelationship) {
        return orgRelationshipMapper.updateOrgRelationship(orgRelationship);
    }

    @Override
    public int deleteOrgRelationship(String or_id) {
        return orgRelationshipMapper.deleteOrgRelationship(or_id);
    }

    @Override
    public List<OrgRelationship> getAllOrgRelationships() {
        return orgRelationshipMapper.selectAllOrgRelationships();
    }

    @Override
    public OrgRelationship getOrgRelationshipById(String or_id) {
        return orgRelationshipMapper.selectOrgRelationshipById(or_id);
    }
}
