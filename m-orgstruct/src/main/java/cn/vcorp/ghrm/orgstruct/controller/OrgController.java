package cn.vcorp.ghrm.orgstruct.controller;

import cn.vcorp.ghrm.common.annotation.Anonymous;
import cn.vcorp.ghrm.common.core.controller.BaseController;
import cn.vcorp.ghrm.common.core.domain.AjaxResult;
import cn.vcorp.ghrm.orgstruct.domain.Org;
import cn.vcorp.ghrm.orgstruct.service.IOrgService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Organization Management")
@RestController
@Anonymous
@RequestMapping("/org")
public class OrgController extends BaseController {

    @Autowired
    private IOrgService orgService;

    // Create an organization
    @ApiOperation("Create Organization")
    //@PreAuthorize("@ss.hasPermi('system:org:create')")
    @PostMapping("/create")
    public AjaxResult create(@RequestBody Org org) {
        int result = orgService.createOrg(org);
        return toAjax(result);
    }

    // Update an organization
    @ApiOperation("Update Organization")
    //@PreAuthorize("@ss.hasPermi('system:org:update')")
    @PutMapping("/update")
    public AjaxResult update(@RequestBody Org org) {
        int result = orgService.updateOrg(org);
        return toAjax(result);
    }

    // Delete an organization
    @ApiOperation("Delete Organization")
    @ApiImplicitParam(name = "org_id", value = "Organization ID", required = true, dataType = "String", paramType = "path")
    //@PreAuthorize("@ss.hasPermi('system:org:delete')")
    @DeleteMapping("/delete/{org_id}")
    public AjaxResult delete(@PathVariable("org_id") String org_id) {
        int result = orgService.deleteOrg(org_id);
        return toAjax(result);
    }

    @ApiOperation("List All Organizations")
    //@PreAuthorize("@ss.hasPermi('system:org:list')")
    @GetMapping("/list")
    public AjaxResult listAll() {
        List<Org> orgs = orgService.getAllOrgs();
        return AjaxResult.success(orgs);
    }

    // Get organization by orgId
    @ApiOperation("Get Organization by Org ID")
    @ApiImplicitParam(name = "org_id", value = "Organization ID", required = true, dataType = "String", paramType = "path")
    //@PreAuthorize("@ss.hasPermi('system:org:get')")
    @GetMapping("/get/{org_id}")
    public AjaxResult getOrgById(@PathVariable("org_id") String org_id) {
        Org org = orgService.getOrgById(org_id);
        return AjaxResult.success(org);
    }
}



