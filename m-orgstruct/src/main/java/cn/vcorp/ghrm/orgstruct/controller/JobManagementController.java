package cn.vcorp.ghrm.orgstruct.controller;

import cn.vcorp.ghrm.common.annotation.Anonymous;
import cn.vcorp.ghrm.common.core.controller.BaseController;
import cn.vcorp.ghrm.common.core.domain.AjaxResult;
import cn.vcorp.ghrm.orgstruct.domain.JobCategory;
import cn.vcorp.ghrm.orgstruct.domain.JobRank;
import cn.vcorp.ghrm.orgstruct.domain.JobTitle;
import cn.vcorp.ghrm.orgstruct.service.IJobManagementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("Job Management")
@RestController
@Anonymous
@RequestMapping("/jobManagement")
public class JobManagementController extends BaseController {

    @Autowired
    private IJobManagementService jobManagementService;

    // JobTitle operations
    @ApiOperation("Create Job Title")
    @PostMapping("/jobTitle/create")
    public AjaxResult createJobTitle(@RequestBody JobTitle jobTitle) {
        int result = jobManagementService.createJobTitle(jobTitle);
        return toAjax(result);
    }

    @ApiOperation("Update Job Title")
    @PutMapping("/jobTitle/update")
    public AjaxResult updateJobTitle(@RequestBody JobTitle jobTitle) {
        int result = jobManagementService.updateJobTitle(jobTitle);
        return toAjax(result);
    }

    @ApiOperation("Delete Job Title")
    @ApiImplicitParam(name = "jt_id", value = "Job Title ID", required = true, dataType = "String", paramType = "path")
    @DeleteMapping("/jobTitle/delete/{jt_id}")
    public AjaxResult deleteJobTitle(@PathVariable("jt_id") String jtId) {
        int result = jobManagementService.deleteJobTitle(jtId);
        return toAjax(result);
    }

    // JobCategory operations
    @ApiOperation("Create Job Category")
    @PostMapping("/jobCategory/create")
    public AjaxResult createJobCategory(@RequestBody JobCategory jobCategory) {
        int result = jobManagementService.createJobCategory(jobCategory);
        return toAjax(result);
    }

    @ApiOperation("Update Job Category")
    @PutMapping("/jobCategory/update")
    public AjaxResult updateJobCategory(@RequestBody JobCategory jobCategory) {
        int result = jobManagementService.updateJobCategory(jobCategory);
        return toAjax(result);
    }

    @ApiOperation("Delete Job Category")
    @ApiImplicitParam(name = "jc_id", value = "Job Category ID", required = true, dataType = "String", paramType = "path")
    @DeleteMapping("/jobCategory/delete/{jc_id}")
    public AjaxResult deleteJobCategory(@PathVariable("jc_id") String jcId) {
        int result = jobManagementService.deleteJobCategory(jcId);
        return toAjax(result);
    }

    // JobRank operations
    @ApiOperation("Create Job Rank")
    @PostMapping("/jobRank/create")
    public AjaxResult createJobRank(@RequestBody JobRank jobRank) {
        int result = jobManagementService.createJobRank(jobRank);
        return toAjax(result);
    }

    @ApiOperation("Update Job Rank")
    @PutMapping("/jobRank/update")
    public AjaxResult updateJobRank(@RequestBody JobRank jobRank) {
        int result = jobManagementService.updateJobRank(jobRank);
        return toAjax(result);
    }

    @ApiOperation("Delete Job Rank")
    @ApiImplicitParam(name = "jr_id", value = "Job Rank ID", required = true, dataType = "String", paramType = "path")
    @DeleteMapping("/jobRank/delete/{jr_id}")
    public AjaxResult deleteJobRank(@PathVariable("jr_id") String jrId) {
        int result = jobManagementService.deleteJobRank(jrId);
        return toAjax(result);
    }
}


