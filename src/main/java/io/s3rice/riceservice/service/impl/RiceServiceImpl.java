package io.s3rice.riceservice.service.impl;

import io.s3rice.riceservice.dto.RiceTypeDto;
import io.s3rice.riceservice.exception.RiceTypeNotFoundException;
import io.s3rice.riceservice.model.RiceType;
import io.s3rice.riceservice.repository.RiceRepository;
import io.s3rice.riceservice.service.IRiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class RiceServiceImpl implements IRiceService {

    private RiceRepository riceRepository;

    @Autowired
    public void setRiceRepository(RiceRepository riceRepository) {
        this.riceRepository = riceRepository;
    }

    @Override
    public RiceType saveRiceType(RiceTypeDto riceTypeDto) {
        RiceType riceType=new RiceType(riceTypeDto.getRiceName(),
                riceTypeDto.getRiceType(),
                riceTypeDto.getMrp(),
                riceTypeDto.getCurrentCost(),
                riceTypeDto.getDescription(),
                riceTypeDto.getAgeOfTheRiceInDays(),
                riceTypeDto.getSoldUnits(),
                riceTypeDto.getAvailableUnits(),
                riceTypeDto.getNetWeight()
             );
                riceType.setCreatedDate(new Date());

            try {
                 riceType.setPackedDate(new SimpleDateFormat("yyyy-MM-dd").parse(riceTypeDto.getPackedDate()));
                } catch (ParseException e) {
                  e.printStackTrace();
               }
        return riceRepository.save(riceType);
    }

    @Override
    public List<RiceType> getAllRiceTypes() {
        return riceRepository.findAll();
    }

    @Override
    public RiceType findOne(int riceId) {
        return riceRepository.findById(riceId)
                .orElseThrow(() -> new RiceTypeNotFoundException("No rice type is found for rice-id,"+riceId));
    }

    @Override
    public void deleteRiceType(int riceTypeId) {
        riceRepository.deleteById(riceTypeId);
    }

    @Override
    public RiceType updateRiceType(RiceType riceType) {
        riceType.setCreatedDate(findOne(riceType.getRiceTypeId()).getCreatedDate());
        riceType.setLastModifiedDate(new Date());
        return riceRepository.save(riceType);
    }
}
