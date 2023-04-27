package cn.vcorp.ghrm.orgstruct.service.impl;

import cn.vcorp.ghrm.orgstruct.domain.OrgStaffing;
import cn.vcorp.ghrm.orgstruct.mapper.OrgStaffingMapper;
import cn.vcorp.ghrm.orgstruct.service.IOrgStaffingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgStaffingServiceImpl implements IOrgStaffingService {

    @Autowired
    private OrgStaffingMapper orgStaffingMapper;

    @Override
    public int createOrgStaffing(OrgStaffing orgStaffing) {
        return orgStaffingMapper.createOrgStaffing(orgStaffing);
    }

    @Override
    public int deleteOrgStaffing(String os_id) {
        return orgStaffingMapper.deleteOrgStaffing(os_id);
    }

    @Override
    public int updateOrgStaffing(OrgStaffing orgStaffing) {
        return orgStaffingMapper.updateOrgStaffing(orgStaffing);
    }

    @Override
    public List<OrgStaffing> getAllOrgStaffings() {
        return orgStaffingMapper.selectAllOrgStaffings();
    }

    @Override
    public OrgStaffing getOrgStaffingById(String os_id) {
        return orgStaffingMapper.selectOrgStaffingById(os_id);
    }
}
