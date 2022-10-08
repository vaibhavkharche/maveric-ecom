# maveric-ecom
Maveric eComm app to enable trade among Maveric employees. Through this app Maveric employees will be able to sell or buy items from their maveric collegues

To run project first create mavecomdb schema in mysql-db *(see application.properties file)*

you can test endpoints locally using below url
http://localhost:8080/rest/users
http://localhost:8080/rest/user/{userId}
http://localhost:8080/rest/image/{imageId}
http://localhost:8080/rest/categories
etc.. *(for all endpoints refer EcomRestController.java)*