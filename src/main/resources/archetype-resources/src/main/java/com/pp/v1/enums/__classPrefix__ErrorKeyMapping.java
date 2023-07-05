package ${groupId}.v1.enums;

#set($className=$classPrefix+"ErrorKeyMapping")

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum $className{

    ;

    private String code;
    private String messageKey;
    private String errorMessageKey;
}