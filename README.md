# Inventory Management System

This Spring Boot application serves as a simple inventory system for a store, facilitating the management of products. With this system, users can:

- View a list of available products
- Add new products to the inventory
- Update existing product details

Each product within the system is characterized by the following attributes:

- Name
- Description
- Price
- Quantity

The application employs Hibernate to ensure seamless persistence of product information within a MySQL database.

## Prerequisites

Before running this application, ensure you have the following installed:

- Java Development Kit (JDK) 8 or above
- Maven
- MySQL

## Setup and Configuration

### 1. Clone the Repository

Clone this repository to your local machine using the following command:

\`\`\`bash
git clone https://github.com/yourusername/inventory-management.git
\`\`\`

### 2. Database Configuration

- Create a MySQL database named `inventory_db`.
- Configure the database connection settings in the `application.properties` file located in the `src/main/resources` directory:

\`\`\`properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=root
spring.datasource.password=root_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
\`\`\`

Replace `root` and `root_password` with your MySQL username and password, if different.

### 3. Build and Run the Application

Navigate to the project directory and execute the following Maven command to build the application:

\`\`\`bash
mvn clean install
\`\`\`

Once the build completes successfully, run the application using:

\`\`\`bash
mvn spring-boot:run
\`\`\`

The application will start, and you can access it at `http://localhost:8080`.

## Usage

1. **View Products**: Navigate to `http://localhost:8080/api/products` to view the list of available products.
2. **Add a Product**: Send a POST request to `http://localhost:8080/api/products` with the product details in JSON format to add a new product.
3. **Update a Product**: Send a PUT request to `http://localhost:8080/api/products/{id}` with the updated product details in JSON format to update an existing product.
4. **Delete a Product**: Send a DELETE request to `http://localhost:8080/api/products/{id}` to delete a product by ID.

## Testing

The application includes unit tests for the `Product`, `ProductService`, and `ProductController` classes to ensure the functionality aligns with the requirements. You can run the tests using the following command:

\`\`\`bash
mvn test
\`\`\`

## Contributing

Feel free to fork the repository and submit pull requests for any improvements or additional features you'd like to see.
