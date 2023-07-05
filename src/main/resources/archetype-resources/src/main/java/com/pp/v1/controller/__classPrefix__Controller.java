package ${groupId}.v1.controller;

#set($className = $classPrefix + "Controller")
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.ResponseEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/${shortName}")
@Validated
@AllArgsConstructor
@Api(tags = "${shortName} Management")
public class $className {

    @GetMapping
    public ResponseEntity get${classPrefix}() {
        return ResponseEntity.ok("Hello World from ${shortName}!!!");
    }

    @PostMapping
    public ResponseEntity post${classPrefix}() {
        return ResponseEntity.ok("Hello World from ${shortName}!!!");
    }

    @PutMapping
    public ResponseEntity put${classPrefix}() {
        return ResponseEntity.ok("Hello World from ${shortName}!!!");
    }

    @DeleteMapping
    public ResponseEntity delete${classPrefix}() {
        return ResponseEntity.ok("Hello World from ${shortName}!!!");
    }


}