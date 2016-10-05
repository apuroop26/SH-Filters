Hello,
Welcome to the project "Filters".
The aim of this project is to upload an audio file, apply filter to the audio file and then play it.
The frontend part was done in AngularJS and Bootstrap.
Backend is mostly done in Java.
Used Drop Wizard.


To run the backend server follow the following procedure.
1. Open IntelliJ
2. Open the backend folder of the project.
3. First time running the project follow the following steps or skip to step 10.
4. Hover the mouse to left bottom corner and then click on Gradle.
5. Click on "Refresh all gradle projects" icon on the top left corner in "Gradle projects" menu.
6. In "/backend/src/main/java/se/bth/softhouse/db/FilterDAO.java" in line 21, click once on <Filter> and then "alt+enter" on your keyboard.
7. Click on "Add library 'Gradle: junit:junit:4.11' to classpath
8. Then in debug configuration (Path Application) click on it and choose "Edit Configuration".
9. In the popup, in "Program Arguments" form, type : "server src/config/config.yml" with out quotations and click ok.
10. Now right click on  "/backend/src/main/java/se/example2/softhouse/PathApplication.java" and click on "Run 'PathApplication.main()' ".
11. Now the backend is running. Go to "http://localhost:8080" in your browser and you an view your front end.
12. If you want to access H2 database, the go to "http://localhost:8082" and then first go to Intellij open "/backend/src/config/config.yml" then Copy url in database. It is 'jdbc:h2:~/target/filter.db' with out quotations.
13. Paste it in H2 JDBC database form section.
14. Use username = sa and password = sa and then you can access database.

Thanks for following me. Go ahead.
