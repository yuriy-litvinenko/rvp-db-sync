package kz.izipaq.rvpdbsync.mapper;

import kz.izipaq.rvpdbsync.model.RVPCaseHistory;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.connect.data.Struct;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RVPCaseHistoryMapper {

    private final MapHandler mapHandler;

    public RVPCaseHistory getObject(Struct struct) {
        RVPCaseHistory rvpCaseHistory = new RVPCaseHistory();
        rvpCaseHistory.setId(mapHandler.getAsUUID(struct, "Id"));
        rvpCaseHistory.setCaseId(mapHandler.getAsUUID(struct, "CaseId"));
        rvpCaseHistory.setCaseStatusId(mapHandler.getAsString(struct, "CaseStatusId"));
        rvpCaseHistory.setModifiedBy(mapHandler.getAsString(struct, "ModifiedBy"));
        rvpCaseHistory.setModifedDate(mapHandler.getAsTimestamp(struct, "ModifedDate"));
        rvpCaseHistory.setDepartmentId(mapHandler.getAsBigDecimal(struct, "DepartmentId"));
        rvpCaseHistory.setStatusChangeReasonId(mapHandler.getAsString(struct, "StatusChangeReasonId"));
        rvpCaseHistory.setComment(mapHandler.getAsString(struct, "Comment"));
        rvpCaseHistory.setIsReplicated(true);
        return rvpCaseHistory;
    }

}
