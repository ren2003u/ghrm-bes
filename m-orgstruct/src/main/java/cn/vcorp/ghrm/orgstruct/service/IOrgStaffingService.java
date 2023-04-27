package cn.vcorp.ghrm.orgstruct.service;

import cn.vcorp.ghrm.orgstruct.domain.OrgStaffing;

import java.util.List;

public interface IOrgStaffingService {
    int createOrgStaffing(OrgStaffing orgStaffing);
    int deleteOrgStaffing(String os_id);
    int updateOrgStaffing(OrgStaffing orgStaffing);
    List<OrgStaffing> getAllOrgStaffings();
    OrgStaffing getOrgStaffingById(String os_id);
}
