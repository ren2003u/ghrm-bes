package cn.vcorp.ghrm.orgstruct.controller;

import cn.vcorp.ghrm.common.annotation.Anonymous;
import cn.vcorp.ghrm.common.core.controller.BaseController;
import cn.vcorp.ghrm.common.core.domain.AjaxResult;
import cn.vcorp.ghrm.orgstruct.domain.JobCategory;
import cn.vcorp.ghrm.orgstruct.domain.JobRank;
import cn.vcorp.ghrm.orgstruct.domain.JobTitle;
import cn.vcorp.ghrm.orgstruct.service.IJobManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Anonymous
@RequestMapping("/jobManagement")
public class JobManagementController extends BaseController {

    @Autowired
    private IJobManagementService jobManagementService;

    // JobTitle operations
    @PostMapping("/jobTitle/create")
    public AjaxResult createJobTitle(@RequestBody JobTitle jobTitle) {
        int result = jobManagementService.createJobTitle(jobTitle);
        return toAjax(result);
    }

    @PutMapping("/jobTitle/update")
    public AjaxResult updateJobTitle(@RequestBody JobTitle jobTitle) {
        int result = jobManagementService.updateJobTitle(jobTitle);
        return toAjax(result);
    }

    @DeleteMapping("/jobTitle/delete/{jt_id}")
    public AjaxResult deleteJobTitle(@PathVariable("jt_id") String jtId) {
        int result = jobManagementService.deleteJobTitle(jtId);
        return toAjax(result);
    }

    // JobCategory operations
    @PostMapping("/jobCategory/create")
    public AjaxResult createJobCategory(@RequestBody JobCategory jobCategory) {
        int result = jobManagementService.createJobCategory(jobCategory);
        return toAjax(result);
    }

    @PutMapping("/jobCategory/update")
    public AjaxResult updateJobCategory(@RequestBody JobCategory jobCategory) {
        int result = jobManagementService.updateJobCategory(jobCategory);
        return toAjax(result);
    }

    @DeleteMapping("/jobCategory/delete/{jc_id}")
    public AjaxResult deleteJobCategory(@PathVariable("jc_id") String jcId) {
        int result = jobManagementService.deleteJobCategory(jcId);
        return toAjax(result);
    }

    // JobRank operations
    @PostMapping("/jobRank/create")
    public AjaxResult createJobRank(@RequestBody JobRank jobRank) {
        int result = jobManagementService.createJobRank(jobRank);
        return toAjax(result);
    }

    @PutMapping("/jobRank/update")
    public AjaxResult updateJobRank(@RequestBody JobRank jobRank) {
        int result = jobManagementService.updateJobRank(jobRank);
        return toAjax(result);
    }

    @DeleteMapping("/jobRank/delete/{jr_id}")
    public AjaxResult deleteJobRank(@PathVariable("jr_id") String jrId) {
        int result = jobManagementService.deleteJobRank(jrId);
        return toAjax(result);
    }
}
