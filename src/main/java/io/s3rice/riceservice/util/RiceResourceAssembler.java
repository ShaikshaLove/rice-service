package io.s3rice.riceservice.util;
import io.s3rice.riceservice.model.RiceType;
import io.s3rice.riceservice.rest.api.RiceResource;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class RiceResourceAssembler implements RepresentationModelAssembler<RiceType, RiceType> {

    @Override
    public RiceType toModel(RiceType riceType) {
        riceType.add(linkTo(methodOn(RiceResource.class).one(riceType.getRiceTypeId())).withSelfRel());
        riceType.add(linkTo(methodOn(RiceResource.class).all()).withRel("riceTypeList"));
        return riceType;
    }

    @Override
    public CollectionModel<RiceType> toCollectionModel(Iterable<? extends RiceType> entities) {

        return null;
    }

















   /* @Override
    public EntityModel<RiceType> toModel(RiceType riceType) {
        riceType.add(linkTo(methodOn(RiceResource.class).one(riceType.getRiceTypeId())).withSelfRel());
        riceType.add(linkTo(methodOn(RiceResource.class).all()).withRel("riceTypeList"));
        return new EntityModel<>(riceType);
    }


    @Override
    public CollectionModel<EntityModel<RiceType>> toCollectionModel(Iterable<? extends RiceType> entities) {
    *//*    CollectionModel<EntityModel<RiceType>> entityModels=new CollectionModel<>();
        entities.forEach(riceType->{
            riceType.add(linkTo(methodOn(RiceResource.class).one(riceType.getRiceTypeId())).withSelfRel());
            riceType.add(linkTo(methodOn(RiceResource.class).all()).withRel("riceTypeList"));
           // entityModels.add(riceType);
        });
*//*

        return null;
    }*/
}
