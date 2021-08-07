# Cisco Unified Communications Manager AXL Bindings Library
![Maven Central](https://img.shields.io/maven-central/v/io.github.casually-blue/cucm-11)

This is a wsdl2java generated bindings library for the CUCM interface and shouldn't require any extra dependencies to work correctly. It should work both in kotlin and java, although I haven't tested it in java


## Installation Instructions
To use, just declare as a dependency in your project.

Gradle Example
```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.casually-blue:cucm-11:1.6")
}
```

## Usage 
To use the library just initialize a client object by requesting one from the service like this:
```kotlin
import com.github.casuallyblue.cucm.*
import java.xml.ws.BindingProvider

fun getClient(): AXLPort {
    // Get a service reference
    val service = AXLAPIService()
    // get the client (this is a default un-configured client)
    val client = service.axlPort
  
    // Set the properties of the client
    (client as BindingProvider).requestContext.let {
        it[BindingProvider.EDNPOINT_ADDRESS_PROPERTY] = "https://{CUCM Management Hostname}:8443/axl/"
        it[BindingProvider.USERNAME_PROPERTY] = "{CUCM user with axl access permissions}"
        it[BindingProvider.PASSWORD_PROPERTY] = "{CUCM user password}"
    }
  
    return client
}
```
Replace the `{}` elements with your server's information.
You can then, for example, list phones on the server like this:
```kotlin
fun getPhones(client: AXLPort): List<LPhone> {
    // Create a new request
    val request = ListPhoneReq().let { req ->
            // Set the search criteria to get all phones with a name
            req.searchCriteria = ListPhoneReq.SearchCriteria().let { sc ->
                sc.name = "%"
                sc
            }
            req
        }
        
        // Execute the request and get the result
        return client.listPhone(request).`return`.phone
}
```
