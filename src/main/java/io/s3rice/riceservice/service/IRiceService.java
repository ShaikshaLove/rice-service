package io.s3rice.riceservice.service;

import io.s3rice.riceservice.dto.RiceTypeDto;
import io.s3rice.riceservice.model.RiceType;

import java.util.List;

public interface IRiceService {
    public abstract RiceType saveRiceType(RiceTypeDto riceTypeDto);
    public abstract List<RiceType> getAllRiceTypes();
    public abstract RiceType findOne(int riceTypeId);
    public abstract void deleteRiceType(int riceTypeId);
    public abstract RiceType updateRiceType(RiceType riceType);
}
