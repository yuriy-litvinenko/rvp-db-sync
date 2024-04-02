package kz.izipaq.rvpdbsync.mapper;

import kz.izipaq.rvpdbsync.model.SSimpleRef;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.connect.data.Struct;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SSimpleRefMapper {

    private final MapHandler mapHandler;

    public SSimpleRef getObject(Struct struct) {
        SSimpleRef sSimpleRef = new SSimpleRef();
        sSimpleRef.setId(mapHandler.getAsString(struct, "Id"));
        sSimpleRef.setDescrRu(mapHandler.getAsString(struct, "Descr_ru"));
        sSimpleRef.setDescrKz(mapHandler.getAsString(struct, "Descr_kz"));
        sSimpleRef.setIsSys(mapHandler.getAsBigDecimal(struct, "Is_Sys"));
        sSimpleRef.setIsReplicated(true);
        return sSimpleRef;
    }

}
