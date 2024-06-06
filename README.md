# Using this Proof of Concept (POC)

## Creating your own set-up
Refer to this [guide](https://learn.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-active-directory) 
to configure your own Azure Active Directory instance and set up your Spring web app with Microsoft Entra ID authentication.

If you do not have an Azure subscription, you can create an account on a 
free trial.

## Using this demo project's set-up

### Application.properties Configuration
Configure the application.properties file with the following:

```
#Enable related features.
spring.cloud.azure.active-directory.enabled=true
# Specifies your Active Directory ID:
spring.cloud.azure.active-directory.profile.tenant-id=
# Specifies your App Registration's Application ID:
spring.cloud.azure.active-directory.credential.client-id=
# Specifies your App Registration's secret key:
spring.cloud.azure.active-directory.credential.client-secret=
```

Contact **hue_koh_from.intern@cpf.gov.sg** for the demo ID and Secret values (Up to 21 June 2024).
Highly recommend you create your own Azure Active Directory set-up and users instead.

### Demo Accounts
| Username                             | Password  | Assigned Role |
|--------------------------------------|-----------|---------------|
| user@JustAnIntern.onmicrosoft.com    | Saiej8329 | User          |
| admin@JustAnIntern.onmicrosoft.com   | Fawkf1293 | Admin         |