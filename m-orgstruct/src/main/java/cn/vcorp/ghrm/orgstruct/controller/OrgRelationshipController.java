package cn.vcorp.ghrm.orgstruct.controller;

import cn.vcorp.ghrm.common.annotation.Anonymous;
import cn.vcorp.ghrm.common.core.controller.BaseController;
import cn.vcorp.ghrm.common.core.domain.AjaxResult;
import cn.vcorp.ghrm.orgstruct.domain.OrgRelationship;
import cn.vcorp.ghrm.orgstruct.service.IOrgRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Anonymous
@RequestMapping("/orgRelationship")
public class OrgRelationshipController extends BaseController {

    @Autowired
    private IOrgRelationshipService orgRelationshipService;

    // Create a new relationship between organizations
    //@PreAuthorize("@ss.hasPermi('system:orgRelationship:create')")
    @PostMapping("/create")
    public AjaxResult create(@RequestBody OrgRelationship orgRelationship) {
        int result = orgRelationshipService.createOrgRelationship(orgRelationship);
        return toAjax(result);
    }

    // Update an existing relationship between organizations
    //@PreAuthorize("@ss.hasPermi('system:orgRelationship:update')")
    @PutMapping("/update")
    public AjaxResult update(@RequestBody OrgRelationship orgRelationship) {
        int result = orgRelationshipService.updateOrgRelationship(orgRelationship);
        return toAjax(result);
    }

    // Delete an existing relationship between organizations
    //@PreAuthorize("@ss.hasPermi('system:orgRelationship:delete')")
    @DeleteMapping("/delete/{or_id}")
    public AjaxResult delete(@PathVariable("or_id") String or_id) {
        int result = orgRelationshipService.deleteOrgRelationship(or_id);
        return toAjax(result);
    }

    //@PreAuthorize("@ss.hasPermi('system:orgRelationship:list')")
    @GetMapping("/list")
    public AjaxResult listAll() {
        List<OrgRelationship> orgRelationships = orgRelationshipService.getAllOrgRelationships();
        return AjaxResult.success(orgRelationships);
    }

    // Get organization relationship by or_id
    //@PreAuthorize("@ss.hasPermi('system:orgRelationship:get')")
    @GetMapping("/get/{or_id}")
    public AjaxResult getOrgRelationshipById(@PathVariable("or_id") String or_id) {
        OrgRelationship orgRelationship = orgRelationshipService.getOrgRelationshipById(or_id);
        return AjaxResult.success(orgRelationship);
    }
}

