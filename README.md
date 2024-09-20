To run this project, execute class JspDemoApplication.

On IDE (specially INTELIJ), mark "Add dependencies marked as 'provided' to classpath"
when creating the runner.


Other option is to build and deploy the jsp-demo directly into a tomcat or any other container.

The endpoint bellow should be handled by controller, not actual jsp:

```http://localhost:8080/jsp-demo/file.jsp```