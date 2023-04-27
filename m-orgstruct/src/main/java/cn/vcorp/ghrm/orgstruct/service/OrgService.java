package cn.vcorp.ghrm.orgstruct.service;

import cn.vcorp.ghrm.orgstruct.domain.OrgType;
import cn.vcorp.ghrm.orgstruct.mapper.OrgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgService {
    private final OrgMapper orgMapper;

    @Autowired
    public OrgService(OrgMapper orgMapper) {
        this.orgMapper = orgMapper;
    }

//    public List<OrgType> getOrgTypeList() {
//        return orgMapper.selectOrgTypeList();
//    }

//    public List<Org> getOrgListByParent(String parentOrgId) {
//
//    }
}
