package com.AclDemo.AclDemo.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;



    @Configuration
    @OpenAPIDefinition(info = @Info(title = "Disney API",
            description = "API para explorar el mundo del cine",
            version = "1.0",
            contact = @Contact(
                    name = "Elizabeth Olivera Gutierrez",
                    email = "eliolivera570@gmail.com"
            ),

            license = @License(
                    name = "ACL Tecnologia",
                    url = "https://opensource.org/licenses/mit-license.php"
            )
    ))
    public class OpenApiConfig {
}

