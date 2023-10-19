# Spring-to-do-app-test

## Database
this project is using a MySQL DBMS you can change it but make sure to modify the application.properties file, don't forget aswell to put your own DBMS user and password before running the app _**XD**_

## App's endpoints
### Visit this endpoint to get all todos in the list
*curl '127.0.0.1:8080/api/todo'*

### Visit this endpoint providing an {id} to get the todo with that id
*curl '127.0.0.1:8080/api/todo/{id}'*

### Visit this endpoint to add a new todo providing a json object containing a title and a contont fields
*curl -XPOST -H "Content-type: application/json" -d '{"title":"a","content":"b"}' '127.0.0.1:8080/api/todo'*

### Visit this endpoint to modify a todo providing either a title or content as url parameters
*curl -XDELETE '127.0.0.1:8080/api/todo/{id}?title={title}&content=­{content}'*

### Visit this endpoint to mark a todo as complete
*curl -XPUT '127.0.0.1:8080/api/todo/2?title=my%20test&content=i%20changed%20content'*
