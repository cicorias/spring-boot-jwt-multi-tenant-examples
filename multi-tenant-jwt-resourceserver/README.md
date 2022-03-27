# Overview
This repository demonstrates using Spring Security and Multiple OAuth2 IdP issues. In this example, the providers were established as Azure AAD and Azure B2C (and Facebook)

# Reference

Spring Security discusses this implementatino here: [OAuth2 / OAuth2 Resource Server / Multitenancy](https://docs.spring.io/spring-security/reference/servlet/oauth2/resource-server/multitenancy.html#oauth2resourceserver-multitenancy)

This follows the Dynamic Tenants - in that you can "add" more issues to the list in `application.yml`.

```yml
spring:
  autoconfigure:
    exclude:
      # get rid of "Using default security password" logs and basic auth defaults
      - org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration

app:
  issuers:
    - https://sts.windows.net/72f988bf-86f1-41af-91ab-2d7cd011db47/
    - https://<your-tenant>.b2clogin.com/<your-tenant>.onmicrosoft.com/<your-policy>/v2.0/

```

This will parse the claim only once. Essentially, all the "tips" are followed.
