package cn.vcorp.ghrm.orgstruct.controller;

import cn.vcorp.ghrm.common.annotation.Anonymous;
import cn.vcorp.ghrm.common.core.controller.BaseController;
import cn.vcorp.ghrm.common.core.domain.AjaxResult;
import cn.vcorp.ghrm.orgstruct.domain.Org;
import cn.vcorp.ghrm.orgstruct.service.IOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Anonymous
@RequestMapping("/org")
public class OrgController extends BaseController {

    @Autowired
    private IOrgService orgService;

    // Create an organization
    //@PreAuthorize("@ss.hasPermi('system:org:create')")
    @PostMapping("/create")
    public AjaxResult create(@RequestBody Org org) {
        int result = orgService.createOrg(org);
        return toAjax(result);
    }

    // Update an organization
    //@PreAuthorize("@ss.hasPermi('system:org:update')")
    @PutMapping("/update")
    public AjaxResult update(@RequestBody Org org) {
        int result = orgService.updateOrg(org);
        return toAjax(result);
    }

    // Delete an organization
    //@PreAuthorize("@ss.hasPermi('system:org:delete')")
    @DeleteMapping("/delete/{org_id}")
    public AjaxResult delete(@PathVariable("org_id") String org_id) {
        int result = orgService.deleteOrg(org_id);
        return toAjax(result);
    }

    //@PreAuthorize("@ss.hasPermi('system:org:list')")
    @GetMapping("/list")
    public AjaxResult listAll() {
        List<Org> orgs = orgService.getAllOrgs();
        return AjaxResult.success(orgs);
    }

    // Get organization by orgId
    //@PreAuthorize("@ss.hasPermi('system:org:get')")
    @GetMapping("/get/{org_id}")
    public AjaxResult getOrgById(@PathVariable("org_id") String org_id) {
        Org org = orgService.getOrgById(org_id);
        return AjaxResult.success(org);
    }
}

