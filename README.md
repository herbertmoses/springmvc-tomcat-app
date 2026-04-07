# Spring MVC Tomcat Application

A simple Spring MVC web application demonstrating:

* Spring MVC controllers
* JSP views
* Form submission
* Validation
* Deployment on Apache Tomcat

---

# Tech Stack

* Java 21
* Spring MVC
* Maven
* Apache Tomcat 10
* JSP / JSTL

---

# Project Structure

```
src/main/java
    com.example
        HelloController.java
        User.java

src/main/webapp
    WEB-INF
        web.xml
        spring-servlet.xml
        views
            form.jsp
            result.jsp
```

---

# Prerequisites

Install:

* Java 21
* Maven
* Apache Tomcat

Verify:

```
java -version
mvn -version
```

---

# Build Application

```
mvn clean package
```

This creates:

```
target/TomcatApp.war
```

---

# Deploy to Tomcat

Copy WAR file to Tomcat:

```
cp target/TomcatApp.war /path/to/tomcat/webapps/
```

Start Tomcat:

```
cd /path/to/tomcat/bin
./startup.sh
```

---

# Access Application

Open browser:

```
http://localhost:8080/TomcatApp/form
```

---

# Example Flow

1. Open form page
2. Enter name and email
3. Submit form
4. Application displays welcome message

---

# Development Notes

Controllers use:

* `@Controller`
* `@GetMapping`
* `@PostMapping`
* `@ModelAttribute`
* `@Valid`

View resolution:

```
/WEB-INF/views/*.jsp
```

---

# Future Improvements

* Add REST APIs
* Add database integration
* Convert to Spring Boot
* Add Docker support
