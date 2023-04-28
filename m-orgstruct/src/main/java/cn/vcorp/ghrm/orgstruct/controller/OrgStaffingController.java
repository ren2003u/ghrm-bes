package cn.vcorp.ghrm.orgstruct.controller;

import cn.vcorp.ghrm.common.annotation.Anonymous;
import cn.vcorp.ghrm.common.core.controller.BaseController;
import cn.vcorp.ghrm.common.core.domain.AjaxResult;
import cn.vcorp.ghrm.orgstruct.domain.OrgStaffing;
import cn.vcorp.ghrm.orgstruct.service.IOrgStaffingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Organization Staffing Management")
@RestController
@Anonymous
@RequestMapping("/orgStaffing")
public class OrgStaffingController extends BaseController {

    @Autowired
    private IOrgStaffingService orgStaffingService;

    @ApiOperation("Create Organization Staffing")
    @PostMapping("/create")
    public AjaxResult create(@RequestBody OrgStaffing orgStaffing) {
        int result = orgStaffingService.createOrgStaffing(orgStaffing);
        return toAjax(result);
    }

    @ApiOperation("Delete Organization Staffing")
    @ApiImplicitParam(name = "os_id", value = "Organization Staffing ID", required = true, dataType = "String", paramType = "path")
    @DeleteMapping("/delete/{os_id}")
    public AjaxResult delete(@PathVariable("os_id") String os_id) {
        int result = orgStaffingService.deleteOrgStaffing(os_id);
        return toAjax(result);
    }

    @ApiOperation("Update Organization Staffing")
    @PutMapping("/update")
    public AjaxResult update(@RequestBody OrgStaffing orgStaffing) {
        int result = orgStaffingService.updateOrgStaffing(orgStaffing);
        return toAjax(result);
    }

    // Get all organization staffings
    @ApiOperation("List All Organization Staffings")
    @GetMapping("/list")
    public AjaxResult listAll() {
        List<OrgStaffing> orgStaffings = orgStaffingService.getAllOrgStaffings();
        return AjaxResult.success(orgStaffings);
    }

    // Get organization staffing by os_id
    @ApiOperation("Get Organization Staffing by ID")
    @ApiImplicitParam(name = "os_id", value = "Organization Staffing ID", required = true, dataType = "String", paramType = "path")
    @GetMapping("/get/{os_id}")
    public AjaxResult getOrgStaffingById(@PathVariable("os_id") String os_id) {
        OrgStaffing orgStaffing = orgStaffingService.getOrgStaffingById(os_id);
        return AjaxResult.success(orgStaffing);
    }
}
