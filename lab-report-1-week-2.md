# Remote Access Tutorial

Welcome CSE15L students!

So you want to remotely log in to your course-specific account on ieng6?

Follow these steps:

1. **Install Visual Studio Code**
    - Download [HERE](https://code.visualstudio.com/download)
    - Open the downloaded file and just keep clicking next until you reach the end!
    ![Image](https://blogs.sap.com/wp-content/uploads/2020/06/07_Successfull-Installation-1.png)

2. **Remote Connecting**
    - Open a new terminal
    ![Image](report1.jpg)
    - If you don't already know your username and password for your course-specific account you can find it [HERE](https://sdacs.ucsd.edu/~icc/index.php)
    - Now, with your terminal, you need to put this command in: *ssh cs15lsp22zz@ieng6.ucsd.edu* , with the email being your username you found in the step above
    ![Image](ssh.jpg)
    - It will then prompt you for your password, while you type it  in, it will not appear for security reasons. Press enter when done to log in.
    ![Image](ssh2.jpg)
    - You are now logged in!
    
3. **Trying Some Commands**
    - There are a bunch of commands to now try! 
        - ls 
        - ls -a 
        - cd ~
        - cd
        - lat
    - Try them out and see what they do:
    ![Image](ssh3.jpg)

4. **Moving Files With SCP**
    - Here we are gonna attempt to transfer files from your local computer to the remote server.
    - In visual studio code, create a file named: *CopyMe.java*
    - In the file, put the following lines of code
    ```
    class CopyMe {
        public static void main(String[] args) {
            System.out.println(System.out.println("Hello World!"));
    }
    ```
    - Save it then open a new terminal in the directory you made this file.

