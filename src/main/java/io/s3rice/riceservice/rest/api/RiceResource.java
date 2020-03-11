package io.s3rice.riceservice.rest.api;
import io.s3rice.riceservice.dto.Message;
import io.s3rice.riceservice.dto.RiceTypeDto;
import io.s3rice.riceservice.dto.SuccessResponse;
import io.s3rice.riceservice.model.RiceType;
import io.s3rice.riceservice.service.IRiceService;
import io.s3rice.riceservice.util.RiceResourceAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

/***
 *
 * @author shaiksha sayyad
 *
 * @version 1.1
 *
 * @since 27-DEC-2019
 *
 *
 */

@RestController
@RequestMapping("/v1/ricetypes")
public class RiceResource {

    private IRiceService riceService;

    @Autowired
    private RiceResourceAssembler riceResourceAssembler;

    @Autowired
    public void setiRiceService(IRiceService riceService) {
        this.riceService = riceService;
    }

    /**
     * Creating a new ricetype resource
     *
     * */
    @PostMapping(consumes={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
                 produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<SuccessResponse> save(@RequestBody RiceTypeDto riceTypeDto){
        RiceType riceType= riceService.saveRiceType(riceTypeDto);
        Message message=new Message("The rice type information has been saved with id , "+riceType.getRiceTypeId(),HttpStatus.CREATED.value());
        return new ResponseEntity<>(new SuccessResponse(message), HttpStatus.CREATED);
    }

    /**
     * Getting all ricetype resources
     *
     * */
    @GetMapping(produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<RiceType>> all(){

       List<RiceType> riceTypes= riceService.getAllRiceTypes();
              /*  .stream()
                .map(riceType ->{
                   return riceResourceAssembler.toModel(riceType);
                } )
                .collect(Collectors.toList());*/
        return  new ResponseEntity<>(riceTypes,HttpStatus.OK);
    }

    /***
     * Getting a paricular ricetype resource
     * @param riceTypeId
     *
     * */

    @GetMapping(value="/{riceTypeId}",produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<RiceType> one(@PathVariable("riceTypeId")int riceTypeId) {
        return new ResponseEntity<>(/*riceResourceAssembler.toModel()*/riceService.findOne(riceTypeId),HttpStatus.OK);
    }

    /***
     * Updating a existing ricetype resource
     *
     * */
    @PutMapping(consumes={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
                produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<SuccessResponse> update(@RequestBody RiceType riceType){
        riceService.updateRiceType(riceType);
        return ResponseEntity.ok(new SuccessResponse(new Message("The details have been updated, ",HttpStatus.OK.value())));
    }
    /***
     * Deleting a existing ricetpe resource
     *
     * */
    @DeleteMapping("/{riceTypeId}")
    public ResponseEntity<SuccessResponse> delete(@PathVariable("riceTypeId")int riceTypeId){
        riceService.deleteRiceType(riceTypeId);
        return ResponseEntity.ok(new SuccessResponse(new Message("The rice type has been deleted, ",HttpStatus.OK.value())));
    }
}
