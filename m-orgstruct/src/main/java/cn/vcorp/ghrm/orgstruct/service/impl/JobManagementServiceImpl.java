package cn.vcorp.ghrm.orgstruct.service.impl;

import cn.vcorp.ghrm.orgstruct.domain.JobCategory;
import cn.vcorp.ghrm.orgstruct.domain.JobRank;
import cn.vcorp.ghrm.orgstruct.domain.JobTitle;
import cn.vcorp.ghrm.orgstruct.mapper.JobManagementMapper;
import cn.vcorp.ghrm.orgstruct.service.IJobManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobManagementServiceImpl implements IJobManagementService {

    @Autowired
    private JobManagementMapper jobManagementMapper;

    // JobTitle operations
    @Override
    public int createJobTitle(JobTitle jobTitle) {
        return jobManagementMapper.createJobTitle(jobTitle);
    }

    @Override
    public int updateJobTitle(JobTitle jobTitle) {
        return jobManagementMapper.updateJobTitle(jobTitle);
    }

    @Override
    public int deleteJobTitle(String jtId) {
        return jobManagementMapper.deleteJobTitle(jtId);
    }

    // JobCategory operations
    @Override
    public int createJobCategory(JobCategory jobCategory) {
        return jobManagementMapper.createJobCategory(jobCategory);
    }

    @Override
    public int updateJobCategory(JobCategory jobCategory) {
        return jobManagementMapper.updateJobCategory(jobCategory);
    }

    @Override
    public int deleteJobCategory(String jcId) {
        return jobManagementMapper.deleteJobCategory(jcId);
    }

    // JobRank operations
    @Override
    public int createJobRank(JobRank jobRank) {
        return jobManagementMapper.createJobRank(jobRank);
    }

    @Override
    public int updateJobRank(JobRank jobRank) {
        return jobManagementMapper.updateJobRank(jobRank);
    }

    @Override
    public int deleteJobRank(String jrId) {
        return jobManagementMapper.deleteJobRank(jrId);
    }
}
