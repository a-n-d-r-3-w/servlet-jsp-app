cd C:\Users\liua1\servlet-jsp-app\WEB-INF && ^
javac -classpath "\Program Files\Apache Software Foundation\Tomcat 8.5\lib\servlet-api.jar";classes;. -d classes src\com\example\model\*.java src\com\example\web\*.java && ^
cd C:\Users\liua1\servlet-jsp-app && ^
jar -cf servlet-jsp-app.war * && ^
xcopy /EY C:\Users\liua1\servlet-jsp-app\servlet-jsp-app.war "C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps\servlet-jsp-app.war" && ^
rmdir "C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps\servlet-jsp-app\" /s /q