package com.AclDemo.AclDemo.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;



    @Configuration
    @OpenAPIDefinition(info = @Info(title = "Disney API",
            description = "API for exploring the world of Disney",
            version = "1.0",
            contact = @Contact(
                    name = "Fernando Arellano",
                    email = "f.arellano919@gmail.com",
                    url = "https://github.com/farellano91"
            ),
            license = @License(
                    name = "MIT Licence",
                    url = "https://opensource.org/licenses/mit-license.php"
            )
    ))
    public class OpenApiConfig {
}

