package kz.izipaq.rvpdbsync.mapper;

import kz.izipaq.rvpdbsync.model.DSimpleRefVal;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.connect.data.Struct;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DSimpleRefValMapper {

    private final MapHandler mapHandler;

    public DSimpleRefVal getObject(Struct struct) {
        DSimpleRefVal dSimpleRefVal = new DSimpleRefVal();
        dSimpleRefVal.setId(mapHandler.getAsString(struct, "Id"));
        dSimpleRefVal.setRefId(mapHandler.getAsString(struct, "Ref_Id"));
        dSimpleRefVal.setDescrRu(mapHandler.getAsString(struct, "Descr_ru"));
        dSimpleRefVal.setDescrKk(mapHandler.getAsString(struct, "Descr_kk"));
        dSimpleRefVal.setDescrFullRu(mapHandler.getAsString(struct, "Descr_full_ru"));
        dSimpleRefVal.setDescrFullKz(mapHandler.getAsString(struct, "Descr_full_kz"));
        dSimpleRefVal.setStatus(mapHandler.getAsBigDecimal(struct, "Status"));
        dSimpleRefVal.setPid(mapHandler.getAsString(struct, "Pid"));
        dSimpleRefVal.setInsDate(mapHandler.getAsTimestamp(struct, "Ins_Date"));
        dSimpleRefVal.setDelUserId(mapHandler.getAsBigDecimal(struct, "Del_User_Id"));
        dSimpleRefVal.setDelDate(mapHandler.getAsTimestamp(struct, "Del_Date"));
        dSimpleRefVal.setInsUserId(mapHandler.getAsBigDecimal(struct, "Ins_User_Id"));
        dSimpleRefVal.setCode(mapHandler.getAsString(struct, "Code"));
        dSimpleRefVal.setItemOrder(mapHandler.getAsBigDecimal(struct, "Item_Order"));
        dSimpleRefVal.setParentId(mapHandler.getAsString(struct, "Parent_Id"));
        dSimpleRefVal.setDescrEn(mapHandler.getAsString(struct, "Descr_en"));
        dSimpleRefVal.setIsReplicated(true);
        return dSimpleRefVal;
    }

}
