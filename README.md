# Spring Technical Test Models

This library contains the data models used in the Spring Technical Test project. It provides Java classes that represent entities such as users, roles, purchase orders, order details, payment methods, and more.

## Content

- `User`: Represents a user in the system, including their username, password, email, and associated roles.
- `Role`: Represents a role or permission in the system, including its name and activation status.
- `Payment`: Represents a payment method used in a purchase order, including information about the method, total amount, and payment date.
- `Order`: Represents a purchase order made by a user, including details such as the order date and activation status.
- `OrderDetail`: Represents a specific detail of a purchase order, including the quantity, price, and product details.

## Purpose and Utility

This library facilitates the implementation of data models in other services of the Spring Technical Test project. It provides a coherent and well-defined structure to represent common entities in the system, such as users, roles, and purchase orders. By using these models, developers can avoid code duplication and maintain consistency in data representation throughout the application.

## Usage Instructions

To use this library in your project, you first need to compile it to generate the JAR file that you can then include as a dependency in your application. To compile the library, follow these steps:

1. Clone the GitHub repository of the library:
git clone https://github.com/tu-usuario/spring-technical-test-models.git

2. Navigate to the root directory of the cloned project:
cd spring-technical-test-models

3. Compile the project using Maven:
mvn clean package


Once these steps are completed, a JAR file will be generated in the `target` directory of the project. You can include this JAR as a dependency in your Spring project.

To use this library in your project, you can add it as a Maven dependency in your `pom.xml` file:

```xml
<dependency>
 <groupId>com.example</groupId>
 <artifactId>spring-technical-test-models</artifactId>
 <version>1.0.0</version>
</dependency>
