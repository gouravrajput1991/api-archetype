package ${groupId}.v1.enums;

import org.springframework.http.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

#set($className=$classPrefix+"ServiceKeyMapping")

@Getter
@AllArgsConstructor
public enum $className{

    ;

    private String code;
    private HttpStatus httpStatus;
    private String messageKey;
    private String errorMessageKey;
}