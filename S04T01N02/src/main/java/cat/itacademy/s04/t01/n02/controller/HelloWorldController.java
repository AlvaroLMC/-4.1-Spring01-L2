package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    // GET with @RequestParam
    @GetMapping("/HelloWorld")
    public String greet(@RequestParam(defaultValue = "UNKNOWN") String name) {
        return "Hello, " + name + ". You are running a Gradle project";
    }

    // GET with optional @PathVariable
    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greet2(@PathVariable(required = false) String name) {
        if (name == null) name = "UNKNOWN";
        return "Hello, " + name + ". You are running a Gradle project";
    }
}


/* TESTS
http://localhost:9001/HelloWorld
http://localhost:9001/HelloWorld?name=ALVARO
http://localhost:9001/HelloWorld2
http://localhost:9001/HelloWorld2/alvaro
*/
