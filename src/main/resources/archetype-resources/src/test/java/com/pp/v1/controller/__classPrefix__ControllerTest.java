package ${groupId}.v1.controller;

#set($className = $classPrefix + "ControllerTest")
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class $className {

    private static final String EXPECTED_RESPONSE = "Hello World from ${shortName}!!!";

    @Autowired
    private ${classPrefix}Controller ${shortName}Controller;

    @Test
    void get${classPrefix}() {

    }
}