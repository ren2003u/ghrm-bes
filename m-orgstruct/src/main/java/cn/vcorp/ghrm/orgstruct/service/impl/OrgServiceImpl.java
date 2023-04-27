package cn.vcorp.ghrm.orgstruct.service.impl;

import cn.vcorp.ghrm.orgstruct.domain.Org;
import cn.vcorp.ghrm.orgstruct.mapper.OrgMapper;
import cn.vcorp.ghrm.orgstruct.service.IOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgServiceImpl implements IOrgService {

    @Autowired
    private OrgMapper orgMapper;

    @Override
    public int createOrg(Org org) {
        return orgMapper.createOrg(org);
    }

    @Override
    public int updateOrg(Org org) {
        return orgMapper.updateOrg(org);
    }

//    @Override
//    public int createOrg(Org org) {
//        return 0;
//    }

    @Override
    public int deleteOrg(String org_id) {
        return orgMapper.deleteOrg(org_id);
    }

    public List<Org> getAllOrgs() {
        return orgMapper.selectAllOrgs();
    }

    @Override
    public Org getOrgById(String org_id) {
        return orgMapper.selectOrgById(org_id);
    }
}