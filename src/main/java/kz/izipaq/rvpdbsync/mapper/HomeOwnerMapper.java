package kz.izipaq.rvpdbsync.mapper;

import kz.izipaq.rvpdbsync.model.HomeOwner;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.connect.data.Struct;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HomeOwnerMapper {

    private final MapHandler mapHandler;

    public HomeOwner getObject(Struct struct) {
        HomeOwner homeOwner = new HomeOwner();
        homeOwner.setId(mapHandler.getAsUUID(struct, "Id"));
        homeOwner.setCaseId(mapHandler.getAsUUID(struct, "CaseId"));
        homeOwner.setRefId(mapHandler.getAsUUID(struct, "RefId"));
        homeOwner.setIinOrBin(mapHandler.getAsString(struct, "IinOrBin"));
        homeOwner.setRequestTypeId(mapHandler.getAsString(struct, "RequestTypeId"));
        homeOwner.setRequestNumber(mapHandler.getAsString(struct, "RequestNumber"));
        homeOwner.setOwnerConsent(mapHandler.getAsBoolean(struct, "OwnerConsent"));
        homeOwner.setIsDeleted(mapHandler.getAsBoolean(struct, "IsDeleted"));
        homeOwner.setCreatedDate(mapHandler.getAsTimestamp(struct, "CreatedDate"));
        homeOwner.setCreatedBy(mapHandler.getAsString(struct, "CreatedBy"));
        homeOwner.setModifiedDate(mapHandler.getAsTimestamp(struct, "ModifiedDate"));
        homeOwner.setModifiedBy(mapHandler.getAsString(struct, "ModifiedBy"));
        homeOwner.setIsReplicated(true);
        return homeOwner;
    }

}
