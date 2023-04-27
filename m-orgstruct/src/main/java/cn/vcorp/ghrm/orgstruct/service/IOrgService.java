package cn.vcorp.ghrm.orgstruct.service;

import cn.vcorp.ghrm.orgstruct.domain.Org;

import java.util.List;

public interface IOrgService {
    int createOrg(Org org);
    int updateOrg(Org org);
    int deleteOrg(String org_id);
    List<Org> getAllOrgs();
    Org getOrgById(String org_id);
}