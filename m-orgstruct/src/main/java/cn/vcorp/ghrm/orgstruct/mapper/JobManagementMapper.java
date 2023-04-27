package cn.vcorp.ghrm.orgstruct.mapper;

import cn.vcorp.ghrm.common.annotation.DataSource;
import cn.vcorp.ghrm.common.enums.DataSourceType;
import cn.vcorp.ghrm.orgstruct.domain.JobCategory;
import cn.vcorp.ghrm.orgstruct.domain.JobRank;
import cn.vcorp.ghrm.orgstruct.domain.JobTitle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
@DataSource(DataSourceType.SLAVE)
public interface JobManagementMapper {

    // JobTitle operations
    int createJobTitle(@Param("jobTitle") JobTitle jobTitle);
    int updateJobTitle(@Param("jobTitle") JobTitle jobTitle);
    int deleteJobTitle(@Param("jtId") String jtId);

    // JobCategory operations
    int createJobCategory(@Param("jobCategory") JobCategory jobCategory);
    int updateJobCategory(@Param("jobCategory") JobCategory jobCategory);
    int deleteJobCategory(@Param("jcId") String jcId);

    // JobRank operations
    int createJobRank(@Param("jobRank") JobRank jobRank);
    int updateJobRank(@Param("jobRank") JobRank jobRank);
    int deleteJobRank(@Param("jrId") String jrId);
}