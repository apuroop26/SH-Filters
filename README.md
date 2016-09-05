### BTHWebIntro

#### Preconditions
1. You have downloaded the Java8 SDK and installed it on your operating 
system. [Download it here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
2. You have downloaded IntelliJ IDEA. [Download it here](https://www.jetbrains.com/idea/#chooseYourEdition).
3. You have downloaded WebStorm. [Download it here](https://www.jetbrains.com/webstorm/).

If you are a student, you may be eligable for a free license to WebStorm and IntelliJ Idea. [You may apply to the student programme here](https://www.jetbrains.com/student/).

#### WebStorm
We will begin by downloading the git repository. For this, we will use WebStorm. If you feel comfortable using the terminal to download the repository, you may do so. Otherwise, read on.

1. Open WebStorm
2. (Optional) If you already have a open project, go to **File** > **Close Project**
3. You should see the prompt (as shown in image). Click on **Check out from Version Control** > **Git** ![](https://googledrive.com/host/0B2H7nU2mgobdeGc0ckZwYmZVeHM/ws1.png) 
4. In **Git Repository URL** type ``https://dinoopijac@bitbucket.org/dinoopijac/bthwebintro.git``
5. In **Parent Directory** type in the directory you wish to save your project in. For example: Windows: ``C:\Users\<username>\``, macOS: ``/Users/<username>/``, Other UNIX OS: ``/home/<username>/``
6. Leave **Directory Name** as is and press the **Clone** button ![](https://googledrive.com/host/0B2H7nU2mgobdeGc0ckZwYmZVeHM/ws2.png)
7. If a message appears on the screen about 'Checkout From Version Control', just press **Yes**
8. A new project window will appear. Press on the 'clip' icon in the lower left corner. A pane will appear to the right. Click on **1: Project** to view all the files that have been cloned. ![](https://googledrive.com/host/0B2H7nU2mgobdeGc0ckZwYmZVeHM/ws3.png)

You have now successfully downloaded the git repository. You are now ready to develop for the frontend. Our next step is to set up the Java Environment.


#### IntelliJ IDEA
1. Open IntelliJ IDEA
2. (Optional) If you already have a open project, go to **File** > **Close Project**
3. You should see a prompt (as shown in image). Click on **Open**. ![](https://googledrive.com/host/0B2H7nU2mgobdeGc0ckZwYmZVeHM/idea1.png)
4. Go to the directory where you have downloaded the git repository and pick the **backend** directory. E.g. ``/Users/<username>/bthwebintro/backend/`` ![](https://googledrive.com/host/0B2H7nU2mgobdeGc0ckZwYmZVeHM/idea2.png)
5. A window titled **Import Project from Gradle** will pop-up. Click on **OK**. ![](https://googledrive.com/host/0B2H7nU2mgobdeGc0ckZwYmZVeHM/idea3.png)
6. A pop-up will be shown in the top right corner (Unregistered VCS root detected). In this case, press **Ignore**, but in the future, when you work on your own projects, press **Add root**. ![](https://googledrive.com/host/0B2H7nU2mgobdeGc0ckZwYmZVeHM/idea4.png)
7. In the left panel (the file browser), open **backend** > **src** > **main** > **java** > **se.example2.softhouse**. Right click on **DemoApplication** and select Run 'DemoApplicatio...main()'. ![](https://googledrive.com/host/0B2H7nU2mgobdeGc0ckZwYmZVeHM/idea5.png)
8. A message will be shown in the console. Go to the file selection in the top right corner (where it says 'DemoApplication') and select **Edit Configurations ...** ![](https://googledrive.com/host/0B2H7nU2mgobdeGc0ckZwYmZVeHM/idea6.png)
9. In the **Program Arguments** field, type **server src/config/config.yml**, press **Apply**. ![](https://googledrive.com/host/0B2H7nU2mgobdeGc0ckZwYmZVeHM/idea7.png)
10. Finally, in the top right corner, press the green play button and point your browser to [http://localhost:8080/](http://localhost:8080)

Good luck on your projects!