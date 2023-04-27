package cn.vcorp.ghrm.orgstruct.service;

import cn.vcorp.ghrm.orgstruct.domain.JobCategory;
import cn.vcorp.ghrm.orgstruct.domain.JobRank;
import cn.vcorp.ghrm.orgstruct.domain.JobTitle;

public interface IJobManagementService {
    // JobTitle operations
    int createJobTitle(JobTitle jobTitle);
    int updateJobTitle(JobTitle jobTitle);
    int deleteJobTitle(String jtId);

    // JobCategory operations
    int createJobCategory(JobCategory jobCategory);
    int updateJobCategory(JobCategory jobCategory);
    int deleteJobCategory(String jcId);

    // JobRank operations
    int createJobRank(JobRank jobRank);
    int updateJobRank(JobRank jobRank);
    int deleteJobRank(String jrId);
}
