package com.gbet.organizationservice.controller;

import com.gbet.organizationservice.model.Organization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}")
public class OrganizationController {

    @GetMapping
    public Organization getOrganization(@PathVariable("organizationId") String organizationId){

        Organization organization = new Organization();
        organization.setId(organizationId);
        return organization;
    }
}
