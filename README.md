# todo-application
A simple todo application using Spring BOOT and Spring MVC

Technologies Used:
	Spring Boot, 
	Spring MVC, 
	In Memory Database (H2).
	
The project will be able to create a new TODO task, delete the same and mark it as completed. Since, in-memory database is used the data
is deleted after every restart. If you want to add some pre-existing tasks you can write the queries in (data-h2.sql) file that will be placed parallel
to schema-h2.sql which will create the database. The table will be created by using JPA entities on the server startup, as well as any change
in schema will be automatically reflected in the database. You can also filter the tasks on the basis of the status.

Any suggestions or changes are always appreciated and welcome. This is the first commit. I am trying to work out on the features and will update this soon.
