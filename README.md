# Spring-to-do-app-test




curl '127.0.0.1:8080/api/todo'
curl '127.0.0.1:8080/api/todo/2'
curl -XPOST -H "Content-type: application/json" -d '{"title":"a","content":"b"}' '127.0.0.1:8080/api/todo'
curl -XDELETE '127.0.0.1:8080/api/todo/2'  
curl -XPUT '127.0.0.1:8080/api/todo/2?title=my%20test&content=i%20changed%20content'
