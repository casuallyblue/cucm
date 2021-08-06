# Cisco Unified Communications Manager AXL Bindings Library
This is a wsdl2java generated bindings to the CUCM interface and shouldn't require any extra dependencies to work correctly


## Installation Instructions
To use, just declare as a dependency in your project.

Gradle Example
```kotlin
repositories {
    maven {
        name = "Github Packages"
        url = uri("https://maven.pkg.github.com/casually-blue/repos/")
        credentials {
            username = "{github username}"
            password = "{github access token}"
        }
    }
}

dependencies {
    implementation("com.github.casually-blue:cucm:{version}")
}
```
Replace the `{}` values with your credentials and desired version

## Usage 
To use the library just initialize a client object by requesting one from the service like this:
```kotlin
import com.github.casuallyblue.cucm.*
import java.xml.ws.BindingProvider

fun getClient(): AXLPort {
  // Get a service reference
  val service = AXLAPIService()
  // get the client (this is a default unconfigured clinet)
  val client = service.axlPort
  
  (client as BindingProvider).requestContext.let {
    it[BindingProvider.EDNPOINT_ADDRESS_PROPERTY] = "https://{CUCM Management Hostname}:8443/axl/"
    it[BindingProvider.USERNAME_PROPERTY] = "{CUCM user with axl access permissions}"
    it[BindingProvider.PASSWORD_PROPERTY] = "{CUCM user password}"
  }
  
  return client
}
```
replace the `{}` elements with your server's information
