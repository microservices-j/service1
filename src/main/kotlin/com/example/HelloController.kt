package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.security.annotation.Secured

@Secured
@Controller("/hello")
class HelloController {

    @Get(uri="/", produces=["text/plain"])
    fun index(): String {
        return "Example Response"
    }
}

/*
curl --request POST \
  --url http://localhost:8081/login


curl --request GET \
  --url http://localhost:8082/hello \
  --header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJwbXMiLCJzdWIiOiJkZW1vLnVzZXIiLCJpYXQiOjE2NjMyNjg5MTAsImV4cCI6MTY2MzI2OTIxMCwianRpIjoiOWY5NDllMjAtMzM4Ni00ZDMzLWE2MGUtZTM3ODE2ZDRkYWJjIn0.q_FbswEK17R-I-eVlAjysoF-xBd0OYOuu7vh3oCKFDjkZJP-PQJpfsk6ZYbTN05DZVkbKEs4wAklX-84dUqWD4BGgQLJmA7_xLiCozFzAVFsp6y_4zkGzVhEjZjrDBjnUDNiFpm6eLCmdAqCjACXIKUSPe66FNHHNUcsKkB4AGEvotrLz0LHOs-JKVqfEImxKHyyf2Xpq29arcZdWM-ooSTCiGfL3o8D4mo4U_eXu1lF84djv6zl1pw7Q9FiOtOyfWQ2ZMuwBPbWepGB0Z7SdzXjnjjcxrLKAncU5ao_MzOT_ev_b73NEaN4lT_9-ja2vk-vm4J7kfSJtHeoZupqRg'
 */