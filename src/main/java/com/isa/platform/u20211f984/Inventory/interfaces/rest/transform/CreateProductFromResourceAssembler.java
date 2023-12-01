package com.isa.platform.u20211f984.Inventory.interfaces.rest.transform;

import com.isa.platform.u20211f984.Inventory.domain.model.commands.CreateProductCommand;
import com.isa.platform.u20211f984.Inventory.interfaces.rest.resources.CreateProductResource;

public class CreateProductFromResource {
    public static CreateProductCommand toCommandFrom(CreateProductResource resource){
        return new CreateProductCommand(resource.brand(),resource.model(),resource.serialNumber(),resource.monitoringLevel());
    }
}
