package cn.vcorp.ghrm.orgstruct.controller;

import cn.vcorp.ghrm.common.annotation.Anonymous;
import cn.vcorp.ghrm.common.core.controller.BaseController;
import cn.vcorp.ghrm.common.core.domain.AjaxResult;
import cn.vcorp.ghrm.orgstruct.domain.OrgRelationship;
import cn.vcorp.ghrm.orgstruct.service.IOrgRelationshipService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Organization Relationship Management")
@RestController
@Anonymous
@RequestMapping("/orgRelationship")
public class OrgRelationshipController extends BaseController {

    @Autowired
    private IOrgRelationshipService orgRelationshipService;

    // Create a new relationship between organizations
    @ApiOperation("Create Organization Relationship")
    @PostMapping("/create")
    public AjaxResult create(@RequestBody OrgRelationship orgRelationship) {
        int result = orgRelationshipService.createOrgRelationship(orgRelationship);
        return toAjax(result);
    }

    // Update an existing relationship between organizations
    @ApiOperation("Update Organization Relationship")
    @PutMapping("/update")
    public AjaxResult update(@RequestBody OrgRelationship orgRelationship) {
        int result = orgRelationshipService.updateOrgRelationship(orgRelationship);
        return toAjax(result);
    }

    // Delete an existing relationship between organizations
    @ApiOperation("Delete Organization Relationship")
    @ApiImplicitParam(name = "or_id", value = "Organization Relationship ID", required = true, dataType = "String", paramType = "path")
    @DeleteMapping("/delete/{or_id}")
    public AjaxResult delete(@PathVariable("or_id") String or_id) {
        int result = orgRelationshipService.deleteOrgRelationship(or_id);
        return toAjax(result);
    }

    @ApiOperation("List All Organization Relationships")
    @GetMapping("/list")
    public AjaxResult listAll() {
        List<OrgRelationship> orgRelationships = orgRelationshipService.getAllOrgRelationships();
        return AjaxResult.success(orgRelationships);
    }

    // Get organization relationship by or_id
    @ApiOperation("Get Organization Relationship by ID")
    @ApiImplicitParam(name = "or_id", value = "Organization Relationship ID", required = true, dataType = "String", paramType = "path")
    @GetMapping("/get/{or_id}")
    public AjaxResult getOrgRelationshipById(@PathVariable("or_id") String or_id) {
        OrgRelationship orgRelationship = orgRelationshipService.getOrgRelationshipById(or_id);
        return AjaxResult.success(orgRelationship);
    }
}


